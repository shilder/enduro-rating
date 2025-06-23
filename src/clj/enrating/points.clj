(ns enrating.points
  (:import (java.math RoundingMode)))

;; Функции для расчетов очков - математическая модель рейтинга

(def difficulties-map
  {:gold   {:name              "Уровень Золото / Gold / Профессионалы"
            ;; У голда мультипликатор очков, так как считается что класс сложнее
            :points-multiplier 1.5M
            ;; И сдвинутая точка отсечения - последнее место в голде по логике
            ;; должно получать хотя бы немного больше очков чем в бронзе
            :cutoff-multiplier 1.25M}
   :silver {:name              "Уровень Серебро / Silver / Эксперты"
            ;; Аналогично голду, но коэффициенты пониже
            :points-multiplier 1.2M
            :cutoff-multiplier 1.1M}
   :bronze {:name              "Уровень Бронза / Bronze / Хобби"
            :points-multiplier 1M
            :cutoff-multiplier 1M}
   :iron   {:name              "Уровень Железо / Iron / Новички"
            :points-multiplier 0.8M
            :cutoff-multiplier 1M}
   ;; Тут конечно несколько дискриминируем, но как правило в зачете
   ;; леди участники слабее чем в бронзе/железе
   :lady   {:name              "Уровень Леди / Lady"
            :points-multiplier 0.5M
            :cutoff-multiplier 1M}})

;; Логарифмическая функция оценки - снижение кол-ва очков логарифмическое
;; и зависит от кол-ва участников (мы используем т.н. точку отсечения)
;; \text{Points}(r) = P_{\text{max}} \cdot \frac{\log(N + 1) - \log(r)}{\log(N + 1)}
;; Округляем до второго знака по обычным правилам
(defn position-points-log [total position cutoff]
  (.setScale (bigdec
               (let [norm (Math/log (+ cutoff 1.0))]
                 (* total (/ (- norm (Math/log position)) norm))))
             2
             RoundingMode/HALF_UP))

(defn- check-equivalent! [equivalent]
  (when (not (contains? difficulties-map equivalent))
    (throw (ex-info (str "Неверный условный класс сложности: " equivalent) {}))))

;; Расчет сложности зачета
;; Очков за первое место - зависит от сложности события (трасса, уровень участников, и тд)
;; Цифра конечно субъективная, но тут крайне тяжело добиться объективности
;;
;; Сложность гонки
;; Сложность круга * кол-во кругов * штраф за малочисленность
;; TODO: сделать доп баллы за уровень участников ?
(defn first-place-points [laps-count lap-difficulty equivalent points-multiplier]
  (check-equivalent! equivalent)
  (* laps-count
     (bigdec lap-difficulty)
     (get-in difficulties-map [equivalent :points-multiplier])
     (bigdec (or points-multiplier 1))))

;; Расчет точки отсечения - зависит от класса
(defn calculate-cutoff [equivalent count]
  (check-equivalent! equivalent)
  (let [multiplier (get-in difficulties-map [equivalent :cutoff-multiplier])]
    (long (Math/round (* (double count)
                         multiplier)))))
