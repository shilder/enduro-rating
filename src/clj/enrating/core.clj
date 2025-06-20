(ns enrating.core
  (:require [clojure.java.io :as io]
            [clojure.string :as str]
            [enrating.points :as points]
            [rum.core :as rum]
            [rum.server-render]
            [enrating.data.2025]
            [enrating.data.riders])
  (:import (java.math RoundingMode)
           (java.time LocalDate)))



;; TODO:
;;
;; Бонус за финишеров - чем меньше финишеров (относительно числа стартовавших) - тем сложнее была гонка
;;   - решилось само собой с помощью нормированного логарифмического распределения -
;;     чем меньше финишеров относительно стартовавших тем больше очков насыпает
;; Бонус за кол-во участников - чем больше народу тем как правило сложнее (но не всегда и несильно)
;;   - аналогично работает через логарифмическое распределение
;;
;; Бонус за длительность прохождения трассы - чем дольше ехать тем сложнее (как правило)
;;   - просто включаем в базовую сложность круга
;;
;; В теории все что выше можно просто включать в базовый пул очков и регулировать им
;;
;; Бонус за то что обогнал сильного спортсмена - пока не придумал как реализовать
;;

;;
;; Проблемы текущей модели
;;
;; Сложность гонки (и кол-во очков) должна определяться следующими факторами
;;
;; - Сложность трассы сама по себе (с учетом погоды и тд) - это более менее работает
;; - Конкурентность класса - зависит как от кол-ва участников так и от их уровня - этого пока нет, неясно
;;   как реализовать
;;
;; TODO: начислять ли очки за DNF ?
;;

(rum/defc event-field
  [label value]
  [:div.event-field
   [:label label]
   [:div.field-value value]])

(rum/defc classification-card [all-data {:keys [name first-place-points cutoff-point classification-id
                                                started-count laps lap-difficulty equivalent points-multiplier] :as classification-data}]
  (let [results (sort-by :position (filter #(= (:classification-id %) classification-id)
                                           (:results all-data)))
        finished-count (count (filter #(some? (:position %)) results))]
    [:div.event-card {:id classification-id}
     (event-field "Название класса" name)
     (when started-count
       (event-field "Количество стартовавших" started-count))
     (when finished-count
       (event-field "Количество финишировавших" finished-count))
     (when (and started-count finished-count)
       (event-field "Процент финишировавших"
                    (str (Math/round (double (* 100.0 (/ (double finished-count) (double started-count))))) "%")))
     (event-field "Кол-во кругов" laps)
     (event-field "Сложность круга (условная)" lap-difficulty)
     (event-field "Условная сложность" (get-in points/difficulties-map [equivalent :name]))
     (when points-multiplier
       (event-field "Дополнительный коэффициент" points-multiplier))
     (when points-multiplier
       (event-field "Пояснение к коэффициенту" (:multiplier-description classification-data)))
     (event-field "Очки за первое место (Кол-во кругов * сложность круга * коэффициент условной сложности * коэффициент)" first-place-points)
     (event-field "Точка отсечения подсчета очков" cutoff-point)
     [:table.results-table
      [:thead
       [:tr
        [:th "Фамилия"]
        [:th "Имя"]
        [:th "Стартовый номер"]
        [:th "Итоговый результат"]
        [:th "Очков начислено"]]]
      [:tbody
       (for [result results
             :let [rider (get-in all-data [:riders (:rider-id result)])]]
         [:tr {:id (:result-id result)}
          [:td (:surname rider)]
          [:td (:name rider)]
          [:td.number (:plate-number result)]
          [:td.number (:position result)]
          [:td.number (:points result)]])]]]))

(rum/defc event-card
  [all-data {:keys [event-id name date] :as event-data}]
  (let [classifications (sort-by :order
                                 (filter #(= (:event-id %) event-id)
                                         (vals (:classifications all-data))))]
    [:div.event-card {:id event-id}
     (event-field "Название события" name)
     (event-field "Дата" date)
     [:div.classifications-list
      [:p "Список зачетных групп"]
      [:ul
       (for [c classifications]
         [:li [:a {:href (str "#" (:classification-id c))} (:name c)]])]]
     [:h4 "Зачетные группы"]
     (for [classification classifications]
       (classification-card all-data classification))]))

(defn inline-style [content]
  [:style {:type                    "text/css"
           :dangerouslySetInnerHTML {:__html content}}])

(defn inline-js [content]
  [:script {:dangerouslySetInnerHTML {:__html content}}])

(defn- collect-into-map [data id-key type-key]
  (reduce
    (fn [acc v]
      (assoc acc (id-key v) v))
    {}
    (filter #(= (:type %) type-key) data)))

(defn add-points-data [all-data]
  (update all-data
          :results
          (fn [results]
            (mapv
              (fn [result]
                (let [classification (get-in all-data [:classifications (:classification-id result)])]
                  (assoc result :points (points/position-points-log
                                          (:first-place-points classification)
                                          (:position result)
                                          (:cutoff-point classification)))))
              results))))

(def data2025-map
  (let [raw-data2025 enrating.data.2025/data]
    (-> {:events          (collect-into-map raw-data2025 :event-id :event)
         :classifications (collect-into-map raw-data2025 :classification-id :classification)
         :results         (filter #(= (:type %) :result) raw-data2025)
         :riders          enrating.data.riders/riders-map}
        (add-points-data))))

(rum/defc github-logo []
  [:svg.octicon
   {:viewBox "0 0 24 24" :width "32" :height "32" :fill "currentColor"}
   [:path {:d "M12.5.75C6.146.75 1 5.896 1 12.25c0 5.089 3.292 9.387 7.863 10.91.575.101.79-.244.79-.546 0-.273-.014-1.178-.014-2.142-2.889.532-3.636-.704-3.866-1.35-.13-.331-.69-1.352-1.18-1.625-.402-.216-.977-.748-.014-.762.906-.014 1.553.834 1.769 1.179 1.035 1.74 2.688 1.25 3.349.948.1-.747.402-1.25.733-1.538-2.559-.287-5.232-1.279-5.232-5.678 0-1.25.445-2.285 1.178-3.09-.115-.288-.517-1.467.115-3.048 0 0 .963-.302 3.163 1.179.92-.259 1.897-.388 2.875-.388.977 0 1.955.13 2.875.388 2.2-1.495 3.162-1.179 3.162-1.179.633 1.581.23 2.76.115 3.048.733.805 1.179 1.825 1.179 3.09 0 4.413-2.688 5.39-5.247 5.678.417.36.776 1.05.776 2.128 0 1.538-.014 2.774-.014 3.162 0 .302.216.662.79.547C20.709 21.637 24 17.324 24 12.25 24 5.896 18.854.75 12.5.75Z"}]])

(rum/defc riders-table
  [all-data]
  (let [riders-top-score
        (for [rider (vals (:riders all-data))
              :let [results (filter #(= (:rider-id %) (:rider-id rider))
                                    (:results all-data))]
              ;; только для тех у кого есть какие-то очки
              :when (seq results)]
          {:rider   rider
           :total   (reduce + 0M (map :points results))
           :results results})
        events (sort-by #(LocalDate/parse (:date %)) (vals (:events all-data)))
        riders-data (reverse (sort-by :total riders-top-score))]
    [:table
     [:thead
      (-> [:tr
           [:th {:width "50px"} "#"]
           [:th {:width "150px"} "Гонщик"]]
          (into (map
                  (fn [event]
                    [:th {:width "80px"}
                     [:a {:href (str "#" (:event-id event))}
                      (:name event)]]))
                events)
          (into [[:th {:width "80px"} "Всего"]]))]

     (into [:tbody]
           (map (fn [[idx {:keys [total rider results]}]]
                  (-> [:tr
                       [:td.number (inc idx)]
                       [:td (str/join " " [(:surname rider) (:name rider)])]]
                      (into
                        (map (fn [{:keys [event-id]}]
                               ;; Тут мы считаем что в одном событии гонщик может участвовать только в одном зачете
                               (let [result (first (filter #(= (:event-id %) event-id) results))
                                     classification (get-in all-data [:classifications (:classification-id result)])]
                                 [:td.number
                                  {:class   (:equivalent classification)
                                   :onclick (str "highlightRow('" (:result-id result) "')")}
                                  [:a {:href (str "#" (:result-id result))}
                                   (:points result)]])))
                        events)
                      (into [[:th.number total]]))))
           (map vector (range) riders-data))]))

(rum/defc index-page []
  [:html
   [:head
    [:meta {:http-equiv "Content-Type" :content "text/html; charset=UTF-8"}]
    [:meta {:name "viewport" :content "width=device-width, initial-scale=1.0"}]
    ;; TODO: favicon
    [:title "Enduro Rating"]
    (inline-style (slurp (io/resource "modern-normalize.css")))
    (inline-style (slurp (io/resource "styles.css")))
    (inline-js (slurp (io/resource "scripts.js")))]
   [:body
    [:header
     [:h1 "2025 год"]]
    [:section.summary-table
     [:h2 "Сводная таблица по гонщикам"]
     (riders-table data2025-map)]
    [:section.results-info
     [:h2 "Гонки и результаты"]
     (for [event (sort-by (fn [event]
                            ;; Сортировка по дате и имени
                            [(LocalDate/parse (:date event)) (:name event)])
                          (vals (:events data2025-map)))]
       (event-card data2025-map event))]
    [:footer]]])

(defn render-index []
  (println "Generating data")
  (io/delete-file (io/file "generated") true)
  (let [f (io/file "generated" "result.html")]
    (io/make-parents f)
    (with-open [w (io/writer f)]
      (spit w
            (str "<!DOCTYPE html>\n"
                 (rum.server-render/render-static-markup
                   (index-page)))))))

(render-index)

(defn dummy [& args]
  ;; Do nothing - loading of namespace triggers rendering
  )