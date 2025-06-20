(ns enrating.data.checks)

;; Автоматические проверки данных

(defn- unique-values!
  [collection key error-fn]
  (reduce
    (fn [a v]
      (if (contains? a v)
        (error-fn v)
        (conj a v)))
    #{}
    (map key collection)))

(defn sanity-checks!
  [data]
  (doseq [[id classification] (group-by :classification-id (filter #(= (:type %) :result) data))]
    ;; Внутри зачета - каждый пилот, каждый стартовый номер и каждое место должно быть только один раз
    (unique-values! classification :rider-id
                    (fn [v]
                      (throw (ex-info (format "В зачете %s уже есть гонщик %s"
                                              id v)
                                      {}))))
    (unique-values! classification :plate-number
                    (fn [v]
                      (throw (ex-info (format "В зачете %s уже есть гонщик со стартовым номером %s"
                                              id v)
                                      {}))))
    (unique-values! classification :rider-id
                    (fn [v]
                      (throw (ex-info (format "В зачете %s уже есть гонщик с итоговым местом %s"
                                              id v)
                                      {}))))

    ;; TODO: position - число
    ;; TODO: нет "дырок" в позициях
    ;; TODO: есть атрибуты для подсчета очков
    )
  data)
