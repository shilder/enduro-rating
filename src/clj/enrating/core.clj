(ns enrating.core
  (:require [clojure.java.io :as io]
            [rum.core :as rum]
            [rum.server-render]
            [enrating.data.2025]
            [enrating.data.riders]
            [ns-tracker.core :as nt])
  (:import (java.time LocalDate)))



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

(rum/defc classification-card [all-data {:keys [name base-points classification-id] :as classification-data}]
  [:div.event-card
   [:div.event-field
    [:label "Название класса"]
    [:div.field-value name]]
   [:div.event-field
    [:label "Базовый пул очков для этого класса"]
    [:div.field-value base-points]]
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
       [:tr
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

(def positions-map
  {1 0.178M
   2 0.142M
   3 0.114M
   4 0.093M
   5 0.079M
   6 0.071M
   7 0.064M
   8 0.058M
   9 0.053M
   10 0.049M})

;; Калька с сетки MotoGP, там фиксированный пул в 140 очков за событие
;; идея в том что в топ попасть значительно сложнее, поэтому большая часть очков
;; распределяется в рамках первой десятки, остальным достаются копейки
(defn- position-points [total position]
  (let [multiplier (or (get positions-map position)
                       (max 0.001M (- 0.045M (* 0.001M (- position 6)))))]
    (* multiplier total)))


;; Примеры начисления очков в зависимости от места и общего пула:
(comment
  (for [pos (range 1 16)]
    [pos (position-points 140 pos)])

  (for [pos (range 1 100)]
    [pos (position-points 240 pos)]))


(defn inline-style [content]
  [:style {:type "text/css"
           :dangerouslySetInnerHTML {:__html content}}])

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
                  (assoc result :points (position-points (:base-points classification) (:position result)))))
              results))))

(def data2025-map
  (let [raw-data2025 (enrating.data.2025/data)]
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
    (inline-style (slurp (io/resource "styles.css")))]
   [:body
    [:h1 "2025 год"]
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

;; Auto-reload for changes in data - will regenerate pages on every change

(def modified-namespaces
  (nt/ns-tracker ["src"]))

(defn start-auto-reload []
  (println "Starting auto-reload thread")
  (let [thread (Thread. (fn []
                          (loop []
                            (doseq [ns-sym (modified-namespaces)]
                              (require ns-sym :reload))
                            (Thread/sleep 1000)
                            (recur))))]
    (.start thread)
    thread))

(defonce reload-thread (start-auto-reload))
