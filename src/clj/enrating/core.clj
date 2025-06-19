(ns enrating.core
  (:require [clojure.java.io :as io]
            [clojure.string :as str]
            [rum.core :as rum]
            [rum.server-render]
            [enrating.data.2025]
            [enrating.data.riders])
  (:import (java.math RoundingMode)
           (java.time LocalDate)))



;; TODO:
;;
;; Бонус за финишеров - чем меньше финишеров (относительно числа стартовавших) - тем сложнее была гонка
;; Бонус за кол-во участников - чем больше народу тем как правило сложнее (но не всегда и несильно)
;; Бонус за длительность прохождения трассы - чем дольше ехать тем сложнее (как правило)
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
;; - Сложность трассы сама по себе (с учетом погоды и тд)
;; - Конкурентность класса - зависит как от кол-ва участников так и от их уровня
;;
;; По текущей модели слишком мало очков достается тому кто ниже 20 места, надо сделать более равномерное распределение
;; Что-то вроде процентного распределения, то есть если участников много, то сильнее размазывать баллы


(rum/defc classification-card [all-data {:keys [name first-place-points cutoff-point classification-id] :as classification-data}]
  [:div.event-card
   [:div.event-field
    [:label "Название класса"]
    [:div.field-value name]]
   [:div.event-field
    [:label "Очки за первое место"]
    [:div.field-value first-place-points]]
   [:div.event-field
    [:label "Точка отсечения подсчета очков"]
    [:div.field-value cutoff-point]]
   [:div "Результаты"]
   [:table
    [:thead
     [:tr
      [:th "Фамилия"]
      [:th "Имя"]
      [:th "Стартовый номер"]
      [:th "Итоговый результат"]
      [:th "Очков начислено"]]]
    [:tbody
     (for [result (sort-by :position (filter #(= (:classification-id %) classification-id)
                                             (:results all-data)))
           :let [rider (get-in all-data [:riders (:rider-id result)])]]
       [:tr {:id (:result-id result)}
        [:td (:surname rider)]
        [:td (:name rider)]
        [:td (:plate-number result)]
        [:td (:position result)]
        [:td (:points result)]])]]])

(rum/defc event-card
  [all-data {:keys [event-id name date] :as event-data}]
  [:div.event-card
   [:div.event-field
    [:label "Название события"]
    [:div.field-value name]]
   [:div.event-field
    [:label "Дата"]
    [:div.field-value date]]
   [:div "Классификация"]
   (for [classification (filter #(= (:event-id %) event-id)
                                (vals (:classifications all-data)))]
     (classification-card all-data classification))])

;; Логарифмическая функция оценки - снижение кол-ва очков логарифмическое
;; и зависит от кол-ва участников
;; \text{Points}(r) = P_{\text{max}} \cdot \frac{\log(N + 1) - \log(r)}{\log(N + 1)}
;; Округляем до второго знака по обычным правилам
(defn position-points4 [total position amount]
  (.setScale (bigdec
               (* total (/ (- (Math/log (inc amount)) (Math/log position))
                           (Math/log (inc amount)))))
             2
             RoundingMode/HALF_UP))

;; Примеры начисления очков в зависимости от места и общего пула:
(comment
  (for [pos (range 1 16)]
    [pos (position-points2 140 pos)])

  (for [pos (range 1 100)]
    [pos (position-points3 240 pos 100)])

  (for [pos (range 1 100)]
    [pos (position-points4 240 pos 100)]))


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
                  (assoc result :points (position-points4 (:first-place-points classification)
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

(rum/defc index-page []
  [:html
   [:head
    [:meta {:http-equiv "Content-Type" :content "text/html; charset=UTF-8"}]
    [:meta {:name "viewport" :content "width=device-width, initial-scale=1.0"}]
    ;; TODO: favicon
    [:title "Enduro Rating"]
    (inline-style (slurp (io/resource "styles.css")))
    (inline-js (slurp (io/resource "scripts.js")))]
   [:body
    [:h1 "2025 год"]
    [:h2 "Сводная таблица по гонщикам"]
    ;; Collect into vector
    (let [riders-top-score
          (for [rider (vals (:riders data2025-map))
                :let [results (filter #(= (:rider-id %) (:rider-id rider))
                                      (:results data2025-map))]
                ;; только для тех у кого есть какие-то очки
                :when (seq results)]
            {:rider   rider
             :total   (reduce + 0M (map :points results))
             :results results})
          events (sort-by #(LocalDate/parse (:date %)) (vals (:events data2025-map)))
          riders-data (reverse (sort-by :total riders-top-score))]
      [:table
       [:thead
        (-> [:tr
             [:th "#"]
             [:th "Гонщик"]]
            (into (map
                    (fn [event]
                      [:th (:name event)]))
                  events)
            (into [[:th "Всего"]]))]

       (into [:tbody]
             (map (fn [[idx {:keys [total rider results]}]]
                    (-> [:tr
                         [:td (inc idx)]
                         [:td (str/join " " [(:surname rider) (:name rider)])]]
                        (into
                          (map (fn [{:keys [event-id]}]
                                 ;; Тут мы считаем что в одном событии гонщик может участвовать только в одном зачете
                                 (let [result (first (filter #(= (:event-id %) event-id) results))
                                       classification (get-in data2025-map [:classifications (:classification-id result)])]
                                   ;; TODO: подсветить результат
                                   [:td {:class (:equivalent classification)
                                         :onclick (str "highlightRow('" (:result-id result) "')")}
                                    [:a {:href (str "#" (:result-id result))}
                                     (:points result)]])))
                          events)
                        (into [[:td total]]))))
             (map vector (range) riders-data))])

    [:h2 "Гонки и результаты"]
    (for [event (sort-by #(LocalDate/parse (:date %)) (vals (:events data2025-map)))]
      (event-card data2025-map event))]])

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