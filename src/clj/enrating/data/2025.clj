(ns enrating.data.2025
  (:require [enrating.data.riders :refer [find-rider-id]]
            [enrating.data.ids :refer [result-id classification-id]]
            [enrating.data.checks :as checks]
            [enrating.points :as points]))

;; Данные за 2025 год

;; TODO: добавить время из протоколов
;; TODO: добавить информацию о кол-ве кругов/факта финиша

(def slg1
  [
   {:type         :event
    :name         "Самая Легкая Гонка"
    :date         "2025-05-24"
    :event-url    "https://dolina.su/race-2025"
    :telegram-url "https://t.me/easyrace"
    :event-id     "EALkbw"
    }

   ;; Результаты уровень 7
   (let [кругов 2
         сложность-круга 90
         стартовало 26
         условный-класс :gold]
     {
      :type              :classification
      :classification-id "CClUxywqlX4"
      :event-id          "EALkbw"
      :name              "Класс 7 / Уровень 7 / ХАРД, ЗОЛОТО"
      :equivalent        условный-класс
      :laps              кругов
      :lap-difficulty    сложность-круга
      :started-count     стартовало
      :order             1
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
         сложность-круга 70
         стартовало 153
         условный-класс :silver]
     {
      :type              :classification
      :classification-id "CNyY6EmTHP8g"
      :event-id          "EALkbw"
      :name              "Класс 6 / Уровень 6 / ДВУХТАКТНЫЕ МОТОЦИКЛЫ"
      :order             2
      :equivalent        условный-класс
      :laps              кругов
      :lap-difficulty    сложность-круга
      :started-count     стартовало})

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
         сложность-круга 70
         стартовало 28
         условный-класс :silver]
     {
      :type              :classification
      :classification-id "CQuv6rI64Fg"
      :event-id          "EALkbw"
      :name              "Класс 5 / Уровень 5 / ВОДЯНОЙ"
      :order             3
      :equivalent        условный-класс
      :laps              кругов
      :lap-difficulty    сложность-круга
      :started-count     стартовало
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

   ;; Результаты уровень 4
   (let [кругов 2
         ;; Такая же сложность как и для класса 5/6
         сложность-круга 70
         стартовало 17
         условный-класс :silver]
     {
      :type              :classification
      :classification-id "CeY5ORDnv0j4"
      :event-id          "EALkbw"
      :order             4
      :name              "Класс 4 / Уровень 4 / ВОЗДУШКА"
      :equivalent        условный-класс
      :laps              кругов
      :lap-difficulty    сложность-круга
      :started-count     стартовало
      })

   ;; Страница 1
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 1 :plate-number "921" :rider-id (find-rider-id "Семён" "Скулкин")]
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 4 :plate-number "407" :rider-id (find-rider-id "Леонид" "Асташов")]
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 2 :plate-number "404" :rider-id (find-rider-id "Павел" "Стаин")]
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 5 :plate-number "405" :rider-id (find-rider-id "Ринат" "Нохов")]
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 3 :plate-number "922" :rider-id (find-rider-id "Евгений" "Мирзаметов")]
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 11 :plate-number "406" :rider-id (find-rider-id "Василий" "Тараторин")]
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 15 :plate-number "412" :rider-id (find-rider-id "Александр" "Талыгин")]
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 6 :plate-number "415" :rider-id (find-rider-id "Егор" "Коноплев")]
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 12 :plate-number "411" :rider-id (find-rider-id "Роман" "Белоногов")]
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 7 :plate-number "419" :rider-id (find-rider-id "Виктор" "Медведев")]
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 8 :plate-number "402" :rider-id (find-rider-id "Максим" "Пестов")]
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 9 :plate-number "416" :rider-id (find-rider-id "Илья" "Ефимов")]
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 10 :plate-number "418" :rider-id (find-rider-id "Александр" "Ишонин")]
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 16 :plate-number "408" :rider-id (find-rider-id "Дмитрий" "Сажин")]
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 14 :plate-number "904" :rider-id (find-rider-id "Сергей" "Ужегов")]
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 13 :plate-number "413" :rider-id (find-rider-id "Александр" "Зверев")]
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 17 :plate-number "417" :rider-id (find-rider-id "Максим" "Паршаков")]

   ;; TODO: разобраться с уровнем 3 / 2 - что-то не сходится
   ;; Результаты уровень 3
   (let [кругов 4
         сложность-круга 25.0
         стартовало 56
         условный-класс :bronze]
     {
      :type              :classification
      :classification-id "CtOb9wIT2lI"
      :event-id          "EALkbw"
      :order             5
      :name              "Класс 3 / Уровень 3 / КАНТРИ КРОСС"
      :equivalent        условный-класс
      :laps              кругов
      :lap-difficulty    сложность-круга
      :started-count     стартовало
      })

   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 1 :plate-number "507" :rider-id (find-rider-id "Александр" "Новопашин")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 2 :plate-number "554" :rider-id (find-rider-id "Александр" "Бескровный")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 3 :plate-number "511" :rider-id (find-rider-id "Сергей" "Борисов")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 4 :plate-number "548" :rider-id (find-rider-id "Дмитрий" "Тимошевский")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 5 :plate-number "539" :rider-id (find-rider-id "Александр" "Кабаев")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 6 :plate-number "528" :rider-id (find-rider-id "Алексей" "Слабочков")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 7 :plate-number "938" :rider-id (find-rider-id "Василий" "Дудников")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 8 :plate-number "541" :rider-id (find-rider-id "Евгений" "Исупов")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 9 :plate-number "517" :rider-id (find-rider-id "Валера" "Варгасов")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 10 :plate-number "502" :rider-id (find-rider-id "Артём" "Котельников")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 11 :plate-number "542" :rider-id (find-rider-id "Алексей" "Фадеев")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 12 :plate-number "534" :rider-id (find-rider-id "Константин" "Тынкасов")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 13 :plate-number "537" :rider-id (find-rider-id "Владислав" "Хонькин")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 14 :plate-number "925" :rider-id (find-rider-id "Антон" "Аристахов")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 15 :plate-number "547" :rider-id (find-rider-id "Денис" "Воробьев")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 16 :plate-number "552" :rider-id (find-rider-id "Александр" "Исаев")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 17 :plate-number "510" :rider-id (find-rider-id "Василий" "Жук")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 18 :plate-number "501" :rider-id (find-rider-id "Сергей" "Анисимов")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 19 :plate-number "513" :rider-id (find-rider-id "Евгений" "Василькин")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 20 :plate-number "941" :rider-id (find-rider-id "Дмитрий" "Прядко")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 21 :plate-number "949" :rider-id (find-rider-id "Алексей" "Полыгалов")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 22 :plate-number "505" :rider-id (find-rider-id "Алексей" "Ищук")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 23 :plate-number "516" :rider-id (find-rider-id "Александр" "Сумин")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 24 :plate-number "545" :rider-id (find-rider-id "Максим" "Тимошевский")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 25 :plate-number "531" :rider-id (find-rider-id "Владислав" "Мочалов")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 26 :plate-number "509" :rider-id (find-rider-id "Александр" "Храмов")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 27 :plate-number "557" :rider-id (find-rider-id "Василий" "Кармацких")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 28 :plate-number "503" :rider-id (find-rider-id "Андрей" "Созыкин")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 29 :plate-number "540" :rider-id (find-rider-id "Алексей" "Самойлов")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 30 :plate-number "556" :rider-id (find-rider-id "Сергей" "Лазукин")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 31 :plate-number "525" :rider-id (find-rider-id "Роман" "Ахмадиев")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 32 :plate-number "538" :rider-id (find-rider-id "Александр" "Михалев")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 33 :plate-number "929" :rider-id (find-rider-id "Евгений" "Симаков")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 34 :plate-number "518" :rider-id (find-rider-id "Александр" "Курчев")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 35 :plate-number "543" :rider-id (find-rider-id "Станислав" "Евдокимов")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 36 :plate-number "918" :rider-id (find-rider-id "Владимир" "Жданов")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 37 :plate-number "909" :rider-id (find-rider-id "Денис" "Деревенченко")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 38 :plate-number "512" :rider-id (find-rider-id "Алексей" "Матвеев")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 39 :plate-number "536" :rider-id (find-rider-id "Антон" "Кийко")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 40 :plate-number "526" :rider-id (find-rider-id "Евгений" "Максимов")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 41 :plate-number "546" :rider-id (find-rider-id "Вячеслав" "Салмин")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 42 :plate-number "520" :rider-id (find-rider-id "Константин" "Одиноков")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 43 :plate-number "515" :rider-id (find-rider-id "Юрий" "Лобко")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 44 :plate-number "550" :rider-id (find-rider-id "Сергей" "Потлов")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 45 :plate-number "555" :rider-id (find-rider-id "Никита" "Мохнин")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 46 :plate-number "535" :rider-id (find-rider-id "Иван" "Мохнин")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 47 :plate-number "524" :rider-id (find-rider-id "Алексей" "Сазанов")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 48 :plate-number "945" :rider-id (find-rider-id "Михаил" "Дегтярёв")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 49 :plate-number "946" :rider-id (find-rider-id "Андрей" "Дегтярёв")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 50 :plate-number "529" :rider-id (find-rider-id "Иван" "Моисеев")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 51 :plate-number "508" :rider-id (find-rider-id "Константин" "Розенбаум")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 52 :plate-number "504" :rider-id (find-rider-id "Дмитрий" "Чирков")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 54 :plate-number "527" :rider-id (find-rider-id "Сергей" "Уткин")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 55 :plate-number "532" :rider-id (find-rider-id "Александр" "Орешко")]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 56 :plate-number "544" :rider-id (find-rider-id "Сергей" "Ягудин")]

   ;; Результаты уровень 2 - девушки
   (let [кругов 4
         ;; Такая же сложность как и для класса 3
         сложность-круга 25.0
         стартовало 10
         условный-класс :lady]
     {
      :type              :classification
      :classification-id "CbnNqePYIllI"
      :event-id          "EALkbw"
      :name              "Класс 2 / Уровень 2 / ЛЕДИ"
      :order             6
      :equivalent        условный-класс
      :laps              кругов
      :lap-difficulty    сложность-круга
      :started-count     стартовало
      })

   ;; Страница 1
   [:type :result :event-id "EALkbw" :classification-id "CbnNqePYIllI" :position 1 :plate-number "606" :rider-id (find-rider-id "Дарья" "Шабловская")]
   [:type :result :event-id "EALkbw" :classification-id "CbnNqePYIllI" :position 2 :plate-number "604" :rider-id (find-rider-id "Ксения" "Потапович")]
   [:type :result :event-id "EALkbw" :classification-id "CbnNqePYIllI" :position 3 :plate-number "602" :rider-id (find-rider-id "Анна" "Медведева")]
   [:type :result :event-id "EALkbw" :classification-id "CbnNqePYIllI" :position 4 :plate-number "605" :rider-id (find-rider-id "Марина" "Аверина")]
   [:type :result :event-id "EALkbw" :classification-id "CbnNqePYIllI" :position 5 :plate-number "603" :rider-id (find-rider-id "Ульяна" "Храмцова")]
   [:type :result :event-id "EALkbw" :classification-id "CbnNqePYIllI" :position 6 :plate-number "607" :rider-id (find-rider-id "Юлия" "Березинских")]
   [:type :result :event-id "EALkbw" :classification-id "CbnNqePYIllI" :position 7 :plate-number "609" :rider-id (find-rider-id "Анастасия" "Шилова")]
   [:type :result :event-id "EALkbw" :classification-id "CbnNqePYIllI" :position 8 :plate-number "601" :rider-id (find-rider-id "Маргарита" "Гришина")]
   [:type :result :event-id "EALkbw" :classification-id "CbnNqePYIllI" :position 9 :plate-number "610" :rider-id (find-rider-id "Анна" "Евграфова")]
   [:type :result :event-id "EALkbw" :classification-id "CbnNqePYIllI" :position 10 :plate-number "937" :rider-id (find-rider-id "Наталья" "Макеева")]
   ])


(def stalker1
  [
   {:type     :event
    :name     "The Stalker League - 1 Этап"
    :date     "2025-05-17"
    :event-id "Eo2KmTA"}

   (let [кругов 3
         ;; У Золота было немного посложнее - была парочка подъемов
         сложность-круга 60.0
         стартовало 6
         ;; Мало участников было очень - придется штрафануть
         штраф 0.8
         условный-класс :gold]
     {
      :type                   :classification
      :classification-id      "CyMOX89K67hY"
      :event-id               "Eo2KmTA"
      :name                   "Gold"
      :order                  1
      :equivalent             условный-класс
      :laps                   кругов
      :lap-difficulty         сложность-круга
      :started-count          стартовало
      :points-multiplier      штраф
      :multiplier-description "Мало участников"
      })

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
      :type              :classification
      :classification-id "CX0NGKT0qMZA"
      :event-id          "Eo2KmTA"
      :name              "Silver"
      :order             2
      :equivalent        условный-класс
      :laps              кругов
      :lap-difficulty    сложность-круга
      :started-count     стартовало
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
   {:type :result :event-id "Eo2KmTA" :classification-id "CX0NGKT0qMZA" :position 12 :plate-number "21" :rider-id (find-rider-id "Евгений" "Мирзаметов") :motorcycle "КТМ"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CX0NGKT0qMZA" :position 13 :plate-number "37" :rider-id (find-rider-id "Артем" "Чернецкий") :team "НАУКА" :motorcycle "FAIDET NC300S ULTRA"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CX0NGKT0qMZA" :position 14 :plate-number "34" :rider-id (find-rider-id "Денис" "Шилов") :motorcycle "КТМ 300 EXC"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CX0NGKT0qMZA" :position 15 :plate-number "29" :rider-id (find-rider-id "Роман" "Карнаухов") :motorcycle "КТМ"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CX0NGKT0qMZA" :position 16 :plate-number "28" :rider-id (find-rider-id "Артём" "Тараненко") :motorcycle "КТМ"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CX0NGKT0qMZA" :position 17 :plate-number "31" :rider-id (find-rider-id "Александр" "Тютиков") :motorcycle "Koshine"}
   {:type :result :event-id "Eo2KmTA" :classification-id "CX0NGKT0qMZA" :position 18 :plate-number "27" :rider-id (find-rider-id "Алексей" "Коротаев") :team "Арматура" :motorcycle "Husqvarna TE300 "}

   (let [кругов 3
         ;; Не такая простая бронза была на самом деле
         сложность-круга 35.0
         стартовало 13
         условный-класс :bronze]
     {
      :type              :classification
      :classification-id "CkE6aHK3mE5w"
      :event-id          "Eo2KmTA"
      :name              "Bronze"
      :order             3
      :equivalent        условный-класс
      :laps              кругов
      :lap-difficulty    сложность-круга
      :started-count     стартовало
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
   ])


(def lesnik1
  (let [event-id "EcmuQVQ"]
    [
     {:type     :event
      :name     "Путь Лесника 2025"
      :date     "2025-05-17"
      :event-id event-id}

     (let [кругов 2
           ;; Считаем примерно как кантри-кросс солнечной долины
           сложность-круга 25.0
           стартовало 100
           условный-класс :bronze]
       {
        :type              :classification
        :classification-id "CL5ILfQIBrCw"
        :event-id          event-id
        :name              "На расслабоне"
        :order             2
        :equivalent        условный-класс
        :laps              кругов
        :lap-difficulty    сложность-круга
        :started-count     стартовало
        })

     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 1 :plate-number "150" :rider-id (find-rider-id "Владимир" "Архипов") :team "Прохват72 team" :motorcycle "Kews k16"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 2 :plate-number "134" :rider-id (find-rider-id "Андрей" "Русинов") :motorcycle "GR8"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 3 :plate-number "157" :rider-id (find-rider-id "Владислав" "Хонькин") :team "АНО \"МОТОСПОРТ74\"" :motorcycle "Husqvarna te300"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 4 :plate-number "155" :rider-id (find-rider-id "Евгений" "Василькин") :team "Прохват72 team" :motorcycle "Gas Gas"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 5 :plate-number "203" :rider-id (find-rider-id "Евгений" "Камаев") :team "Богданович-BSL" :motorcycle "GR8"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 6 :plate-number "193" :rider-id (find-rider-id "Алексей" "Пилипчук") :motorcycle "Beta 300rr"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 7 :plate-number "197" :rider-id (find-rider-id "Игорь" "Куценко") :team "Gravity" :motorcycle "BRZ x5s"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 8 :plate-number "133" :rider-id (find-rider-id "Федор" "Колпаков") :motorcycle "Kayo K1 "}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 9 :plate-number "146" :rider-id (find-rider-id "Константин" "Никитин") :motorcycle "GR8 optium"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 10 :plate-number "205" :rider-id (find-rider-id "Алексей" "Кузнецов") :team "Богданович-BSL" :motorcycle "КТМ"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 11 :plate-number "141" :rider-id (find-rider-id "Алексей" "Шестаков") :team "Enduro Live" :motorcycle "Kews k20 nc250"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 12 :plate-number "206" :rider-id (find-rider-id "Михаил" "Попов") :team "Вектор" :motorcycle "GR 8"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 13 :plate-number "130" :rider-id (find-rider-id "Егор" "Новопашин") :motorcycle "Yamaha WR 450"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 14 :plate-number "101" :rider-id (find-rider-id "Роман" "Максимов") :motorcycle "Kews k16"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 15 :plate-number "108" :rider-id (find-rider-id "Антон" "Юрин") :team "Прохват72 team" :motorcycle "DS MOTO 250 2t"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 16 :plate-number "149" :rider-id (find-rider-id "Александр" "Перов") :motorcycle "KTM ex 300 2t"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 17 :plate-number "109" :rider-id (find-rider-id "Артем" "Баранов") :team "Enduro VP" :motorcycle "GR 8 МТ250"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 18 :plate-number "186" :rider-id (find-rider-id "Евгений" "Подъезжих") :team "Эндуро Бро Асбест" :motorcycle "Регульмото"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 19 :plate-number "165" :rider-id (find-rider-id "Матвей" "Мангилев") :motorcycle "BSE M2"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 20 :plate-number "163" :rider-id (find-rider-id "Анатолий" "Середкин") :motorcycle "Kayo T2 250"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 21 :plate-number "194" :rider-id (find-rider-id "Александр" "Доросинский") :motorcycle "КТМ"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 22 :plate-number "128" :rider-id (find-rider-id "Павел" "Татаринов") :motorcycle "GR7"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 23 :plate-number "195" :rider-id (find-rider-id "Николай" "Карпенко") :motorcycle "GR8"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 24 :plate-number "116" :rider-id (find-rider-id "Владимир" "Кадырин") :team "Enduro VP" :motorcycle "Питон мото 300"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 25 :plate-number "145" :rider-id (find-rider-id "Сергей" "Кузьмин") :team "K-Ur Enduro" :motorcycle "GR7 PR300"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 26 :plate-number "152" :rider-id (find-rider-id "Станислав" "Карнаухов") :motorcycle "Hengiian 300 2t"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 27 :plate-number "180" :rider-id (find-rider-id "Павел" "Федоровых") :motorcycle "Regulmoto "}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 28 :plate-number "198" :rider-id (find-rider-id "Денис" "Булатов") :motorcycle ""}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 29 :plate-number "172" :rider-id (find-rider-id "Алексей" "Родионов") :team "МОЕМОТО_ЕКВ" :motorcycle "Rockot r300"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 30 :plate-number "204" :rider-id (find-rider-id "Сергей" "Гулонян") :team "Богданович-BSL" :motorcycle "Kayo k2"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 31 :plate-number "202" :rider-id (find-rider-id "Дмитрий" "Холкин") :team "Богданович-BSL" :motorcycle "Regulmoto "}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 33 :plate-number "167" :rider-id (find-rider-id "Михаил" "Пудов") :motorcycle "Yamaha yz 450f"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 34 :plate-number "189" :rider-id (find-rider-id "Илья" "Саргин") :motorcycle "Kayo T2"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 35 :plate-number "135" :rider-id (find-rider-id "Александр" "Локшин") :motorcycle "КТМ"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 36 :plate-number "187" :rider-id (find-rider-id "Егор" "Борняков") :motorcycle "GR7"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 37 :plate-number "153" :rider-id (find-rider-id "Александр" "Полехин") :motorcycle "XGS K26"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 38 :plate-number "110" :rider-id (find-rider-id "Егор" "Павлов") :motorcycle "GR 8 МТ250"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 39 :plate-number "139" :rider-id (find-rider-id "Александр" "Матвеев") :team "MintForсe team" :motorcycle "Hengiian z300"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 40 :plate-number "131" :rider-id (find-rider-id "Кирилл" "Новопашин") :motorcycle "GR 8"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 42 :plate-number "119" :rider-id (find-rider-id "Петр" "Антонов") :motorcycle "Kayo K4"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 45 :plate-number "154" :rider-id (find-rider-id "Рашид" "Ибрагимов") :team "Прохват72 team" :motorcycle "Beta"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 46 :plate-number "171" :rider-id (find-rider-id "Павел" "Пудов") :motorcycle "Yamaha WR 450"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 47 :plate-number "111" :rider-id (find-rider-id "Юрий" "Дьячков") :motorcycle "Kews k16"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 48 :plate-number "102" :rider-id (find-rider-id "Макар" "Шангареев") :team "Enduro VP" :motorcycle "GR8"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 49 :plate-number "158" :rider-id (find-rider-id "Вячеслав" "Лопатин") :motorcycle "Yamaha yz250f"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 50 :plate-number "192" :rider-id (find-rider-id "Андрей" "Каратаев") :motorcycle ""}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 51 :plate-number "168" :rider-id (find-rider-id "Вячеслав" "Волков") :team "Дилетанты enduro" :motorcycle "Xinguizun 300"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 52 :plate-number "103" :rider-id (find-rider-id "Спартак" "Шангареев") :team "Enduro VP" :motorcycle "GR8"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 53 :plate-number "183" :rider-id (find-rider-id "Андрей" "Антонов") :motorcycle "GR8 300 2t"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 54 :plate-number "175" :rider-id (find-rider-id "Михаил" "Сычев") :team "МОЕМОТО_ЕКВ" :motorcycle "GR7 250"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 57 :plate-number "164" :rider-id (find-rider-id "Владислав" "Светлаков") :motorcycle "Kews k23"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 58 :plate-number "170" :rider-id (find-rider-id "Иван" "Коркин") :motorcycle "Kayo t4"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 59 :plate-number "173" :rider-id (find-rider-id "Олег" "Гоголев") :team "МОЕМОТО_ЕКВ" :motorcycle "Kayo K5"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 60 :plate-number "184" :rider-id (find-rider-id "Виталий" "Фуртаев") :motorcycle "Kews k16"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 61 :plate-number "174" :rider-id (find-rider-id "Константин" "Яковлев") :team "МОЕМОТО_ЕКВ" :motorcycle "Racer 300"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 62 :plate-number "162" :rider-id (find-rider-id "Александр" "Кайнов") :motorcycle "Kayo T2 300"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 64 :plate-number "113" :rider-id (find-rider-id "Антон" "Кадников") :motorcycle "Сурон"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 65 :plate-number "129" :rider-id (find-rider-id "Равиль" "Сарваров") :motorcycle "JHL Z4"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 66 :plate-number "115" :rider-id (find-rider-id "Леонид" "Чепиль") :team "Enduro VP" :motorcycle "Progasi 450"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 67 :plate-number "182" :rider-id (find-rider-id "Андрей" "Волков") :team "Эндуро Бро Асбест" :motorcycle "Kayo K4"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 68 :plate-number "92" :rider-id (find-rider-id "Иван" "Мохнин") :motorcycle "Avantis pro 300 carb"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 69 :plate-number "91" :rider-id (find-rider-id "Сергей" "Уткин") :motorcycle "TRX 300 4t"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 70 :plate-number "159" :rider-id (find-rider-id "Сергей" "Сивинских") :motorcycle "GR-7"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 71 :plate-number "125" :rider-id (find-rider-id "Иван" "Баранков") :motorcycle "GR 8"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 72 :plate-number "104" :rider-id (find-rider-id "Матвей" "Донских") :motorcycle "Kews k16 cb250r"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 73 :plate-number "105" :rider-id (find-rider-id "Никита" "Зырянов") :motorcycle "BSE Z1"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 74 :plate-number "112" :rider-id (find-rider-id "Антон" "Бородин") :motorcycle "GR7"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 77 :plate-number "118" :rider-id (find-rider-id "Александр" "Орбан") :motorcycle "GR8"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 78 :plate-number "120" :rider-id (find-rider-id "Антон" "Юнусов") :motorcycle "GR8"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 79 :plate-number "121" :rider-id (find-rider-id "Дмитрий" "Канюков") :motorcycle "Kayo T2"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 80 :plate-number "123" :rider-id (find-rider-id "Никита" "Насонов") :motorcycle "Kayo t4"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 81 :plate-number "124" :rider-id (find-rider-id "Алексей" "Ширяев") :motorcycle "JHL LX5"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 82 :plate-number "126" :rider-id (find-rider-id "Владислав" "Куклин") :motorcycle "Jhl tgr"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 83 :plate-number "127" :rider-id (find-rider-id "Иван" "Кенчин") :motorcycle "Ataki"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 84 :plate-number "136" :rider-id (find-rider-id "Артем" "Максимов") :team "Only Top team" :motorcycle ""}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 85 :plate-number "137" :rider-id (find-rider-id "Сергей" "Максимов") :team "Only Top team" :motorcycle "Kews К16 Lanza"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 87 :plate-number "140" :rider-id (find-rider-id "Евгений" "Перевощиков") :team "MintForсe team" :motorcycle "Kews k16 CB250R"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 88 :plate-number "142" :rider-id (find-rider-id "Даниил" "Доронин") :motorcycle "SYCMCC 300cc"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 89 :plate-number "143" :rider-id (find-rider-id "Сергей" "Клевцов") :motorcycle "KAYO T4"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 90 :plate-number "144" :rider-id (find-rider-id "Михаил" "Бобыкин") :motorcycle "KEWS k10 pr 300"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 91 :plate-number "151" :rider-id (find-rider-id "Алексей" "Опаков") :motorcycle "Hengiian 300 2t"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 92 :plate-number "156" :rider-id (find-rider-id "Дмитрий" "Бобков") :motorcycle "GR 8"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 93 :plate-number "160" :rider-id (find-rider-id "Денис" "Борисов") :motorcycle "Racer 125"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 94 :plate-number "161" :rider-id (find-rider-id "Евгений" "Сухотин") :motorcycle "КТМ exc 300 2t"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 95 :plate-number "169" :rider-id (find-rider-id "Леонид" "Старков") :motorcycle "Suzuki dr250"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 96 :plate-number "177" :rider-id (find-rider-id "Олег" "Садыков") :team "Enduro VP" :motorcycle "Kews К16 nb300"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 97 :plate-number "178" :rider-id (find-rider-id "Константин" "Бачев") :motorcycle ""}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 98 :plate-number "185" :rider-id (find-rider-id "Тимофей" "Тихонов") :motorcycle "Kayo K1 "}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 99 :plate-number "196" :rider-id (find-rider-id "Матвей" "Иванов") :team "Gravity" :motorcycle "BRZ x5s"}
     {:type :result :event-id event-id :classification-id "CL5ILfQIBrCw" :position 100 :plate-number "199" :rider-id (find-rider-id "Федор" "Щвецов") :motorcycle "Garo Q8"}

     (let [кругов 3
           ;; Считаем примерно как серебро Сталкера
           сложность-круга 50.0
           стартовало 96
           условный-класс :silver]
       {:type              :classification
        :classification-id "CCHpFTiWmQks"
        :event-id          event-id
        :name              "На опыте"
        :order             1
        :equivalent        условный-класс
        :laps              кругов
        :lap-difficulty    сложность-круга
        :started-count     стартовало})

     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 1 :plate-number "3" :rider-id (find-rider-id "Станислав" "Максимов") :team "Прохват72team" :motorcycle "Beta xt"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 2 :plate-number "54" :rider-id (find-rider-id "Евгений" "Журавский") :team "JJ Moto" :motorcycle "Husqvarna 300"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 3 :plate-number "46" :rider-id (find-rider-id "Евгений" "Захаров") :team "JJ Moto" :motorcycle "Husqvarna te250"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 4 :plate-number "12" :rider-id (find-rider-id "Сергей" "Чигвинцев") :team "Эндуро Произвол" :motorcycle "Husqvarna te300"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 5 :plate-number "95" :rider-id (find-rider-id "Дмитрий" "Никитин") :team "AGUSHA team" :motorcycle "Husqvarna te300"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 6 :plate-number "97" :rider-id (find-rider-id "Алексей" "Санаров") :motorcycle "КТМ"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 7 :plate-number "81" :rider-id (find-rider-id "Виктор" "Шабуров") :team "Северка Екатеринбург" :motorcycle "Kews k23 nc300s "}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 8 :plate-number "59" :rider-id (find-rider-id "Павел" "Хисамутдинов") :motorcycle "КТМ 300"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 9 :plate-number "43" :rider-id (find-rider-id "Дмитрий" "Аверин") :motorcycle "KTM 300"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 10 :plate-number "70" :rider-id (find-rider-id "Антон" "Толкачев") :team "Corona" :motorcycle "КТМ"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 11 :plate-number "63" :rider-id (find-rider-id "Артем" "Сердитых") :motorcycle "KTM exc300tpi"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 12 :plate-number "18" :rider-id (find-rider-id "Константин" "Захаров") :motorcycle "Бета 200"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 13 :plate-number "7" :rider-id (find-rider-id "Антон" "Коробейников") :team "NICE ENDURO" :motorcycle "GR8 300 2т"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 14 :plate-number "16" :rider-id (find-rider-id "Кирилл" "Егоров") :motorcycle "КТМ"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 15 :plate-number "47" :rider-id (find-rider-id "Илья" "Кузнецов") :team "ДрынДуро" :motorcycle "KTM exc 300 tpi"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 16 :plate-number "60" :rider-id (find-rider-id "Дмитрий" "Иванов") :motorcycle "Koshine 302t"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 17 :plate-number "5" :rider-id (find-rider-id "Александр" "Новопашин") :team "Прохват72team" :motorcycle "Хенжан 250мт"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 18 :plate-number "304" :rider-id (find-rider-id "Максим" "Бормотов") :team "Cosmotec" :motorcycle "Beta"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 19 :plate-number "34" :rider-id (find-rider-id "Владимир" "Килунин") :motorcycle "Kayo T2"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 20 :plate-number "23" :rider-id (find-rider-id "Дмитрий" "Кандышев") :team "Дилетанты enduro" :motorcycle "GR8"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 21 :plate-number "19" :rider-id (find-rider-id "Андрей" "Кондовин") :team "Эндуро Произвол" :motorcycle "Beta xt"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 22 :plate-number "20" :rider-id (find-rider-id "Александр" "Храмцов") :motorcycle "Zuumav cb250"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 23 :plate-number "78" :rider-id (find-rider-id "Петр" "Хардин") :motorcycle "yamaha yz"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 24 :plate-number "11" :rider-id (find-rider-id "Евгений" "Габдулханов") :motorcycle "Ataki"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 25 :plate-number "67" :rider-id (find-rider-id "Александр" "Белых") :motorcycle "КТМ 300 exc"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 26 :plate-number "77" :rider-id (find-rider-id "Константин" "Вилисов") :team "Enduro revda" :motorcycle "GR8"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 27 :plate-number "39" :rider-id (find-rider-id "Дмитрий" "Аленьковский") :team "EnduroXXL team" :motorcycle "Шерко ТОП"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 28 :plate-number "10" :rider-id (find-rider-id "Сергей" "Шайбаков") :team "Эндуро Произвол" :motorcycle "Ержан"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 29 :plate-number "13" :rider-id (find-rider-id "Алексей" "Донских") :team "Эндуро Произвол" :motorcycle "GR8 300 2т"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 30 :plate-number "53" :rider-id (find-rider-id "Владислав" "Чибаков") :motorcycle "Бета"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 31 :plate-number "68" :rider-id (find-rider-id "Лев" "Буторин") :motorcycle "Ержан 302 2t"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 32 :plate-number "72" :rider-id (find-rider-id "Алексей" "Власов") :motorcycle "Hengiian 302"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 33 :plate-number "49" :rider-id (find-rider-id "Иван" "Ведерников") :team "NICE ENDURO" :motorcycle "Kews 250"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 34 :plate-number "8" :rider-id (find-rider-id "Виталий" "Горбачев") :team "Эндуро Произвол" :motorcycle "КТМ"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 35 :plate-number "48" :rider-id (find-rider-id "Александр" "Мугулов") :motorcycle "Koshine 302t"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 36 :plate-number "22" :rider-id (find-rider-id "Андрей" "Ковалев") :motorcycle "Хускварна"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 37 :plate-number "9" :rider-id (find-rider-id "Евгений" "Константинов") :team "Эндуро Произвол" :motorcycle "КТМ EXC 300"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 38 :plate-number "1" :rider-id (find-rider-id "Артем" "Дурницын") :motorcycle "GR7, 250 2т"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 39 :plate-number "2" :rider-id (find-rider-id "Александр" "Огорелышев") :motorcycle "BSE Z10"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 40 :plate-number "4" :rider-id (find-rider-id "Данил" "Старцев") :team "Дилетанты enduro" :motorcycle "Kews k16 cb250r"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 41 :plate-number "6" :rider-id (find-rider-id "Григорий" "Подкорытов") :team "ENDURO LIVE" :motorcycle "Хенжан 300 2т"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 42 :plate-number "14" :rider-id (find-rider-id "Олег" "Карелин") :motorcycle "GR8 Lanza TOP"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 43 :plate-number "15" :rider-id (find-rider-id "Игорь" "Чечулин") :motorcycle "Kews K16  "}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 44 :plate-number "17" :rider-id (find-rider-id "Александр" "Волков") :team "Дилетанты enduro" :motorcycle "Xinguizun 250"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 45 :plate-number "24" :rider-id (find-rider-id "Дамир" "Резванов") :motorcycle "КТМ 200"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 46 :plate-number "25" :rider-id (find-rider-id "Александр" "Федяев") :motorcycle "BSE Z5"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 47 :plate-number "27" :rider-id (find-rider-id "Евгений" "Ярославцев") :team "В поисках приключений" :motorcycle "GR8"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 48 :plate-number "28" :rider-id (find-rider-id "Степан" "Алексеев") :motorcycle "Honda XR250"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 49 :plate-number "29" :rider-id (find-rider-id "Роман" "Важенин") :motorcycle "Rieju mr 300"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 50 :plate-number "30" :rider-id (find-rider-id "Владимир" "Лазеев") :motorcycle "Kews k16 250"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 51 :plate-number "32" :rider-id (find-rider-id "Евгений" "Максимов") :team "URALFOX TEAM" :motorcycle "Kayo T2-G"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 52 :plate-number "33" :rider-id (find-rider-id "Алексей" "Захаров") :team "EnduroXXL team" :motorcycle "Kews k23 Lanza"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 53 :plate-number "35" :rider-id (find-rider-id "Владислав" "Фатеев") :team "MintForсe team" :motorcycle "Hengiian YBS300"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 54 :plate-number "36" :rider-id (find-rider-id "Павел" "Митрофанов") :team "ЭндуроКлуб" :motorcycle "КТМ"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 55 :plate-number "37" :rider-id (find-rider-id "Никита" "Полозников") :team "Enduro Guru" :motorcycle "Kayo K1"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 56 :plate-number "38" :rider-id (find-rider-id "Вячеслав" "Алферьев") :team "Реж-Хлеб" :motorcycle "Воздушка-чакушка 250"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 57 :plate-number "40" :rider-id (find-rider-id "Константин" "Сыров") :team "Эндуро Клуб" :motorcycle "GR8"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 58 :plate-number "41" :rider-id (find-rider-id "Алексей" "Матвеев") :motorcycle "Хускварна"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 59 :plate-number "44" :rider-id (find-rider-id "Дмитрий" "Бахарев") :team "Arteks moto" :motorcycle "Hengiian Z300"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 60 :plate-number "45" :rider-id (find-rider-id "Сергей" "Уфимцев") :team "Эндуро кружок" :motorcycle ""}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 61 :plate-number "50" :rider-id (find-rider-id "Ален" "Кокшаров") :motorcycle "Газмяс 250"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 62 :plate-number "51" :rider-id (find-rider-id "Константин" "Табанин") :team "Отдышка" :motorcycle "Husqvarna te300"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 63 :plate-number "52" :rider-id (find-rider-id "Андрей" "Кожемяков") :motorcycle "КТМ 300"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 64 :plate-number "55" :rider-id (find-rider-id "Анатолий" "Ванчинов") :team "Corona" :motorcycle "Бета 300rr"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 65 :plate-number "56" :rider-id (find-rider-id "Иван" "Тихонов") :team "Corona" :motorcycle "KTM exc 250"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 66 :plate-number "57" :rider-id (find-rider-id "Геронтий" "Гогиберидзе") :team "Corona" :motorcycle "КТМ"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 67 :plate-number "58" :rider-id (find-rider-id "Александр" "Рахмеев") :team "Отдышка" :motorcycle "KTM exc 300"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 68 :plate-number "62" :rider-id (find-rider-id "Денис" "Пастухов") :team "Синие псы" :motorcycle "Kews k23 2t"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 69 :plate-number "64" :rider-id (find-rider-id "Виталий" "Стаценков") :motorcycle "КТМ"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 70 :plate-number "65" :rider-id (find-rider-id "Сергей" "Солодянкин") :motorcycle "Hengiian 302"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 71 :plate-number "66" :rider-id (find-rider-id "Андрей" "Озорнин") :motorcycle "КТМ"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 72 :plate-number "69" :rider-id (find-rider-id "Павел" "Андреев") :team "URALFOX TEAM" :motorcycle "Apollo 300"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 73 :plate-number "71" :rider-id (find-rider-id "Тимофей" "Доросинский") :team "Dossik team" :motorcycle "КТМ"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 74 :plate-number "73" :rider-id (find-rider-id "Леонид" "Асташов") :team "EnduroXXL team" :motorcycle "Avantis 250"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 75 :plate-number "74" :rider-id (find-rider-id "Николай" "Авдюшев") :motorcycle "Kews 4t"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 76 :plate-number "75" :rider-id (find-rider-id "Максим" "Кабаненко") :motorcycle "КТМ"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 78 :plate-number "79" :rider-id (find-rider-id "Алексей" "Мамашев") :motorcycle "Koshine 302t"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 80 :plate-number "82" :rider-id (find-rider-id "Денис" "Румянцев") :motorcycle ""}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 81 :plate-number "83" :rider-id (find-rider-id "Сергей" "Блохин") :motorcycle ""}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 82 :plate-number "84" :rider-id (find-rider-id "Сергей" "Андраманов") :motorcycle ""}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 83 :plate-number "85" :rider-id (find-rider-id "Андрей" "Корелин") :motorcycle "Kayo K6 250"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 84 :plate-number "86" :rider-id (find-rider-id "Михаил" "Пашов") :motorcycle "Kews k16"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 85 :plate-number "87" :rider-id (find-rider-id "Александр" "Беляков") :motorcycle "Hengiian Z300"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 86 :plate-number "88" :rider-id (find-rider-id "Евгений" "Морозов") :motorcycle "Beta"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 87 :plate-number "89" :rider-id (find-rider-id "Владимир" "Мыкалов") :team "Эндуро кружок" :motorcycle "Beta 300"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 88 :plate-number "90" :rider-id (find-rider-id "Павел" "Гостюхин") :motorcycle "Beta"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 89 :plate-number "93" :rider-id (find-rider-id "Артем" "Савичев") :motorcycle "Husqvarna 300"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 90 :plate-number "94" :rider-id (find-rider-id "Алексей" "Васильев") :motorcycle "Зум 300"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 91 :plate-number "96" :rider-id (find-rider-id "Сергей" "Авдюков") :motorcycle "GR8 300 2т"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 92 :plate-number "99" :rider-id (find-rider-id "Игорь" "Хайруллов") :motorcycle ""}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 93 :plate-number "100" :rider-id (find-rider-id "Максим" "Морозов") :motorcycle "FXmoto х8"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 94 :plate-number "300" :rider-id (find-rider-id "Евгений" "Жилин") :motorcycle "Regulmoto"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 95 :plate-number "301" :rider-id (find-rider-id "Аркадий" "Баландин") :team "AGUSHA team" :motorcycle "Хускварна 300"}
     {:type :result :event-id event-id :classification-id "CCHpFTiWmQks" :position 96 :plate-number "303" :rider-id (find-rider-id "Дмитрий" "Брызгалов") :motorcycle "КТМ"}

     (let [кругов 2
           ;; Я так понял что трек тот же что и на расслабоне
           сложность-круга 25.0
           стартовало 15
           условный-класс :iron]
       {
        :type              :classification
        :classification-id "C64otektrHqg"
        :event-id          event-id
        :name              "На каникулах"
        :order             3
        :equivalent        условный-класс
        :laps              кругов
        :lap-difficulty    сложность-круга
        :started-count     стартовало
        })

     {:type :result :event-id event-id :classification-id "C64otektrHqg" :position 1 :plate-number "190" :rider-id (find-rider-id "Савелий" "Кунакбаев") :motorcycle ""}
     {:type :result :event-id event-id :classification-id "C64otektrHqg" :position 2 :plate-number "179" :rider-id (find-rider-id "Андрей" "Богомолов") :motorcycle "КТМ 85"}
     {:type :result :event-id event-id :classification-id "C64otektrHqg" :position 3 :plate-number "191" :rider-id (find-rider-id "Денис" "Кунакбаев") :motorcycle ""}
     {:type :result :event-id event-id :classification-id "C64otektrHqg" :position 4 :plate-number "132" :rider-id (find-rider-id "Артем" "Новопашин") :motorcycle "Kews k16"}
     {:type :result :event-id event-id :classification-id "C64otektrHqg" :position 5 :plate-number "106" :rider-id (find-rider-id "Егор" "Султангалеев") :motorcycle "GR7"}
     {:type :result :event-id event-id :classification-id "C64otektrHqg" :position 7 :plate-number "107" :rider-id (find-rider-id "Иван" "Моисеевских") :motorcycle "Motoland XT250HS"}
     {:type :result :event-id event-id :classification-id "C64otektrHqg" :position 8 :plate-number "122" :rider-id (find-rider-id "Михаил" "Чесноков") :motorcycle "Regulmoto atlet"}
     {:type :result :event-id event-id :classification-id "C64otektrHqg" :position 10 :plate-number "181" :rider-id (find-rider-id "Андрей" "Ляшенко") :motorcycle "kayo evo 140"}
     {:type :result :event-id event-id :classification-id "C64otektrHqg" :position 11 :plate-number "114" :rider-id (find-rider-id "Илья" "Болотов") :motorcycle "Kayo T2"}
     {:type :result :event-id event-id :classification-id "C64otektrHqg" :position 12 :plate-number "117" :rider-id (find-rider-id "Станислав" "Карелин") :motorcycle "Racer 125"}
     {:type :result :event-id event-id :classification-id "C64otektrHqg" :position 13 :plate-number "138" :rider-id (find-rider-id "Дмитрий" "Максимов") :team "URALFOX TEAM" :motorcycle "Kayo evolution 125"}
     {:type :result :event-id event-id :classification-id "C64otektrHqg" :position 14 :plate-number "166" :rider-id (find-rider-id "Дмитрий" "Пудов") :motorcycle "КТМ"}
     {:type :result :event-id event-id :classification-id "C64otektrHqg" :position 15 :plate-number "176" :rider-id (find-rider-id "Роман" "Лукин") :motorcycle "Motoland 140"}

     (let [кругов 2
           ;; Я так понял что трек тот же что и на расслабоне
           сложность-круга 25.0
           стартовало 2
           условный-класс :lady]
       {
        :type              :classification
        :classification-id "CX6xDHXjag"
        :event-id          event-id
        :name              "На каблуках"
        :order             4
        :equivalent        условный-класс
        :points-multiplier 0.8
        :multiplier-description "Мало участников"
        :laps              кругов
        :lap-difficulty    сложность-круга
        :started-count     стартовало
        })

     {:type :result :event-id event-id :classification-id "CX6xDHXjag" :position 1 :plate-number "201" :rider-id (find-rider-id "Юлия" "Березинских") :motorcycle "Beta Xтренер"}
     {:type :result :event-id event-id :classification-id "CX6xDHXjag" :position 2 :plate-number "148" :rider-id (find-rider-id "Марина" "Аверина") :motorcycle "Artic Leopard Snow"}

     ]))

(def bogdanovich1
  (let [event-id "E1rV2kA"
        points-multiplier 1.3
        multiplier-description "Плохая погода сильно усложнила трек"]
    [
     {:type     :event
      :name     "Взятие Кашинского городища 2025"
      :date     "2025-04-26"
      :event-url "https://marshalone.ru/card/e37e471b-beab-43c3-be8d-c497d760d85c"
      :telegram-url "https://t.me/EnduroBGD"
      :event-id event-id}

     (let [кругов 3
           сложность-круга 40.0
           стартовало 18
           условный-класс :gold]
       {
        :type              :classification
        :classification-id "C5H3OYYSHDnc"
        :event-id          event-id
        :name              "Gold"
        :order             1
        :points-multiplier points-multiplier
        :multiplier-description multiplier-description
        :equivalent        условный-класс
        :laps              кругов
        :lap-difficulty    сложность-круга
        :started-count     стартовало
        })

     {:type :result :event-id event-id :classification-id "C5H3OYYSHDnc" :position 1 :plate-number "8" :rider-id (find-rider-id "Сергей" "Тронин")}
     {:type :result :event-id event-id :classification-id "C5H3OYYSHDnc" :position 2 :plate-number "15" :rider-id (find-rider-id "Евгений" "Цицимушкин") :team "Южный Урал мотоспорт"}
     {:type :result :event-id event-id :classification-id "C5H3OYYSHDnc" :position 3 :plate-number "20" :rider-id (find-rider-id "Андрей" "Журавлев") :team "Avantis Racing Team"}
     {:type :result :event-id event-id :classification-id "C5H3OYYSHDnc" :position 4 :plate-number "11" :rider-id (find-rider-id "Павел" "Лядецкий") :team "TuPizza Enduro Team"}
     {:type :result :event-id event-id :classification-id "C5H3OYYSHDnc" :position 5 :plate-number "13" :rider-id (find-rider-id "Дамир" "Юсупов")}
     {:type :result :event-id event-id :classification-id "C5H3OYYSHDnc" :position 6 :plate-number "12" :rider-id (find-rider-id "Вахтанг" "Гагуа")}
     {:type :result :event-id event-id :classification-id "C5H3OYYSHDnc" :position 7 :plate-number "4" :rider-id (find-rider-id "Константин" "Захаров")}
     {:type :result :event-id event-id :classification-id "C5H3OYYSHDnc" :position 8 :plate-number "16" :rider-id (find-rider-id "Сергей" "Мезенцев")}
     {:type :result :event-id event-id :classification-id "C5H3OYYSHDnc" :position 9 :plate-number "19" :rider-id (find-rider-id "Константин" "Калмыков") :team "Южный Урал мотоспорт"}
     {:type :result :event-id event-id :classification-id "C5H3OYYSHDnc" :position 10 :plate-number "18" :rider-id (find-rider-id "Олег" "Габбасов") :team "УСМК"}
     {:type :result :event-id event-id :classification-id "C5H3OYYSHDnc" :position 11 :plate-number "2" :rider-id (find-rider-id "Семён" "Костяев")}
     {:type :result :event-id event-id :classification-id "C5H3OYYSHDnc" :position 12 :plate-number "14" :rider-id (find-rider-id "Вадим" "Черевко") :team "EnduroPerm"}
     {:type :result :event-id event-id :classification-id "C5H3OYYSHDnc" :position 13 :plate-number "3" :rider-id (find-rider-id "Артем" "Копытов") :team "Enduro Clinic"}
     {:type :result :event-id event-id :classification-id "C5H3OYYSHDnc" :position 14 :plate-number "1" :rider-id (find-rider-id "Егор" "Емельянов") :team "MotikoGroup"}
     {:type :result :event-id event-id :classification-id "C5H3OYYSHDnc" :position 15 :plate-number "17" :rider-id (find-rider-id "Константин" "Бортничук") :team "эндуро урал"}
     {:type :result :event-id event-id :classification-id "C5H3OYYSHDnc" :position 16 :plate-number "10" :rider-id (find-rider-id "Кирилл" "Пешков") :team "ENDURO KRK"}
     {:type :result :event-id event-id :classification-id "C5H3OYYSHDnc" :position 17 :plate-number "7" :rider-id (find-rider-id "Василий" "Тараторин") :team "Моховичковские псы"}
     {:type :result :event-id event-id :classification-id "C5H3OYYSHDnc" :position 18 :plate-number "6" :rider-id (find-rider-id "Александр" "Храмцов")}

     (let [кругов 2
           сложность-круга 40.0
           стартовало 46
           условный-класс :silver]
       {
        :type              :classification
        :classification-id "ChnSllmc6Y0"
        :event-id          event-id
        :name              "Silver"
        :order             2
        :equivalent        условный-класс
        :laps              кругов
        :lap-difficulty    сложность-круга
        :points-multiplier points-multiplier
        :multiplier-description multiplier-description
        :started-count     стартовало
        })

     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 1 :plate-number "54" :rider-id (find-rider-id "Владимир" "Иванов")}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 2 :plate-number "31" :rider-id (find-rider-id "Дмитрий" "Аверин")}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 3 :plate-number "23" :rider-id (find-rider-id "Владимир" "Мусихин") :team "Горназ эндуро"}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 4 :plate-number "74" :rider-id (find-rider-id "Алексей" "Санаров")}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 5 :plate-number "25" :rider-id (find-rider-id "Антон" "Толкачев")}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 6 :plate-number "61" :rider-id (find-rider-id "Илья" "Кругликов")}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 7 :plate-number "45" :rider-id (find-rider-id "Илья" "Кузнецов") :team "ДрынДуро"}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 8 :plate-number "28" :rider-id (find-rider-id "Владимир" "Богомолов") :team "enduro ural"}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 9 :plate-number "44" :rider-id (find-rider-id "Леонид" "Леонтьев") :team "Эндуро Тюмень"}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 10 :plate-number "57" :rider-id (find-rider-id "Александр" "Удачин") :team "KATAYENDURO"}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 11 :plate-number "60" :rider-id (find-rider-id "Александр" "Выгодский")}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 12 :plate-number "35" :rider-id (find-rider-id "Евгений" "Шигабеев")}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 13 :plate-number "21" :rider-id (find-rider-id "Кирилл" "Казанцев") :team "ENDURO KAMYSHLOV"}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 14 :plate-number "70" :rider-id (find-rider-id "Андрей" "Склюев")}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 15 :plate-number "38" :rider-id (find-rider-id "Алексей" "Мамашев")}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 16 :plate-number "37" :rider-id (find-rider-id "Андрей" "Полномочнов") :team "Enduro86"}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 17 :plate-number "50" :rider-id (find-rider-id "Кирилл" "Егоров")}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 18 :plate-number "56" :rider-id (find-rider-id "Антон" "Ершов")}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 19 :plate-number "22" :rider-id (find-rider-id "Иван" "Замиралов")}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 20 :plate-number "47" :rider-id (find-rider-id "Евгений" "Белькевич") :team "Осинки Мото"}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 21 :plate-number "40" :rider-id (find-rider-id "Алексей" "Семилетов")}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 22 :plate-number "32" :rider-id (find-rider-id "Геронтий" "Гогиберидзе")}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 23 :plate-number "55" :rider-id (find-rider-id "Иван" "Попов")}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 24 :plate-number "51" :rider-id (find-rider-id "Иван" "Филиппов")}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 25 :plate-number "59" :rider-id (find-rider-id "Иван" "Швейкерт") :team "Моховичковские псы"}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 26 :plate-number "34" :rider-id (find-rider-id "Дмитрий" "Чистяков") :team "Вектор"}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 27 :plate-number "65" :rider-id (find-rider-id "Михаил" "Харламенков")}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 28 :plate-number "41" :rider-id (find-rider-id "Антон" "Чикин")}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 29 :plate-number "36" :rider-id (find-rider-id "Максим" "Антонов") :team "Enduro86"}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 30 :plate-number "58" :rider-id (find-rider-id "Александр" "Белых") :team "EnduroPVK"}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 31 :plate-number "73" :rider-id (find-rider-id "Никита" "Баранов")}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 32 :plate-number "72" :rider-id (find-rider-id "Руслан" "Салыев")}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 33 :plate-number "49" :rider-id (find-rider-id "Матвей" "Филимонов")}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 34 :plate-number "42" :rider-id (find-rider-id "Александр" "Беспалов")}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 35 :plate-number "46" :rider-id (find-rider-id "Юрий" "Хицов")}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 36 :plate-number "27" :rider-id (find-rider-id "Евгений" "Захаров")}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 37 :plate-number "26" :rider-id (find-rider-id "Султан" "Хабибрахманов") :team "CoronaMechanics"}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 38 :plate-number "68" :rider-id (find-rider-id "Антон" "Стелюк") :team "Зацепанет"}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 39 :plate-number "30" :rider-id (find-rider-id "Кирилл" "Терентьев") :team "Вектор"}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 40 :plate-number "66" :rider-id (find-rider-id "Юрий" "Бороздин")}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 41 :plate-number "33" :rider-id (find-rider-id "Алексей" "Петров") :team "EnduroUral"}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 42 :plate-number "48" :rider-id (find-rider-id "Дмитрий" "Тимошевский")}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 43 :plate-number "64" :rider-id (find-rider-id "Кирилл" "Галкин") :team "Вектор"}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 44 :plate-number "24" :rider-id (find-rider-id "Александр" "Громов") :team "Вектор"}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 45 :plate-number "43" :rider-id (find-rider-id "Евгений" "Каширин")}
     {:type :result :event-id event-id :classification-id "ChnSllmc6Y0" :position 46 :plate-number "53" :rider-id (find-rider-id "Александр" "Мугулов")}

     (let [кругов 2
           сложность-круга 30.0
           стартовало 84
           условный-класс :bronze]
       {
        :type              :classification
        :classification-id "C5UrF3fk4g9g"
        :event-id          event-id
        :name              "Bronze"
        :order             3
        :points-multiplier points-multiplier
        :multiplier-description multiplier-description
        :equivalent        условный-класс
        :laps              кругов
        :lap-difficulty    сложность-круга
        :started-count     стартовало
        })

     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 1 :plate-number "175" :rider-id (find-rider-id "Денис" "Меньшиков") :team "KATAYENDURO"}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 2 :plate-number "118" :rider-id (find-rider-id "Александр" "Новопашин") :team "Прохват72"}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 3 :plate-number "147" :rider-id (find-rider-id "Михаил" "Ялунин")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 4 :plate-number "140" :rider-id (find-rider-id "Александр" "Ковелин")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 5 :plate-number "119" :rider-id (find-rider-id "Сергей" "Тимофеев")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 6 :plate-number "172" :rider-id (find-rider-id "Константин" "Табанин")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 7 :plate-number "173" :rider-id (find-rider-id "Константин" "Вилисов") :team "ENDURO REVDA"}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 8 :plate-number "122" :rider-id (find-rider-id "Евгений" "Мирзаметов")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 9 :plate-number "180" :rider-id (find-rider-id "Артем" "Чернецкий") :team "НАУКА"}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 10 :plate-number "132" :rider-id (find-rider-id "Роман" "Белоногов") :team "Enduro MOTO LIFE"}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 11 :plate-number "196" :rider-id (find-rider-id "Евгений" "Камаев")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 12 :plate-number "190" :rider-id (find-rider-id "Андрей" "Кокшаров")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 13 :plate-number "164" :rider-id (find-rider-id "Иван" "Черемисов") :team "Вектор"}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 14 :plate-number "125" :rider-id (find-rider-id "Виталий" "Горбачев") :team "Группа эндуро произвола"}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 15 :plate-number "148" :rider-id (find-rider-id "Артём" "Белых")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 16 :plate-number "117" :rider-id (find-rider-id "Максим" "Кабаненко")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 17 :plate-number "193" :rider-id (find-rider-id "Иван" "Бояркин")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 18 :plate-number "178" :rider-id (find-rider-id "Денис" "Козлов") :team "Моховичковские псы"}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 19 :plate-number "141" :rider-id (find-rider-id "Станислав" "Тарасов")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 20 :plate-number "177" :rider-id (find-rider-id "Арсен" "Байрамуков") :team "Эндуро Златоуст"}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 21 :plate-number "166" :rider-id (find-rider-id "Алексей" "Кузнецов")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 22 :plate-number "121" :rider-id (find-rider-id "Анатолий" "Ванчинов") :team "Corona"}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 23 :plate-number "120" :rider-id (find-rider-id "Сергей" "Попов") :team "Прохват72"}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 24 :plate-number "182" :rider-id (find-rider-id "Виталий" "Стаценков") :team "SEVERKA ENDURO GARAGE"}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 25 :plate-number "162" :rider-id (find-rider-id "Владислав" "Хонькин") :team "АНО Мотоспорт74"}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 26 :plate-number "154" :rider-id (find-rider-id "Алексей" "Залесов")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 27 :plate-number "115" :rider-id (find-rider-id "Михаил" "Унесихин") :team "Enduro Uktus"}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 28 :plate-number "199" :rider-id (find-rider-id "Егор" "Камалов")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 29 :plate-number "130" :rider-id (find-rider-id "Иван" "Чирков")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 30 :plate-number "123" :rider-id (find-rider-id "Иван" "Адам")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 31 :plate-number "145" :rider-id (find-rider-id "Дмитрий" "Холкин")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 32 :plate-number "176" :rider-id (find-rider-id "Андрей" "Коковин")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 33 :plate-number "192" :rider-id (find-rider-id "Евгений" "Горин")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 34 :plate-number "184" :rider-id (find-rider-id "Алексей" "Любимов")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 35 :plate-number "129" :rider-id (find-rider-id "Евгений" "Бекетов")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 36 :plate-number "170" :rider-id (find-rider-id "Денис" "Токмин") :team "Enduro Bgd"}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 37 :plate-number "135" :rider-id (find-rider-id "Матвей" "Иванов") :team "Gravity team"}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 38 :plate-number "168" :rider-id (find-rider-id "Станислав" "Сысков")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 39 :plate-number "112" :rider-id (find-rider-id "Андрей" "Степанов")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 40 :plate-number "198" :rider-id (find-rider-id "Дмитрий" "Бурыкин")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 41 :plate-number "150" :rider-id (find-rider-id "Денис" "Пастухов")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 42 :plate-number "181" :rider-id (find-rider-id "Александр" "Тютиков")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 43 :plate-number "131" :rider-id (find-rider-id "Евгений" "Константинов")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 44 :plate-number "195" :rider-id (find-rider-id "Владимир" "Гусев")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 45 :plate-number "158" :rider-id (find-rider-id "Денис" "Ефимов")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 46 :plate-number "155" :rider-id (find-rider-id "Иван" "Тихонов")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 47 :plate-number "156" :rider-id (find-rider-id "Максим" "Логинов")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 48 :plate-number "161" :rider-id (find-rider-id "Евгений" "Шубин") :team "Enduro MOTO LIFE"}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 49 :plate-number "138" :rider-id (find-rider-id "Владимир" "Филимончук")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 50 :plate-number "186" :rider-id (find-rider-id "Никита" "Лебедев")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 51 :plate-number "146" :rider-id (find-rider-id "Артём" "Потапов")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 52 :plate-number "137" :rider-id (find-rider-id "Антон" "Овчинников")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 53 :plate-number "188" :rider-id (find-rider-id "Андрей" "Садыков") :team "Enduro Сухой Лог"}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 54 :plate-number "149" :rider-id (find-rider-id "Руслан" "Кунакбаев")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 55 :plate-number "127" :rider-id (find-rider-id "Дмитрий" "Тренин")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 56 :plate-number "187" :rider-id (find-rider-id "Андре" "Долматов")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 57 :plate-number "153" :rider-id (find-rider-id "Михаил" "Романенко")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 58 :plate-number "163" :rider-id (find-rider-id "Роман" "Коковин")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 59 :plate-number "185" :rider-id (find-rider-id "Евгений" "Каргапольцев") :team "Enduro MOTO LIFE"}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 60 :plate-number "165" :rider-id (find-rider-id "Евгений" "Максимов") :team "URALFOX TEAM"}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 61 :plate-number "183" :rider-id (find-rider-id "Иван" "Киприн")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 62 :plate-number "126" :rider-id (find-rider-id "Артём" "Щукин") :team "Вектор"}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 63 :plate-number "114" :rider-id (find-rider-id "Антон" "Боровских")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 64 :plate-number "116" :rider-id (find-rider-id "Денис" "Дзюбин")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 65 :plate-number "160" :rider-id (find-rider-id "Александр" "Зайцев")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 66 :plate-number "151" :rider-id (find-rider-id "Сергей" "Нелюбин") :team "Прохват72"}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 67 :plate-number "142" :rider-id (find-rider-id "Антон" "Болныгин")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 68 :plate-number "133" :rider-id (find-rider-id "Дамир" "Хабибрахманов")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 69 :plate-number "136" :rider-id (find-rider-id "Александр" "Анисимов")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 70 :plate-number "197" :rider-id (find-rider-id "Василий" "Дудников")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 71 :plate-number "169" :rider-id (find-rider-id "Александр" "Чикишев") :team "МОТОЕБОТА"}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 72 :plate-number "113" :rider-id (find-rider-id "Сергей" "Баранов") :team "Нягань"}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 73 :plate-number "111" :rider-id (find-rider-id "Роман" "Панов")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 74 :plate-number "139" :rider-id (find-rider-id "Николай" "Половников")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 75 :plate-number "124" :rider-id (find-rider-id "Сергей" "Уткин") :team "Диванные Эндуристы"}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 76 :plate-number "157" :rider-id (find-rider-id "Сергей" "Беличев")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 77 :plate-number "152" :rider-id (find-rider-id "Станислав" "Макуха")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 78 :plate-number "179" :rider-id (find-rider-id "Максим" "Солин") :team "НАУКА"}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 79 :plate-number "189" :rider-id (find-rider-id "Борис" "Коваленко")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 80 :plate-number "143" :rider-id (find-rider-id "Дмитрий" "Бахарев")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 81 :plate-number "171" :rider-id (find-rider-id "Павел" "Байдала")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 82 :plate-number "144" :rider-id (find-rider-id "Павел" "Федоровых")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 83 :plate-number "167" :rider-id (find-rider-id "Кирилл" "Ауэрбах")}
     {:type :result :event-id event-id :classification-id "C5UrF3fk4g9g" :position 84 :plate-number "159" :rider-id (find-rider-id "Тимофей" "Максимов")}

     (let [кругов 1
           сложность-круга 25.0
           стартовало 2
           условный-класс :lady]
       {
        :type              :classification
        :classification-id "CxVwzZvXYo64"
        :event-id          event-id
        :name              "Леди"
        :order             5
        :equivalent        условный-класс
        :laps              кругов
        :lap-difficulty    сложность-круга
        :started-count     стартовало
        })

     {:type :result :event-id event-id :classification-id "CxVwzZvXYo64" :position 1 :plate-number "242" :rider-id (find-rider-id "Марина" "Аверина")}
     {:type :result :event-id event-id :classification-id "CxVwzZvXYo64" :position 2 :plate-number "241" :rider-id (find-rider-id "Юлия" "Березинских")}

     (let [кругов 1
           сложность-круга 25.0
           стартовало 9
           условный-класс :iron]
       {
        :type              :classification
        :classification-id "C1gLPX9AUjc"
        :event-id          event-id
        :order             4
        :points-multiplier points-multiplier
        :multiplier-description multiplier-description
        :name              "Ветераны"
        :equivalent        условный-класс
        :laps              кругов
        :lap-difficulty    сложность-круга
        :started-count     стартовало
        })

     {:type :result :event-id event-id :classification-id "C1gLPX9AUjc" :position 1 :plate-number "235" :rider-id (find-rider-id "Александр" "Некрасов")}
     {:type :result :event-id event-id :classification-id "C1gLPX9AUjc" :position 2 :plate-number "237" :rider-id (find-rider-id "Сергей" "Кузнецов") :team "KATAYENDURO"}
     {:type :result :event-id event-id :classification-id "C1gLPX9AUjc" :position 3 :plate-number "236" :rider-id (find-rider-id "Андрей" "Щипунов")}
     {:type :result :event-id event-id :classification-id "C1gLPX9AUjc" :position 4 :plate-number "234" :rider-id (find-rider-id "Константин" "Одиноков")}
     {:type :result :event-id event-id :classification-id "C1gLPX9AUjc" :position 5 :plate-number "231" :rider-id (find-rider-id "Владимир" "Боровских") :team "Камышлов"}
     {:type :result :event-id event-id :classification-id "C1gLPX9AUjc" :position 6 :plate-number "239" :rider-id (find-rider-id "Дмитрий" "Григоренко")}
     {:type :result :event-id event-id :classification-id "C1gLPX9AUjc" :position 7 :plate-number "238" :rider-id (find-rider-id "Александр" "Капустин")}
     {:type :result :event-id event-id :classification-id "C1gLPX9AUjc" :position 8 :plate-number "233" :rider-id (find-rider-id "Андрей" "Тужилов")}
     {:type :result :event-id event-id :classification-id "C1gLPX9AUjc" :position 9 :plate-number "232" :rider-id (find-rider-id "Андрей" "Кудин")}
     ]))

;; TODO: перенести
(defn process-data
  [row]
  (let [row (if (vector? row)
              ;; Разворачиваем вектор в мапу попарно
              (into {} (map vec (partition 2 row)))
              row)
        row (if (= (:type row) :classification)
              ;; Подсчитываем сложность гонки исходя из параметров
              (assoc row :cutoff-point (points/calculate-cutoff (:equivalent row) (:started-count row))
                         :first-place-points (points/first-place-points (:laps row)
                                                                        (:lap-difficulty row)
                                                                        (:equivalent row)
                                                                        (:points-multiplier row)))
              row)
        row (if (and (= (:type row) :result)
                     (nil? (:result-id row)))
              ;; Проставляем случайный result-id (для работы навигации в UI)
              (assoc row :result-id (enrating.data.ids/result-id))
              row)]
    row))

(def data
  (checks/sanity-checks! (map process-data
                              (concat slg1
                                      stalker1
                                      lesnik1
                                      bogdanovich1))))
