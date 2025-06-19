(ns enrating.data.2025
  (:require [clojure.string :as str]
            [enrating.data.riders :refer [find-rider-id]]
            [enrating.data.ids :refer [result-id classification-id]]))

;; Данные за 2025 год

;; TODO: богданович
;; TODO: алапаевск


;; Расчет точки отсечения - зависит от класса
(defn calculate-cutoff [equivalent count]
  (case equivalent
    ;; +25% от стартовавших для условного голда
    :gold
    (long (Math/round (* count 1.25)))

    ;; +10% от стартовавших для условного серебра
    :silver
    (long (Math/round (* count 1.1)))

    ;; Для всех остальных - кол-во стартовавших
    count))

;; Самая Легкая Гонка, первый этап - 24.05.2025
(def slg1
  [
   {:type     :event
    :name     "Самая Легкая Гонка"
    :date     "2025-05-24"
    :event-id "EALkbw"
    }

   ;; Результаты уровень 7
   (let [кругов 2
         сложность-круга 100.0
         стартовало 26
         штраф 1
         условный-класс :gold]
     {
      :type               :classification
      :classification-id  "CClUxywqlX4"
      :event-id           "EALkbw"
      :name               "Класс 7 / Уровень 7 / ХАРД, ЗОЛОТО"
      :equivalent         условный-класс

      :laps               кругов
      :lap-difficulty     сложность-круга
      :started-count      стартовало

      ;; Очков за первое место - зависит от сложности события (трасса, уровень участников, и тд)
      ;; Цифра конечно субъективная, но тут крайне тяжело добиться объективности
      ;;
      ;; Сложность гонки
      ;; Сложность круга * кол-во кругов * штраф за малочисленность
      ;; TODO: сделать доп баллы за уровень участников ?
      ;;
      ;; Штраф за малочисленность (кол-во стартовавших) - 1.0 - за кол-во больше 10, 0.5 - за кол-во меньше или равно 3
      :first-place-points (* кругов сложность-круга штраф)

      ;; точка отсечения
      ;; для бронзы/железа - кол-во стартовавших
      ;; для серебра - кол-во стартовавших + 10%
      ;; для золота - кол-во стартовавших + 25%
      :cutoff-point       (calculate-cutoff условный-класс стартовало)
      })


   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 1 :plate-number "23" :rider-id (find-rider-id "Никита" "Поляков")]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 2 :plate-number "10" :rider-id (find-rider-id "Евгений" "Цицимушкин")]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 3 :plate-number "165" :rider-id (find-rider-id "Андрей" "Мишагин")]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 4 :plate-number "22" :rider-id (find-rider-id "Павел" "Лядецкий")]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 5 :plate-number "943" :rider-id (find-rider-id "Константин" "Майбуров")]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 6 :plate-number "8" :rider-id (find-rider-id "Эрик" "Ишмаков")]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 7 :plate-number "6" :rider-id (find-rider-id "Роман" "Кузнецов")]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 8 :plate-number "25" :rider-id (find-rider-id "Артём" "Калинин")]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 9 :plate-number "19" :rider-id (find-rider-id "Денис" "Шилов")]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 10 :plate-number "13" :rider-id (find-rider-id "Денис" "Медведюк")]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 11 :plate-number "21" :rider-id (find-rider-id "Михаил" "Ушаков")]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 12 :plate-number "905" :rider-id (find-rider-id "Дамир" "Юсупов")]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 13 :plate-number "24" :rider-id (find-rider-id "Константин" "Калмыков")]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 14 :plate-number "1" :rider-id (find-rider-id "Александр" "Миронов")]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 15 :plate-number "12" :rider-id (find-rider-id "Алексей" "Кошелев")]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 16 :plate-number "9" :rider-id (find-rider-id "Артём" "Цуркан")]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 17 :plate-number "11" :rider-id (find-rider-id "Виталий" "Саитов")]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 18 :plate-number "910" :rider-id (find-rider-id "Николай" "Швед")]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 19 :plate-number "3" :rider-id (find-rider-id "Олег" "Габбасов")]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 20 :plate-number "16" :rider-id (find-rider-id "Сергей" "Терентьев")]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 21 :plate-number "14" :rider-id (find-rider-id "Вячеслав" "Ярулин")]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 22 :plate-number "4" :rider-id (find-rider-id "Ильфар" "Сарваров")]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 23 :plate-number "7" :rider-id (find-rider-id "Артем" "Иванов")]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 24 :plate-number "2" :rider-id (find-rider-id "Кирилл" "Синченко")]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 25 :plate-number "18" :rider-id (find-rider-id "Андрей" "Полномочнов")]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 26 :plate-number "5" :rider-id (find-rider-id "Ростислав" "Забродин")]

   ;; Результаты уровень 6
   (let [кругов 2
         сложность-круга 75.0
         стартовало 153
         штраф 1
         условный-класс :silver]
     {
      :type               :classification
      :classification-id  "CNyY6EmTHP8g"
      :event-id           "EALkbw"
      :name               "Класс 6 / Уровень 6 / ДВУХТАКТНЫЕ МОТОЦИКЛЫ"
      :equivalent         условный-класс
      :laps               кругов
      :lap-difficulty     сложность-круга
      :started-count      стартовало
      :first-place-points (* кругов сложность-круга штраф)
      :cutoff-point       (calculate-cutoff условный-класс стартовало)})

   ;; Страница 1
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 1 :plate-number "124" :rider-id (find-rider-id "Петр" "Адрианов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 2 :plate-number "208" :rider-id (find-rider-id "Евгений" "Журавский")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 3 :plate-number "264" :rider-id (find-rider-id "Константин" "Романов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 4 :plate-number "123" :rider-id (find-rider-id "Султан" "Хабибрахманов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 5 :plate-number "142" :rider-id (find-rider-id "Виктор" "Цыбулин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 6 :plate-number "147" :rider-id (find-rider-id "Дмитрий" "Аверин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 7 :plate-number "227" :rider-id (find-rider-id "Антон" "Харитонов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 8 :plate-number "200" :rider-id (find-rider-id "Владимир" "Бодрин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 9 :plate-number "916" :rider-id (find-rider-id "Алексей" "Созинов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 10 :plate-number "249" :rider-id (find-rider-id "Алексей" "Кокорин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 11 :plate-number "242" :rider-id (find-rider-id "Азат" "Галимов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 12 :plate-number "241" :rider-id (find-rider-id "Александр" "Выгодский")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 13 :plate-number "220" :rider-id (find-rider-id "Алексей" "Семилетов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 14 :plate-number "195" :rider-id (find-rider-id "Евгений" "Федин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 15 :plate-number "927" :rider-id (find-rider-id "Ринат" "Хафизов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 16 :plate-number "115" :rider-id (find-rider-id "Виталий" "Ощепков")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 17 :plate-number "256" :rider-id (find-rider-id "Матвей" "Захаров")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 18 :plate-number "230" :rider-id (find-rider-id "Илья" "Кузнецов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 19 :plate-number "224" :rider-id (find-rider-id "Андрей" "Ломакин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 20 :plate-number "141" :rider-id (find-rider-id "Константин" "Кетов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 21 :plate-number "254" :rider-id (find-rider-id "Евгений" "Боярских")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 22 :plate-number "103" :rider-id (find-rider-id "Егор" "Кочетов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 23 :plate-number "167" :rider-id (find-rider-id "Иван" "Вербилович")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 24 :plate-number "211" :rider-id (find-rider-id "Денис" "Зараменских")]
   ;; Страница 2
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 25 :plate-number "140" :rider-id (find-rider-id "Дмитрий" "Ахманаев")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 26 :plate-number "154" :rider-id (find-rider-id "Александр" "Некрасов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 27 :plate-number "203" :rider-id (find-rider-id "Михаил" "Жилин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 28 :plate-number "252" :rider-id (find-rider-id "Евгений" "Данилов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 29 :plate-number "131" :rider-id (find-rider-id "Антон" "Толкачев")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 30 :plate-number "129" :rider-id (find-rider-id "Денис" "Козлов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 31 :plate-number "128" :rider-id (find-rider-id "Виктор" "Калинин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 32 :plate-number "934" :rider-id (find-rider-id "Влад" "Чибаков")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 33 :plate-number "251" :rider-id (find-rider-id "Вадим" "Лугаськов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 34 :plate-number "207" :rider-id (find-rider-id "Владимир" "Вязин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 35 :plate-number "120" :rider-id (find-rider-id "Евгений" "Шигабеев")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 36 :plate-number "219" :rider-id (find-rider-id "Вадим" "Ахтямов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 37 :plate-number "169" :rider-id (find-rider-id "Юрий" "Бороздин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 38 :plate-number "184" :rider-id (find-rider-id "Андрей" "Склюев")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 39 :plate-number "246" :rider-id (find-rider-id "Иван" "Филиппов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 40 :plate-number "236" :rider-id (find-rider-id "Алексей" "Лепаев")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 41 :plate-number "174" :rider-id (find-rider-id "Кирилл" "Азаров")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 42 :plate-number "118" :rider-id (find-rider-id "Антон" "Зырянов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 43 :plate-number "215" :rider-id (find-rider-id "Владимир" "Носков")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 44 :plate-number "920" :rider-id (find-rider-id "Артем" "Свяжин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 45 :plate-number "105" :rider-id (find-rider-id "Дмитрий" "Иванов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 46 :plate-number "237" :rider-id (find-rider-id "Константин" "Маркелов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 47 :plate-number "911" :rider-id (find-rider-id "Кирилл" "Галкин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 48 :plate-number "218" :rider-id (find-rider-id "Михаил" "Фурсов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 49 :plate-number "136" :rider-id (find-rider-id "Андрей" "Шаталин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 50 :plate-number "130" :rider-id (find-rider-id "Виктор" "Попов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 51 :plate-number "178" :rider-id (find-rider-id "Андрей" "Шафигулин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 52 :plate-number "135" :rider-id (find-rider-id "Владислав" "Пашнин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 53 :plate-number "234" :rider-id (find-rider-id "Федор" "Сборошенко")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 54 :plate-number "121" :rider-id (find-rider-id "Евгений" "Белькевич")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 55 :plate-number "915" :rider-id (find-rider-id "Алексей" "Гуляев")]
   ;; Страница 3
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 56 :plate-number "204" :rider-id (find-rider-id "Михаил" "Унесихин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 57 :plate-number "245" :rider-id (find-rider-id "Александр" "Перевозчиков")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 58 :plate-number "132" :rider-id (find-rider-id "Данил" "Кварацхелия")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 59 :plate-number "222" :rider-id (find-rider-id "Николай" "Семенов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 60 :plate-number "214" :rider-id (find-rider-id "Матвей" "Тиунов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 61 :plate-number "186" :rider-id (find-rider-id "Антон" "Чикин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 62 :plate-number "160" :rider-id (find-rider-id "Никитин" "Дмитрий")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 63 :plate-number "152" :rider-id (find-rider-id "Виталий" "Стаценков")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 64 :plate-number "170" :rider-id (find-rider-id "Алексей" "Мостовой")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 65 :plate-number "205" :rider-id (find-rider-id "Денис" "Прошакин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 66 :plate-number "231" :rider-id (find-rider-id "Кирилл" "Казанцев")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 67 :plate-number "233" :rider-id (find-rider-id "Денис" "Скоров")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 68 :plate-number "217" :rider-id (find-rider-id "Илья" "Юзеев")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 69 :plate-number "146" :rider-id (find-rider-id "Олег" "Поленков")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 70 :plate-number "112" :rider-id (find-rider-id "Евгений" "Ярославцев")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 71 :plate-number "225" :rider-id (find-rider-id "Михаил" "Попов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 72 :plate-number "150" :rider-id (find-rider-id "Тимофей" "Максимов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 73 :plate-number "259" :rider-id (find-rider-id "Владимир" "Тясин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 74 :plate-number "107" :rider-id (find-rider-id "Алексей" "Захаров")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 75 :plate-number "926" :rider-id (find-rider-id "Андрей" "Куцепендик")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 76 :plate-number "202" :rider-id (find-rider-id "Амир" "Сарваритдинов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 77 :plate-number "134" :rider-id (find-rider-id "Александр" "Белых")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 78 :plate-number "182" :rider-id (find-rider-id "Владимир" "Киселёв")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 79 :plate-number "138" :rider-id (find-rider-id "Дмитрий" "Мокиенко")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 80 :plate-number "117" :rider-id (find-rider-id "Артур" "Поздеев")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 81 :plate-number "119" :rider-id (find-rider-id "Анатолий" "Ванчинов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 82 :plate-number "137" :rider-id (find-rider-id "Иван" "Тихонов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 83 :plate-number "173" :rider-id (find-rider-id "Иван" "Чирков")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 84 :plate-number "153" :rider-id (find-rider-id "Николай" "Обожин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 85 :plate-number "255" :rider-id (find-rider-id "Антон" "Галюк")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 86 :plate-number "265" :rider-id (find-rider-id "Евгений" "Чурин")]
   ;; Страница 4
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 87 :plate-number "180" :rider-id (find-rider-id "Владимир" "Николаев")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 88 :plate-number "166" :rider-id (find-rider-id "Алексей" "Залесов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 89 :plate-number "126" :rider-id (find-rider-id "Сергей" "Вакушин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 90 :plate-number "229" :rider-id (find-rider-id "Станислав" "Тарасов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 91 :plate-number "143" :rider-id (find-rider-id "Никита" "Баранов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 92 :plate-number "226" :rider-id (find-rider-id "Данила" "Фролов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 93 :plate-number "223" :rider-id (find-rider-id "Иван" "Адам")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 94 :plate-number "108" :rider-id (find-rider-id "Александр" "Мугулов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 95 :plate-number "158" :rider-id (find-rider-id "Игорь" "Мальков")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 96 :plate-number "196" :rider-id (find-rider-id "Игорь" "Теплоухов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 97 :plate-number "144" :rider-id (find-rider-id "Игорь" "Ситников")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 98 :plate-number "258" :rider-id (find-rider-id "Владислав" "Култышев")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 99 :plate-number "177" :rider-id (find-rider-id "Александр" "Мерзляков")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 100 :plate-number "239" :rider-id (find-rider-id "Станислав" "Зеленских")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 101 :plate-number "183" :rider-id (find-rider-id "Владимир" "Гусев")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 102 :plate-number "240" :rider-id (find-rider-id "Александр" "Савонин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 103 :plate-number "261" :rider-id (find-rider-id "Кирилл" "Егоров")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 104 :plate-number "191" :rider-id (find-rider-id "Александр" "Осколков")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 105 :plate-number "159" :rider-id (find-rider-id "Руслан" "Сафин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 106 :plate-number "923" :rider-id (find-rider-id "Юрий" "Рысин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 107 :plate-number "521" :rider-id (find-rider-id "Дмитрий" "Долженко")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 108 :plate-number "209" :rider-id (find-rider-id "Владимир" "Иванов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 109 :plate-number "193" :rider-id (find-rider-id "Ален" "Кокшаров")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 110 :plate-number "906" :rider-id (find-rider-id "Иван" "Колягин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 111 :plate-number "235" :rider-id (find-rider-id "Вадим" "Мезенцев")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 112 :plate-number "190" :rider-id (find-rider-id "Денис" "Денисюк")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 113 :plate-number "948" :rider-id (find-rider-id "Семён" "Томилов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 114 :plate-number "106" :rider-id (find-rider-id "Денис" "Бирюков")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 115 :plate-number "913" :rider-id (find-rider-id "Алексей" "Злобин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 116 :plate-number "109" :rider-id (find-rider-id "Рамиль" "Хакимов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 117 :plate-number "111" :rider-id (find-rider-id "Юрий" "Хицов")]
   ;; Страница 5
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 118 :plate-number "942" :rider-id (find-rider-id "Дмитрий" "Прыкин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 119 :plate-number "176" :rider-id (find-rider-id "Сергей" "Максимов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 120 :plate-number "156" :rider-id (find-rider-id "Сергей" "Уфимцев")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 121 :plate-number "172" :rider-id (find-rider-id "Сергей" "Баранов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 122 :plate-number "206" :rider-id (find-rider-id "Андрей" "Верещагин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 123 :plate-number "243" :rider-id (find-rider-id "Иван" "Кукурузов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 124 :plate-number "149" :rider-id (find-rider-id "Дамир" "Хабибрахманов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 125 :plate-number "244" :rider-id (find-rider-id "Алексей" "Калашников")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 126 :plate-number "940" :rider-id (find-rider-id "Сергей" "Богатырёв")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 127 :plate-number "133" :rider-id (find-rider-id "Александр" "Жмаков")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 128 :plate-number "122" :rider-id (find-rider-id "Мыкалов" "Владимир")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 129 :plate-number "125" :rider-id (find-rider-id "Александр" "Чикишев")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 131 :plate-number "221" :rider-id (find-rider-id "Олег" "Сухарев")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 132 :plate-number "216" :rider-id (find-rider-id "Евгений" "Каширин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 133 :plate-number "201" :rider-id (find-rider-id "Ильшат" "Нигматуллин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 134 :plate-number "189" :rider-id (find-rider-id "Виталий" "Шаяхметов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 135 :plate-number "181" :rider-id (find-rider-id "Руслан" "Салыев")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 136 :plate-number "127" :rider-id (find-rider-id "Станислав" "Зубков")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 137 :plate-number "179" :rider-id (find-rider-id "Данил" "Береговой")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 138 :plate-number "151" :rider-id (find-rider-id "Александр" "Беспалов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 139 :plate-number "161" :rider-id (find-rider-id "Егор" "Камалов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 140 :plate-number "101" :rider-id (find-rider-id "Максим" "Килин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 141 :plate-number "210" :rider-id (find-rider-id "Андрей" "Ершов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 142 :plate-number "194" :rider-id (find-rider-id "Николай" "Савочкин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 143 :plate-number "162" :rider-id (find-rider-id "Худорожков" "Петр")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 144 :plate-number "110" :rider-id (find-rider-id "Владимир" "Филимончук")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 145 :plate-number "175" :rider-id (find-rider-id "Павел" "Байдала")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 146 :plate-number "250" :rider-id (find-rider-id "Евгений" "Шестаков")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 147 :plate-number "168" :rider-id (find-rider-id "Сергей" "Беличев")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 148 :plate-number "157" :rider-id (find-rider-id "Сергей" "Нелюбин")]
   ;; Страница 6
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 149 :plate-number "238" :rider-id (find-rider-id "Дмитрий" "Шматков")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 150 :plate-number "262" :rider-id (find-rider-id "Артём" "Душин")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 151 :plate-number "171" :rider-id (find-rider-id "Максим" "Кабаненко")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 152 :plate-number "199" :rider-id (find-rider-id "Иван" "Попов")]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 153 :plate-number "333" :rider-id (find-rider-id "Максим" "Антонов")]

   ;; Результаты уровень 5
   (let [кругов 2
         ;; Такая же сложность как и для класса 6
         сложность-круга 75.0
         стартовало 28
         штраф 1
         условный-класс :silver]
     {
      :type               :classification
      :classification-id  "CQuv6rI64Fg"
      :event-id           "EALkbw"
      :name               "Класс 5 / Уровень 5 / ВОДЯНОЙ"
      :equivalent         условный-класс
      :laps               кругов
      :lap-difficulty     сложность-круга
      :started-count      стартовало
      :first-place-points (* кругов сложность-круга штраф)
      :cutoff-point       (calculate-cutoff условный-класс стартовало)
      })
   ;; Страница 1
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 1 :plate-number "320" :rider-id (enrating.data.riders/find-rider-id "Владимир" "Пономарчук")]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 2 :plate-number "325" :rider-id (enrating.data.riders/find-rider-id "Сергей" "Кузнецов")]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 3 :plate-number "311" :rider-id (enrating.data.riders/find-rider-id "Александр" "Полянин")]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 4 :plate-number "303" :rider-id (enrating.data.riders/find-rider-id "Виктор" "Шабуров")]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 5 :plate-number "327" :rider-id (enrating.data.riders/find-rider-id "Антон" "Стелюк")]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 6 :plate-number "305" :rider-id (enrating.data.riders/find-rider-id "Сергей" "Дубровин")]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 7 :plate-number "317" :rider-id (enrating.data.riders/find-rider-id "Антон" "Тырыкин")]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 8 :plate-number "329" :rider-id (enrating.data.riders/find-rider-id "Артем" "Денисов")]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 9 :plate-number "312" :rider-id (enrating.data.riders/find-rider-id "Андрей" "Волков")]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 10 :plate-number "328" :rider-id (enrating.data.riders/find-rider-id "Ярослав" "Саломатин")]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 11 :plate-number "330" :rider-id (enrating.data.riders/find-rider-id "Дмитрий" "Холкин")]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 12 :plate-number "332" :rider-id (enrating.data.riders/find-rider-id "Ростислав" "Зиязов")]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 13 :plate-number "322" :rider-id (enrating.data.riders/find-rider-id "Евгений" "Моисеев")]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 14 :plate-number "932" :rider-id (enrating.data.riders/find-rider-id "Андрей" "Похващев")]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 15 :plate-number "302" :rider-id (enrating.data.riders/find-rider-id "Артём" "Кириллов")]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 16 :plate-number "331" :rider-id (enrating.data.riders/find-rider-id "Евгений" "Достовалов")]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 17 :plate-number "919" :rider-id (enrating.data.riders/find-rider-id "Иван" "Заболоцкий")]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 18 :plate-number "310" :rider-id (enrating.data.riders/find-rider-id "Вадим" "Тихонов")]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 19 :plate-number "307" :rider-id (enrating.data.riders/find-rider-id "Олег" "Хвостенко")]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 20 :plate-number "306" :rider-id (enrating.data.riders/find-rider-id "Александр" "Анисимов")]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 21 :plate-number "304" :rider-id (enrating.data.riders/find-rider-id "Андрей" "Староватов")]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 22 :plate-number "316" :rider-id (enrating.data.riders/find-rider-id "Иван" "Соболев")]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 23 :plate-number "321" :rider-id (enrating.data.riders/find-rider-id "Олег" "Копытов")]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 24 :plate-number "309" :rider-id (enrating.data.riders/find-rider-id "Эдуард" "Мордюженко")]
   ;; Страница 2
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 25 :plate-number "308" :rider-id (enrating.data.riders/find-rider-id "Александр" "Орбан")]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 26 :plate-number "314" :rider-id (enrating.data.riders/find-rider-id "Антон" "Овчинников")]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 27 :plate-number "324" :rider-id (enrating.data.riders/find-rider-id "Максим" "Кокшаров")]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 28 :plate-number "326" :rider-id (enrating.data.riders/find-rider-id "Андрей" "Маликов")]


   {:type :event
    :name "The Stalker - 1 Этап"
    :date "2025-05-17"
    :event-id "Eo2KmTA"}

   (let [кругов 3
         ;; У Золота было посложнее - была парочка подъемов
         сложность-круга 70.0
         стартовало 6
         ;; Мало участников было очень - придется штрафануть
         штраф 0.8
         условный-класс :gold]
     {
      :type               :classification
      :classification-id  "CyMOX89K67hY"
      :event-id           "Eo2KmTA"
      :name               "Gold"
      :equivalent         условный-класс
      :laps               кругов
      :lap-difficulty     сложность-круга
      :started-count      стартовало

      :first-place-points (* кругов сложность-круга штраф)
      :cutoff-point       (calculate-cutoff условный-класс стартовало)
      })

   ;; TODO: команда и город здесь (может меняться у гонщика, но не в протоколе)
   {:type :result :event-id "Eo2KmTA" :classification-id "CyMOX89K67hY" :position 1 :plate-number "6" :rider-id (find-rider-id "Евгений" "Цицимушкин") :team "Южный Урал мотоспорт" :motorcycle "Husqvarna TE300"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CyMOX89K67hY" :position 2 :plate-number "2" :rider-id (find-rider-id "Павел" "Лядецкий") :team "TuPizza Enduro Team" :motorcycle "Gas Gas EC300R TPI"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CyMOX89K67hY" :position 3 :plate-number "1" :rider-id (find-rider-id "Егор" "Емельянов") :team "MotikoGroup" :motorcycle "Beta"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CyMOX89K67hY" :position 4 :plate-number "5" :rider-id (find-rider-id "Вахтанг" "Гагуа") :motorcycle "KTM 300 EXC"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CyMOX89K67hY" :position 5 :plate-number "4" :rider-id (find-rider-id "Михаил" "Ушаков") :motorcycle "KTM 300 EXC"}
   ;; DNF ??
   {:type :result :event-id "Eo2KmTA" :classification-id "CyMOX89K67hY" :position 6 :plate-number "3" :rider-id (find-rider-id "Артур" "Пресняков") :motorcycle "KTM 300 EXC"}

   (let [кругов 3
         сложность-круга 50.0
         стартовало 18
         условный-класс :silver]
     {
      :type               :classification
      :classification-id  "CX0NGKT0qMZA"
      :event-id           "Eo2KmTA"
      :name               "Silver"
      :equivalent         условный-класс
      :laps               кругов
      :lap-difficulty     сложность-круга
      :started-count      стартовало

      :first-place-points (* кругов сложность-круга)
      :cutoff-point       (calculate-cutoff условный-класс стартовало)
      })

   {:type :result :event-id "Eo2KmTA" :classification-id "CX0NGKT0qMZA" :position 1 :plate-number "23" :rider-id (find-rider-id "Петр" "Петанов") :motorcycle "Husqvarna TE300"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CX0NGKT0qMZA" :position 2 :plate-number "24" :rider-id (find-rider-id "Алексей" "Семилетов") :motorcycle "KTM"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CX0NGKT0qMZA" :position 3 :plate-number "30" :rider-id (find-rider-id "Дмитрий" "Яруллин") :team "Extreme Ekb (Uktus)" :motorcycle "KTM 300 EXC"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CX0NGKT0qMZA" :position 4 :plate-number "35" :rider-id (find-rider-id "Виктор" "Цыбулин") :team "Зацепанет" :motorcycle "Husqvarna TE300"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CX0NGKT0qMZA" :position 5 :plate-number "26" :rider-id (find-rider-id "Евгений" "Данилов") :team "Team A-Motors" :motorcycle "Husqvarna TE300"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CX0NGKT0qMZA" :position 6 :plate-number "25" :rider-id (find-rider-id "Алексей" "Кокорин") :motorcycle "KTM 300 EXC"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CX0NGKT0qMZA" :position 7 :plate-number "33" :rider-id (find-rider-id "Владимир" "Тясин") :motorcycle "KTM"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CX0NGKT0qMZA" :position 8 :plate-number "36" :rider-id (find-rider-id "Александр" "Демьянов") :motorcycle "Kews k23"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CX0NGKT0qMZA" :position 9 :plate-number "22" :rider-id (find-rider-id "Юрий" "Бороздин") :motorcycle "KTM"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CX0NGKT0qMZA" :position 10 :plate-number "38" :rider-id (find-rider-id "Андрей" "Склюев") :motorcycle "Husqvarna TE300"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CX0NGKT0qMZA" :position 11 :plate-number "32" :rider-id (find-rider-id "Илья" "Кругликов") :motorcycle "Beta"}
   ;; DNFs ? TODO: учесть не финишеров
   {:type :result :event-id "Eo2KmTA" :classification-id "CX0NGKT0qMZA" :position 12 :plate-number "21" :rider-id (find-rider-id "Евгений" "Мирзаметов") :motorcycle "КТМ"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CX0NGKT0qMZA" :position 13 :plate-number "37" :rider-id (find-rider-id "Артем" "Чернецкий") :team "НАУКА" :motorcycle "FAIDET NC300S ULTRA"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CX0NGKT0qMZA" :position 14 :plate-number "34" :rider-id (find-rider-id "Денис" "Шилов") :motorcycle "КТМ 300 EXC"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CX0NGKT0qMZA" :position 15 :plate-number "29" :rider-id (find-rider-id "Роман" "Карнаухов") :motorcycle "КТМ"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CX0NGKT0qMZA" :position 16 :plate-number "28" :rider-id (find-rider-id "Артём" "Тараненко") :motorcycle "КТМ"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CX0NGKT0qMZA" :position 17 :plate-number "31" :rider-id (find-rider-id "Александр" "Тютиков") :motorcycle "Koshine"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CX0NGKT0qMZA" :position 18 :plate-number "27" :rider-id (find-rider-id "Алексей" "Коротаев") :team "Арматура" :motorcycle "Husqvarna TE300 "}

   (let [кругов 3
         ;; Не такая простая бронза была на самом деле
         сложность-круга 30.0
         стартовало 13
         условный-класс :bronze]
     {
      :type               :classification
      :classification-id  "CkE6aHK3mE5w"
      :event-id           "Eo2KmTA"
      :name               "Bronze"
      :equivalent         условный-класс
      :laps               кругов
      :lap-difficulty     сложность-круга
      :started-count      стартовало

      :first-place-points (* кругов сложность-круга)
      :cutoff-point       (calculate-cutoff условный-класс стартовало)
      })

   {:type :result :event-id "Eo2KmTA" :classification-id "CkE6aHK3mE5w" :position 1 :plate-number "88" :rider-id (find-rider-id "Артем" "Свяжин") :team "Азимут66"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CkE6aHK3mE5w" :position 2 :plate-number "78" :rider-id (find-rider-id "Виталий" "Грачев") :team "ЭндуроБаранчинский" :motorcycle "ВОЗДУШКА"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CkE6aHK3mE5w" :position 3 :plate-number "76" :rider-id (find-rider-id "Динар" "Сибагатуллин") :motorcycle "GR8 300 2T"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CkE6aHK3mE5w" :position 4 :plate-number "81" :rider-id (find-rider-id "Денис" "Стафеев") :motorcycle "FX moto"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CkE6aHK3mE5w" :position 5 :plate-number "79" :rider-id (find-rider-id "Алексей" "Поздеев") :motorcycle "Artic EXE 880"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CkE6aHK3mE5w" :position 6 :plate-number "82" :rider-id (find-rider-id "Даниил" "Патокин") :motorcycle "Gr8"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CkE6aHK3mE5w" :position 7 :plate-number "84" :rider-id (find-rider-id "Евгений" "Беломестных") :motorcycle "Yamaha yz450f"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CkE6aHK3mE5w" :position 8 :plate-number "85" :rider-id (find-rider-id "Алексей" "Судариков") :motorcycle "Hengjian z300"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CkE6aHK3mE5w" :position 9 :plate-number "87" :rider-id (find-rider-id "Виталий" "Скульбашевский") :motorcycle "Beta r300"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CkE6aHK3mE5w" :position 10 :plate-number "83" :rider-id (find-rider-id "Андрей" "Муравьёв") :motorcycle "Sharmax sport 300 air black edition"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CkE6aHK3mE5w" :position 11 :plate-number "77" :rider-id (find-rider-id "Николай" "Глущенко") :team "Dirty Style Team" :motorcycle "Yamaha wr250f"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CkE6aHK3mE5w" :position 12 :plate-number "80" :rider-id (find-rider-id "Михаил" "Тясин") :team "Азимут 66"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CkE6aHK3mE5w" :position 13 :plate-number "86" :rider-id (find-rider-id "Анна" "Шилова") :motorcycle "Husqvarna ТЕ150"}
   ]
  )

(defn process-data
  [row]
  (let [row (if (vector? row)
              (into {} (map vec (partition 2 row)))
              row)
        row (if (and (= (:type row) :result)
                     (nil? (:result-id row)))
              (assoc row :result-id (enrating.data.ids/result-id))
              row)]
    row))

(defn- unique-values!
  [collection key error-fn]
  (reduce
    (fn [a v]
      (if (contains? a v)
        (error-fn v)
        (conj a v)))
    #{}
    (map key collection)))

;; TODO: перенести в core
(defn sanity-checks
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

    )
  data)

(def data
  (sanity-checks (map process-data slg1)))
