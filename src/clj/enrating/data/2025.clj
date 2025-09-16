(ns enrating.data.2025
  (:require [enrating.data.riders :refer [find-rider-id]]
            [enrating.data.ids :refer [result-id classification-id event-id]]
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


   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 1 :plate-number "23" :rider-id (find-rider-id "Никита" "Поляков") :start "11:36:30" :finish "14:04:24" :penalty "0:00:00" :total "2:27:54"]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 2 :plate-number "10" :rider-id (find-rider-id "Евгений" "Цицимушкин") :start "11:33:00" :finish "14:04:23" :penalty "0:00:00" :total "2:31:23"]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 3 :plate-number "165" :rider-id (find-rider-id "Андрей" "Мишагин") :start "11:55:00" :finish "14:59:55" :penalty "0:00:00" :total "3:04:55"]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 4 :plate-number "22" :rider-id (find-rider-id "Павел" "Лядецкий") :start "11:36:00" :finish "14:45:34" :penalty "0:00:00" :total "3:09:34"]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 5 :plate-number "943" :rider-id (find-rider-id "Константин" "Майбуров") :start "11:38:00" :finish "15:05:18" :penalty "0:00:00" :total "3:27:18"]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 6 :plate-number "8" :rider-id (find-rider-id "Эрик" "Ишмаков") :start "11:32:30" :finish "15:03:09" :penalty "0:00:00" :total "3:30:39"]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 7 :plate-number "6" :rider-id (find-rider-id "Роман" "Кузнецов") :start "11:32:00" :finish "15:03:24" :penalty "0:00:00" :total "3:31:24"]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 8 :plate-number "25" :rider-id (find-rider-id "Артём" "Калинин") :start "11:37:00" :finish "15:24:59" :penalty "0:00:00" :total "3:47:59"]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 9 :plate-number "19" :rider-id (find-rider-id "Денис" "Шилов") :start "11:35:30" :finish "15:29:02" :penalty "0:00:00" :total "3:53:32"]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 10 :plate-number "13" :rider-id (find-rider-id "Денис" "Медведюк") :start "11:34:00" :finish "15:30:43" :penalty "0:00:00" :total "3:56:43"]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 11 :plate-number "21" :rider-id (find-rider-id "Михаил" "Ушаков") :start "11:36:00" :finish "15:39:45" :penalty "0:00:00" :total "4:03:45"]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 12 :plate-number "905" :rider-id (find-rider-id "Дамир" "Юсупов") :start "11:37:30" :finish "15:05:15" :penalty "0:40:00" :total "4:07:45"]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 13 :plate-number "24" :rider-id (find-rider-id "Константин" "Калмыков") :start "11:36:30" :finish "15:50:23" :penalty "0:00:00" :total "4:13:53"]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 14 :plate-number "1" :rider-id (find-rider-id "Александр" "Миронов") :start "11:31:00" :finish "16:10:24" :penalty "0:00:00" :total "4:39:24"]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 15 :plate-number "12" :rider-id (find-rider-id "Алексей" "Кошелев") :start "11:33:30" :finish "15:40:02" :penalty "0:40:00" :total "4:46:32"]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 16 :plate-number "9" :rider-id (find-rider-id "Артём" "Цуркан") :start "11:33:00" :finish "14:22:10" :penalty "2:00:00" :total "4:49:10"]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 17 :plate-number "11" :rider-id (find-rider-id "Виталий" "Саитов") :start "11:33:30" :finish "15:06:19" :penalty "1:20:00" :total "4:52:49"]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 18 :plate-number "910" :rider-id (find-rider-id "Николай" "Швед") :start "11:37:30" :finish "15:23:08" :penalty "1:20:00" :total "5:05:38"]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 19 :plate-number "3" :rider-id (find-rider-id "Олег" "Габбасов") :start "11:31:30" :finish "16:40:59" :penalty "0:00:00" :total "5:09:29"]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 20 :plate-number "16" :rider-id (find-rider-id "Сергей" "Терентьев") :start "11:34:30" :finish "14:04:20" :penalty "2:40:00" :total "5:09:50"]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 21 :plate-number "14" :rider-id (find-rider-id "Вячеслав" "Ярулин") :start "11:34:00" :finish "14:15:42" :penalty "2:40:00" :total "5:21:42"]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 22 :plate-number "4" :rider-id (find-rider-id "Ильфар" "Сарваров") :start "11:31:30" :finish "16:27:24" :penalty "0:40:00" :total "5:35:54"]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 23 :plate-number "7" :rider-id (find-rider-id "Артем" "Иванов") :start "11:32:30" :finish "14:13:48" :penalty "3:20:00" :total "6:01:18"]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 24 :plate-number "2" :rider-id (find-rider-id "Кирилл" "Синченко") :start "11:31:00" :finish "14:42:16" :penalty "5:20:00" :total "8:31:16"]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 25 :plate-number "18" :rider-id (find-rider-id "Андрей" "Полномочнов") :start "11:35:00" :finish "16:17:07" :penalty "5:20:00" :total "10:02:07"]
   [:type :result :event-id "EALkbw" :classification-id "CClUxywqlX4" :position 26 :plate-number "5" :rider-id (find-rider-id "Ростислав" "Забродин") :start "11:32:00" :finish "18:05:18" :penalty "5:20:00" :total "11:53:18"]

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
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 1 :plate-number "124" :rider-id (find-rider-id "Петр" "Адрианов") :start "11:44:30" :finish "14:25:58" :penalty "0:00:00" :total "2:41:28"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 2 :plate-number "208" :rider-id (find-rider-id "Евгений" "Журавский") :start "12:05:30" :finish "14:48:38" :penalty "0:00:00" :total "2:43:08"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 3 :plate-number "264" :rider-id (find-rider-id "Константин" "Романов") :start "12:19:30" :finish "15:06:15" :penalty "0:00:00" :total "2:46:45"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 4 :plate-number "123" :rider-id (find-rider-id "Султан" "Хабибрахманов") :start "11:44:30" :finish "14:32:01" :penalty "0:00:00" :total "2:47:31"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 5 :plate-number "142" :rider-id (find-rider-id "Виктор" "Цыбулин") :start "11:49:00" :finish "14:40:13" :penalty "0:00:00" :total "2:51:13"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 6 :plate-number "147" :rider-id (find-rider-id "Дмитрий" "Аверин") :start "11:50:30" :finish "14:52:27" :penalty "0:00:00" :total "3:01:57"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 7 :plate-number "227" :rider-id (find-rider-id "Антон" "Харитонов") :start "12:10:30" :finish "15:12:48" :penalty "0:00:00" :total "3:02:18"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 8 :plate-number "200" :rider-id (find-rider-id "Владимир" "Бодрин") :start "12:03:30" :finish "15:09:18" :penalty "0:00:00" :total "3:05:48"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 9 :plate-number "916" :rider-id (find-rider-id "Алексей" "Созинов") :start "13:13:00" :finish "16:23:10" :penalty "0:00:00" :total "3:10:10"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 10 :plate-number "249" :rider-id (find-rider-id "Алексей" "Кокорин") :start "12:16:00" :finish "15:26:55" :penalty "0:00:00" :total "3:10:55"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 11 :plate-number "242" :rider-id (find-rider-id "Азат" "Галимов") :start "12:14:00" :finish "15:26:28" :penalty "0:00:00" :total "3:12:28"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 12 :plate-number "241" :rider-id (find-rider-id "Александр" "Выгодский") :start "12:14:00" :finish "15:28:39" :penalty "0:00:00" :total "3:14:39"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 13 :plate-number "220" :rider-id (find-rider-id "Алексей" "Семилетов") :start "12:08:30" :finish "15:23:28" :penalty "0:00:00" :total "3:14:58"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 14 :plate-number "195" :rider-id (find-rider-id "Евгений" "Федин") :start "12:02:30" :finish "14:40:22" :penalty "0:40:00" :total "3:17:52"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 15 :plate-number "927" :rider-id (find-rider-id "Ринат" "Хафизов") :start "13:13:00" :finish "16:31:34" :penalty "0:00:00" :total "3:18:34"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 16 :plate-number "115" :rider-id (find-rider-id "Виталий" "Ощепков") :start "11:42:30" :finish "15:02:48" :penalty "0:00:00" :total "3:20:18"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 17 :plate-number "256" :rider-id (find-rider-id "Матвей" "Захаров") :start "12:17:30" :finish "15:00:03" :penalty "0:40:00" :total "3:22:33"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 18 :plate-number "230" :rider-id (find-rider-id "Илья" "Кузнецов") :start "12:11:00" :finish "15:34:04" :penalty "0:00:00" :total "3:23:04"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 19 :plate-number "224" :rider-id (find-rider-id "Андрей" "Ломакин") :start "12:09:30" :finish "15:33:36" :penalty "0:00:00" :total "3:24:06"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 20 :plate-number "141" :rider-id (find-rider-id "Константин" "Кетов") :start "11:49:00" :finish "15:14:16" :penalty "0:00:00" :total "3:25:16"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 21 :plate-number "254" :rider-id (find-rider-id "Евгений" "Боярских") :start "12:17:00" :finish "15:03:16" :penalty "0:40:00" :total "3:26:16"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 22 :plate-number "103" :rider-id (find-rider-id "Егор" "Кочетов") :start "11:39:30" :finish "14:27:31" :penalty "0:40:00" :total "3:28:01"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 23 :plate-number "167" :rider-id (find-rider-id "Иван" "Вербилович") :start "11:55:30" :finish "15:24:34" :penalty "0:00:00" :total "3:29:04"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 24 :plate-number "211" :rider-id (find-rider-id "Денис" "Зараменских") :start "12:06:30" :finish "15:35:42" :penalty "0:00:00" :total "3:29:12"]
   ;; Страница 2
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 25 :plate-number "140" :rider-id (find-rider-id "Дмитрий" "Ахманаев") :start "11:48:30" :finish "15:18:45" :penalty "0:00:00" :total "3:30:15"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 26 :plate-number "154" :rider-id (find-rider-id "Александр" "Некрасов") :start "11:52:00" :finish "15:23:25" :penalty "0:00:00" :total "3:31:25"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 27 :plate-number "203" :rider-id (find-rider-id "Михаил" "Жилин") :start "12:04:30" :finish "15:36:33" :penalty "0:00:00" :total "3:32:03"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 28 :plate-number "252" :rider-id (find-rider-id "Евгений" "Данилов") :start "12:16:30" :finish "15:48:50" :penalty "0:00:00" :total "3:32:20"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 29 :plate-number "131" :rider-id (find-rider-id "Антон" "Толкачев") :start "11:46:30" :finish "15:20:28" :penalty "0:00:00" :total "3:33:58"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 30 :plate-number "129" :rider-id (find-rider-id "Денис" "Козлов") :start "11:46:00" :finish "15:22:25" :penalty "0:00:00" :total "3:36:25"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 31 :plate-number "128" :rider-id (find-rider-id "Виктор" "Калинин") :start "11:45:30" :finish "15:24:03" :penalty "0:00:00" :total "3:38:33"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 32 :plate-number "934" :rider-id (find-rider-id "Влад" "Чибаков") :start "13:13:00" :finish "16:52:00" :penalty "0:00:00" :total "3:39:00"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 33 :plate-number "251" :rider-id (find-rider-id "Вадим" "Лугаськов") :start "12:16:30" :finish "15:19:43" :penalty "0:40:00" :total "3:43:13"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 34 :plate-number "207" :rider-id (find-rider-id "Владимир" "Вязин") :start "12:05:30" :finish "15:49:57" :penalty "0:00:00" :total "3:44:27"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 35 :plate-number "120" :rider-id (find-rider-id "Евгений" "Шигабеев") :start "11:43:30" :finish "15:29:04" :penalty "0:00:00" :total "3:45:34"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 36 :plate-number "219" :rider-id (find-rider-id "Вадим" "Ахтямов") :start "12:08:30" :finish "15:54:16" :penalty "0:00:00" :total "3:45:46"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 37 :plate-number "169" :rider-id (find-rider-id "Юрий" "Бороздин") :start "11:56:00" :finish "15:45:15" :penalty "0:00:00" :total "3:49:15"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 38 :plate-number "184" :rider-id (find-rider-id "Андрей" "Склюев") :start "11:59:30" :finish "15:49:13" :penalty "0:00:00" :total "3:49:43"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 39 :plate-number "246" :rider-id (find-rider-id "Иван" "Филиппов") :start "12:15:00" :finish "16:04:50" :penalty "0:00:00" :total "3:49:50"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 40 :plate-number "236" :rider-id (find-rider-id "Алексей" "Лепаев") :start "12:12:30" :finish "15:23:08" :penalty "0:40:00" :total "3:50:38"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 41 :plate-number "174" :rider-id (find-rider-id "Кирилл" "Азаров") :start "11:57:00" :finish "15:51:39" :penalty "0:00:00" :total "3:54:39"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 42 :plate-number "118" :rider-id (find-rider-id "Антон" "Зырянов") :start "11:43:00" :finish "15:00:04" :penalty "0:40:00" :total "3:57:04"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 43 :plate-number "215" :rider-id (find-rider-id "Владимир" "Носков") :start "12:07:30" :finish "16:12:05" :penalty "0:00:00" :total "4:04:35"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 44 :plate-number "920" :rider-id (find-rider-id "Артем" "Свяжин") :start "13:12:30" :finish "15:58:08" :penalty "1:20:00" :total "4:05:38"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 45 :plate-number "105" :rider-id (find-rider-id "Дмитрий" "Иванов") :start "11:40:00" :finish "15:08:46" :penalty "0:40:00" :total "4:08:46"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 46 :plate-number "237" :rider-id (find-rider-id "Константин" "Маркелов") :start "12:13:00" :finish "15:42:11" :penalty "0:40:00" :total "4:09:11"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 47 :plate-number "911" :rider-id (find-rider-id "Кирилл" "Галкин") :start "13:11:00" :finish "16:03:59" :penalty "1:20:00" :total "4:12:59"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 48 :plate-number "218" :rider-id (find-rider-id "Михаил" "Фурсов") :start "12:08:00" :finish "16:21:46" :penalty "0:00:00" :total "4:13:46"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 49 :plate-number "136" :rider-id (find-rider-id "Андрей" "Шаталин") :start "11:47:30" :finish "15:22:12" :penalty "0:40:00" :total "4:14:42"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 50 :plate-number "130" :rider-id (find-rider-id "Виктор" "Попов") :start "11:46:00" :finish "15:23:01" :penalty "0:40:00" :total "4:17:01"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 51 :plate-number "178" :rider-id (find-rider-id "Андрей" "Шафигулин") :start "11:58:00" :finish "16:15:17" :penalty "0:00:00" :total "4:17:17"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 52 :plate-number "135" :rider-id (find-rider-id "Владислав" "Пашнин") :start "11:47:30" :finish "15:25:55" :penalty "0:40:00" :total "4:18:25"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 53 :plate-number "234" :rider-id (find-rider-id "Федор" "Сборошенко") :start "12:12:00" :finish "16:30:38" :penalty "0:00:00" :total "4:18:38"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 54 :plate-number "121" :rider-id (find-rider-id "Евгений" "Белькевич") :start "11:44:00" :finish "16:03:20" :penalty "0:00:00" :total "4:19:20"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 55 :plate-number "915" :rider-id (find-rider-id "Алексей" "Гуляев") :start "13:12:00" :finish "16:51:22" :penalty "0:40:00" :total "4:19:22"]
   ;; Страница 3
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 56 :plate-number "204" :rider-id (find-rider-id "Михаил" "Унесихин") :start "12:04:30" :finish "15:45:16" :penalty "0:40:00" :total "4:20:46"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 57 :plate-number "245" :rider-id (find-rider-id "Александр" "Перевозчиков") :start "12:15:00" :finish "16:10:25" :penalty "0:40:00" :total "4:35:25"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 58 :plate-number "132" :rider-id (find-rider-id "Данил" "Кварацхелия") :start "11:46:30" :finish "15:45:18" :penalty "0:40:00" :total "4:38:48"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 59 :plate-number "222" :rider-id (find-rider-id "Николай" "Семенов") :start "12:09:00" :finish "16:47:55" :penalty "0:00:00" :total "4:38:55"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 60 :plate-number "214" :rider-id (find-rider-id "Матвей" "Тиунов") :start "12:07:00" :finish "16:09:03" :penalty "0:40:00" :total "4:42:03"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 61 :plate-number "186" :rider-id (find-rider-id "Антон" "Чикин") :start "12:00:00" :finish "16:43:44" :penalty "0:00:00" :total "4:43:44"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 62 :plate-number "160" :rider-id (find-rider-id "Никитин" "Дмитрий") :start "11:53:30" :finish "15:20:26" :penalty "1:20:00" :total "4:46:56"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 63 :plate-number "152" :rider-id (find-rider-id "Виталий" "Стаценков") :start "11:51:30" :finish "15:59:07" :penalty "0:40:00" :total "4:47:37"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 64 :plate-number "170" :rider-id (find-rider-id "Алексей" "Мостовой") :start "11:56:00" :finish "16:45:38" :penalty "0:00:00" :total "4:49:38"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 65 :plate-number "205" :rider-id (find-rider-id "Денис" "Прошакин") :start "12:05:00" :finish "16:56:31" :penalty "0:00:00" :total "4:51:31"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 66 :plate-number "231" :rider-id (find-rider-id "Кирилл" "Казанцев") :start "12:11:30" :finish "15:03:15" :penalty "2:00:00" :total "4:51:45"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 67 :plate-number "233" :rider-id (find-rider-id "Денис" "Скоров") :start "12:12:00" :finish "17:05:38" :penalty "0:00:00" :total "4:53:38"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 68 :plate-number "217" :rider-id (find-rider-id "Илья" "Юзеев") :start "12:08:00" :finish "17:07:03" :penalty "0:00:00" :total "4:59:03"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 69 :plate-number "146" :rider-id (find-rider-id "Олег" "Поленков") :start "11:50:00" :finish "16:50:49" :penalty "0:00:00" :total "5:00:49"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 70 :plate-number "112" :rider-id (find-rider-id "Евгений" "Ярославцев") :start "11:41:30" :finish "16:02:47" :penalty "0:40:00" :total "5:01:17"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 71 :plate-number "225" :rider-id (find-rider-id "Михаил" "Попов") :start "12:10:00" :finish "17:13:13" :penalty "0:00:00" :total "5:03:13"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 72 :plate-number "150" :rider-id (find-rider-id "Тимофей" "Максимов") :start "11:51:00" :finish "16:15:18" :penalty "0:40:00" :total "5:04:18"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 73 :plate-number "259" :rider-id (find-rider-id "Владимир" "Тясин") :start "12:18:30" :finish "15:24:19" :penalty "2:00:00" :total "5:05:49"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 74 :plate-number "107" :rider-id (find-rider-id "Алексей" "Захаров") :start "11:40:30" :finish "16:07:54" :penalty "0:40:00" :total "5:07:24"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 75 :plate-number "926" :rider-id (find-rider-id "Андрей" "Куцепендик") :start "13:13:00" :finish "17:02:32" :penalty "1:20:00" :total "5:09:32"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 76 :plate-number "202" :rider-id (find-rider-id "Амир" "Сарваритдинов") :start "12:04:00" :finish "17:14:27" :penalty "0:00:00" :total "5:10:27"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 77 :plate-number "134" :rider-id (find-rider-id "Александр" "Белых") :start "11:47:00" :finish "15:38:42" :penalty "1:20:00" :total "5:11:42"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 78 :plate-number "182" :rider-id (find-rider-id "Владимир" "Киселёв") :start "11:59:00" :finish "15:50:54" :penalty "1:20:00" :total "5:11:54"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 79 :plate-number "138" :rider-id (find-rider-id "Дмитрий" "Мокиенко") :start "11:48:00" :finish "15:44:18" :penalty "1:20:00" :total "5:16:18"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 80 :plate-number "117" :rider-id (find-rider-id "Артур" "Поздеев") :start "11:43:00" :finish "17:02:34" :penalty "0:00:00" :total "5:19:34"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 81 :plate-number "119" :rider-id (find-rider-id "Анатолий" "Ванчинов") :start "11:43:30" :finish "16:25:57" :penalty "0:40:00" :total "5:22:27"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 82 :plate-number "137" :rider-id (find-rider-id "Иван" "Тихонов") :start "11:48:00" :finish "16:41:33" :penalty "0:40:00" :total "5:33:33"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 83 :plate-number "173" :rider-id (find-rider-id "Иван" "Чирков") :start "11:57:00" :finish "17:31:06" :penalty "0:00:00" :total "5:34:06"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 84 :plate-number "153" :rider-id (find-rider-id "Николай" "Обожин") :start "11:52:00" :finish "16:46:39" :penalty "0:40:00" :total "5:34:39"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 85 :plate-number "255" :rider-id (find-rider-id "Антон" "Галюк") :start "12:17:30" :finish "15:52:47" :penalty "2:00:00" :total "5:35:17"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 86 :plate-number "265" :rider-id (find-rider-id "Евгений" "Чурин") :start "12:20:00" :finish "17:16:51" :penalty "0:40:00" :total "5:36:51"]
   ;; Страница 4
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 87 :plate-number "180" :rider-id (find-rider-id "Владимир" "Николаев") :start "11:58:30" :finish "15:07:12" :penalty "2:40:00" :total "5:48:42"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 88 :plate-number "166" :rider-id (find-rider-id "Алексей" "Залесов") :start "11:55:00" :finish "16:24:10" :penalty "1:20:00" :total "5:49:10"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 89 :plate-number "126" :rider-id (find-rider-id "Сергей" "Вакушин") :start "11:45:00" :finish "16:58:06" :penalty "0:40:00" :total "5:53:06"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 90 :plate-number "229" :rider-id (find-rider-id "Станислав" "Тарасов") :start "12:11:00" :finish "16:44:50" :penalty "1:20:00" :total "5:53:50"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 91 :plate-number "143" :rider-id (find-rider-id "Никита" "Баранов") :start "11:49:30" :finish "16:24:06" :penalty "1:20:00" :total "5:54:36"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 92 :plate-number "226" :rider-id (find-rider-id "Данила" "Фролов") :start "12:10:00" :finish "17:36:39" :penalty "0:40:00" :total "6:06:39"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 93 :plate-number "223" :rider-id (find-rider-id "Иван" "Адам") :start "12:09:30" :finish "16:58:03" :penalty "1:20:00" :total "6:08:33"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 94 :plate-number "108" :rider-id (find-rider-id "Александр" "Мугулов") :start "11:40:30" :finish "15:51:04" :penalty "2:00:00" :total "6:10:34"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 95 :plate-number "158" :rider-id (find-rider-id "Игорь" "Мальков") :start "11:53:00" :finish "16:43:50" :penalty "1:20:00" :total "6:10:50"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 96 :plate-number "196" :rider-id (find-rider-id "Игорь" "Теплоухов") :start "12:02:30" :finish "16:27:15" :penalty "2:00:00" :total "6:24:45"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 97 :plate-number "144" :rider-id (find-rider-id "Игорь" "Ситников") :start "11:49:30" :finish "15:30:28" :penalty "3:20:00" :total "7:00:58"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 98 :plate-number "258" :rider-id (find-rider-id "Владислав" "Култышев") :start "12:18:00" :finish "14:09:04" :penalty "5:20:00" :total "7:11:04"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 99 :plate-number "177" :rider-id (find-rider-id "Александр" "Мерзляков") :start "11:58:00" :finish "13:50:22" :penalty "5:20:00" :total "7:12:22"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 100 :plate-number "239" :rider-id (find-rider-id "Станислав" "Зеленских") :start "12:13:30" :finish "17:40:26" :penalty "2:00:00" :total "7:26:56"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 101 :plate-number "183" :rider-id (find-rider-id "Владимир" "Гусев") :start "11:59:30" :finish "17:26:55" :penalty "2:00:00" :total "7:27:25"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 102 :plate-number "240" :rider-id (find-rider-id "Александр" "Савонин") :start "12:13:30" :finish "14:26:00" :penalty "5:20:00" :total "7:32:30"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 103 :plate-number "261" :rider-id (find-rider-id "Кирилл" "Егоров") :start "12:19:00" :finish "14:34:10" :penalty "5:20:00" :total "7:35:10"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 104 :plate-number "191" :rider-id (find-rider-id "Александр" "Осколков") :start "12:01:30" :finish "16:21:04" :penalty "3:20:00" :total "7:39:34"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 105 :plate-number "159" :rider-id (find-rider-id "Руслан" "Сафин") :start "11:53:30" :finish "14:13:57" :penalty "5:20:00" :total "7:40:27"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 106 :plate-number "923" :rider-id (find-rider-id "Юрий" "Рысин") :start "13:12:30" :finish "15:33:41" :penalty "5:20:00" :total "7:41:11"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 107 :plate-number "521" :rider-id (find-rider-id "Дмитрий" "Долженко") :start "12:43:00" :finish "17:50:52" :penalty "2:40:00" :total "7:47:52"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 108 :plate-number "209" :rider-id (find-rider-id "Владимир" "Иванов") :start "12:06:00" :finish "14:44:00" :penalty "5:20:00" :total "7:58:00"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 109 :plate-number "193" :rider-id (find-rider-id "Ален" "Кокшаров") :start "12:02:00" :finish "14:43:47" :penalty "5:20:00" :total "8:01:47"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 110 :plate-number "906" :rider-id (find-rider-id "Иван" "Колягин") :start "13:11:30" :finish "17:56:37" :penalty "3:20:00" :total "8:05:07"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 111 :plate-number "235" :rider-id (find-rider-id "Вадим" "Мезенцев") :start "12:12:30" :finish "14:57:54" :penalty "5:20:00" :total "8:05:24"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 112 :plate-number "190" :rider-id (find-rider-id "Денис" "Денисюк") :start "12:01:00" :finish "14:46:34" :penalty "5:20:00" :total "8:05:34"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 113 :plate-number "948" :rider-id (find-rider-id "Семён" "Томилов") :start "13:18:30" :finish "16:08:33" :penalty "5:20:00" :total "8:10:03"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 114 :plate-number "106" :rider-id (find-rider-id "Денис" "Бирюков") :start "11:40:00" :finish "14:37:52" :penalty "5:20:00" :total "8:17:52"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 115 :plate-number "913" :rider-id (find-rider-id "Алексей" "Злобин") :start "13:11:00" :finish "16:15:35" :penalty "5:20:00" :total "8:24:35"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 116 :plate-number "109" :rider-id (find-rider-id "Рамиль" "Хакимов") :start "11:41:00" :finish "14:48:51" :penalty "5:20:00" :total "8:27:51"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 117 :plate-number "111" :rider-id (find-rider-id "Юрий" "Хицов") :start "11:41:30" :finish "14:50:04" :penalty "5:20:00" :total "8:28:34"]
   ;; Страница 5
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 118 :plate-number "942" :rider-id (find-rider-id "Дмитрий" "Прыкин") :start "13:18:00" :finish "16:28:56" :penalty "5:20:00" :total "8:30:56"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 119 :plate-number "176" :rider-id (find-rider-id "Сергей" "Максимов") :start "11:57:30" :finish "18:29:26" :penalty "2:00:00" :total "8:31:56"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 120 :plate-number "156" :rider-id (find-rider-id "Сергей" "Уфимцев") :start "11:52:30" :finish "17:06:56" :penalty "3:20:00" :total "8:34:26"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 121 :plate-number "172" :rider-id (find-rider-id "Сергей" "Баранов") :start "11:56:30" :finish "15:19:38" :penalty "5:20:00" :total "8:43:08"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 122 :plate-number "206" :rider-id (find-rider-id "Андрей" "Верещагин") :start "12:05:00" :finish "15:30:00" :penalty "5:20:00" :total "8:45:00"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 123 :plate-number "243" :rider-id (find-rider-id "Иван" "Кукурузов") :start "12:14:30" :finish "15:42:10" :penalty "5:20:00" :total "8:47:40"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 124 :plate-number "149" :rider-id (find-rider-id "Дамир" "Хабибрахманов") :start "11:51:00" :finish "15:20:00" :penalty "5:20:00" :total "8:49:00"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 125 :plate-number "244" :rider-id (find-rider-id "Алексей" "Калашников") :start "12:14:30" :finish "15:45:09" :penalty "5:20:00" :total "8:50:39"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 126 :plate-number "940" :rider-id (find-rider-id "Сергей" "Богатырёв") :start "13:13:00" :finish "16:47:19" :penalty "5:20:00" :total "8:54:19"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 127 :plate-number "133" :rider-id (find-rider-id "Александр" "Жмаков") :start "11:47:00" :finish "15:25:10" :penalty "5:20:00" :total "8:58:10"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 128 :plate-number "122" :rider-id (find-rider-id "Мыкалов" "Владимир") :start "11:44:00" :finish "15:25:15" :penalty "5:20:00" :total "9:01:15"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 129 :plate-number "125" :rider-id (find-rider-id "Александр" "Чикишев") :start "11:45:00" :finish "15:29:03" :penalty "5:20:00" :total "9:04:03"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 130 :plate-number "229*" :rider-id (find-rider-id "Станислав" "Тарасов (дубль)") :start "12:11:00" :finish "15:58:14" :penalty "5:20:00" :total "9:07:14"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 131 :plate-number "221" :rider-id (find-rider-id "Олег" "Сухарев") :start "12:09:00" :finish "16:01:18" :penalty "5:20:00" :total "9:12:18"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 132 :plate-number "216" :rider-id (find-rider-id "Евгений" "Каширин") :start "12:07:30" :finish "16:07:57" :penalty "5:20:00" :total "9:20:27"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 133 :plate-number "201" :rider-id (find-rider-id "Ильшат" "Нигматуллин") :start "12:04:00" :finish "16:04:53" :penalty "5:20:00" :total "9:20:53"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 134 :plate-number "189" :rider-id (find-rider-id "Виталий" "Шаяхметов") :start "12:01:00" :finish "16:03:04" :penalty "5:20:00" :total "9:22:04"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 135 :plate-number "181" :rider-id (find-rider-id "Руслан" "Салыев") :start "11:59:00" :finish "16:02:53" :penalty "5:20:00" :total "9:23:53"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 136 :plate-number "127" :rider-id (find-rider-id "Станислав" "Зубков") :start "11:45:30" :finish "15:52:39" :penalty "5:20:00" :total "9:27:09"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 137 :plate-number "179" :rider-id (find-rider-id "Данил" "Береговой") :start "11:58:30" :finish "16:10:28" :penalty "5:20:00" :total "9:31:58"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 138 :plate-number "151" :rider-id (find-rider-id "Александр" "Беспалов") :start "11:51:30" :finish "16:07:02" :penalty "5:20:00" :total "9:35:32"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 139 :plate-number "161" :rider-id (find-rider-id "Егор" "Камалов") :start "11:54:00" :finish "16:14:35" :penalty "5:20:00" :total "9:40:35"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 140 :plate-number "101" :rider-id (find-rider-id "Максим" "Килин") :start "11:39:00" :finish "16:05:07" :penalty "5:20:00" :total "9:46:07"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 141 :plate-number "210" :rider-id (find-rider-id "Андрей" "Ершов") :start "12:06:00" :finish "16:35:59" :penalty "5:20:00" :total "9:49:59"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 142 :plate-number "194" :rider-id (find-rider-id "Николай" "Савочкин") :start "12:02:00" :finish "16:40:21" :penalty "5:20:00" :total "9:58:21"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 143 :plate-number "162" :rider-id (find-rider-id "Худорожков" "Петр") :start "11:54:00" :finish "16:38:34" :penalty "5:20:00" :total "10:04:34"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 144 :plate-number "110" :rider-id (find-rider-id "Владимир" "Филимончук") :start "11:41:00" :finish "16:33:10" :penalty "5:20:00" :total "10:12:10"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 145 :plate-number "175" :rider-id (find-rider-id "Павел" "Байдала") :start "11:57:30" :finish "16:52:34" :penalty "5:20:00" :total "10:15:04"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 146 :plate-number "250" :rider-id (find-rider-id "Евгений" "Шестаков") :start "12:16:00" :finish "17:35:29" :penalty "5:20:00" :total "10:39:29"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 147 :plate-number "168" :rider-id (find-rider-id "Сергей" "Беличев") :start "11:55:30" :finish "17:26:24" :penalty "5:20:00" :total "10:50:54"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 148 :plate-number "157" :rider-id (find-rider-id "Сергей" "Нелюбин") :start "11:53:00" :finish "17:25:19" :penalty "5:20:00" :total "10:52:19"]
   ;; Страница 6
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 149 :plate-number "238" :rider-id (find-rider-id "Дмитрий" "Шматков") :start "12:13:00" :finish "17:54:07" :penalty "5:20:00" :total "11:01:07"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 150 :plate-number "262" :rider-id (find-rider-id "Артём" "Душин") :start "12:19:00" :finish "18:08:32" :penalty "5:20:00" :total "11:09:32"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 151 :plate-number "171" :rider-id (find-rider-id "Максим" "Кабаненко") :start "11:56:30" :finish "17:56:32" :penalty "5:20:00" :total "11:20:02"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 152 :plate-number "199" :rider-id (find-rider-id "Иван" "Попов") :start "12:03:30" :finish "13:26:51" :penalty "10:00:00" :total "11:23:21"]
   [:type :result :event-id "EALkbw" :classification-id "CNyY6EmTHP8g" :position 153 :plate-number "333" :rider-id (find-rider-id "Максим" "Антонов") :start "12:30:00" :finish "17:00:00" :penalty "10:00:00" :total "14:30:00"]

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
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 1 :plate-number "320" :rider-id (find-rider-id "Владимир" "Пономарчук") :start "12:26:30" :finish "15:43:56" :penalty "0:00:00" :total "3:17:26"]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 2 :plate-number "325" :rider-id (find-rider-id "Сергей" "Кузнецов" "Владимирович" nil) :start "12:28:00" :finish "15:23:05" :penalty "0:40:00" :total "3:35:05"]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 3 :plate-number "311" :rider-id (find-rider-id "Александр" "Полянин") :start "12:24:30" :finish "15:24:30" :penalty "0:40:00" :total "3:40:00"]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 4 :plate-number "303" :rider-id (find-rider-id "Виктор" "Шабуров") :start "12:22:30" :finish "15:26:45" :penalty "0:40:00" :total "3:44:15"]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 5 :plate-number "327" :rider-id (find-rider-id "Антон" "Стелюк") :start "12:28:30" :finish "15:38:50" :penalty "0:40:00" :total "3:50:20"]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 6 :plate-number "305" :rider-id (find-rider-id "Сергей" "Дубровин") :start "12:23:00" :finish "16:23:16" :penalty "0:00:00" :total "4:00:16"]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 7 :plate-number "317" :rider-id (find-rider-id "Антон" "Тырыкин") :start "12:26:00" :finish "16:30:41" :penalty "0:00:00" :total "4:04:41"]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 8 :plate-number "329" :rider-id (find-rider-id "Артем" "Денисов") :start "12:29:00" :finish "16:01:33" :penalty "0:40:00" :total "4:12:33"]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 9 :plate-number "312" :rider-id (find-rider-id "Андрей" "Волков") :start "12:24:30" :finish "16:11:55" :penalty "0:40:00" :total "4:27:25"]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 10 :plate-number "328" :rider-id (find-rider-id "Ярослав" "Саломатин") :start "12:28:30" :finish "15:43:31" :penalty "1:20:00" :total "4:35:01"]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 11 :plate-number "330" :rider-id (find-rider-id "Дмитрий" "Холкин") :start "12:29:00" :finish "17:07:01" :penalty "0:40:00" :total "5:18:01"]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 12 :plate-number "332" :rider-id (find-rider-id "Ростислав" "Зиязов") :start "12:29:30" :finish "16:27:48" :penalty "1:20:00" :total "5:18:18"]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 13 :plate-number "322" :rider-id (find-rider-id "Евгений" "Моисеев") :start "12:27:00" :finish "15:53:30" :penalty "2:40:00" :total "6:06:30"]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 14 :plate-number "932" :rider-id (find-rider-id "Андрей" "Похващев") :start "13:13:00" :finish "15:25:07" :penalty "5:20:00" :total "7:32:07"]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 15 :plate-number "302" :rider-id (find-rider-id "Артём" "Кириллов") :start "12:22:00" :finish "15:00:46" :penalty "5:20:00" :total "7:58:46"]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 16 :plate-number "331" :rider-id (find-rider-id "Евгений" "Достовалов") :start "12:29:30" :finish "15:33:55" :penalty "5:20:00" :total "8:24:25"]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 17 :plate-number "919" :rider-id (find-rider-id "Иван" "Заболоцкий") :start "13:12:00" :finish "16:18:52" :penalty "5:20:00" :total "8:26:52"]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 18 :plate-number "310" :rider-id (find-rider-id "Вадим" "Тихонов") :start "12:24:00" :finish "15:44:20" :penalty "5:20:00" :total "8:40:20"]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 19 :plate-number "307" :rider-id (find-rider-id "Олег" "Хвостенко") :start "12:23:30" :finish "15:43:54" :penalty "5:20:00" :total "8:40:24"]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 20 :plate-number "306" :rider-id (find-rider-id "Александр" "Анисимов") :start "12:23:00" :finish "16:13:24" :penalty "5:20:00" :total "9:10:24"]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 21 :plate-number "304" :rider-id (find-rider-id "Андрей" "Староватов") :start "12:22:30" :finish "16:21:31" :penalty "5:20:00" :total "9:19:01"]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 22 :plate-number "316" :rider-id (find-rider-id "Иван" "Соболев") :start "12:25:30" :finish "16:24:39" :penalty "5:20:00" :total "9:19:09"]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 23 :plate-number "321" :rider-id (find-rider-id "Олег" "Копытов") :start "12:27:00" :finish "16:46:19" :penalty "5:20:00" :total "9:39:19"]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 24 :plate-number "309" :rider-id (find-rider-id "Эдуард" "Мордюженко") :start "12:24:00" :finish "16:50:50" :penalty "5:20:00" :total "9:46:50"]
   ;; Страница 2
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 25 :plate-number "308" :rider-id (find-rider-id "Александр" "Орбан") :start "12:23:30" :finish "18:02:47" :penalty "5:20:00" :total "10:59:17"]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 26 :plate-number "314" :rider-id (find-rider-id "Антон" "Овчинников") :start "12:25:00" :finish "14:20:00" :penalty "10:00:00" :total "11:55:00"]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 27 :plate-number "324" :rider-id (find-rider-id "Максим" "Кокшаров") :start "12:27:30" :finish "15:51:40" :penalty "10:00:00" :total "13:24:10"]
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 28 :plate-number "326" :rider-id (find-rider-id "Андрей" "Маликов") :start "12:28:00" :finish "17:30:00" :penalty "10:00:00" :total "15:02:00"]

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
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 1 :plate-number "921" :rider-id (find-rider-id "Семён" "Скулкин") :start "13:13:00" :finish "16:24:56" :penalty "00:00:00" :total "03:11:56"]
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 4 :plate-number "407" :rider-id (find-rider-id "Леонид" "Асташов") :start "12:33:30" :finish "16:51:29" :penalty "00:00:00" :total "04:17:59"]
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 2 :plate-number "404" :rider-id (find-rider-id "Павел" "Стаин") :start "12:32:30" :finish "15:41:14" :penalty "01:20:00" :total "04:28:44"]
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 5 :plate-number "405" :rider-id (find-rider-id "Ринат" "Нохов") :start "12:33:00" :finish "17:10:11" :penalty "00:00:00" :total "04:37:11"]
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 3 :plate-number "922" :rider-id (find-rider-id "Евгений" "Мирзаметов") :start "13:13:00" :finish "17:14:42" :penalty "00:40:00" :total "04:41:42"]
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 11 :plate-number "406" :rider-id (find-rider-id "Василий" "Тараторин") :start "12:33:00" :finish "17:03:06" :penalty "00:40:00" :total "05:10:06"]
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 15 :plate-number "412" :rider-id (find-rider-id "Александр" "Талыгин") :start "12:34:30" :finish "16:34:46" :penalty "01:20:00" :total "05:20:16"]
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 6 :plate-number "415" :rider-id (find-rider-id "Егор" "Коноплев") :start "12:35:30" :finish "17:42:15" :penalty "02:00:00" :total "07:06:45"]
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 12 :plate-number "411" :rider-id (find-rider-id "Роман" "Белоногов") :start "12:34:30" :finish "15:44:31" :penalty "05:20:00" :total "08:30:01"]
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 7 :plate-number "419" :rider-id (find-rider-id "Виктор" "Медведев") :start "12:36:30" :finish "16:06:42" :penalty "05:20:00" :total "08:50:12"]
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 8 :plate-number "402" :rider-id (find-rider-id "Максим" "Пестов") :start "12:32:00" :finish "16:12:09" :penalty "05:20:00" :total "09:00:09"]
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 9 :plate-number "416" :rider-id (find-rider-id "илья" "Ефимов") :start "12:35:30" :finish "16:15:41" :penalty "05:20:00" :total "09:00:11"]
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 10 :plate-number "418" :rider-id (find-rider-id "Александр" "Ишонин") :start "12:36:00" :finish "16:19:24" :penalty "05:20:00" :total "09:03:24"]
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 16 :plate-number "408" :rider-id (find-rider-id "Дмитрий" "Сажин") :start "12:33:30" :finish "16:38:38" :penalty "05:20:00" :total "09:25:08"]
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 14 :plate-number "904" :rider-id (find-rider-id "Сергей" "Ужегов") :start "13:10:00" :finish "14:46:26" :penalty "10:00:00" :total "11:36:26"]
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 13 :plate-number "413" :rider-id (find-rider-id "Александр" "Зверев") :start "12:35:00" :finish "14:59:12" :penalty "10:00:00" :total "12:24:12"]
   [:type :result :event-id "EALkbw" :classification-id "CeY5ORDnv0j4" :position 17 :plate-number "417" :rider-id (find-rider-id "Максим" "Паршаков") :start "12:36:00" :finish "17:04:31" :penalty "10:00:00" :total "14:28:31"]

   ;; TODO: разобраться с уровнем 3 / 2 - что-то не сходится - очень долго ехали для типа простой трассы
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

   ;; Страница 1
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 1 :plate-number "507" :rider-id (find-rider-id "Александр" "Новопашин") :start "12:39:30" :finish "16:19:36" :penalty "00:00:00" :total "03:40:06"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 2 :plate-number "554" :rider-id (find-rider-id "Александр" "Бескровный") :start "12:51:00" :finish "16:32:53" :penalty "00:00:00" :total "03:41:53"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 3 :plate-number "511" :rider-id (find-rider-id "Сергей" "Борисов") :start "12:40:30" :finish "16:25:33" :penalty "00:00:00" :total "03:45:03"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 4 :plate-number "548" :rider-id (find-rider-id "Дмитрий" "Тимошевский") :start "12:49:30" :finish "16:45:52" :penalty "00:00:00" :total "03:56:22"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 5 :plate-number "539" :rider-id (find-rider-id "Александр" "Кабаев") :start "12:47:30" :finish "16:06:27" :penalty "00:40:00" :total "03:58:57"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 6 :plate-number "528" :rider-id (find-rider-id "Алексей" "Слабочков") :start "12:44:30" :finish "16:48:21" :penalty "00:00:00" :total "04:03:51"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 7 :plate-number "938" :rider-id (find-rider-id "Василий" "Дудников") :start "13:19:00" :finish "17:30:16" :penalty "00:00:00" :total "04:11:16"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 8 :plate-number "541" :rider-id (find-rider-id "Евгений" "Исупов") :start "12:48:00" :finish "16:09:37" :penalty "01:20:00" :total "04:41:37"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 9 :plate-number "517" :rider-id (find-rider-id "Валера" "Варгасов") :start "12:42:00" :finish "16:05:37" :penalty "01:20:00" :total "04:43:37"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 10 :plate-number "502" :rider-id (find-rider-id "Артём" "Котельников") :start "12:38:00" :finish "16:07:17" :penalty "01:20:00" :total "04:49:17"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 11 :plate-number "542" :rider-id (find-rider-id "Алексей" "Фадеев") :start "12:48:00" :finish "16:23:06" :penalty "01:20:00" :total "04:55:06"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 12 :plate-number "534" :rider-id (find-rider-id "Константин" "Тынкасов") :start "12:46:00" :finish "16:26:35" :penalty "01:20:00" :total "05:00:35"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 13 :plate-number "537" :rider-id (find-rider-id "Владислав" "Хонькин") :start "12:47:00" :finish "16:30:55" :penalty "01:20:00" :total "05:03:55"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 14 :plate-number "925" :rider-id (find-rider-id "Антон" "Аристахов") :start "13:13:00" :finish "17:01:30" :penalty "01:20:00" :total "05:08:30"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 15 :plate-number "547" :rider-id (find-rider-id "Денис" "Воробьев") :start "12:49:30" :finish "16:38:56" :penalty "01:20:00" :total "05:09:26"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 16 :plate-number "552" :rider-id (find-rider-id "Александр" "Исаев") :start "12:50:30" :finish "16:55:58" :penalty "01:20:00" :total "05:25:28"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 17 :plate-number "510" :rider-id (find-rider-id "Василий" "Жук") :start "12:40:00" :finish "16:47:53" :penalty "01:20:00" :total "05:27:53"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 18 :plate-number "501" :rider-id (find-rider-id "Сергей" "Анисимов") :start "12:38:00" :finish "16:51:15" :penalty "01:20:00" :total "05:33:15"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 19 :plate-number "513" :rider-id (find-rider-id "Евгений" "Василькин") :start "12:41:00" :finish "17:00:40" :penalty "01:20:00" :total "05:39:40"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 20 :plate-number "941" :rider-id (find-rider-id "Дмитрий" "Прядко") :start "13:13:00" :finish "13:45:40" :penalty "05:20:00" :total "05:52:40"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 21 :plate-number "949" :rider-id (find-rider-id "Алексей" "Полыгалов") :start "12:52:30" :finish "17:38:40" :penalty "01:20:00" :total "06:06:10"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 22 :plate-number "505" :rider-id (find-rider-id "Алексей" "Ищук") :start "12:39:00" :finish "13:43:00" :penalty "05:20:00" :total "06:24:00"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 23 :plate-number "516" :rider-id (find-rider-id "Александр" "Сумин") :start "12:41:30" :finish "16:54:11" :penalty "02:40:00" :total "06:52:41"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 24 :plate-number "545" :rider-id (find-rider-id "Максим" "Тимошевский") :start "12:49:00" :finish "14:22:46" :penalty "05:20:00" :total "06:53:46"]
   ;; Страница 2
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 25 :plate-number "531" :rider-id (find-rider-id "Владислав" "Мочалов") :start "12:45:30" :finish "14:37:34" :penalty "05:20:00" :total "07:12:04"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 26 :plate-number "509" :rider-id (find-rider-id "Александр" "Храмов") :start "12:40:00" :finish "14:53:34" :penalty "05:20:00" :total "07:33:34"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 27 :plate-number "557" :rider-id (find-rider-id "Василий" "Кармацких") :start "12:52:00" :finish "15:08:33" :penalty "05:20:00" :total "07:36:33"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 28 :plate-number "503" :rider-id (find-rider-id "Андрей" "Созыкин") :start "12:38:30" :finish "15:07:55" :penalty "05:20:00" :total "07:49:25"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 29 :plate-number "540" :rider-id (find-rider-id "Алексей" "Самойлов") :start "12:47:30" :finish "15:17:50" :penalty "05:20:00" :total "07:50:20"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 30 :plate-number "556" :rider-id (find-rider-id "Сергей" "Лазукин") :start "12:51:30" :finish "15:23:59" :penalty "05:20:00" :total "07:52:29"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 31 :plate-number "525" :rider-id (find-rider-id "Роман" "Ахмадиев") :start "12:44:00" :finish "15:22:30" :penalty "05:20:00" :total "07:58:30"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 32 :plate-number "538" :rider-id (find-rider-id "Александр" "Михалев") :start "12:47:00" :finish "15:29:00" :penalty "05:20:00" :total "08:02:00"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 33 :plate-number "929" :rider-id (find-rider-id "Евгений" "Симаков") :start "13:13:00" :finish "16:00:20" :penalty "05:20:00" :total "08:07:20"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 34 :plate-number "518" :rider-id (find-rider-id "Александр" "Курчев") :start "12:42:00" :finish "15:34:43" :penalty "05:20:00" :total "08:12:43"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 35 :plate-number "543" :rider-id (find-rider-id "Станислав" "Евдокимов") :start "12:48:30" :finish "15:44:39" :penalty "05:20:00" :total "08:16:09"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 36 :plate-number "918" :rider-id (find-rider-id "Владимир" "Жданов") :start "13:12:30" :finish "16:15:16" :penalty "05:20:00" :total "08:22:46"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 37 :plate-number "909" :rider-id (find-rider-id "Денис" "Деревенченко") :start "13:10:30" :finish "16:19:04" :penalty "05:20:00" :total "08:28:34"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 38 :plate-number "512" :rider-id (find-rider-id "Алексей" "Матвеев") :start "12:40:30" :finish "15:50:40" :penalty "05:20:00" :total "08:30:10"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 39 :plate-number "536" :rider-id (find-rider-id "Антон" "Кийко") :start "12:46:30" :finish "15:59:01" :penalty "05:20:00" :total "08:32:31"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 40 :plate-number "526" :rider-id (find-rider-id "Евгений" "Максимов") :start "12:44:00" :finish "16:03:40" :penalty "05:20:00" :total "08:39:40"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 41 :plate-number "546" :rider-id (find-rider-id "Вячеслав" "Салмин") :start "12:49:00" :finish "16:09:32" :penalty "05:20:00" :total "08:40:32"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 42 :plate-number "520" :rider-id (find-rider-id "Константин" "Одиноков") :start "12:42:30" :finish "16:19:06" :penalty "05:20:00" :total "08:56:36"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 43 :plate-number "515" :rider-id (find-rider-id "Юрий" "Лобко") :start "12:41:30" :finish "16:21:40" :penalty "05:20:00" :total "09:00:10"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 44 :plate-number "550" :rider-id (find-rider-id "Сергей" "Потлов") :start "12:50:00" :finish "16:34:31" :penalty "05:20:00" :total "09:04:31"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 45 :plate-number "555" :rider-id (find-rider-id "Никита" "Мохнин") :start "12:51:30" :finish "16:54:09" :penalty "05:20:00" :total "09:22:39"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 46 :plate-number "535" :rider-id (find-rider-id "Иван" "Мохнин") :start "12:46:30" :finish "16:54:18" :penalty "05:20:00" :total "09:27:48"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 47 :plate-number "524" :rider-id (find-rider-id "Алексей" "Сазанов") :start "12:43:30" :finish "17:15:02" :penalty "05:20:00" :total "09:51:32"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 48 :plate-number "945" :rider-id (find-rider-id "Михаил" "Дегтярёв") :start "13:13:30" :finish "17:58:04" :penalty "05:20:00" :total "10:04:34"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 49 :plate-number "946" :rider-id (find-rider-id "Андрей" "Дегтярёв") :start "13:13:30" :finish "17:58:05" :penalty "05:20:00" :total "10:04:35"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 50 :plate-number "529" :rider-id (find-rider-id "Иван" "Моисеев") :start "12:45:00" :finish "17:31:28" :penalty "05:20:00" :total "10:06:28"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 51 :plate-number "508" :rider-id (find-rider-id "Константин" "Розенбаум") :start "12:39:30" :finish "17:37:02" :penalty "05:20:00" :total "10:17:32"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 52 :plate-number "504" :rider-id (find-rider-id "Дмитрий" "Чирков") :start "12:38:30" :finish "13:26:51" :penalty "10:00:00" :total "10:48:21"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 53 :plate-number "541*" :rider-id (find-rider-id "Евгений" "Исупов (дубль)") :start "12:48:00" :finish "14:31:57" :penalty "10:00:00" :total "11:43:57"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 54 :plate-number "527" :rider-id (find-rider-id "Сергей" "Уткин") :start "12:44:30" :finish "15:12:53" :penalty "10:00:00" :total "12:28:23"]
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 55 :plate-number "532" :rider-id (find-rider-id "Александр" "Орешко") :start "12:45:30" :finish "15:58:00" :penalty "10:00:00" :total "13:12:30"]
   ;; Страница 3
   [:type :result :event-id "EALkbw" :classification-id "CtOb9wIT2lI" :position 56 :plate-number "544" :rider-id (find-rider-id "Сергей" "Ягудин") :start "12:48:30" :finish "16:09:23" :penalty "10:00:00" :total "13:20:53"]

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
   [:type :result :event-id "EALkbw" :classification-id "CbnNqePYIllI" :position 1 :plate-number "606" :rider-id (find-rider-id "Дарья" "Шабловская") :start "12:55:00" :finish "15:49:58" :penalty "00:00:00" :total "02:54:58"]
   [:type :result :event-id "EALkbw" :classification-id "CbnNqePYIllI" :position 2 :plate-number "604" :rider-id (find-rider-id "Ксения" "Потапович") :start "12:54:30" :finish "15:50:25" :penalty "00:40:00" :total "03:35:55"]
   [:type :result :event-id "EALkbw" :classification-id "CbnNqePYIllI" :position 3 :plate-number "602" :rider-id (find-rider-id "Анна" "Медведева") :start "12:54:00" :finish "16:57:22" :penalty "00:00:00" :total "04:03:22"]
   [:type :result :event-id "EALkbw" :classification-id "CbnNqePYIllI" :position 4 :plate-number "605" :rider-id (find-rider-id "Марина" "Аверина") :start "12:55:00" :finish "17:20:20" :penalty "00:00:00" :total "04:25:20"]
   [:type :result :event-id "EALkbw" :classification-id "CbnNqePYIllI" :position 5 :plate-number "603" :rider-id (find-rider-id "Ульяна" "Храмцова") :start "12:54:30" :finish "15:26:09" :penalty "02:00:00" :total "04:31:39"]
   [:type :result :event-id "EALkbw" :classification-id "CbnNqePYIllI" :position 6 :plate-number "607" :rider-id (find-rider-id "Юлия" "Березинских") :start "12:55:30" :finish "15:39:14" :penalty "02:00:00" :total "04:43:44"]
   [:type :result :event-id "EALkbw" :classification-id "CbnNqePYIllI" :position 7 :plate-number "609" :rider-id (find-rider-id "Анастасия" "Шилова") :start "12:56:00" :finish "17:47:05" :penalty "02:00:00" :total "06:51:05"]
   [:type :result :event-id "EALkbw" :classification-id "CbnNqePYIllI" :position 8 :plate-number "601" :rider-id (find-rider-id "Маргарита" "Гришина") :start "12:54:00" :finish "17:32:09" :penalty "06:00:00" :total "10:38:09"]
   [:type :result :event-id "EALkbw" :classification-id "CbnNqePYIllI" :position 9 :plate-number "610" :rider-id (find-rider-id "Анна" "Евграфова") :start "12:56:00" :finish "13:54:30" :penalty "06:00:00" :total "06:58:30"]
   [:type :result :event-id "EALkbw" :classification-id "CbnNqePYIllI" :position 10 :plate-number "937" :rider-id (find-rider-id "Наталья" "Макеева") :start "13:13:00" :finish "14:16:34" :penalty "06:00:00" :total "07:03:34"]
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
     {:type :result :event-id event-id :classification-id "C1gLPX9AUjc" :position 2 :plate-number "237" :rider-id (find-rider-id "Сергей" "Кузнецов" "Владимирович" nil) :team "KATAYENDURO"}
     {:type :result :event-id event-id :classification-id "C1gLPX9AUjc" :position 3 :plate-number "236" :rider-id (find-rider-id "Андрей" "Щипунов")}
     {:type :result :event-id event-id :classification-id "C1gLPX9AUjc" :position 4 :plate-number "234" :rider-id (find-rider-id "Константин" "Одиноков")}
     {:type :result :event-id event-id :classification-id "C1gLPX9AUjc" :position 5 :plate-number "231" :rider-id (find-rider-id "Владимир" "Боровских") :team "Камышлов"}
     {:type :result :event-id event-id :classification-id "C1gLPX9AUjc" :position 6 :plate-number "239" :rider-id (find-rider-id "Дмитрий" "Григоренко")}
     {:type :result :event-id event-id :classification-id "C1gLPX9AUjc" :position 7 :plate-number "238" :rider-id (find-rider-id "Александр" "Капустин")}
     {:type :result :event-id event-id :classification-id "C1gLPX9AUjc" :position 8 :plate-number "233" :rider-id (find-rider-id "Андрей" "Тужилов")}
     {:type :result :event-id event-id :classification-id "C1gLPX9AUjc" :position 9 :plate-number "232" :rider-id (find-rider-id "Андрей" "Кудин")}
     ]))

;; Вызов - Еманжелинск
(def emanzhelinsk1
  (let [event-id "EBord8g"]
    (concat
      [{:type         :event
        :name         "Гонка Вызов"
        :date         "2025-06-14"
        :event-url    "https://marshalone.ru/card/73419310-c012-4500-8567-3ee9f5b3a4ad"
        :telegram-url "https://t.me/MOTOSPORT74"
        :event-id     event-id
        }]

      (let [classification-id "CQ575942x5Rg"]
        [{:type              :classification
          :classification-id classification-id
          :event-id          event-id
          :order             1
          :name              "Золото"
          :equivalent        :gold
          :laps              3
          ;; Тут сложно - круг не сказать чтобы сильно легкий, но довольно короткий
          :lap-difficulty    60
          :started-count     20
          :laps-info?        true}

         [:type :result :event-id event-id :classification-id classification-id :position 1 :plate-number "15" :rider-id (find-rider-id "Станислав" "Максимов") :start "12:02:30" :finish "14:07:37" :penalty "00:00:00" :total "02:05:07" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 2 :plate-number "6" :rider-id (find-rider-id "Никита" "Поляков") :start "12:01:00" :finish "14:06:21" :penalty "00:00:00" :total "02:05:21" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 3 :plate-number "1" :rider-id (find-rider-id "Евгений" "Цицимушкин") :start "12:01:00" :finish "14:08:16" :penalty "00:00:00" :total "02:07:16" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 4 :plate-number "11" :rider-id (find-rider-id "Артём" "Иванов") :start "12:01:00" :finish "14:16:17" :penalty "00:00:00" :total "02:15:17" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 5 :plate-number "10" :rider-id (find-rider-id "Артем" "Калинин") :start "12:01:00" :finish "14:22:30" :penalty "00:00:00" :total "02:21:30" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 6 :plate-number "3" :rider-id (find-rider-id "Михаил" "Ушаков") :start "12:01:00" :finish "14:25:54" :penalty "00:00:00" :total "02:24:54" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 7 :plate-number "18" :rider-id (find-rider-id "Егор" "Емельянов") :start "12:02:30" :finish "14:31:25" :penalty "00:40:00" :total "03:08:55" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 8 :plate-number "9" :rider-id (find-rider-id "Константин" "Калмыков") :start "12:01:00" :finish "14:53:05" :penalty "00:40:00" :total "03:32:05" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 9 :plate-number "20" :rider-id (find-rider-id "Александр" "Антипин") :start "12:02:30" :finish "14:01:01" :penalty "04:00:00" :total "05:58:31" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 10 :plate-number "12" :rider-id (find-rider-id "Павел" "Хисамутдинов") :start "12:02:30" :finish "15:30:07" :penalty "02:40:00" :total "06:07:37" :laps 3]
         ;; TODO: Эти не могли финишировать 3 круга полностью, но проставлено что 3
         [:type :result :event-id event-id :classification-id classification-id :position 11 :plate-number "8" :rider-id (find-rider-id "Константин" "Майбуров") :start "12:01:00" :finish "16:16:22" :penalty "02:40:00" :total "06:55:22" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 12 :plate-number "7" :rider-id (find-rider-id "Денис" "Медведюк") :start "12:01:00" :finish "16:19:07" :penalty "02:40:00" :total "06:58:07" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 13 :plate-number "2" :rider-id (find-rider-id "Егор" "Харитонов") :start "12:02:30" :finish "16:10:00" :penalty "03:20:00" :total "07:27:30" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 14 :plate-number "16" :rider-id (find-rider-id "Владимир" "Килунин") :start "12:02:30" :finish "14:57:17" :penalty "04:40:00" :total "07:34:47" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 15 :plate-number "19" :rider-id (find-rider-id "Алексей" "Мамашев") :start "12:02:30" :finish "16:07:00" :penalty "06:00:00" :total "10:04:30" :laps 2]
         ;; TODO: Два раза 19 номер в протоколе - проверить
         [:type :result :event-id event-id :classification-id classification-id :position 16 :plate-number "19*" :rider-id (find-rider-id "Андрей" "Бадьин") :start "12:02:30" :finish "14:52:22" :penalty "07:20:00" :total "10:09:52" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 17 :plate-number "5" :rider-id (find-rider-id "Дмитрий" "Резницкий") :start "12:01:00" :finish "16:20:08" :penalty "08:40:00" :total "12:59:08" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 18 :plate-number "17" :rider-id (find-rider-id "Антон" "Зырянов") :start "12:02:30" :finish "16:16:51" :penalty "10:00:00" :total "14:14:21" :laps 2]
         ;; TODO: Эти по идее без финиша должны быть
         [:type :result :event-id event-id :classification-id classification-id :position 19 :plate-number "4" :rider-id (find-rider-id "Кирилл" "Синченко") :start "12:01:00" :finish "13:38:38" :penalty "11:20:00" :total "12:57:38" :laps 1]
         [:type :result :event-id event-id :classification-id classification-id :position 20 :plate-number "13" :rider-id (find-rider-id "Евгений" "Осадчий") :start "12:02:30" :finish "14:04:36" :penalty "11:20:00" :total "13:22:06" :laps 1]

         ])

      (let [classification-id "CO1fgit5GOqE"]
        [
         {:type              :classification
          :classification-id classification-id
          :event-id          event-id
          :order             2
          :name              "Серебро"
          :equivalent        :silver
          :laps              2
          ;; Та же сложность что и в золоте - трасса одинаковая
          :lap-difficulty    60
          :started-count     76
          :laps-info?        true}

         [:type :result :event-id event-id :classification-id classification-id :position 1 :plate-number "146" :rider-id (find-rider-id "Владимир" "Иванов") :start "12:10:00" :finish "13:51:01" :penalty "00:00:00" :total "01:41:01" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 2 :plate-number "101" :rider-id (find-rider-id "Константин" "Романов") :start "12:04:00" :finish "13:46:48" :penalty "00:00:00" :total "01:42:48" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 3 :plate-number "153" :rider-id (find-rider-id "Денис" "Шилов") :start "12:11:30" :finish "13:55:57" :penalty "00:00:00" :total "01:44:27" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 4 :plate-number "154" :rider-id (find-rider-id "Александр" "Удачин") :start "12:11:30" :finish "13:56:18" :penalty "00:00:00" :total "01:44:48" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 5 :plate-number "163" :rider-id (find-rider-id "Алексей" "Кошелев") :start "12:13:00" :finish "14:06:30" :penalty "00:00:00" :total "01:53:30" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 6 :plate-number "102" :rider-id (find-rider-id "Дмитрий" "Аверин") :start "12:04:00" :finish "14:02:07" :penalty "00:00:00" :total "01:58:07" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 7 :plate-number "152" :rider-id (find-rider-id "Владимир" "Бодрин") :start "12:11:30" :finish "14:19:46" :penalty "00:00:00" :total "02:08:16" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 8 :plate-number "160" :rider-id (find-rider-id "Александр" "Любченко") :start "12:13:00" :finish "14:23:21" :penalty "00:00:00" :total "02:10:21" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 9 :plate-number "122" :rider-id (find-rider-id "Владислав" "Пашнин") :start "12:07:00" :finish "14:18:50" :penalty "00:00:00" :total "02:11:50" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 10 :plate-number "164" :rider-id (find-rider-id "Артем" "Копытов") :start "12:13:00" :finish "14:26:40" :penalty "00:00:00" :total "02:13:40" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 11 :plate-number "108" :rider-id (find-rider-id "Денис" "Зараменских") :start "12:04:00" :finish "14:18:14" :penalty "00:00:00" :total "02:14:14" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 12 :plate-number "106" :rider-id (find-rider-id "Владимир" "Пономарчук") :start "12:04:00" :finish "14:21:08" :penalty "00:00:00" :total "02:17:08" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 13 :plate-number "107" :rider-id (find-rider-id "Илья" "Кузнецов") :start "12:04:00" :finish "14:21:51" :penalty "00:00:00" :total "02:17:51" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 14 :plate-number "172" :rider-id (find-rider-id "Виталий" "Голов") :start "12:14:30" :finish "13:56:55" :penalty "00:40:00" :total "02:22:25" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 15 :plate-number "120" :rider-id (find-rider-id "Дмитрий" "Иванов") :start "12:07:00" :finish "14:04:12" :penalty "00:40:00" :total "02:37:12" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 16 :plate-number "157" :rider-id (find-rider-id "Артём" "Ремесленников") :start "12:11:30" :finish "14:16:42" :penalty "00:40:00" :total "02:45:12" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 17 :plate-number "121" :rider-id (find-rider-id "Константин" "Маркелов") :start "12:07:00" :finish "14:53:51" :penalty "00:00:00" :total "02:46:51" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 18 :plate-number "119" :rider-id (find-rider-id "Артем" "Свяжин") :start "12:05:30" :finish "14:13:42" :penalty "00:40:00" :total "02:48:12" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 19 :plate-number "161" :rider-id (find-rider-id "Александр" "Лабутин") :start "12:13:00" :finish "13:43:02" :penalty "01:20:00" :total "02:50:02" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 20 :plate-number "118" :rider-id (find-rider-id "Антон" "Тырыкин") :start "12:05:30" :finish "15:08:55" :penalty "00:00:00" :total "03:03:25" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 21 :plate-number "103" :rider-id (find-rider-id "Алексей" "Кокорин") :start "12:04:00" :finish "14:00:28" :penalty "01:20:00" :total "03:16:28" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 22 :plate-number "100" :rider-id (find-rider-id "Евгений" "Журавский") :start "12:04:00" :finish "14:00:41" :penalty "01:20:00" :total "03:16:41" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 23 :plate-number "167" :rider-id (find-rider-id "Константин" "Захаров") :start "12:13:00" :finish "14:15:04" :penalty "01:20:00" :total "03:22:04" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 24 :plate-number "166" :rider-id (find-rider-id "Павел" "Иванов") :start "12:13:00" :finish "14:44:45" :penalty "01:20:00" :total "03:51:45" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 25 :plate-number "104" :rider-id (find-rider-id "Александр" "Выгодский") :start "12:04:00" :finish "15:30:00" :penalty "00:40:00" :total "04:06:00" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 26 :plate-number "115" :rider-id (find-rider-id "Андрей" "Склюев") :start "12:05:30" :finish "15:11:30" :penalty "01:20:00" :total "04:26:00" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 27 :plate-number "159" :rider-id (find-rider-id "Дмитрий" "Никитин") :start "12:11:30" :finish "14:41:22" :penalty "02:00:00" :total "04:29:52" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 28 :plate-number "114" :rider-id (find-rider-id "Юрий" "Бороздин") :start "12:05:30" :finish "15:30:00" :penalty "01:20:00" :total "04:44:30" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 29 :plate-number "105" :rider-id (find-rider-id "Алексей" "Семилетов") :start "12:04:00" :finish "15:30:00" :penalty "01:20:00" :total "04:46:00" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 30 :plate-number "175" :rider-id (find-rider-id "Максим" "Бормотов") :start "12:14:30" :finish "15:42:22" :penalty "01:20:00" :total "04:47:52" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 31 :plate-number "137" :rider-id (find-rider-id "Антон" "Галюк") :start "12:08:30" :finish "15:00:00" :penalty "02:00:00" :total "04:51:30" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 32 :plate-number "131" :rider-id (find-rider-id "Владимир" "Киселёв") :start "12:08:30" :finish "15:30:00" :penalty "02:00:00" :total "05:21:30" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 33 :plate-number "110" :rider-id (find-rider-id "Владислав" "Чибаков") :start "12:05:30" :finish "16:05:00" :penalty "02:00:00" :total "05:59:30" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 34 :plate-number "111" :rider-id (find-rider-id "Вадим" "Лугаськов") :start "12:05:30" :finish "15:41:13" :penalty "02:40:00" :total "06:15:43" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 35 :plate-number "168" :rider-id (find-rider-id "Иван" "Заполоцкий") :start "12:13:00" :finish "16:52:08" :penalty "02:00:00" :total "06:39:08" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 36 :plate-number "156" :rider-id (find-rider-id "Михаил" "Соловьев") :start "12:11:30" :finish "15:35:00" :penalty "03:20:00" :total "06:43:30" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 37 :plate-number "162" :rider-id (find-rider-id "Артем" "Кремлев") :start "12:13:00" :finish "15:03:28" :penalty "04:00:00" :total "06:50:28" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 38 :plate-number "135" :rider-id (find-rider-id "Александр" "Мугулов") :start "12:08:30" :finish "16:34:14" :penalty "02:40:00" :total "07:05:44" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 39 :plate-number "130" :rider-id (find-rider-id "Дмитрий" "Мокиенко") :start "12:08:30" :finish "16:16:01" :penalty "03:20:00" :total "07:27:31" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 40 :plate-number "123" :rider-id (find-rider-id "Александр" "Савонин") :start "12:07:00" :finish "17:07:49" :penalty "02:40:00" :total "07:40:49" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 41 :plate-number "138" :rider-id (find-rider-id "Анатолий" "Ванчинов") :start "12:08:30" :finish "16:34:27" :penalty "03:20:00" :total "07:45:57" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 42 :plate-number "155" :rider-id (find-rider-id "Ильдус" "Сулейманов") :start "12:11:30" :finish "16:47:12" :penalty "03:20:00" :total "07:55:42" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 43 :plate-number "116" :rider-id (find-rider-id "Иван" "Филиппов") :start "12:05:30" :finish "17:07:31" :penalty "03:20:00" :total "08:22:01" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 44 :plate-number "109" :rider-id (find-rider-id "Виктор" "Калинин") :start "12:04:00" :finish "18:35:00" :penalty "03:20:00" :total "09:51:00" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 45 :plate-number "142" :rider-id (find-rider-id "Руслан" "Сафин") :start "12:10:00" :finish "14:34:07" :penalty "05:20:00" :total "07:44:07" :laps 1]
         [:type :result :event-id event-id :classification-id classification-id :position 46 :plate-number "140" :rider-id (find-rider-id "Никита" "Баранов") :start "12:10:00" :finish "14:34:25" :penalty "05:20:00" :total "07:44:25" :laps 1]
         [:type :result :event-id event-id :classification-id classification-id :position 47 :plate-number "144" :rider-id (find-rider-id "Вадим" "Мезенцев") :start "12:10:00" :finish "14:40:10" :penalty "06:00:00" :total "08:30:10" :laps 1]
         [:type :result :event-id event-id :classification-id classification-id :position 48 :plate-number "170" :rider-id (find-rider-id "Василий" "Дудников") :start "12:14:30" :finish "14:50:16" :penalty "06:00:00" :total "08:35:46" :laps 1]
         [:type :result :event-id event-id :classification-id classification-id :position 49 :plate-number "126" :rider-id (find-rider-id "Евгений" "Ярославцев") :start "12:07:00" :finish "14:05:00" :penalty "06:40:00" :total "08:38:00" :laps 1]
         [:type :result :event-id event-id :classification-id classification-id :position 50 :plate-number "117" :rider-id (find-rider-id "Сергей" "Дубровин") :start "12:05:30" :finish "16:20:28" :penalty "04:40:00" :total "08:54:58" :laps 1]
         [:type :result :event-id event-id :classification-id classification-id :position 51 :plate-number "113" :rider-id (find-rider-id "Вадим" "Ахтямов") :start "12:05:30" :finish "16:28:29" :penalty "04:40:00" :total "09:02:59" :laps 1]
         [:type :result :event-id event-id :classification-id classification-id :position 52 :plate-number "134" :rider-id (find-rider-id "Николай" "Обожин") :start "12:08:30" :finish "14:04:24" :penalty "07:20:00" :total "09:15:54" :laps 1]
         [:type :result :event-id event-id :classification-id classification-id :position 53 :plate-number "128" :rider-id (find-rider-id "Амир" "Сарваритдинов") :start "12:07:00" :finish "15:30:00" :penalty "06:00:00" :total "09:23:00" :laps 1]
         [:type :result :event-id event-id :classification-id classification-id :position 54 :plate-number "145" :rider-id (find-rider-id "Ален" "Кокшаров") :start "12:10:00" :finish "14:20:09" :penalty "07:20:00" :total "09:30:09" :laps 1]
         [:type :result :event-id event-id :classification-id classification-id :position 55 :plate-number "125" :rider-id (find-rider-id "Илья" "Юзеев") :start "12:07:00" :finish "15:28:37" :penalty "06:40:00" :total "10:01:37" :laps 1]
         [:type :result :event-id event-id :classification-id classification-id :position 56 :plate-number "136" :rider-id (find-rider-id "Егор" "Коноплев") :start "12:08:30" :finish "15:30:00" :penalty "07:20:00" :total "10:41:30" :laps 1]
         [:type :result :event-id event-id :classification-id classification-id :position 57 :plate-number "147" :rider-id (find-rider-id "Сергей" "Баранов") :start "12:10:00" :finish "15:30:00" :penalty "08:00:00" :total "10:50:00" :laps 1]
         [:type :result :event-id event-id :classification-id classification-id :position 58 :plate-number "148" :rider-id (find-rider-id "Руслан" "Салыев") :start "12:10:00" :finish "15:00:07" :penalty "08:00:00" :total "10:50:07" :laps 1]
         [:type :result :event-id event-id :classification-id classification-id :position 59 :plate-number "139" :rider-id (find-rider-id "Сергей" "Вакушин") :start "12:08:30" :finish "15:30:00" :penalty "08:00:00" :total "11:21:30" :laps 1]
         [:type :result :event-id event-id :classification-id classification-id :position 60 :plate-number "169" :rider-id (find-rider-id "Рустам" "Еникеев") :start "12:13:00" :finish "15:42:35" :penalty "08:00:00" :total "11:29:35" :laps 1]
         [:type :result :event-id event-id :classification-id classification-id :position 61 :plate-number "129" :rider-id (find-rider-id "Артур" "Поздеев") :start "12:07:00" :finish "15:48:49" :penalty "08:00:00" :total "11:41:49" :laps 1]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "176" :rider-id (find-rider-id "Данил" "Береговой") :start "12:14:30" :finish "—" :penalty "08:40:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "151" :rider-id (find-rider-id "Илья" "Ефимов") :start "12:11:30" :finish "—" :penalty "08:40:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "165" :rider-id (find-rider-id "Арсений" "Исмагилов") :start "12:13:00" :finish "—" :penalty "08:40:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "150" :rider-id (find-rider-id "Егор" "Камалов") :start "12:11:30" :finish "—" :penalty "08:40:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "141" :rider-id (find-rider-id "Семён" "Томилов") :start "12:10:00" :finish "—" :penalty "08:40:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "149" :rider-id (find-rider-id "Ильшат" "Нигматуллин") :start "12:10:00" :finish "—" :penalty "08:40:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "171" :rider-id (find-rider-id "Анатолий" "Горбачев") :start "12:14:30" :finish "—" :penalty "09:20:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "158" :rider-id (find-rider-id "Александр" "Ремесленников") :start "12:11:30" :finish "—" :penalty "10:40:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "174" :rider-id (find-rider-id "Павел" "Водовозов") :start "12:14:30" :finish "—" :penalty "11:20:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "173" :rider-id (find-rider-id "Геронтий" "Гогиберидзе") :start "12:14:30" :finish "—" :penalty "11:20:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "127" :rider-id (find-rider-id "Алексей" "Захаров") :start "12:07:00" :finish "—" :penalty "11:20:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "124" :rider-id (find-rider-id "Евгений" "Мирзаметов") :start "12:07:00" :finish "—" :penalty "11:20:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "143" :rider-id (find-rider-id "Юрий" "Рысин") :start "12:10:00" :finish "—" :penalty "11:20:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "133" :rider-id (find-rider-id "Иван" "Тихонов") :start "12:08:30" :finish "—" :penalty "11:20:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "132" :rider-id (find-rider-id "Данила" "Фролов") :start "12:08:30" :finish "—" :penalty "11:20:00" :total "сошел" :dnf? true]

         ])

      (let [classification-id "CspvRi8oaQs"]
        [{:type              :classification
          :classification-id classification-id
          :event-id          event-id
          :order             3
          :name              "Бронза"
          :equivalent        :bronze
          :laps              3
          ;; Ощутимо проще чем золото/серебро
          :lap-difficulty    40
          :started-count     89
          :laps-info?        true}

         [:type :result :event-id event-id :classification-id classification-id :position 1 :plate-number "223" :rider-id (find-rider-id "Савелий" "Кунакбаев") :start "12:19:00" :finish "13:48:48" :penalty "00:00:00" :total "01:29:48" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 2 :plate-number "231" :rider-id (find-rider-id "Матвей" "Тиунов") :start "12:20:30" :finish "13:55:38" :penalty "00:00:00" :total "01:35:08" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 3 :plate-number "267" :rider-id (find-rider-id "Сергей" "Кузнецов" "Владимирович" nil) :start "12:25:00" :finish "14:01:30" :penalty "00:00:00" :total "01:36:30" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 4 :plate-number "201" :rider-id (find-rider-id "Александр" "Бескровный") :start "12:16:00" :finish "13:58:59" :penalty "00:00:00" :total "01:42:59" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 5 :plate-number "291" :rider-id (find-rider-id "Александр" "Зверев") :start "12:28:00" :finish "14:14:44" :penalty "00:00:00" :total "01:46:44" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 6 :plate-number "226" :rider-id (find-rider-id "Леонид" "Асташов") :start "12:19:00" :finish "14:07:13" :penalty "00:00:00" :total "01:48:13" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 7 :plate-number "243" :rider-id (find-rider-id "Михаил" "Попов") :start "12:22:00" :finish "14:10:32" :penalty "00:00:00" :total "01:48:32" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 8 :plate-number "206" :rider-id (find-rider-id "Денис" "Воробьёв") :start "12:16:00" :finish "14:07:08" :penalty "00:00:00" :total "01:51:08" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 9 :plate-number "203" :rider-id (find-rider-id "Алексей" "Слабочков") :start "12:16:00" :finish "14:07:36" :penalty "00:00:00" :total "01:51:36" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 10 :plate-number "229" :rider-id (find-rider-id "Владимир" "Тясин") :start "12:19:00" :finish "14:11:26" :penalty "00:00:00" :total "01:52:26" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 11 :plate-number "224" :rider-id (find-rider-id "Андрей" "Ломакин") :start "12:19:00" :finish "14:11:32" :penalty "00:00:00" :total "01:52:32" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 12 :plate-number "257" :rider-id (find-rider-id "Денис" "Меньшиков") :start "12:23:30" :finish "14:17:11" :penalty "00:00:00" :total "01:53:41" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 13 :plate-number "239" :rider-id (find-rider-id "Ярослав" "Саломатин") :start "12:20:30" :finish "14:14:36" :penalty "00:00:00" :total "01:54:06" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 14 :plate-number "266" :rider-id (find-rider-id "Кирилл" "Кузнецов") :start "12:25:00" :finish "14:19:07" :penalty "00:00:00" :total "01:54:07" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 15 :plate-number "200" :rider-id (find-rider-id "Александр" "Новопашин") :start "12:16:00" :finish "14:11:31" :penalty "00:00:00" :total "01:55:31" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 16 :plate-number "265" :rider-id (find-rider-id "Иван" "Чедаев") :start "12:25:00" :finish "14:20:36" :penalty "00:00:00" :total "01:55:36" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 17 :plate-number "238" :rider-id (find-rider-id "Фёдор" "Сборошенко") :start "12:20:30" :finish "14:16:34" :penalty "00:00:00" :total "01:56:04" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 18 :plate-number "205" :rider-id (find-rider-id "Артём" "Котельников") :start "12:16:00" :finish "14:18:35" :penalty "00:00:00" :total "02:02:35" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 19 :plate-number "246" :rider-id (find-rider-id "Вадим" "Плеханов") :start "12:22:00" :finish "14:25:52" :penalty "00:00:00" :total "02:03:52" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 20 :plate-number "232" :rider-id (find-rider-id "Константин" "Табанин") :start "12:20:30" :finish "14:27:05" :penalty "00:00:00" :total "02:06:35" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 21 :plate-number "202" :rider-id (find-rider-id "Сергей" "Борисов") :start "12:16:00" :finish "14:24:55" :penalty "00:00:00" :total "02:08:55" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 22 :plate-number "215" :rider-id (find-rider-id "Константин" "Одиноков") :start "12:17:30" :finish "14:37:44" :penalty "00:00:00" :total "02:20:14" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 23 :plate-number "292" :rider-id (find-rider-id "Арсен" "Байрамуков") :start "12:28:00" :finish "14:57:33" :penalty "00:00:00" :total "02:29:33" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 24 :plate-number "234" :rider-id (find-rider-id "Виталий" "Стаценков") :start "12:20:30" :finish "14:50:41" :penalty "00:00:00" :total "02:30:11" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 25 :plate-number "241" :rider-id (find-rider-id "Александр" "Рахмеев") :start "12:22:00" :finish "14:40:33" :penalty "00:40:00" :total "02:58:33" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 26 :plate-number "280" :rider-id (find-rider-id "Арсений" "Вшивков") :start "12:28:00" :finish "14:56:59" :penalty "00:40:00" :total "03:08:59" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 27 :plate-number "204" :rider-id (find-rider-id "Валерий" "Варгасов") :start "12:16:00" :finish "14:51:35" :penalty "00:40:00" :total "03:15:35" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 28 :plate-number "225" :rider-id (find-rider-id "Владимир" "Носков") :start "12:19:00" :finish "15:07:52" :penalty "00:40:00" :total "03:28:52" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 29 :plate-number "288" :rider-id (find-rider-id "Дмитрий" "Абдрахманов") :start "12:28:00" :finish "14:57:11" :penalty "01:20:00" :total "03:49:11" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 30 :plate-number "285" :rider-id (find-rider-id "Роман" "Белоногов") :start "12:28:00" :finish "15:00:00" :penalty "01:20:00" :total "03:52:00" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 31 :plate-number "289" :rider-id (find-rider-id "Дмитрий" "Холкин") :start "12:28:00" :finish "15:09:00" :penalty "01:20:00" :total "04:01:00" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 32 :plate-number "227" :rider-id (find-rider-id "Сергей" "Уфимцев") :start "12:19:00" :finish "15:13:43" :penalty "01:20:00" :total "04:14:43" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 33 :plate-number "283" :rider-id (find-rider-id "Евгений" "Чурин") :start "12:28:00" :finish "15:41:18" :penalty "01:20:00" :total "04:33:18" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 34 :plate-number "209" :rider-id (find-rider-id "Максим" "Тимошевский") :start "12:16:00" :finish "15:46:00" :penalty "01:20:00" :total "04:50:00" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 35 :plate-number "274" :rider-id (find-rider-id "Станислав" "Зеленских") :start "12:26:30" :finish "16:35:14" :penalty "01:20:00" :total "05:28:44" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 36 :plate-number "236" :rider-id (find-rider-id "Евгений" "Соловьев") :start "12:20:30" :finish "16:32:45" :penalty "01:20:00" :total "05:32:15" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 37 :plate-number "245" :rider-id (find-rider-id "Олег" "Поленков") :start "12:22:00" :finish "15:58:05" :penalty "02:00:00" :total "05:36:05" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 38 :plate-number "252" :rider-id (find-rider-id "Ринат" "Нохов") :start "12:23:30" :finish "16:44:54" :penalty "01:20:00" :total "05:41:24" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 39 :plate-number "249" :rider-id (find-rider-id "Максим" "Паршаков") :start "12:22:00" :finish "16:45:40" :penalty "01:20:00" :total "05:43:40" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 40 :plate-number "242" :rider-id (find-rider-id "Дмитрий" "Прикин") :start "12:22:00" :finish "17:25:44" :penalty "01:20:00" :total "06:23:44" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 41 :plate-number "253" :rider-id (find-rider-id "Александр" "Храмцов") :start "12:23:30" :finish "17:40:00" :penalty "01:20:00" :total "06:36:30" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 42 :plate-number "221" :rider-id (find-rider-id "Артем" "Денисов") :start "12:19:00" :finish "18:18:58" :penalty "01:20:00" :total "07:19:58" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 43 :plate-number "259" :rider-id (find-rider-id "Алексей" "Любимов") :start "12:23:30" :finish "14:26:38" :penalty "02:00:00" :total "04:03:08" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 44 :plate-number "228" :rider-id (find-rider-id "Алексей" "Угрюмов") :start "12:19:00" :finish "15:00:00" :penalty "02:00:00" :total "04:41:00" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 45 :plate-number "270" :rider-id (find-rider-id "Алексей" "Калашников") :start "12:26:30" :finish "14:30:00" :penalty "04:00:00" :total "06:03:30" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 46 :plate-number "213" :rider-id (find-rider-id "Денис" "Деренченко") :start "12:17:30" :finish "14:30:00" :penalty "04:00:00" :total "06:12:30" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 47 :plate-number "277" :rider-id (find-rider-id "Владимир" "Гусев") :start "12:26:30" :finish "16:44:21" :penalty "02:00:00" :total "06:17:51" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 48 :plate-number "237" :rider-id (find-rider-id "Денис" "Скоров") :start "12:20:30" :finish "16:08:00" :penalty "02:40:00" :total "06:27:30" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 49 :plate-number "261" :rider-id (find-rider-id "Илья" "Луценко") :start "12:25:00" :finish "15:30:30" :penalty "04:00:00" :total "07:05:30" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 50 :plate-number "284" :rider-id (find-rider-id "Александр" "Беспалов") :start "12:28:00" :finish "15:00:00" :penalty "04:40:00" :total "07:12:00" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 51 :plate-number "208" :rider-id (find-rider-id "Александр" "Сумин") :start "12:16:00" :finish "15:00:00" :penalty "04:40:00" :total "07:24:00" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 52 :plate-number "271" :rider-id (find-rider-id "Александр" "Ишонин") :start "12:26:30" :finish "15:52:12" :penalty "04:00:00" :total "07:25:42" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 53 :plate-number "255" :rider-id (find-rider-id "Владимир" "Мыкалов") :start "12:23:30" :finish "16:50:06" :penalty "04:00:00" :total "08:26:36" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 54 :plate-number "272" :rider-id (find-rider-id "Станислав" "Зубков") :start "12:26:30" :finish "16:58:14" :penalty "04:40:00" :total "09:11:44" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 55 :plate-number "286" :rider-id (find-rider-id "Марк" "Хашковский") :start "12:28:00" :finish "13:33:44" :penalty "05:20:00" :total "06:25:44" :laps 1]
         [:type :result :event-id event-id :classification-id classification-id :position 56 :plate-number "211" :rider-id (find-rider-id "Андрей" "Созыкин") :start "12:17:30" :finish "13:37:50" :penalty "05:20:00" :total "06:40:20" :laps 1]
         [:type :result :event-id event-id :classification-id classification-id :position 57 :plate-number "222" :rider-id (find-rider-id "Андрей" "Богомолов") :start "12:19:00" :finish "13:43:55" :penalty "05:20:00" :total "06:44:55" :laps 1]
         [:type :result :event-id event-id :classification-id classification-id :position 58 :plate-number "273" :rider-id (find-rider-id "Алексей" "Злобин") :start "12:26:30" :finish "14:17:52" :penalty "05:20:00" :total "07:11:22" :laps 1]
         [:type :result :event-id event-id :classification-id classification-id :position 59 :plate-number "264" :rider-id (find-rider-id "Олег" "Лазарев") :start "12:25:00" :finish "14:27:18" :penalty "05:20:00" :total "07:22:18" :laps 1]
         [:type :result :event-id event-id :classification-id classification-id :position 60 :plate-number "262" :rider-id (find-rider-id "Вячеслав" "Лопатин") :start "12:25:00" :finish "15:30:00" :penalty "04:40:00" :total "07:45:00" :laps 1]
         [:type :result :event-id event-id :classification-id classification-id :position 61 :plate-number "275" :rider-id (find-rider-id "Линар" "Яруллин") :start "12:26:30" :finish "15:00:00" :penalty "05:20:00" :total "07:53:30" :laps 1]
         [:type :result :event-id event-id :classification-id classification-id :position 62 :plate-number "251" :rider-id (find-rider-id "Александр" "Обухов") :start "12:23:30" :finish "15:00:00" :penalty "05:20:00" :total "07:56:30" :laps 1]
         [:type :result :event-id event-id :classification-id classification-id :position 63 :plate-number "230" :rider-id (find-rider-id "Дмитрий" "Тренин") :start "12:20:30" :finish "17:55:00" :penalty "04:40:00" :total "10:14:30" :laps 1]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "269" :rider-id (find-rider-id "Денис" "Копытов") :start "12:25:00" :finish "—" :penalty "06:00:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "207" :rider-id (find-rider-id "Дмитрий" "Прядко") :start "12:16:00" :finish "—" :penalty "06:00:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "290" :rider-id (find-rider-id "Дмитрий" "Долженко") :start "12:28:00" :finish "—" :penalty "06:00:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "214" :rider-id (find-rider-id "Евгений" "Максимов") :start "12:17:30" :finish "—" :penalty "06:00:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "212" :rider-id (find-rider-id "Сергей" "Лазукин") :start "12:17:30" :finish "—" :penalty "06:00:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "240" :rider-id (find-rider-id "Денис" "Саликов") :start "12:22:00" :finish "—" :penalty "06:00:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "287" :rider-id (find-rider-id "Роман" "Алёхин") :start "12:28:00" :finish "—" :penalty "06:40:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "260" :rider-id (find-rider-id "Эдуард" "Лысцов") :start "12:25:00" :finish "—" :penalty "06:40:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "250" :rider-id (find-rider-id "Евгений" "Папулов") :start "12:23:30" :finish "—" :penalty "06:40:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "235" :rider-id (find-rider-id "Леонид" "Старков") :start "12:20:30" :finish "—" :penalty "06:40:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "218" :rider-id (find-rider-id "Иван" "Моисеев") :start "12:17:30" :finish "—" :penalty "06:40:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "219" :rider-id (find-rider-id "Сергей" "Уткин") :start "12:17:30" :finish "—" :penalty "06:40:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "244" :rider-id (find-rider-id "Евгений" "Полунин") :start "12:22:00" :finish "—" :penalty "06:40:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "279" :rider-id (find-rider-id "Евгений" "Ганичев") :start "12:26:30" :finish "—" :penalty "06:40:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "254" :rider-id (find-rider-id "Владислав" "Николаев") :start "12:23:30" :finish "—" :penalty "06:40:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "233" :rider-id (find-rider-id "Андрей" "Строшков") :start "12:20:30" :finish "—" :penalty "06:40:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "281" :rider-id (find-rider-id "Иван" "Вострецов") :start "12:28:00" :finish "—" :penalty "07:20:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "282" :rider-id (find-rider-id "Денис" "Борисов") :start "12:28:00" :finish "—" :penalty "07:20:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "247" :rider-id (find-rider-id "Иван" "Першин") :start "12:22:00" :finish "—" :penalty "07:20:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "220" :rider-id (find-rider-id "Сергей" "Ягудин") :start "12:19:00" :finish "—" :penalty "07:20:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "216" :rider-id (find-rider-id "Алексей" "Сазанов") :start "12:17:30" :finish "—" :penalty "07:20:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "210" :rider-id (find-rider-id "Василий" "Кармацких") :start "12:17:30" :finish "—" :penalty "07:20:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "263" :rider-id (find-rider-id "Илья" "Чебыкин") :start "12:25:00" :finish "—" :penalty "07:20:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "276" :rider-id (find-rider-id "Роман" "Данилевский") :start "12:26:30" :finish "—" :penalty "07:20:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "256" :rider-id (find-rider-id "Николай" "Мишунин") :start "12:23:30" :finish "—" :penalty "07:20:00" :total "сошел" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :plate-number "258" :rider-id (find-rider-id "Александр" "Мальков") :start "12:23:30" :finish "—" :penalty "07:20:00" :total "сошел" :dnf? true]
         ])

      (let [classification-id "CWahDysvCMM"]
        [{:type              :classification
          :classification-id classification-id
          :event-id          event-id
          :order             3
          :name              "Леди"
          :equivalent        :lady
          :laps              3
          ;; Еще проще чем бронза
          :lap-difficulty    25
          :started-count     10
          :laps-info?        true}

         [:type :result :event-id event-id :classification-id classification-id :position 1 :plate-number "304" :rider-id (find-rider-id "Анна" "Шилова") :start "12:29:30" :finish "13:50:58" :penalty "00:00:00" :total "01:21:28" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 2 :plate-number "305" :rider-id (find-rider-id "Анна" "Медведева") :start "12:29:30" :finish "14:11:50" :penalty "00:00:00" :total "01:42:20" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 3 :plate-number "300" :rider-id (find-rider-id "Марина" "Аверина") :start "12:29:30" :finish "14:29:17" :penalty "00:00:00" :total "01:59:47" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 4 :plate-number "309" :rider-id (find-rider-id "Юлия" "Березинских") :start "12:29:30" :finish "14:01:19" :penalty "00:40:00" :total "02:11:49" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 5 :plate-number "302" :rider-id (find-rider-id "Ульяна" "Храмцова") :start "12:29:30" :finish "14:03:42" :penalty "00:40:00" :total "02:14:12" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 6 :plate-number "307" :rider-id (find-rider-id "Ксения" "Потапович") :start "12:29:30" :finish "14:10:27" :penalty "00:40:00" :total "02:20:57" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 7 :plate-number "308" :rider-id (find-rider-id "Наталья" "Дроздова") :start "12:29:30" :finish "15:04:39" :penalty "00:40:00" :total "03:15:09" :laps 2]
         ]))))

(def kyshtim1
  (let [event-id "EjXVRYQ"
        ;; Круг был один для всех
        ;; Круг был непростой, но в основном из за погоды, по сухому было бы
        ;; примерно как самая легкая гонка уровень 6
        lap-difficulty 70
        laps 2
        points-multiplier 1.2
        multiplier-description "Было сыро и в Кыштыме это сразу делает все значительно сложнее"]
    (concat
      [{:type         :event
        :name         "Демидовские Тропы - день 1"
        :location     "Кыштым, Челябинская область"
        :date         "2025-06-21"
        :event-url    "https://marshalone.ru/card/09b586e1-5848-4a4a-ba4c-bfad7b175395"
        :telegram-url "https://t.me/enduro_kyshtym"
        :event-id     event-id}]

      (let [classification-id "CJX97h7vAEDg"]
        [
         {:type              :classification
          :classification-id classification-id
          :event-id          event-id
          :order             1
          :name              "EXTREME"
          :equivalent        :gold
          :laps              laps
          :lap-difficulty    lap-difficulty
          :points-multiplier points-multiplier
          :multiplier-description multiplier-description
          :started-count     26
          :laps-info?        true}

         [:type :result :event-id event-id :classification-id classification-id :position 1 :plate-number "37" :rider-id (find-rider-id "Артем" "Калинин") :motorcycle "Husqvarna" :city "Челябинск" :team "Extremal club" :start "10:58:00" :finish "14:19:03" :total "03:21:02" :laps "2"]
         [:type :result :event-id event-id :classification-id classification-id :position 2 :plate-number "34" :rider-id (find-rider-id "Артем" "Цуркан") :motorcycle "KTM" :city "Екатеринбург" :start "10:57:00" :finish "14:18:25" :total "03:21:24" :laps "2"]
         [:type :result :event-id event-id :classification-id classification-id :position 3 :plate-number "19" :rider-id (find-rider-id "Станислав" "Максимов") :motorcycle "Beta xt" :city "Кыштым" :start "10:52:00" :finish "14:14:03" :total "03:22:03" :laps "2"]
         [:type :result :event-id event-id :classification-id classification-id :position 4 :plate-number "21" :rider-id (find-rider-id "Максим" "Золотов") :motorcycle "Ktm 300 exc" :city "Челябинск" :team "Южный Урал мотоспорт" :start "10:53:00" :finish "14:21:28" :total "03:28:28" :laps "2"]
         [:type :result :event-id event-id :classification-id classification-id :position 5 :plate-number "24" :rider-id (find-rider-id "Николай" "Кокорин") :motorcycle "Хускварна" :city "Ижевск" :start "10:53:30" :finish "14:28:59" :total "03:35:28" :laps "2"]
         [:type :result :event-id event-id :classification-id classification-id :position 6 :plate-number "26" :rider-id (find-rider-id "Евгений" "Захаров") :motorcycle "Те 250" :city "Березовский" :start "10:54:31" :finish "14:35:48" :total "03:41:17" :laps "2"]
         [:type :result :event-id event-id :classification-id classification-id :position 7 :plate-number "30" :rider-id (find-rider-id "Денис" "Шилов") :motorcycle "KTM 300 EXC" :city "Екатеринбург" :start "10:56:30" :finish "14:40:48" :total "03:44:17" :laps "2"]
         [:type :result :event-id event-id :classification-id classification-id :position 8 :plate-number "11" :rider-id (find-rider-id "Султан" "Хабибрахманов") :motorcycle "Exc300" :city "Екатеринбург" :team "CoronaMechanics" :start "10:49:00" :finish "14:33:19" :total "03:44:19" :laps "2"]
         [:type :result :event-id event-id :classification-id classification-id :position 9 :plate-number "8" :rider-id (find-rider-id "Петр" "Адрианов") :motorcycle "KTM 300 2 T" :city "Челябинск" :team "ЮжныйУрал Мотоспорт" :start "10:47:31" :finish "14:41:42" :total "03:54:11" :laps "2"]
         [:type :result :event-id event-id :classification-id classification-id :position 10 :plate-number "12" :rider-id (find-rider-id "Алексей" "Санаров") :motorcycle "ктм" :city "Березовский" :start "10:49:30" :finish "14:46:01" :total "03:56:30" :laps "2"]
         [:type :result :event-id event-id :classification-id classification-id :position 11 :plate-number "14" :rider-id (find-rider-id "Константин" "Майбуров") :motorcycle "Husqvarna 300" :city "Екатеринбург" :team "Enduro Ekaterinburg" :start "10:50:30" :finish "14:09:29" :total "03:18:58" :laps "1.909"]
         [:type :result :event-id event-id :classification-id classification-id :position 12 :plate-number "3" :rider-id (find-rider-id "Сергей" "Чигвинцев") :motorcycle "husqvarna" :city "Екатеринбург" :team "Rival Powersports" :start "10:45:29" :finish "14:06:49" :total "03:21:19" :laps "1.909"]
         [:type :result :event-id event-id :classification-id classification-id :position 13 :plate-number "16" :rider-id (find-rider-id "Павел" "Иванов") :motorcycle "ТЕ 300" :city "Челябинск" :team "Южный Урал мотоспорт" :start "10:51:00" :finish "14:30:04" :total "03:39:04" :laps "1.909"]
         [:type :result :event-id event-id :classification-id classification-id :position 14 :plate-number "36" :rider-id (find-rider-id "Павел" "Хисамутдинов") :motorcycle "KTM300" :city "Лосиный" :start "10:57:30" :finish "14:42:28" :total "03:44:58" :laps "1.909"]
         [:type :result :event-id event-id :classification-id classification-id :position 15 :plate-number "9" :rider-id (find-rider-id "Константин" "Романов") :motorcycle "KTM" :city "Челябинск" :team "Южный Урал" :start "10:48:00" :finish "14:33:34" :total "03:45:34" :laps "1.909"]
         [:type :result :event-id event-id :classification-id classification-id :position 16 :plate-number "17" :rider-id (find-rider-id "Антон" "Толкачев") :motorcycle "Ктм" :city "Талица" :start "10:51:30" :finish "14:43:33" :total "03:52:02" :laps "1.909"]
         [:type :result :event-id event-id :classification-id classification-id :position 17 :plate-number "5" :rider-id (find-rider-id "Дмитрий" "Резницкий") :motorcycle "Husqvarna TE300" :city "150000 Петропавловск" :team "Fa-Fa Racing" :start "10:46:30" :finish "14:44:58" :total "03:58:27" :laps "1.909"]
         [:type :result :event-id event-id :classification-id classification-id :position 18 :plate-number "29" :rider-id (find-rider-id "Александр" "Ремесленников") :motorcycle "KTM EXC 300" :city "Усть-Катав" :team "sUKenduro" :start "10:56:00" :finish "14:46:56" :total "03:50:55" :laps "1.727"]
         [:type :result :event-id event-id :classification-id classification-id :position 19 :plate-number "28" :rider-id (find-rider-id "Артём" "Ремесленников") :motorcycle "KTM EXC 300" :city "Усть-Катав" :team "sUKenduro" :start "10:55:30" :finish "14:46:59" :total "03:51:29" :laps "1.727"]
         [:type :result :event-id event-id :classification-id classification-id :position 20 :plate-number "4" :rider-id (find-rider-id "Владимир" "Николаев") :motorcycle "Beta" :city "Тюмень" :start "10:46:01" :finish "14:45:12" :total "03:59:11" :laps "1.727"]
         [:type :result :event-id event-id :classification-id classification-id :position 21 :plate-number "7" :rider-id (find-rider-id "Алексей" "Мамашев") :motorcycle "Ктм300" :city "Среднеуральск" :start "10:47:00" :finish "13:13:35" :total "02:26:34" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 22 :plate-number "13" :rider-id (find-rider-id "Владимир" "Тясин") :motorcycle "Ктм" :city "Екатеринбург" :start "10:50:00" :finish "13:37:20" :total "02:47:20" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 23 :plate-number "20" :rider-id (find-rider-id "Денис" "Пономарев") :motorcycle "KTM EXC 300" :city "Богданович" :start "10:52:30" :finish "13:52:59" :total "03:00:29" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 24 :plate-number "1" :rider-id (find-rider-id "Михаил" "Ушаков") :motorcycle "Ктм" :city "Тюмень" :start "10:45:04" :finish "14:09:06" :total "03:24:02" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 25 :plate-number "18" :rider-id (find-rider-id "Александр" "Беляков") :motorcycle "Hengjian z300" :city "Ревда" :start "10:55:00" :finish "14:50:17" :total "03:55:16" :laps ".909 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 26 :plate-number "25" :rider-id (find-rider-id "Роман" "Кузнецов") :motorcycle "Gr8" :city "Ижевск" :start "10:54:00" :finish "12:52:40" :total "01:58:39" :laps ".818 (1)"]

         ])

      (let [classification-id "CGIgmrpoK7yg"]
        [{:type                   :classification
          :classification-id      classification-id
          :event-id               event-id
          :order                  2
          :name                   "HOBBY"
          :equivalent             :silver
          :laps                   laps
          :lap-difficulty         lap-difficulty
          :points-multiplier      points-multiplier
          :multiplier-description multiplier-description
          :started-count          78
          :laps-info?             true}

         [:type :result :event-id event-id :classification-id classification-id :position 1 :plate-number "47" :rider-id (find-rider-id "Алексей" "Кокорин") :motorcycle "KTM EXC300" :city "Курган" :start "11:00:31" :finish "14:47:13" :total "03:46:42" :laps "2"]
         [:type :result :event-id event-id :classification-id classification-id :position 2 :plate-number "46" :rider-id (find-rider-id "Алексей" "Семилетов") :motorcycle "Ктм тби  300" :city "Курган" :start "11:00:00" :finish "14:23:44" :total "03:23:44" :laps "1.9"]
         [:type :result :event-id event-id :classification-id classification-id :position 3 :plate-number "81" :rider-id (find-rider-id "Сергей" "Кузнецов" "Владимирович" nil) :motorcycle "ktm350" :city "Катайск" :team "KATAYENDURO" :start "11:14:00" :finish "14:49:09" :total "03:35:09" :laps "1.9"]
         [:type :result :event-id event-id :classification-id classification-id :position 4 :plate-number "55" :rider-id (find-rider-id "Денис" "Козлов") :motorcycle "300 te" :city "Челябинск" :team "Моховичковские псы" :start "11:03:00" :finish "14:40:18" :total "03:37:18" :laps "1.9"]
         [:type :result :event-id event-id :classification-id classification-id :position 5 :plate-number "130" :rider-id (find-rider-id "Александр" "Сиренко") :motorcycle "KТМ" :city "Курган" :start "11:28:29" :finish "15:07:12" :total "03:38:43" :laps "1.9"]
         [:type :result :event-id event-id :classification-id classification-id :position 6 :plate-number "62" :rider-id (find-rider-id "Василий" "Решетков") :motorcycle "Хаска" :city "Еманжелинск" :start "11:06:00" :finish "14:46:13" :total "03:40:13" :laps "1.9"]
         [:type :result :event-id event-id :classification-id classification-id :position 7 :plate-number "72" :rider-id (find-rider-id "Александр" "Бескровный") :motorcycle "Gas gas ec300" :city "Челябинск" :start "11:09:30" :finish "14:49:49" :total "03:40:19" :laps "1.9"]
         [:type :result :event-id event-id :classification-id classification-id :position 8 :plate-number "45" :rider-id (find-rider-id "Артем" "Кремлев") :motorcycle "GRrr" :city "Златоуст" :team "Эндуро Златоуст" :start "10:59:30" :finish "14:41:52" :total "03:42:21" :laps "1.9"]
         [:type :result :event-id event-id :classification-id classification-id :position 9 :plate-number "147" :rider-id (find-rider-id "Владислав" "Лептягин") :motorcycle "GR8" :city "Ижевск" :team "МОТОГРЯЗЬ" :start "11:34:29" :finish "15:18:32" :total "03:44:02" :laps "1.9"]
         [:type :result :event-id event-id :classification-id classification-id :position 10 :plate-number "52" :rider-id (find-rider-id "Владимир" "Киселёв") :motorcycle "Ктм" :city "Челябинск" :team "Моховичковские псы" :start "11:01:59" :finish "14:49:13" :total "03:47:13" :laps "1.9"]
         [:type :result :event-id event-id :classification-id classification-id :position 11 :plate-number "82" :rider-id (find-rider-id "Денис" "Меньшиков") :motorcycle "Кайо 250 2т" :city "Катайск" :team "KATAYENDURO" :start "11:14:30" :finish "15:02:17" :total "03:47:47" :laps "1.9"]
         [:type :result :event-id event-id :classification-id classification-id :position 12 :plate-number "68" :rider-id (find-rider-id "Дмитрий" "Тимошевский") :motorcycle "GR8 300 2T" :city "Челябинск" :start "11:07:59" :finish "15:04:42" :total "03:56:42" :laps "1.9"]
         [:type :result :event-id event-id :classification-id classification-id :position 13 :plate-number "54" :rider-id (find-rider-id "Виталий" "Горбачев") :motorcycle "KTM EXC 302T" :city "Екатеринбург" :team "Группа эндуро произвола" :start "11:02:29" :finish "14:50:34" :total "03:48:04" :laps "1.8"]
         [:type :result :event-id event-id :classification-id classification-id :position 14 :plate-number "76" :rider-id (find-rider-id "Игорь" "Павленко") :motorcycle "GR-8 2t" :city "Кыштым" :team "СТК. РАДОН" :start "11:11:30" :finish "15:09:33" :total "03:58:03" :laps "1.8"]
         [:type :result :event-id event-id :classification-id classification-id :position 15 :plate-number "133" :rider-id (find-rider-id "Сергей" "Шайбаков") :motorcycle "Гр8" :city "Екатеринбург" :start "11:29:30" :finish "15:29:12" :total "03:59:41" :laps "1.8"]
         [:type :result :event-id event-id :classification-id classification-id :position 16 :plate-number "60" :rider-id (find-rider-id "Вадим" "Ахтямов") :motorcycle "Hendjian Z300" :city "Миасс" :team "Enduro Miass 74" :start "11:05:00" :finish "14:54:50" :total "03:49:49" :laps "1.7"]
         [:type :result :event-id event-id :classification-id classification-id :position 17 :plate-number "65" :rider-id (find-rider-id "Дмитрий" "Иванов") :motorcycle "Koshine 320" :city "Каменск-Уральский" :start "11:07:30" :finish "15:00:38" :total "03:53:08" :laps "1.7"]
         [:type :result :event-id event-id :classification-id classification-id :position 18 :plate-number "56" :rider-id (find-rider-id "Константин" "Маркелов") :motorcycle "KTM EXC 300" :city "Челябинск" :team "Моховичковские псы" :start "11:03:30" :finish "14:22:19" :total "03:18:48" :laps "1.5"]
         [:type :result :event-id event-id :classification-id classification-id :position 19 :plate-number "108" :rider-id (find-rider-id "Анатолий" "Ванчинов") :motorcycle "Beta 300rr" :city "Екатеринбург" :team "Corona" :start "11:22:00" :finish "15:13:05" :total "03:51:04" :laps "1.5"]
         [:type :result :event-id event-id :classification-id classification-id :position 20 :plate-number "58" :rider-id (find-rider-id "Сергей" "Дубровин") :motorcycle "Kews nb300" :city "Миасс" :team "Enduro Miass 74" :start "11:03:59" :finish "14:55:19" :total "03:51:20" :laps "1.5"]
         [:type :result :event-id event-id :classification-id classification-id :position 21 :plate-number "63" :rider-id (find-rider-id "Алексей" "Слабочков") :motorcycle "Beta xt" :city "Миасс" :start "11:06:17" :finish "14:58:08" :total "03:51:51" :laps "1.5"]
         [:type :result :event-id event-id :classification-id classification-id :position 22 :plate-number "61" :rider-id (find-rider-id "Вадим" "Мезенцев") :motorcycle "Rieju" :city "Карабаш" :start "11:05:30" :finish "14:58:10" :total "03:52:40" :laps "1.5"]
         [:type :result :event-id event-id :classification-id classification-id :position 23 :plate-number "87" :rider-id (find-rider-id "Денис" "Воробьёв") :motorcycle "Gr8" :city "Челябинск" :start "11:16:30" :finish "15:06:28" :total "03:49:58" :laps "1.4"]
         [:type :result :event-id event-id :classification-id classification-id :position 24 :plate-number "50" :rider-id (find-rider-id "Евгений" "Моисеев") :motorcycle "Procida nb300" :city "Челябинск" :team "MotoExtrem74" :start "11:01:30" :finish "14:54:16" :total "03:52:46" :laps "1.3"]
         [:type :result :event-id event-id :classification-id classification-id :position 25 :plate-number "73" :rider-id (find-rider-id "Иван" "Тихонов") :motorcycle "Ktm exc 250" :city "Екатеринбург" :start "11:10:00" :finish "15:02:03" :total "03:52:02" :laps "1.2"]
         [:type :result :event-id event-id :classification-id classification-id :position 26 :plate-number "93" :rider-id (find-rider-id "Сергей" "Кузнецов" "Николаевич" nil) :motorcycle "Hengjain Z300" :city "Сургут" :start "11:18:00" :finish "15:13:26" :total "03:55:25" :laps "1.2"]
         [:type :result :event-id event-id :classification-id classification-id :position 27 :plate-number "101" :rider-id (find-rider-id "Михаил" "Ялунин") :motorcycle "GR 8" :city "Богданович" :start "11:19:30" :finish "15:14:44" :total "03:55:14" :laps "1.1"]
         [:type :result :event-id event-id :classification-id classification-id :position 28 :plate-number "10" :rider-id (find-rider-id "Александр" "Кабаев") :motorcycle "Suzuki RMzilla 250" :city "Челябинск" :start "10:48:30" :finish "13:02:50" :total "02:14:19" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 29 :plate-number "42" :rider-id (find-rider-id "Максим" "Ивощук") :motorcycle "KTM 300" :city "Богданович" :team "ENDURO Bogdanovich" :start "10:58:30" :finish "13:26:39" :total "02:28:09" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 30 :plate-number "110" :rider-id (find-rider-id "Артём" "Душин") :motorcycle "Husqvarna te 300" :city "Ижевск" :team "HardEnduroUdm" :start "11:23:00" :finish "14:10:46" :total "02:47:45" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 31 :plate-number "129" :rider-id (find-rider-id "Андрей" "Волков") :motorcycle "STN NB300" :city "Каменск-Уральский" :start "11:28:00" :finish "14:16:26" :total "02:48:25" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 32 :plate-number "126" :rider-id (find-rider-id "Артём" "Тараненко") :motorcycle "Ktm exc 300" :city "Екатеринбург" :start "11:27:00" :finish "14:17:48" :total "02:50:47" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 33 :plate-number "86" :rider-id (find-rider-id "Валерий" "Варгасов") :motorcycle "Beta x tender 300 2t" :city "Челябинск" :team "Моховичковкие псы" :start "11:16:00" :finish "14:10:27" :total "02:54:26" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 34 :plate-number "128" :rider-id (find-rider-id "Евгений" "Константинов") :motorcycle "KTM EXC 300" :city "Екатеринбург" :start "11:27:30" :finish "14:23:59" :total "02:56:28" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 35 :plate-number "64" :rider-id (find-rider-id "Михаил" "Тясин") :motorcycle "henjian 300" :city "Екатеринбург" :team "Азимут 66" :start "11:07:00" :finish "14:04:36" :total "02:57:36" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 36 :plate-number "83" :rider-id (find-rider-id "Роман" "Белоногов") :motorcycle "BSE Z10" :city "Каменск-Уральский" :team "Enduro MOTO LIFE" :start "11:15:00" :finish "14:24:44" :total "03:09:44" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 37 :plate-number "48" :rider-id (find-rider-id "Максим" "Мишуков") :motorcycle "Lanza 250 2t" :city "Магнитогорск" :start "11:01:00" :finish "14:15:16" :total "03:14:15" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 38 :plate-number "103" :rider-id (find-rider-id "Алексей" "Кузнецов") :motorcycle "KAYO" :city "Богданович" :start "11:20:30" :finish "14:39:36" :total "03:19:06" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 39 :plate-number "105" :rider-id (find-rider-id "Евгений" "Камаев") :motorcycle "GR8 2т" :city "Сухой Лог" :start "11:21:00" :finish "14:40:37" :total "03:19:37" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 40 :plate-number "59" :rider-id (find-rider-id "Артём" "Сухов") :motorcycle "GR8 300" :city "Далматово" :start "11:04:30" :finish "14:24:10" :total "03:19:40" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 41 :plate-number "97" :rider-id (find-rider-id "Максим" "Тимошевский") :motorcycle "Хускварна 300 2 т" :city "Челябинск" :start "11:18:30" :finish "14:49:39" :total "03:31:09" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 42 :plate-number "91" :rider-id (find-rider-id "Виталий" "Бесперстов") :motorcycle "Ержан 3002Т" :city "Сургут" :start "11:17:00" :finish "14:56:13" :total "03:39:13" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 43 :plate-number "142" :rider-id (find-rider-id "Ильфар" "Сарваров") :motorcycle "ГАЗель" :city "Сургут" :team "Enduro86" :start "11:33:00" :finish "15:28:49" :total "03:55:48" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 44 :plate-number "123" :rider-id (find-rider-id "Константин" "Сыров") :motorcycle "Gr8 3002t" :city "Екатеринбург" :start "11:26:31" :finish "15:22:45" :total "03:56:14" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 45 :plate-number "121" :rider-id (find-rider-id "Павел" "Митрофанов") :motorcycle "ктм300" :city "Екатеринбург" :team "Эндуроклуб" :start "11:26:00" :finish "15:23:36" :total "03:57:35" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 46 :plate-number "43" :rider-id (find-rider-id "Василий" "Тараторин") :motorcycle "Авантис" :city "Кременкуль" :team "Моховичковские псы" :start "10:59:00" :finish "14:58:04" :total "03:59:03" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 47 :plate-number "149" :rider-id (find-rider-id "Денис" "Зайнитдинов") :motorcycle "ZM Tracer" :city "Учалы" :start "11:35:30" :finish "13:28:39" :total "01:53:09" :laps ".9 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 48 :plate-number "69" :rider-id (find-rider-id "Ильдус" "Сулейманов") :motorcycle "Ктм" :city "Учалы" :start "11:08:30" :finish "13:16:50" :total "02:08:19" :laps ".9 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 49 :plate-number "74" :rider-id (find-rider-id "Александр" "Беспалов") :motorcycle "Gr8 2T" :city "Челябинск" :start "11:10:30" :finish "13:22:23" :total "02:11:52" :laps ".9 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 50 :plate-number "78" :rider-id (find-rider-id "Олег" "Хвостенко") :motorcycle "Progasi RACE 300" :city "Екатеринбург" :start "11:12:30" :finish "13:33:50" :total "02:21:19" :laps ".9 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 51 :plate-number "151" :rider-id (find-rider-id "Александр" "Жмаков") :motorcycle "-" :city "Учалы" :start "11:36:30" :finish "14:03:09" :total "02:26:38" :laps ".9 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 52 :plate-number "137" :rider-id (find-rider-id "Сергей" "Лазукин") :motorcycle "Gr8 300 2t" :city "Snezhinsk" :start "11:31:29" :finish "14:12:21" :total "02:40:51" :laps ".9 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 53 :plate-number "75" :rider-id (find-rider-id "Алексей" "Коротков") :motorcycle "KTM 250" :city "Екатеринбург" :start "11:11:00" :finish "13:57:01" :total "02:46:01" :laps ".9 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 54 :plate-number "80" :rider-id (find-rider-id "Дамир" "Хабибрахманов") :motorcycle "КТМ 300exc" :city "Екатеринбург" :start "11:13:29" :finish "14:03:35" :total "02:50:05" :laps ".9 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 55 :plate-number "77" :rider-id (find-rider-id "Алексей" "Донских") :motorcycle "GR8 300 2t" :city "Березовский" :team "Эндуро произвол" :start "11:12:00" :finish "14:09:46" :total "02:57:45" :laps ".9 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 56 :plate-number "119" :rider-id (find-rider-id "Игорь" "Римшев") :motorcycle "Jhl tlx 250" :city "Пермь" :team "EC Molotov" :start "11:25:00" :finish "14:37:17" :total "03:12:17" :laps ".9 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 57 :plate-number "71" :rider-id (find-rider-id "Артур" "Бузыкаев") :motorcycle "Кошайн 300 2 т" :city "Учалы" :start "11:09:00" :finish "14:28:43" :total "03:19:43" :laps ".9 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 58 :plate-number "102" :rider-id (find-rider-id "Евгений" "Бекетов") :motorcycle "GR8 300 2T" :city "Богданович" :start "11:20:00" :finish "14:49:36" :total "03:29:35" :laps ".9 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 59 :plate-number "115" :rider-id (find-rider-id "Иван" "Попов") :motorcycle "302" :city "Екатеринбург" :start "11:24:00" :finish "13:36:33" :total "02:12:33" :laps ".8 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 60 :plate-number "107" :rider-id (find-rider-id "Данил" "Порошин") :motorcycle "Yamaha wr250f" :city "Екатеринбург" :start "11:21:29" :finish "13:54:08" :total "02:32:38" :laps ".8 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 61 :plate-number "79" :rider-id (find-rider-id "Виталий" "Баглай") :motorcycle "Rieju mr 300" :city "Курган" :start "11:12:59" :finish "14:35:52" :total "03:22:53" :laps ".8 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 62 :plate-number "143" :rider-id (find-rider-id "Владимир" "Баландин") :motorcycle "BRZ X6 cbs (174FMM-NB)" :city "Каменск-Уральский" :start "11:33:29" :finish "15:19:51" :total "03:46:21" :laps ".8 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 63 :plate-number "117" :rider-id (find-rider-id "Олег" "Сухарев") :motorcycle "Zm tracer" :city "Екатеринбург" :start "11:24:30" :finish "15:22:19" :total "03:57:49" :laps ".8 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 64 :plate-number "112" :rider-id (find-rider-id "Максим" "Килин") :motorcycle "Beta300rr" :city "Березовский" :start "11:23:30" :finish "15:22:23" :total "03:58:53" :laps ".8 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 65 :plate-number "99" :rider-id (find-rider-id "Иван" "Губин") :motorcycle "Хускварна 300" :city "Екатеринбург" :start "11:19:01" :finish "13:55:03" :total "02:36:01" :laps ".6 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 66 :plate-number "132" :rider-id (find-rider-id "Антон" "Аристархов") :motorcycle "KTM EXC-F 250" :city "Челябинск" :start "11:29:00" :finish "12:25:43" :total "00:56:42" :laps ".4 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 67 :plate-number "146" :rider-id (find-rider-id "Дарья" "Шабловская") :motorcycle "Kayo k1" :city "Екатеринбург" :team "Partizan" :start "11:34:01" :finish "12:01:22" :total "00:27:21" :laps ".2 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 68 :plate-number "141" :rider-id (find-rider-id "Руслан" "Сафин") :motorcycle "Ktm exc 250" :city "Учалы" :start "11:32:30" :finish "12:00:18" :total "00:27:48" :laps ".2 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 69 :plate-number "120" :rider-id (find-rider-id "Александр" "Ярков") :motorcycle "Bse z5" :city "Дегтярск" :team "ATLAS TEAM" :start "11:25:30" :finish "11:55:56" :total "00:30:25" :laps ".2 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 70 :plate-number "134" :rider-id (find-rider-id "Андрей" "Демченко") :motorcycle "250 PVR REISING" :city "Касли" :start "11:30:00" :finish "12:02:30" :total "00:32:30" :laps ".2 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 71 :plate-number "140" :rider-id (find-rider-id "Никита" "Бездомов") :motorcycle "Promax daikon" :city "Сухой Лог" :start "11:31:59" :finish "12:56:42" :total "01:24:42" :laps ".2 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 72 :plate-number "136" :rider-id (find-rider-id "Сергей" "Гуланян") :motorcycle "Kayo k2 pro" :city "Сухой Лог" :start "11:31:00" :finish "12:56:29" :total "01:25:28" :laps ".2 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 73 :plate-number "135" :rider-id (find-rider-id "Дмитрий" "Холкин") :motorcycle "Regulmoto" :city "Богданович" :start "11:30:29" :finish "12:56:35" :total "01:26:05" :laps ".2 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 74 :plate-number "92" :rider-id (find-rider-id "Иван" "Кравчук") :motorcycle "GR-8 Lanza-2T" :city "Сургут" :start "11:17:30" :finish "14:42:34" :total "03:25:04" :laps ".2 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 75 :plate-number "109" :rider-id (find-rider-id "Иван" "Порсев") :motorcycle "Gas gas" :city "Ижевск" :team "None" :start "11:22:29" :finish "13:15:26" :total "01:52:56" :laps "0 (2)" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 76 :plate-number "148" :rider-id (find-rider-id "Александр" "Перевозчиков") :motorcycle "KTM" :city "Екатеринбург" :start "11:35:00" :finish "14:04:44" :total "02:29:44" :laps "0 (2)" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 77 :plate-number "85" :rider-id (find-rider-id "Владислав" "Светлаков") :motorcycle "Kews 23" :city "Ревда" :start "11:15:30" :finish "14:39:30" :total "03:23:59" :laps "0 (2)" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 78 :plate-number "150" :rider-id (find-rider-id "Ильшат" "Нигматуллин") :motorcycle "-" :city "Учалы" :start "11:35:59" :finish "15:04:38" :total "03:28:38" :laps "0 (2)" :dnf? true]
         ])

      (let [classification-id "CrTKJtzoMtQ0"]
        [{:type                   :classification
          :classification-id      classification-id
          :event-id               event-id
          :order                  3
          :name                   "LITE"
          :equivalent             :bronze
          :laps                   laps
          :lap-difficulty         lap-difficulty
          :points-multiplier      points-multiplier
          :multiplier-description multiplier-description
          :started-count          21
          :laps-info?             true}

         [:type :result :event-id event-id :classification-id classification-id :position 1 :plate-number "158" :rider-id (find-rider-id "Александр" "Полянин") :motorcycle "ATAKI EF300" :city "Златоуст" :start "11:38:30" :finish "15:35:59" :total "03:57:28" :laps "1.7"]
         [:type :result :event-id event-id :classification-id classification-id :position 2 :plate-number "154" :rider-id (find-rider-id "Евгений" "Кузенков") :motorcycle "ГР" :city "Челябинск" :team "Мотоспорт Южный Урал" :start "11:37:30" :finish "15:36:29" :total "03:58:59" :laps "1.6"]
         [:type :result :event-id event-id :classification-id classification-id :position 3 :plate-number "156" :rider-id (find-rider-id "Константин" "Одиноков") :motorcycle "Гр8" :city "Златоуст" :start "11:38:00" :finish "14:53:24" :total "03:15:24" :laps "1.1"]
         [:type :result :event-id event-id :classification-id classification-id :position 4 :plate-number "179" :rider-id (find-rider-id "Лев" "Кислицын") :motorcycle "GR2" :city "Кыштым" :team "СТК Радон" :start "11:44:30" :finish "14:37:36" :total "02:53:05" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 5 :plate-number "177" :rider-id (find-rider-id "Александр" "Мальков") :motorcycle "Gr7" :city "Челябинск" :start "11:43:29" :finish "14:03:38" :total "02:20:09" :laps ".9 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 6 :plate-number "180" :rider-id (find-rider-id "Олег" "Мальков") :motorcycle "Sport 003" :city "Челябинск" :start "11:45:00" :finish "14:26:02" :total "02:41:02" :laps ".9 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 7 :plate-number "159" :rider-id (find-rider-id "Арсентий" "Кругленков") :motorcycle "Gr 2" :city "Челябинск" :team "774 team" :start "11:39:00" :finish "14:20:17" :total "02:41:17" :laps ".9 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 8 :plate-number "178" :rider-id (find-rider-id "Александр" "Копытов") :motorcycle "GR7,4т" :city "Челябинск" :start "11:44:00" :finish "14:34:04" :total "02:50:03" :laps ".9 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 9 :plate-number "170" :rider-id (find-rider-id "Павел" "Федоровых") :motorcycle "Regulmoto sport  003" :city "Богданович" :start "11:41:30" :finish "14:55:25" :total "03:13:54" :laps ".9 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 10 :plate-number "163" :rider-id (find-rider-id "Евгений" "Максимов") :motorcycle "Kayo T2-G" :city "Челябинск" :team "URALFOX TEAM" :start "11:40:00" :finish "15:04:18" :total "03:24:18" :laps ".9 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 11 :plate-number "176" :rider-id (find-rider-id "Анна" "Шилова") :motorcycle "Хаска ТЕ 150" :city "Екатеринбург" :start "11:43:01" :finish "13:55:29" :total "02:12:28" :laps ".8 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 12 :plate-number "173" :rider-id (find-rider-id "Андрей" "Муравьёв") :motorcycle "Sharmax 300" :city "Екатеринбург" :start "11:42:30" :finish "14:30:02" :total "02:47:31" :laps ".8 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 13 :plate-number "172" :rider-id (find-rider-id "Андрей" "Посохин") :motorcycle "Jhl lx5" :city "Пермь" :start "11:42:00" :finish "15:12:56" :total "03:30:56" :laps ".8 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 14 :plate-number "161" :rider-id (find-rider-id "Александр" "Капустин") :motorcycle "H250" :city "Богданович" :start "11:39:30" :finish "15:26:15" :total "03:46:44" :laps ".8 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 15 :plate-number "168" :rider-id (find-rider-id "Раиль" "Газизов") :motorcycle "Franken 250 stein" :city "Курган" :team "МЕДЛЕННЫЙ КРОТ" :start "11:40:59" :finish "15:39:05" :total "03:58:05" :laps ".8 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 16 :plate-number "185" :rider-id (find-rider-id "Егор" "Красько") :motorcycle "Zuumav K6R" :city "Челябинск" :start "11:46:00" :finish "15:36:40" :total "03:50:39" :laps ".6 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 17 :plate-number "186" :rider-id (find-rider-id "Алим" "Батыршин") :motorcycle "-" :city "Учалы" :start "11:46:30" :finish "14:19:53" :total "02:33:23" :laps ".5 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 18 :plate-number "187" :rider-id (find-rider-id "Булат" "Юлмухаметов") :motorcycle "-" :city "Учалы" :start "11:47:00" :finish "15:08:50" :total "03:21:50" :laps ".5 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 19 :plate-number "153" :rider-id (find-rider-id "Артем" "Комаров") :motorcycle "Motolend xt250hs" :city "Каменск-Уральский" :team "Respect enduro" :start "11:37:01" :finish "12:17:03" :total "00:40:02" :laps ".2 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 20 :plate-number "165" :rider-id (find-rider-id "Владимир" "Степанов") :motorcycle "BSE Z5" :city "Екатеринбург" :start "11:40:30" :finish "12:24:17" :total "00:43:46" :laps ".2 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 21 :plate-number "184" :rider-id (find-rider-id "Андрей" "Строшков") :motorcycle "Атаки еф 250" :city "Каменск-Уральский" :start "11:45:30" :finish "12:30:14" :total "00:44:43" :laps ".2 (1)"]
         ])
      )))

(def kyshtim2
  (let [event-id "E7yAKpg"
        ;; Тот же трек, но в обратную сторону
        ;; Он был немного полегче, но ночью шел дождь и стало еще грязнее и супер скользко
        lap-difficulty 60
        laps 2
        points-multiplier 1.3
        multiplier-description "Было еще грязнее и еще более скользко, сам круг был немного полегче, но с учетом погоды все плюс минус также"]
    (concat
      [{:type         :event
        :name         "Демидовские Тропы - день 2"
        :location     "Кыштым, Челябинская область"
        :date         "2025-06-22"
        :event-url    "https://marshalone.ru/card/23bc28f3-c0a9-4a18-aa58-f7f7176aacc8"
        :telegram-url "https://t.me/enduro_kyshtym"
        :event-id     event-id}]

      (let [classification-id "CEnVhqQeSYfk"]
        [
         {:type              :classification
          :classification-id classification-id
          :event-id          event-id
          :order             1
          :name              "EXTREME"
          :equivalent        :gold
          :laps              laps
          :lap-difficulty    lap-difficulty
          :points-multiplier points-multiplier
          :multiplier-description multiplier-description
          :started-count     15
          :laps-info?        true}

         [:type :result :event-id event-id :classification-id classification-id :position 1 :plate-number "21" :rider-id (find-rider-id "Максим" "Золотов") :motorcycle "Ktm 300 exc" :city "Челябинск" :team "Южный Урал мотоспорт" :start "10:16:00" :finish "13:44:07" :total "03:28:06.385" :laps "2"]
         [:type :result :event-id event-id :classification-id classification-id :position 2 :plate-number "1" :rider-id (find-rider-id "Михаил" "Ушаков") :motorcycle "Ктм" :city "Тюмень" :start "10:21:30" :finish "13:53:03" :total "03:31:33.274" :laps "2"]
         [:type :result :event-id event-id :classification-id classification-id :position 3 :plate-number "19" :rider-id (find-rider-id "Станислав" "Максимов") :motorcycle "Beta xt" :city "Кыштым" :start "10:15:29" :finish "13:47:03" :total "03:31:33.977" :laps "2"]
         [:type :result :event-id event-id :classification-id classification-id :position 4 :plate-number "34" :rider-id (find-rider-id "Артем" "Цуркан") :motorcycle "KTM" :city "Екатеринбург" :start "10:15:00" :finish "13:47:01" :total "03:32:01.640" :laps "2"]
         [:type :result :event-id event-id :classification-id classification-id :position 5 :plate-number "26" :rider-id (find-rider-id "Евгений" "Захаров") :motorcycle "Те 250" :city "Березовский" :start "10:16:30" :finish "13:57:57" :total "03:41:27.338" :laps "2"]
         [:type :result :event-id event-id :classification-id classification-id :position 6 :plate-number "3" :rider-id (find-rider-id "Сергей" "Чигвинцев") :motorcycle "husqvarna" :city "Екатеринбург" :team "Rival Powersports" :start "10:17:59" :finish "14:09:13" :total "03:51:13.449" :laps "2"]
         [:type :result :event-id event-id :classification-id classification-id :position 7 :plate-number "9" :rider-id (find-rider-id "Константин" "Романов") :motorcycle "KTM" :city "Челябинск" :team "Южный Урал" :start "10:18:59" :finish "14:11:03" :total "03:52:03.794" :laps "2"]
         [:type :result :event-id event-id :classification-id classification-id :position 8 :plate-number "30" :rider-id (find-rider-id "Денис" "Шилов") :motorcycle "KTM 300 EXC" :city "Екатеринбург" :start "10:16:59" :finish "14:10:26" :total "03:53:26.847" :laps "2"]
         [:type :result :event-id event-id :classification-id classification-id :position 9 :plate-number "16" :rider-id (find-rider-id "Павел" "Иванов") :motorcycle "ТЕ 300" :city "Челябинск" :team "Южный Урал мотоспорт" :start "10:18:29" :finish "14:17:00" :total "03:58:30.431" :laps "1.909"]
         [:type :result :event-id event-id :classification-id classification-id :position 10 :plate-number "8" :rider-id (find-rider-id "Петр" "Адрианов") :motorcycle "KTM 300 2 T" :city "Челябинск" :team "ЮжныйУрал Мотоспорт" :start "10:17:29" :finish "14:11:11" :total "03:53:41.895" :laps "1.818"]
         [:type :result :event-id event-id :classification-id classification-id :position 11 :plate-number "5" :rider-id (find-rider-id "Дмитрий" "Резницкий") :motorcycle "Husqvarna TE300" :city "150000 Петропавловск" :team "Fa-Fa Racing" :start "10:19:30" :finish "14:08:33" :total "03:49:03.513" :laps "1.727"]
         [:type :result :event-id event-id :classification-id classification-id :position 12 :plate-number "4" :rider-id (find-rider-id "Владимир" "Николаев") :motorcycle "Beta" :city "Тюмень" :start "10:19:59" :finish "14:14:56" :total "03:54:56.815" :laps "1.727"]
         [:type :result :event-id event-id :classification-id classification-id :position 13 :plate-number "17" :rider-id (find-rider-id "Антон" "Толкачев") :motorcycle "Ктм" :city "Талица" :start "10:22:00" :finish "12:58:19" :total "02:36:19.054" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 14 :plate-number "20" :rider-id (find-rider-id "Денис" "Пономарев") :motorcycle "KTM EXC 300" :city "Богданович" :start "10:20:59" :finish "13:07:25" :total "02:46:25.228" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 15 :plate-number "13" :rider-id (find-rider-id "Владимир" "Тясин") :motorcycle "Ктм" :city "Екатеринбург" :start "10:20:30" :finish "13:18:38" :total "02:58:08.035" :laps "1 (1)"]])

      (let [classification-id "CaA1OiEeUEI"]
        [{:type              :classification
          :classification-id classification-id
          :event-id          event-id
          :order             1
          :name              "HOBBY"
          :equivalent        :silver
          :laps              laps
          :lap-difficulty    lap-difficulty
          :points-multiplier points-multiplier
          :multiplier-description multiplier-description
          :started-count     38
          :laps-info?        true}

         [:type :result :event-id event-id :classification-id classification-id :position 1 :plate-number "62" :rider-id (find-rider-id "Василий" "Решетков") :motorcycle "Хаска" :city "Еманжелинск" :start "10:23:59" :finish "14:22:02" :total "03:58:03.010" :laps "2"]
         [:type :result :event-id event-id :classification-id classification-id :position 2 :plate-number "46" :rider-id (find-rider-id "Алексей" "Семилетов") :motorcycle "Ктм тби  300" :city "Курган" :start "10:23:00" :finish "14:15:26" :total "03:52:26.245" :laps "1.9"]
         [:type :result :event-id event-id :classification-id classification-id :position 3 :plate-number "45" :rider-id (find-rider-id "Артем" "Кремлев") :motorcycle "GRrr" :city "Златоуст" :team "Эндуро Златоуст" :start "10:25:00" :finish "14:18:59" :total "03:53:59.605" :laps "1.9"]
         [:type :result :event-id event-id :classification-id classification-id :position 4 :plate-number "10" :rider-id (find-rider-id "Александр" "Кабаев") :motorcycle "Suzuki RMzilla 250" :city "Челябинск" :start "10:33:30" :finish "14:24:30" :total "03:51:00.405" :laps "1.8"]
         [:type :result :event-id event-id :classification-id classification-id :position 5 :plate-number "52" :rider-id (find-rider-id "Владимир" "Киселёв") :motorcycle "Ктм" :city "Челябинск" :team "Моховичковские псы" :start "10:25:59" :finish "14:18:28" :total "03:52:29.420" :laps "1.8"]
         [:type :result :event-id event-id :classification-id classification-id :position 6 :plate-number "63" :rider-id (find-rider-id "Алексей" "Слабочков") :motorcycle "Beta xt" :city "Миасс" :start "10:30:15" :finish "14:23:49" :total "03:53:33.761" :laps "1.7"]
         [:type :result :event-id event-id :classification-id classification-id :position 7 :plate-number "60" :rider-id (find-rider-id "Вадим" "Ахтямов") :motorcycle "Hendjian Z300" :city "Миасс" :team "Enduro Miass 74" :start "10:27:59" :finish "14:23:31" :total "03:55:31.602" :laps "1.7"]
         [:type :result :event-id event-id :classification-id classification-id :position 8 :plate-number "82" :rider-id (find-rider-id "Денис" "Меньшиков") :motorcycle "Кайо 250 2т" :city "Катайск" :team "KATAYENDURO" :start "10:26:29" :finish "14:15:30" :total "03:49:00.572" :laps "1.5"]
         [:type :result :event-id event-id :classification-id classification-id :position 9 :plate-number "54" :rider-id (find-rider-id "Виталий" "Горбачев") :motorcycle "KTM EXC 302T" :city "Екатеринбург" :team "Группа эндуро произвола" :start "10:27:30" :finish "14:12:59" :total "03:45:29.244" :laps "1.4"]
         [:type :result :event-id event-id :classification-id classification-id :position 10 :plate-number "65" :rider-id (find-rider-id "Дмитрий" "Иванов") :motorcycle "Koshine 320" :city "Каменск-Уральский" :start "10:28:29" :finish "14:17:59" :total "03:49:29.735" :laps "1.4"]
         [:type :result :event-id event-id :classification-id classification-id :position 11 :plate-number "108" :rider-id (find-rider-id "Анатолий" "Ванчинов") :motorcycle "Beta 300rr" :city "Екатеринбург" :team "Corona" :start "10:29:29" :finish "14:29:29" :total "03:59:59.256" :laps "1.3"]
         [:type :result :event-id event-id :classification-id classification-id :position 12 :plate-number "56" :rider-id (find-rider-id "Константин" "Маркелов") :motorcycle "KTM EXC 300" :city "Челябинск" :team "Моховичковские псы" :start "10:29:00" :finish "13:05:15" :total "02:36:15.715" :laps "1.2"]
         [:type :result :event-id event-id :classification-id classification-id :position 13 :plate-number "72" :rider-id (find-rider-id "Александр" "Бескровный") :motorcycle "Gas gas ec300" :city "Челябинск" :start "10:24:30" :finish "13:22:56" :total "02:58:25.396" :laps "1.2"]
         [:type :result :event-id event-id :classification-id classification-id :position 14 :plate-number "87" :rider-id (find-rider-id "Денис" "Воробьёв") :motorcycle "Gr8" :city "Челябинск" :start "10:30:59" :finish "14:26:21" :total "03:55:21.198" :laps "1.2"]
         [:type :result :event-id event-id :classification-id classification-id :position 15 :plate-number "188" :rider-id (find-rider-id "Рамзис" "Газизов") :motorcycle "-" :city "Заречный" :start "10:46:00" :finish "14:41:26" :total "03:55:26.819" :laps "1.2"]
         [:type :result :event-id event-id :classification-id classification-id :position 16 :plate-number "47" :rider-id (find-rider-id "Алексей" "Кокорин") :motorcycle "KTM EXC300" :city "Курган" :start "10:22:30" :finish "12:45:29" :total "02:22:59.191" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 17 :plate-number "142" :rider-id (find-rider-id "Ильфар" "Сарваров") :motorcycle "ГАЗель" :city "Сургут" :team "Enduro86" :start "10:38:00" :finish "13:20:44" :total "02:42:44.062" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 18 :plate-number "48" :rider-id (find-rider-id "Максим" "Мишуков") :motorcycle "Lanza 250 2t" :city "Магнитогорск" :start "10:36:00" :finish "13:28:04" :total "02:52:04.025" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 19 :plate-number "128" :rider-id (find-rider-id "Евгений" "Константинов") :motorcycle "KTM EXC 300" :city "Екатеринбург" :start "10:34:59" :finish "13:27:37" :total "02:52:37.932" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 20 :plate-number "101" :rider-id (find-rider-id "Михаил" "Ялунин") :motorcycle "GR 8" :city "Богданович" :start "10:32:59" :finish "13:32:16" :total "02:59:16.203" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 21 :plate-number "64" :rider-id (find-rider-id "Михаил" "Тясин") :motorcycle "henjian 300" :city "Екатеринбург" :team "Азимут 66" :start "10:35:28" :finish "13:50:03" :total "03:14:34.821" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 22 :plate-number "59" :rider-id (find-rider-id "Артём" "Сухов") :motorcycle "GR8 300" :city "Далматово" :start "10:36:30" :finish "13:58:28" :total "03:21:57.750" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 23 :plate-number "77" :rider-id (find-rider-id "Алексей" "Донских") :motorcycle "GR8 300 2t" :city "Березовский" :team "Эндуро произвол" :start "10:38:29" :finish "14:01:32" :total "03:23:03.036" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 24 :plate-number "97" :rider-id (find-rider-id "Максим" "Тимошевский") :motorcycle "Хускварна 300 2 т" :city "Челябинск" :start "10:36:59" :finish "14:00:56" :total "03:23:56.900" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 25 :plate-number "50" :rider-id (find-rider-id "Евгений" "Моисеев") :motorcycle "Procida nb300" :city "Челябинск" :team "MotoExtrem74" :start "10:31:30" :finish "14:00:16" :total "03:28:46.245" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 26 :plate-number "91" :rider-id (find-rider-id "Виталий" "Бесперстов") :motorcycle "Ержан 3002Т" :city "Сургут" :start "10:37:29" :finish "14:13:09" :total "03:35:40.226" :laps "1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 27 :plate-number "68" :rider-id (find-rider-id "Дмитрий" "Тимошевский") :motorcycle "GR8 300 2T" :city "Челябинск" :start "10:26:59" :finish "12:19:39" :total "01:52:39.969" :laps ".8 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 28 :plate-number "73" :rider-id (find-rider-id "Иван" "Тихонов") :motorcycle "Ktm exc 250" :city "Екатеринбург" :start "10:31:59" :finish "13:31:50" :total "02:59:51.516" :laps ".8 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 29 :plate-number "86" :rider-id (find-rider-id "Валерий" "Варгасов") :motorcycle "Beta x tender 300 2t" :city "Челябинск" :team "Моховичковкие псы" :start "10:34:29" :finish "12:29:47" :total "01:55:17.269" :laps ".6 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 30 :plate-number "42" :rider-id (find-rider-id "Максим" "Ивощук") :motorcycle "KTM 300" :city "Богданович" :team "ENDURO Bogdanovich" :start "10:34:00" :finish "12:01:31" :total "01:27:31.078" :laps ".4 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 31 :plate-number "55" :rider-id (find-rider-id "Денис" "Козлов") :motorcycle "300 te" :city "Челябинск" :team "Моховичковские псы" :start "10:25:30" :finish "11:01:50" :total "00:36:20.978" :laps ".2 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 32 :plate-number "81" :rider-id (find-rider-id "Сергей" "Кузнецов" "Владимирович" nil) :motorcycle "ktm350" :city "Катайск" :team "KATAYENDURO" :start "10:23:30" :finish "11:02:23" :total "00:38:53.130" :laps ".2 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 33 :plate-number "92" :rider-id (find-rider-id "Иван" "Кравчук") :motorcycle "GR-8 Lanza-2T" :city "Сургут" :start "10:40:00" :finish "11:34:28" :total "00:54:27.282" :laps ".1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 34 :plate-number "120" :rider-id (find-rider-id "Александр" "Ярков") :motorcycle "Bse z5" :city "Дегтярск" :team "ATLAS TEAM" :start "10:39:00" :finish "13:13:24" :total "02:34:24.268" :laps ".1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 35 :plate-number "152" :rider-id (find-rider-id "Дмитрий" "Тренин") :motorcycle "-" :city "Мартюш" :start "10:42:00" :finish "13:20:48" :total "02:38:48.598" :laps ".1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 36 :plate-number "134" :rider-id (find-rider-id "Андрей" "Демченко") :motorcycle "250 PVR REISING" :city "Касли" :start "10:39:30" :finish "10:39:30" :total "-" :laps "0 (2)" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 37 :plate-number "58" :rider-id (find-rider-id "Сергей" "Дубровин") :motorcycle "Kews nb300" :city "Миасс" :team "Enduro Miass 74" :start "10:30:00" :finish "10:30:00" :total "-" :laps "0 (1)" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 38 :plate-number "93" :rider-id (find-rider-id "Сергей" "Кузнецов" "Николаевич" nil) :motorcycle "Hengjain Z300" :city "Сургут" :start "10:32:29" :finish "10:32:29" :total "-" :laps "0 (2)" :dnf? true]
         ])

      (let [classification-id "CI4BYMP4yROM"]
        [{:type              :classification
          :classification-id classification-id
          :event-id          event-id
          :order             1
          :name              "LITE"
          :equivalent        :bronze
          :laps              laps
          :lap-difficulty    lap-difficulty
          :points-multiplier points-multiplier
          :multiplier-description multiplier-description
          :started-count     10
          :laps-info?        true}

         [:type :result :event-id event-id :classification-id classification-id :position 1 :plate-number "158" :rider-id (find-rider-id "Александр" "Полянин") :motorcycle "ATAKI EF300" :city "Златоуст" :start "10:40:29" :finish "14:36:34" :total "03:56:04.846" :laps "1.5"]
         [:type :result :event-id event-id :classification-id classification-id :position 2 :plate-number "154" :rider-id (find-rider-id "Евгений" "Кузенков") :motorcycle "ГР" :city "Челябинск" :team "Мотоспорт Южный Урал" :start "10:41:00" :finish "14:26:28" :total "03:45:28.550" :laps "1.4"]
         [:type :result :event-id event-id :classification-id classification-id :position 3 :plate-number "179" :rider-id (find-rider-id "Лев" "Кислицын") :motorcycle "GR2" :city "Кыштым" :team "СТК Радон" :start "10:42:29" :finish "14:36:36" :total "03:54:06.217" :laps "1.4"]
         [:type :result :event-id event-id :classification-id classification-id :position 4 :plate-number "156" :rider-id (find-rider-id "Константин" "Одиноков") :motorcycle "Гр8" :city "Златоуст" :start "10:41:29" :finish "14:37:14" :total "03:55:45.154" :laps "1.2"]
         [:type :result :event-id event-id :classification-id classification-id :position 5 :plate-number "185" :rider-id (find-rider-id "Егор" "Красько") :motorcycle "Zuumav K6R" :city "Челябинск" :start "10:44:30" :finish "14:21:05" :total "03:36:35.349" :laps ".9 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 6 :plate-number "163" :rider-id (find-rider-id "Евгений" "Максимов") :motorcycle "Kayo T2-G" :city "Челябинск" :team "URALFOX TEAM" :start "10:43:29" :finish "14:43:16" :total "03:59:46.341" :laps ".8 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 7 :plate-number "176" :rider-id (find-rider-id "Анна" "Шилова") :motorcycle "Хаска ТЕ 150" :city "Екатеринбург" :start "10:44:59" :finish "14:19:25" :total "03:34:25.643" :laps ".4 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 8 :plate-number "159" :rider-id (find-rider-id "Арсентий" "Кругленков") :motorcycle "Gr 2" :city "Челябинск" :team "774 team" :start "10:42:59" :finish "11:50:16" :total "01:07:16.262" :laps ".1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 9 :plate-number "173" :rider-id (find-rider-id "Андрей" "Муравьёв") :motorcycle "Sharmax 300" :city "Екатеринбург" :start "10:45:29" :finish "12:58:13" :total "02:12:43.518" :laps ".1 (1)"]
         [:type :result :event-id event-id :classification-id classification-id :position 10 :plate-number "161" :rider-id (find-rider-id "Александр" "Капустин") :motorcycle "H250" :city "Богданович" :start "10:44:00" :finish "10:44:00" :total "-" :laps "0 (2)" :dnf? true]
         ]))))

;; Космост
(def kosmost1
  (let [event-id "EMJKm6w"
        laps 1
        points-multiplier 1.5
        multiplier-description "Было сыро и ехать было очень тяжко"]
    (concat
      [{:type         :event
        :name         "КосМост - день 1"
        :location     "п. Косой мост, Челябинская область"
        :date         "2025-07-26"
        :event-url    "https://marshalone.ru/card/2cd87e73-a487-4d68-86f6-7c3837771de2"
        :telegram-url "https://t.me/ChjAj3AVo3YTRi"
        :event-id     event-id}]

      (let [classification-id "C0lgokNbkOlA"]
        [
         {:type              :classification
          :classification-id classification-id
          :event-id          event-id
          :order             1
          :name              "ЗОЛОТО"
          :equivalent        :gold
          :laps              laps
          ;; Трек золота был явно сложнее самой легкой гонки
          :lap-difficulty    150
          :points-multiplier points-multiplier
          :multiplier-description multiplier-description
          :started-count     14
          :laps-info?        false}

         [:type :result :event-id event-id :classification-id classification-id :position 1 :plate-number "2" :rider-id (find-rider-id "Евгений" "Цицимушкин") :start "11:01:00" :finish "16:55:52" :total "5:54:52" :total-no-penalty "5:54:52" :penalty "0:00:00" :checkpoints-count 13 :city "Кыштым"]
         [:type :result :event-id event-id :classification-id classification-id :position 6 :plate-number "11" :rider-id (find-rider-id "Вячеслав" "Ярулин") :start "11:04:00" :finish "17:36:06" :total "6:32:06" :total-no-penalty "6:32:06" :penalty "0:00:00" :checkpoints-count 13 :city "Екатеринбург"]
         [:type :result :event-id event-id :classification-id classification-id :position 2 :plate-number "8" :rider-id (find-rider-id "Павел" "Лядецкий") :start "11:01:00" :finish "17:38:12" :total "6:37:12" :total-no-penalty "6:37:12" :penalty "0:00:00" :checkpoints-count 13 :city "Челябинск"]
         [:type :result :event-id event-id :classification-id classification-id :position 3 :plate-number "1" :rider-id (find-rider-id "Станислав" "Максимов") :start "11:01:00" :finish "17:38:43" :total "6:37:43" :total-no-penalty "6:37:43" :penalty "0:00:00" :checkpoints-count 13 :city "Кыштым"]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "3" :rider-id (find-rider-id "Артем" "Калинин") :start "11:01:00" :finish "18:23:06" :total "7:22:06" :total-no-penalty "7:22:06" :penalty "0:00:00" :checkpoints-count 13 :city "Челябинск" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "9" :rider-id (find-rider-id "Николай" "Швед") :start "11:01:00" :finish "18:26:36" :total "7:25:36" :total-no-penalty "7:25:36" :penalty "0:00:00" :checkpoints-count 13 :city "Магнитогорск" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "7" :rider-id (find-rider-id "Денис" "Медведюк") :start "11:01:00" :finish "18:51:35" :total "8:20:35" :total-no-penalty "7:50:35" :penalty "0:30:00" :checkpoints-count 12 :city "Тюмень" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "4" :rider-id (find-rider-id "Михаил" "Ушаков") :start "11:01:00" :finish "18:51:52" :total "8:20:52" :total-no-penalty "7:50:52" :penalty "0:30:00" :checkpoints-count 12 :city "Тюмень" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "14" :rider-id (find-rider-id "Александр" "Миронов") :start "11:04:00" :finish "19:01:02" :total "8:57:02" :total-no-penalty "7:57:02" :penalty "1:00:00" :checkpoints-count 11 :city "Сургут" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "16" :rider-id (find-rider-id "Павел" "Хисамутдинов") :start "11:04:00" :finish "18:34:57" :total "9:00:57" :total-no-penalty "7:30:57" :penalty "1:30:00" :checkpoints-count 10 :city "Лосиный" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "5" :rider-id (find-rider-id "Егор" "Емельянов") :start "11:01:00" :finish "17:16:17" :total "дискв." :total-no-penalty "6:15:17" :penalty "—" :checkpoints-count nil :city "Полевской" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "6" :rider-id (find-rider-id "Константин" "Майбуров") :start "11:01:00" :finish "17:34:32" :total "дискв." :total-no-penalty "6:33:32" :penalty "—" :checkpoints-count nil :city "Екатеринбург" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "10" :rider-id (find-rider-id "Денис" "Шилов") :start "11:01:00" :finish "12:27:00" :total "сошел" :total-no-penalty "1:26:00" :penalty "—" :checkpoints-count nil :city "Екатеринбург" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "15" :rider-id (find-rider-id "Александр" "Лунченко") :start "11:04:00" :finish "15:05:19" :total "сошел" :total-no-penalty "4:01:19" :penalty "—" :checkpoints-count nil :city "Екатеринбург" :dnf? true]


         ])

      (let [classification-id "CvYJUgUTm8CI"]
        [
         {:type              :classification
          :classification-id classification-id
          :event-id          event-id
          :order             2
          :name              "СЕРЕБРО"
          :equivalent        :silver
          :laps              laps
          ;; Серебро слегка проще золота было, но тоже не сахар
          :lap-difficulty    120
          :points-multiplier points-multiplier
          :multiplier-description multiplier-description
          :started-count     46
          :laps-info?        false}

         [:type :result :event-id event-id :classification-id classification-id :position 1 :plate-number "134" :rider-id (find-rider-id "Егор" "Харитонов") :start "11:16:00" :finish "16:42:51" :total "5:26:51" :total-no-penalty "5:26:51" :penalty "0:00:00" :checkpoints-count 13 :city "Озерск"]
         [:type :result :event-id event-id :classification-id classification-id :position 2 :plate-number "138" :rider-id (find-rider-id "Виктор" "Цыбулин") :start "11:16:00" :finish "16:46:48" :total "5:30:48" :total-no-penalty "5:30:48" :penalty "0:00:00" :checkpoints-count 13 :city "Тюмень"]
         [:type :result :event-id event-id :classification-id classification-id :position 3 :plate-number "114" :rider-id (find-rider-id "Евгений" "Журавский") :start "11:10:00" :finish "17:29:42" :total "6:19:42" :total-no-penalty "6:19:42" :penalty "0:00:00" :checkpoints-count 13 :city "Пермь"]
         [:type :result :event-id event-id :classification-id classification-id :position 4 :plate-number "104" :rider-id (find-rider-id "Дмитрий" "Аверин") :start "11:07:00" :finish "17:05:38" :total "6:28:38" :total-no-penalty "5:58:38" :penalty "0:30:00" :checkpoints-count 13 :city "Екатеринбург"]
         [:type :result :event-id event-id :classification-id classification-id :position 5 :plate-number "131" :rider-id (find-rider-id "Кирилл" "Азаров") :start "11:16:00" :finish "17:23:56" :total "6:37:56" :total-no-penalty "6:07:56" :penalty "0:30:00" :checkpoints-count 13 :city "Челябинск"]
         [:type :result :event-id event-id :classification-id classification-id :position 6 :plate-number "116" :rider-id (find-rider-id "Юрий" "Бороздин") :start "11:10:00" :finish "17:21:01" :total "6:41:01" :total-no-penalty "6:11:01" :penalty "0:30:00" :checkpoints-count 13 :city "Екатеринбург"]
         [:type :result :event-id event-id :classification-id classification-id :position 7 :plate-number "111" :rider-id (find-rider-id "Артем" "Свяжин") :start "11:10:00" :finish "17:21:36" :total "6:41:36" :total-no-penalty "6:11:36" :penalty "0:30:00" :checkpoints-count 13 :city "Екатеринбург"]
         [:type :result :event-id event-id :classification-id classification-id :position 8 :plate-number "113" :rider-id (find-rider-id "Алексей" "Кокорин") :start "11:10:00" :finish "17:23:39" :total "6:43:39" :total-no-penalty "6:13:39" :penalty "0:30:00" :checkpoints-count 13 :city "Курган"]
         [:type :result :event-id event-id :classification-id classification-id :position 9 :plate-number "102" :rider-id (find-rider-id "Константин" "Романов") :start "11:07:00" :finish "17:24:29" :total "6:47:29" :total-no-penalty "6:17:29" :penalty "0:30:00" :checkpoints-count 13 :city "Челябинск"]
         [:type :result :event-id event-id :classification-id classification-id :position 10 :plate-number "106" :rider-id (find-rider-id "Денис" "Зараменских") :start "11:07:00" :finish "17:24:51" :total "6:47:51" :total-no-penalty "6:17:51" :penalty "0:30:00" :checkpoints-count 13 :city "Коркино"]
         [:type :result :event-id event-id :classification-id classification-id :position 11 :plate-number "121" :rider-id (find-rider-id "Вадим" "Лугаськов") :start "11:13:00" :finish "17:35:54" :total "6:52:54" :total-no-penalty "6:22:54" :penalty "0:30:00" :checkpoints-count 13 :city "Ревда"]
         [:type :result :event-id event-id :classification-id classification-id :position 12 :plate-number "103" :rider-id (find-rider-id "Александр" "Удачин") :start "11:07:00" :finish "17:32:58" :total "6:55:58" :total-no-penalty "6:25:58" :penalty "0:30:00" :checkpoints-count 13 :city "Катайск"]
         [:type :result :event-id event-id :classification-id classification-id :position 13 :plate-number "108" :rider-id (find-rider-id "Илья" "Кузнецов") :start "11:07:00" :finish "17:36:01" :total "6:59:01" :total-no-penalty "6:29:01" :penalty "0:30:00" :checkpoints-count 13 :city "Екатеринбург"]
         [:type :result :event-id event-id :classification-id classification-id :position 14 :plate-number "105" :rider-id (find-rider-id "Владимир" "Бодрин") :start "11:07:00" :finish "17:42:25" :total "7:05:25" :total-no-penalty "6:35:25" :penalty "0:30:00" :checkpoints-count 13 :city "Магнитогорск"]

         [:type :result :event-id event-id :classification-id classification-id :position 15 :plate-number "146" :rider-id (find-rider-id "Андрей" "Шафигулин") :start "11:19:00" :finish "17:54:57" :total "7:05:57" :total-no-penalty "6:35:57" :penalty "0:30:00" :checkpoints-count 13 :city "Челябинск"]
         [:type :result :event-id event-id :classification-id classification-id :position 16 :plate-number "127" :rider-id (find-rider-id "Петр" "Адрианов") :start "11:13:00" :finish "17:21:21" :total "6:38:21" :total-no-penalty "6:08:21" :penalty "0:30:00" :checkpoints-count 12 :city "Челябинск"]
         [:type :result :event-id event-id :classification-id classification-id :position 17 :plate-number "101" :rider-id (find-rider-id "Владимир" "Иванов") :start "11:07:00" :finish "17:59:02" :total "7:22:02" :total-no-penalty "6:52:02" :penalty "0:30:00" :checkpoints-count 13 :city "Копейск"]
         [:type :result :event-id event-id :classification-id classification-id :position 18 :plate-number "147" :rider-id (find-rider-id "Андрей" "Ломакин") :start "11:19:00" :finish "17:33:04" :total "7:14:04" :total-no-penalty "6:14:04" :penalty "1:00:00" :checkpoints-count 11 :city "Трехгорный"]
         [:type :result :event-id event-id :classification-id classification-id :position 19 :plate-number "139" :rider-id (find-rider-id "Артём" "Тараненко") :start "11:16:00" :finish "17:14:45" :total "8:28:45" :total-no-penalty "5:58:45" :penalty "2:30:00" :checkpoints-count 8 :city "Екатеринбург"]
         [:type :result :event-id event-id :classification-id classification-id :position 20 :plate-number "120" :rider-id (find-rider-id "Владислав" "Чибаков") :start "11:10:00" :finish "17:12:47" :total "8:32:47" :total-no-penalty "6:02:47" :penalty "2:30:00" :checkpoints-count 8 :city "Сысерть"]
         [:type :result :event-id event-id :classification-id classification-id :position 21 :plate-number "132" :rider-id (find-rider-id "Ильфар" "Сарваров") :start "11:16:00" :finish "17:24:23" :total "8:38:23" :total-no-penalty "6:08:23" :penalty "2:30:00" :checkpoints-count 8 :city "Сургут"]
         [:type :result :event-id event-id :classification-id classification-id :position 22 :plate-number "148" :rider-id (find-rider-id "Алексей" "Коротаев") :start "11:19:00" :finish "17:48:23" :total "8:59:23" :total-no-penalty "6:29:23" :penalty "2:30:00" :checkpoints-count 8 :city "Екатеринбург"]
         [:type :result :event-id event-id :classification-id classification-id :position 23 :plate-number "144" :rider-id (find-rider-id "Андрей" "Азегов") :start "11:19:00" :finish "17:54:38" :total "9:05:38" :total-no-penalty "6:35:38" :penalty "2:30:00" :checkpoints-count 8 :city "Нижневартовск"]
         [:type :result :event-id event-id :classification-id classification-id :position 24 :plate-number "130" :rider-id (find-rider-id "Леонид" "Леонтьев") :start "11:13:00" :finish "17:58:25" :total "9:15:25" :total-no-penalty "6:45:25" :penalty "2:30:00" :checkpoints-count 8 :city "Тюмень"]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "117" :rider-id (find-rider-id "Алексей" "Семилетов") :start "11:10:00" :finish "18:18:15" :total "7:08:15" :total-no-penalty "7:08:15" :penalty "0:00:00" :checkpoints-count 13 :city "Курган" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "109" :rider-id (find-rider-id "Дмитрий" "Иванов") :start "11:07:00" :finish "18:17:16" :total "7:10:16" :total-no-penalty "7:10:16" :penalty "0:00:00" :checkpoints-count 13 :city "Каменск-Уральский" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "119" :rider-id (find-rider-id "Владимир" "Киселёв") :start "11:10:00" :finish "18:22:53" :total "7:12:53" :total-no-penalty "7:12:53" :penalty "0:00:00" :checkpoints-count 13 :city "Челябинск" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "115" :rider-id (find-rider-id "Андрей" "Склюев") :start "11:10:00" :finish "18:23:36" :total "7:13:36" :total-no-penalty "7:13:36" :penalty "0:00:00" :checkpoints-count 13 :city "Тюмень" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "118" :rider-id (find-rider-id "Антон" "Галюк") :start "11:10:00" :finish "18:36:15" :total "7:26:15" :total-no-penalty "7:26:15" :penalty "0:00:00" :checkpoints-count 13 :city "Тюмень" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "112" :rider-id (find-rider-id "Антон" "Тырыкин") :start "11:10:00" :finish "18:45:26" :total "7:35:26" :total-no-penalty "7:35:26" :penalty "0:00:00" :checkpoints-count 13 :city "Челябинск" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "107" :rider-id (find-rider-id "Владимир" "Пономарчук") :start "11:07:00" :finish "18:45:49" :total "7:38:49" :total-no-penalty "7:38:49" :penalty "0:00:00" :checkpoints-count 13 :city "Челябинск" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "149" :rider-id (find-rider-id "Александр" "Перевозчиков") :start "11:19:00" :finish "18:13:52" :total "7:24:52" :total-no-penalty "6:54:52" :penalty "0:30:00" :checkpoints-count 12 :city "Екатеринбург" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "142" :rider-id (find-rider-id "Андрей" "Бадьин") :start "11:19:00" :finish "18:37:43" :total "7:48:43" :total-no-penalty "7:18:43" :penalty "0:30:00" :checkpoints-count 12 :city "Магнитогорск" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "133" :rider-id (find-rider-id "Иван" "Мышенков") :start "11:16:00" :finish "19:02:53" :total "8:16:53" :total-no-penalty "7:46:53" :penalty "0:30:00" :checkpoints-count 12 :city "Челябинск" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "140" :rider-id (find-rider-id "Антон" "Зырянов") :start "11:16:00" :finish "19:30:18" :total "9:14:18" :total-no-penalty "8:14:18" :penalty "1:00:00" :checkpoints-count 11 :city "Магнитогорск" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "137" :rider-id (find-rider-id "Владимир" "Воронин") :start "11:16:00" :finish "18:29:35" :total "8:43:35" :total-no-penalty "7:13:35" :penalty "1:30:00" :checkpoints-count 10 :city "Нижневартовск" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "145" :rider-id (find-rider-id "Андрей" "Полномочнов") :start "11:19:00" :finish "18:45:51" :total "8:56:51" :total-no-penalty "7:26:51" :penalty "1:30:00" :checkpoints-count 10 :city "Сургут" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "124" :rider-id (find-rider-id "Ален" "Кокшаров") :start "11:13:00" :finish "18:46:18" :total "9:03:18" :total-no-penalty "7:33:18" :penalty "1:30:00" :checkpoints-count 10 :city "Екатеринбург" :timebar? true :dnf? true]

         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "129" :rider-id (find-rider-id "Максим" "Кузнецов") :start "11:13:00" :finish "18:16:45" :total "9:33:45" :total-no-penalty "7:03:45" :penalty "2:30:00" :checkpoints-count 8 :city "Сургут" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "135" :rider-id (find-rider-id "Евгений" "Каширин") :start "11:16:00" :finish "18:36:22" :total "9:50:22" :total-no-penalty "7:20:22" :penalty "2:30:00" :checkpoints-count 8 :city "Учалы" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "126" :rider-id (find-rider-id "Роман" "Афанасьев") :start "11:13:00" :finish "18:01:31" :total "10:48:31" :total-no-penalty "6:48:31" :penalty "4:00:00" :checkpoints-count 5 :city "Екатеринбург" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "141" :rider-id (find-rider-id "Антон" "Толкачев") :start "11:19:00" :finish "17:38:08" :total "сошел" :total-no-penalty "сошел" :penalty "—" :checkpoints-count nil :city "Талица" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "128" :rider-id (find-rider-id "Олег" "Галкин") :start "11:13:00" :finish "16:29:46" :total "сошел" :total-no-penalty "сошел" :penalty "—" :checkpoints-count nil :city "Сургут" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "110" :rider-id (find-rider-id "Константин" "Маркелов") :start "11:07:00" :finish "15:03:28" :total "сошел" :total-no-penalty "сошел" :penalty "—" :checkpoints-count nil :city "Челябинск" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "122" :rider-id (find-rider-id "Иван" "Заполоцкий") :start "11:13:00" :finish "15:37:50" :total "сошел" :total-no-penalty "сошел" :penalty "—" :checkpoints-count nil :city "Муо" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "125" :rider-id (find-rider-id "Данила" "Фролов") :start "11:13:00" :finish "15:38:34" :total "сошел" :total-no-penalty "сошел" :penalty "—" :checkpoints-count nil :city "Тюмень" :dnf? true]
         ])

      (let [classification-id "CSoSfbdhxQ"]
        [{:type                   :classification
          :classification-id      classification-id
          :event-id               event-id
          :order                  3
          :name                   "БРОНЗА"
          :equivalent             :bronze
          :laps                   laps
          ;; Бронза еще попроще серебра, но тоже не супер-лайт - весьма сложный трек
          :lap-difficulty         90
          :points-multiplier      points-multiplier
          :multiplier-description multiplier-description
          :started-count          71
          :laps-info?             false}

         [:type :result :event-id event-id :classification-id classification-id :position 1 :plate-number "258" :rider-id (find-rider-id "Дмитрий" "Тимошевский") :start "11:37:00" :finish "16:46:55" :total "5:09:55" :total-no-penalty "5:09:55" :penalty "0:00:00" :checkpoints-count 13 :city "Челябинск"]
         [:type :result :event-id event-id :classification-id classification-id :position 2 :plate-number "267" :rider-id (find-rider-id "Василий" "Решетков") :start "11:40:00" :finish "16:52:09" :total "5:12:09" :total-no-penalty "5:12:09" :penalty "0:00:00" :checkpoints-count 13 :city "Еманжелинск"]
         [:type :result :event-id event-id :classification-id classification-id :position 3 :plate-number "260" :rider-id (find-rider-id "Денис" "Козлов") :start "11:37:00" :finish "16:52:06" :total "5:15:06" :total-no-penalty "5:15:06" :penalty "0:00:00" :checkpoints-count 13 :city "Челябинск"]
         [:type :result :event-id event-id :classification-id classification-id :position 4 :plate-number "208" :rider-id (find-rider-id "Владимир" "Тясин") :start "11:22:00" :finish "16:44:23" :total "5:22:23" :total-no-penalty "5:22:23" :penalty "0:00:00" :checkpoints-count 13 :city "Екатеринбург"]
         [:type :result :event-id event-id :classification-id classification-id :position 5 :plate-number "248" :rider-id (find-rider-id "Иван" "Швейкерт") :start "11:34:00" :finish "17:00:22" :total "5:26:22" :total-no-penalty "5:26:22" :penalty "0:00:00" :checkpoints-count 13 :city "Челябинск"]
         [:type :result :event-id event-id :classification-id classification-id :position 6 :plate-number "201" :rider-id (find-rider-id "Савелий" "Кунакбаев") :start "11:22:00" :finish "16:55:13" :total "5:33:13" :total-no-penalty "5:33:13" :penalty "0:00:00" :checkpoints-count 13 :city "Полевской"]
         [:type :result :event-id event-id :classification-id classification-id :position 7 :plate-number "242" :rider-id (find-rider-id "Лев" "Кислицын") :start "11:34:00" :finish "17:09:32" :total "5:35:32" :total-no-penalty "5:35:32" :penalty "0:00:00" :checkpoints-count 13 :city "Кыштым"]
         [:type :result :event-id event-id :classification-id classification-id :position 8 :plate-number "213" :rider-id (find-rider-id "Арсен" "Байрамуков") :start "11:25:00" :finish "17:01:43" :total "5:36:43" :total-no-penalty "5:36:43" :penalty "0:00:00" :checkpoints-count 13 :city "Златоуст"]
         [:type :result :event-id event-id :classification-id classification-id :position 9 :plate-number "264" :rider-id (find-rider-id "Владислав" "Хонькин") :start "11:40:00" :finish "17:16:58" :total "5:36:58" :total-no-penalty "5:36:58" :penalty "0:00:00" :checkpoints-count 13 :city "Еманжелинск"]
         [:type :result :event-id event-id :classification-id classification-id :position 10 :plate-number "268" :rider-id (find-rider-id "Вадим" "Ахтямов") :start "11:40:00" :finish "17:18:59" :total "5:38:59" :total-no-penalty "5:38:59" :penalty "0:00:00" :checkpoints-count 13 :city "Миасс"]
         [:type :result :event-id event-id :classification-id classification-id :position 11 :plate-number "204" :rider-id (find-rider-id "Александр" "Бескровный") :start "11:22:00" :finish "17:01:46" :total "5:39:46" :total-no-penalty "5:39:46" :penalty "0:00:00" :checkpoints-count 13 :city "Челябинск"]
         [:type :result :event-id event-id :classification-id classification-id :position 12 :plate-number "205" :rider-id (find-rider-id "Александр" "Зверев") :start "11:22:00" :finish "17:07:15" :total "5:45:15" :total-no-penalty "5:45:15" :penalty "0:00:00" :checkpoints-count 13 :city "Златоуст"]
         [:type :result :event-id event-id :classification-id classification-id :position 13 :plate-number "207" :rider-id (find-rider-id "Алексей" "Слабочков") :start "11:22:00" :finish "17:15:54" :total "5:53:54" :total-no-penalty "5:53:54" :penalty "0:00:00" :checkpoints-count 13 :city "Миасс"]
         [:type :result :event-id event-id :classification-id classification-id :position 14 :plate-number "216" :rider-id (find-rider-id "Евгений" "Соловьев") :start "11:25:00" :finish "16:58:32" :total "6:03:32" :total-no-penalty "5:33:32" :penalty "0:30:00" :checkpoints-count 13 :city "Ревда"]
         [:type :result :event-id event-id :classification-id classification-id :position 15 :plate-number "241" :rider-id (find-rider-id "Леонид" "Асташов") :start "11:34:00" :finish "17:45:02" :total "6:11:02" :total-no-penalty "6:11:02" :penalty "0:00:00" :checkpoints-count 13 :city "Половинный"]
         [:type :result :event-id event-id :classification-id classification-id :position 16 :plate-number "215" :rider-id (find-rider-id "Максим" "Тимошевский") :start "11:25:00" :finish "17:40:05" :total "6:15:05" :total-no-penalty "6:15:05" :penalty "0:00:00" :checkpoints-count 13 :city "Челябинск"]
         [:type :result :event-id event-id :classification-id classification-id :position 17 :plate-number "212" :rider-id (find-rider-id "Сергей" "Борисов") :start "11:25:00" :finish "17:42:58" :total "6:17:58" :total-no-penalty "6:17:58" :penalty "0:00:00" :checkpoints-count 13 :city "Челябинск"]
         [:type :result :event-id event-id :classification-id classification-id :position 18 :plate-number "202" :rider-id (find-rider-id "Матвей" "Тиунов") :start "11:22:00" :finish "17:40:04" :total "6:18:04" :total-no-penalty "6:18:04" :penalty "0:00:00" :checkpoints-count 13 :city "Сатка"]
         [:type :result :event-id event-id :classification-id classification-id :position 19 :plate-number "269" :rider-id (find-rider-id "Вадим" "Мезенцев") :start "11:40:00" :finish "17:59:12" :total "6:19:12" :total-no-penalty "6:19:12" :penalty "0:00:00" :checkpoints-count 13 :city "Карабаш"]
         [:type :result :event-id event-id :classification-id classification-id :position 20 :plate-number "211" :rider-id (find-rider-id "Фёдор" "Сборошенко") :start "11:25:00" :finish "17:45:17" :total "6:20:17" :total-no-penalty "6:20:17" :penalty "0:00:00" :checkpoints-count 13 :city "Челябинск"]
         [:type :result :event-id event-id :classification-id classification-id :position 21 :plate-number "266" :rider-id (find-rider-id "Виктор" "Семенов") :start "11:40:00" :finish "16:03:31" :total "6:53:31" :total-no-penalty "4:23:31" :penalty "2:30:00" :checkpoints-count 8 :city "Челябинск"]
         [:type :result :event-id event-id :classification-id classification-id :position 22 :plate-number "275" :rider-id (find-rider-id "Александр" "Полянин") :start "11:43:00" :finish "16:12:42" :total "6:59:42" :total-no-penalty "4:29:42" :penalty "2:30:00" :checkpoints-count 8 :city "Златоуст"]
         [:type :result :event-id event-id :classification-id classification-id :position 23 :plate-number "214" :rider-id (find-rider-id "Виталий" "Стаценков") :start "11:25:00" :finish "17:19:03" :total "8:24:03" :total-no-penalty "5:54:03" :penalty "2:30:00" :checkpoints-count 8 :city "Екатеринбург"]
         [:type :result :event-id event-id :classification-id classification-id :position 24 :plate-number "210" :rider-id (find-rider-id "Александр" "Новопашин") :start "11:22:00" :finish "17:29:14" :total "8:37:14" :total-no-penalty "6:07:14" :penalty "2:30:00" :checkpoints-count 8 :city "Тюмень"]
         [:type :result :event-id event-id :classification-id classification-id :position 25 :plate-number "224" :rider-id (find-rider-id "Дмитрий" "Долженко") :start "11:28:00" :finish "17:47:22" :total "8:49:22" :total-no-penalty "6:19:22" :penalty "2:30:00" :checkpoints-count 8 :city "Тюмень"]
         [:type :result :event-id event-id :classification-id classification-id :position 26 :plate-number "263" :rider-id (find-rider-id "Дамир" "Хабибрахманов") :start "11:40:00" :finish "16:45:06" :total "8:05:06" :total-no-penalty "5:05:06" :penalty "3:00:00" :checkpoints-count 7 :city "Екатеринбург"]
         [:type :result :event-id event-id :classification-id classification-id :position 27 :plate-number "231" :rider-id (find-rider-id "Сергей" "Вакушин") :start "11:31:00" :finish "15:33:26" :total "7:32:26" :total-no-penalty "4:02:26" :penalty "3:30:00" :checkpoints-count 6 :city "Миасс"]
         [:type :result :event-id event-id :classification-id classification-id :position 28 :plate-number "271" :rider-id (find-rider-id "Анатолий" "Ванчинов") :start "11:43:00" :finish "16:23:44" :total "8:10:44" :total-no-penalty "4:40:44" :penalty "3:30:00" :checkpoints-count 6 :city "Екатеринбург"]
         [:type :result :event-id event-id :classification-id classification-id :position 29 :plate-number "249" :rider-id (find-rider-id "Иван" "Тихонов") :start "11:34:00" :finish "16:23:12" :total "8:19:12" :total-no-penalty "4:49:12" :penalty "3:30:00" :checkpoints-count 6 :city "Екатеринбург"]
         [:type :result :event-id event-id :classification-id classification-id :position 30 :plate-number "273" :rider-id (find-rider-id "Алексей" "Гаврилов") :start "11:43:00" :finish "17:59:08" :total "9:46:08" :total-no-penalty "6:16:08" :penalty "3:30:00" :checkpoints-count 6 :city "Златоуст"]
         [:type :result :event-id event-id :classification-id classification-id :position 31 :plate-number "221" :rider-id (find-rider-id "Александр" "Сумин") :start "11:28:00" :finish "17:28:59" :total "10:00:59" :total-no-penalty "6:00:59" :penalty "4:00:00" :checkpoints-count 5 :city "Челябинск"]
         [:type :result :event-id event-id :classification-id classification-id :position 32 :plate-number "226" :rider-id (find-rider-id "Денис" "Саликов") :start "11:28:00" :finish "17:29:31" :total "10:01:31" :total-no-penalty "6:01:31" :penalty "4:00:00" :checkpoints-count 5 :city "Тюмень"]
         [:type :result :event-id event-id :classification-id classification-id :position 33 :plate-number "217" :rider-id (find-rider-id "Олег" "Поленков") :start "11:25:00" :finish "17:28:37" :total "10:03:37" :total-no-penalty "6:03:37" :penalty "4:00:00" :checkpoints-count 5 :city "Магнитогорск"]
         [:type :result :event-id event-id :classification-id classification-id :position 34 :plate-number "225" :rider-id (find-rider-id "Сергей" "Лазукин") :start "11:28:00" :finish "17:34:22" :total "10:06:22" :total-no-penalty "6:06:22" :penalty "4:00:00" :checkpoints-count 5 :city "Снежинск"]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "232" :rider-id (find-rider-id "Сергей" "Баранов") :start "11:31:00" :finish "18:37:34" :total "7:06:34" :total-no-penalty "7:06:34" :penalty "0:00:00" :checkpoints-count 13 :city "Нягань" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "270" :rider-id (find-rider-id "Артем" "Богданов") :start "11:40:00" :finish "18:39:04" :total "7:29:04" :total-no-penalty "6:59:04" :penalty "0:30:00" :checkpoints-count 12 :city "Нижневартовск" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "259" :rider-id (find-rider-id "Дмитрий" "Шматков") :start "11:37:00" :finish "18:40:04" :total "7:33:04" :total-no-penalty "7:03:04" :penalty "0:30:00" :checkpoints-count 12 :city "Челябинск" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "220" :rider-id (find-rider-id "Александр" "Беспалов") :start "11:25:00" :finish "18:38:22" :total "7:43:22" :total-no-penalty "7:13:22" :penalty "0:30:00" :checkpoints-count 12 :city "Челябинск" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "233" :rider-id (find-rider-id "Сергей" "Шайбаков") :start "11:31:00" :finish "18:44:50" :total "7:43:50" :total-no-penalty "7:13:50" :penalty "0:30:00" :checkpoints-count 12 :city "Екатеринбург" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "203" :rider-id (find-rider-id "Сергей" "Кузнецов" nil "Сургут") :start "11:22:00" :finish "18:02:42" :total "7:40:42" :total-no-penalty "6:40:42" :penalty "1:00:00" :checkpoints-count 11 :city "Сургут" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "244" :rider-id (find-rider-id "Илья" "Ефимов") :start "11:34:00" :finish "18:38:24" :total "8:04:24" :total-no-penalty "7:04:24" :penalty "1:00:00" :checkpoints-count 11 :city "Каменск-Уральский" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "251" :rider-id (find-rider-id "Егор" "Камалов") :start "11:37:00" :finish "18:55:06" :total "8:18:06" :total-no-penalty "7:18:06" :penalty "1:00:00" :checkpoints-count 11 :city "Златоуст" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "272" :rider-id (find-rider-id "Алексей" "Захаров") :start "11:43:00" :finish "18:22:19" :total "8:09:19" :total-no-penalty "6:39:19" :penalty "1:30:00" :checkpoints-count 10 :city "Екатеринбург" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "243" :rider-id (find-rider-id "Илья" "Юзеев") :start "11:34:00" :finish "18:23:12" :total "8:19:12" :total-no-penalty "6:49:12" :penalty "1:30:00" :checkpoints-count 10 :city "Миасс" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "254" :rider-id (find-rider-id "Евгений" "Константинов") :start "11:37:00" :finish "18:30:09" :total "8:23:09" :total-no-penalty "6:53:09" :penalty "1:30:00" :checkpoints-count 10 :city "Екатеринбург" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "240" :rider-id (find-rider-id "Леонид" "Наговский") :start "11:31:00" :finish "18:34:24" :total "8:33:24" :total-no-penalty "7:03:24" :penalty "1:30:00" :checkpoints-count 10 :city "Челябинск" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "222" :rider-id (find-rider-id "Станислав" "Зубков") :start "11:28:00" :finish "18:39:38" :total "8:41:38" :total-no-penalty "7:11:38" :penalty "1:30:00" :checkpoints-count 10 :city "Челябинск" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "261" :rider-id (find-rider-id "Денис" "Воробьёв") :start "11:40:00" :finish "18:11:12" :total "8:31:12" :total-no-penalty "6:31:12" :penalty "2:00:00" :checkpoints-count 9 :city "Челябинск" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "262" :rider-id (find-rider-id "Данил" "Береговой") :start "11:40:00" :finish "18:02:50" :total "8:52:50" :total-no-penalty "6:22:50" :penalty "2:30:00" :checkpoints-count 8 :city "Миасс" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "218" :rider-id (find-rider-id "Максим" "Паршаков") :start "11:25:00" :finish "18:09:08" :total "9:14:08" :total-no-penalty "6:44:08" :penalty "2:30:00" :checkpoints-count 8 :city "Челябинск" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "274" :rider-id (find-rider-id "Александр" "Копытов") :start "11:43:00" :finish "18:00:29" :total "9:17:29" :total-no-penalty "6:17:29" :penalty "3:00:00" :checkpoints-count 7 :city "Челябинск" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "219" :rider-id (find-rider-id "Александр" "Мальков") :start "11:25:00" :finish "18:00:50" :total "9:35:50" :total-no-penalty "6:35:50" :penalty "3:00:00" :checkpoints-count 7 :city "Челябинск" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "256" :rider-id (find-rider-id "Дмитрий" "Некрасов") :start "11:37:00" :finish "18:06:52" :total "9:59:52" :total-no-penalty "6:29:52" :penalty "3:30:00" :checkpoints-count 6 :city "Каменск-Уральский" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "237" :rider-id (find-rider-id "Пётр" "Хардин") :start "11:31:00" :finish "18:04:36" :total "10:03:36" :total-no-penalty "6:33:36" :penalty "3:30:00" :checkpoints-count 6 :city "Тюмень" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "252" :rider-id (find-rider-id "Егор" "Красько") :start "11:37:00" :finish "18:24:04" :total "11:17:04" :total-no-penalty "6:47:04" :penalty "4:30:00" :checkpoints-count 4 :city "Челябинск" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "257" :rider-id (find-rider-id "Дмитрий" "Смаль") :start "11:37:00" :finish "19:02:45" :total "11:55:45" :total-no-penalty "7:25:45" :penalty "4:30:00" :checkpoints-count 4 :city "Нижневартовск" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "234" :rider-id (find-rider-id "Сергей" "Поздеев") :start "11:31:00" :finish "19:01:02" :total "12:00:02" :total-no-penalty "7:30:02" :penalty "4:30:00" :checkpoints-count 4 :city "Новая Ляля" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "235" :rider-id (find-rider-id "Сергей" "Горбенко") :start "11:31:00" :finish "19:01:53" :total "12:00:53" :total-no-penalty "7:30:53" :penalty "4:30:00" :checkpoints-count 4 :city "Нижневартовск" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "250" :rider-id (find-rider-id "Иван" "Шестеров") :start "11:34:00" :finish "18:39:48" :total "сошел" :total-no-penalty "сошел" :penalty "—" :checkpoints-count nil :city "Златоуст" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "206" :rider-id (find-rider-id "Михаил" "Попов") :start "11:22:00" :finish "12:55:38" :total "сошел" :total-no-penalty "сошел" :penalty "—" :checkpoints-count nil :city "Каменск-Уральский" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "230" :rider-id (find-rider-id "Степан" "Мысляев") :start "11:28:00" :finish "12:55:55" :total "сошел" :total-no-penalty "сошел" :penalty "—" :checkpoints-count nil :city "Кыштым" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "246" :rider-id (find-rider-id "Игорь" "Пятышин") :start "11:34:00" :finish "13:17:37" :total "сошел" :total-no-penalty "сошел" :penalty "—" :checkpoints-count nil :city "Екатеринбург" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "239" :rider-id (find-rider-id "Михаил" "Пятышин") :start "11:31:00" :finish "13:17:38" :total "сошел" :total-no-penalty "сошел" :penalty "—" :checkpoints-count nil :city "Екатеринбург" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "247" :rider-id (find-rider-id "Иван" "Кравчук") :start "11:34:00" :finish "14:15:07" :total "сошел" :total-no-penalty "сошел" :penalty "—" :checkpoints-count nil :city "Сургут" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "227" :rider-id (find-rider-id "Эдуард" "Лысцов") :start "11:28:00" :finish "14:26:53" :total "сошел" :total-no-penalty "сошел" :penalty "—" :checkpoints-count nil :city "Сысерть" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "223" :rider-id (find-rider-id "Олег" "Лазарев") :start "11:28:00" :finish "14:27:07" :total "сошел" :total-no-penalty "сошел" :penalty "—" :checkpoints-count nil :city "Екатеринбург" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "238" :rider-id (find-rider-id "Павел" "Папазов") :start "11:31:00" :finish "14:41:03" :total "сошел" :total-no-penalty "сошел" :penalty "—" :checkpoints-count nil :city "Новый Уренгой" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "236" :rider-id (find-rider-id "Роман" "Дайбов") :start "11:31:00" :finish "17:14:12" :total "сошел" :total-no-penalty "сошел" :penalty "—" :checkpoints-count nil :city "Кыштым" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "253" :rider-id (find-rider-id "Евгений" "Филиппов") :start "11:37:00" :finish "18:11:56" :total "сошел" :total-no-penalty "сошел" :penalty "—" :checkpoints-count nil :city "Сатка" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "229" :rider-id (find-rider-id "Илья" "Чебыкин") :start "11:28:00" :finish "14:58:41" :total "сошел" :total-no-penalty "сошел" :penalty "—" :checkpoints-count nil :city "Красногорский" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "265" :rider-id (find-rider-id "Виталий" "Бесперстов") :start "11:40:00" :finish "16:06:02" :total "сошел" :total-no-penalty "сошел" :penalty "—" :checkpoints-count nil :city "Сургут" :dnf? true]
         ]
        )

      (let [classification-id "ChVNGcIx0v98"]
        [{:type                   :classification
          :classification-id      classification-id
          :event-id               event-id
          :order                  4
          :name                   "ЛЕДИ"
          :equivalent             :lady
          :laps                   laps
          ;; Леди ехали сокращенную бронзу
          :lap-difficulty         60
          :points-multiplier      points-multiplier
          :multiplier-description multiplier-description
          :started-count          5
          :laps-info?             false}

         [:type :result :event-id event-id :classification-id classification-id :position 1 :plate-number "401" :rider-id (find-rider-id "Анна" "Шилова") :start "11:49:00" :finish "18:23:04" :total "6:34:04" :total-no-penalty "6:34:04" :penalty "0:00:00" :checkpoints-count 8 :city "Екатеринбург"]
         [:type :result :event-id event-id :classification-id classification-id :position 2 :plate-number "402" :rider-id (find-rider-id "Анна" "Медведева") :start "11:49:00" :finish "18:25:17" :total "8:06:17" :total-no-penalty "6:36:17" :penalty "1:30:00" :checkpoints-count 5 :city "Челябинск"]
         [:type :result :event-id event-id :classification-id classification-id :position 3 :plate-number "404" :rider-id (find-rider-id "Ульяна" "Храмцова") :start "11:49:00" :finish "18:46:28" :total "8:57:28" :total-no-penalty "6:57:28" :penalty "2:00:00" :checkpoints-count 4 :city "Златоуст"]
         [:type :result :event-id event-id :classification-id classification-id :position 4 :plate-number "403" :rider-id (find-rider-id "Марина" "Аверина") :start "11:49:00" :finish "21:59:12" :total "11:40:12" :total-no-penalty "10:10:12" :penalty "1:30:00" :checkpoints-count 5 :city "Екатеринбург"]
         [:type :result :event-id event-id :classification-id classification-id :position 5 :plate-number "405" :rider-id (find-rider-id "Анастасия" "Шилова") :start "11:49:00" :finish "15:31:27" :total "7:42:27" :total-no-penalty "3:42:27" :penalty "4:00:00" :checkpoints-count 0 :city "Челябинск"]]))))

(def kosmost2
  (let [event-id "E7eaCfw"
        laps 1
        points-multiplier 1.5
        multiplier-description "Ночью шел дождь и трасса стала еще грязнее сырее"]
    (concat
      [{:type         :event
        :name         "КосМост - день 2"
        :location     "п. Косой мост, Челябинская область"
        :date         "2025-07-27"
        :event-url    "https://marshalone.ru/card/2cd87e73-a487-4d68-86f6-7c3837771de2"
        :telegram-url "https://t.me/ChjAj3AVo3YTRi"
        :event-id     event-id}]

      (let [classification-id "Cg8QNM888ZM0"]
        [{:type                   :classification
          :classification-id      classification-id
          :event-id               event-id
          :order                  1
          :name                   "ЗОЛОТО"
          :equivalent             :gold
          :laps                   laps
          ;; Трек упростили по сравнению с первым днем
          :lap-difficulty         120
          :points-multiplier      points-multiplier
          :multiplier-description multiplier-description
          :started-count          9
          :laps-info?             false}

         [:type :result :event-id event-id :classification-id classification-id :position 1 :plate-number "3" :rider-id (find-rider-id "Станислав" "Максимов") :start "11:18:30" :finish "14:40:05" :total "3:21:35" :total-no-penalty "3:21:35" :penalty "0:00:00" :checkpoints-count 10 :city "Кыштым"]
         [:type :result :event-id event-id :classification-id classification-id :position 2 :plate-number "1" :rider-id (find-rider-id "Евгений" "Цицимушкин") :start "11:17:58" :finish "14:41:48" :total "3:23:50" :total-no-penalty "3:23:50" :penalty "0:00:00" :checkpoints-count 10 :city "Кыштым"]
         [:type :result :event-id event-id :classification-id classification-id :position 3 :plate-number "6" :rider-id (find-rider-id "Вячеслав" "Ярулин") :start "11:18:02" :finish "15:07:08" :total "3:49:06" :total-no-penalty "3:49:06" :penalty "0:00:00" :checkpoints-count 10 :city "Екатеринбург"]
         [:type :result :event-id event-id :classification-id classification-id :position 4 :plate-number "4" :rider-id (find-rider-id "Егор" "Емельянов") :start "11:19:09" :finish "15:41:42" :total "4:22:33" :total-no-penalty "4:22:33" :penalty "0:00:00" :checkpoints-count 10 :city "Полевской"]
         [:type :result :event-id event-id :classification-id classification-id :position 5 :plate-number "8" :rider-id (find-rider-id "Николай" "Швед") :start "11:19:35" :finish "15:47:23" :total "4:27:48" :total-no-penalty "4:27:48" :penalty "0:00:00" :checkpoints-count 10 :city "Магнитогорск"]
         [:type :result :event-id event-id :classification-id classification-id :position 6 :plate-number "10" :rider-id (find-rider-id "Михаил" "Ушаков") :start "11:19:13" :finish "16:58:30" :total "5:39:17" :total-no-penalty "5:39:17" :penalty "0:00:00" :checkpoints-count 10 :city "Тюмень"]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "11" :rider-id (find-rider-id "Александр" "Миронов") :start "11:20:09" :finish "19:21:33" :total "8:01:24" :total-no-penalty "8:01:24" :penalty "0:00:00" :checkpoints-count 10 :city "Сургут" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "9" :rider-id (find-rider-id "Денис" "Медведюк") :start "11:19:37" :finish "15:15:06" :total "сошел" :total-no-penalty "сошел" :penalty "—" :checkpoints-count nil :city "Тюмень" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "2" :rider-id (find-rider-id "Павел" "Лядецкий") :start "11:18:33" :finish "12:06:52" :total "сошел" :total-no-penalty "сошел" :penalty "—" :checkpoints-count nil :city "Челябинск" :dnf? true]])

      (let [classification-id "CJB7l9HT600"]
        [{:type                   :classification
          :classification-id      classification-id
          :event-id               event-id
          :order                  2
          :name                   "СЕРЕБРО"
          :equivalent             :silver
          :laps                   laps
          ;; Трек упростили по сравнению с первым днем
          :lap-difficulty         90
          :points-multiplier      points-multiplier
          :multiplier-description multiplier-description
          :started-count          17
          :laps-info?             false}

         [:type :result :event-id event-id :classification-id classification-id :position 1 :plate-number "101" :rider-id (find-rider-id "Егор" "Харитонов") :start "11:20:33" :finish "15:38:33" :total "4:18:00" :total-no-penalty "4:18:00" :penalty "0:00:00" :checkpoints-count 10 :city "Озерск"]
         [:type :result :event-id event-id :classification-id classification-id :position 2 :plate-number "108" :rider-id (find-rider-id "Константин" "Романов") :start "11:21:33" :finish "15:46:40" :total "4:25:07" :total-no-penalty "4:25:07" :penalty "0:00:00" :checkpoints-count 10 :city "Челябинск"]
         [:type :result :event-id event-id :classification-id classification-id :position 3 :plate-number "102" :rider-id (find-rider-id "Виктор" "Цыбулин") :start "11:21:02" :finish "15:49:10" :total "4:28:08" :total-no-penalty "4:28:08" :penalty "0:00:00" :checkpoints-count 10 :city "Тюмень"]
         [:type :result :event-id event-id :classification-id classification-id :position 4 :plate-number "110" :rider-id (find-rider-id "Евгений" "Журавский") :start "11:24:01" :finish "16:02:05" :total "4:38:04" :total-no-penalty "4:38:04" :penalty "0:00:00" :checkpoints-count 10 :city "Пермь"]
         [:type :result :event-id event-id :classification-id classification-id :position 5 :plate-number "107" :rider-id (find-rider-id "Алексей" "Кокорин") :start "11:21:30" :finish "16:06:48" :total "4:45:18" :total-no-penalty "4:45:18" :penalty "0:00:00" :checkpoints-count 10 :city "Курган"]
         [:type :result :event-id event-id :classification-id classification-id :position 6 :plate-number "114" :rider-id (find-rider-id "Владимир" "Бодрин") :start "11:22:35" :finish "16:11:46" :total "4:49:11" :total-no-penalty "4:49:11" :penalty "0:00:00" :checkpoints-count 10 :city "Магнитогорск"]
         [:type :result :event-id event-id :classification-id classification-id :position 7 :plate-number "109" :rider-id (find-rider-id "Денис" "Зараменских") :start "11:22:01" :finish "16:11:48" :total "4:49:47" :total-no-penalty "4:49:47" :penalty "0:00:00" :checkpoints-count 10 :city "Коркино"]
         [:type :result :event-id event-id :classification-id classification-id :position 8 :plate-number "106" :rider-id (find-rider-id "Артем" "Свяжин") :start "11:21:04" :finish "15:43:49" :total "4:52:45" :total-no-penalty "4:22:45" :penalty "0:30:00" :checkpoints-count 10 :city "Екатеринбург"]
         [:type :result :event-id event-id :classification-id classification-id :position 9 :plate-number "113" :rider-id (find-rider-id "Илья" "Кузнецов") :start "11:22:03" :finish "16:22:00" :total "4:59:57" :total-no-penalty "4:59:57" :penalty "0:00:00" :checkpoints-count 10 :city "Екатеринбург"]
         [:type :result :event-id event-id :classification-id classification-id :position 10 :plate-number "111" :rider-id (find-rider-id "Вадим" "Лугаськов") :start "11:20:35" :finish "16:22:26" :total "5:01:51" :total-no-penalty "5:01:51" :penalty "0:00:00" :checkpoints-count 10 :city "Ревда"]
         [:type :result :event-id event-id :classification-id classification-id :position 11 :plate-number "118" :rider-id (find-rider-id "Алексей" "Семилетов") :start "11:22:33" :finish "16:00:39" :total "5:38:06" :total-no-penalty "4:38:06" :penalty "1:00:00" :checkpoints-count 8 :city "Курган"]
         [:type :result :event-id event-id :classification-id classification-id :position 12 :plate-number "131" :rider-id (find-rider-id "Ильфар" "Сарваров") :start "11:23:34" :finish "17:27:49" :total "6:34:15" :total-no-penalty "6:04:15" :penalty "0:30:00" :checkpoints-count 9 :city "Сургут"]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "133" :rider-id (find-rider-id "Андрей" "Полномочнов") :start "11:23:31" :finish "18:40:04" :total "10:46:33" :total-no-penalty "7:16:33" :penalty "3:30:00" :checkpoints-count 3 :city "Сургут" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "140" :rider-id (find-rider-id "Максим" "Кузнецов") :start "11:24:04" :finish "16:50:20" :total "сошел" :total-no-penalty "сошел" :penalty "—" :checkpoints-count nil :city "Сургут" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "136" :rider-id (find-rider-id "Андрей" "Азегов") :start "11:23:02" :finish "16:50:13" :total "сошел" :total-no-penalty "сошел" :penalty "—" :checkpoints-count nil :city "Нижневартовск" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "132" :rider-id (find-rider-id "Владимир" "Воронин") :start "11:23:06" :finish "14:41:01" :total "сошел" :total-no-penalty "сошел" :penalty "—" :checkpoints-count nil :city "Нижневартовск" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "137" :rider-id (find-rider-id "Антон" "Зырянов") :start "11:14:00" :finish "12:00:00" :total "сошел" :total-no-penalty "сошел" :penalty "—" :checkpoints-count nil :city "Магнитогорск" :dnf? true]])

      (let [classification-id "CGC4L5Een3bY"]
        [{:type                   :classification
          :classification-id      classification-id
          :event-id               event-id
          :order                  3
          :name                   "БРОНЗА"
          :equivalent             :bronze
          :laps                   laps
          ;; Трек упростили по сравнению с первым днем
          :lap-difficulty         60
          :points-multiplier      points-multiplier
          :multiplier-description multiplier-description
          :started-count          24
          :laps-info?             false}

         [:type :result :event-id event-id :classification-id classification-id :position 1 :plate-number "211" :rider-id (find-rider-id "Александр" "Бескровный") :start "11:26:29" :finish "14:56:56" :total "3:30:27" :total-no-penalty "3:30:27" :penalty "0:00:00" :checkpoints-count 9 :city "Челябинск"]
         [:type :result :event-id event-id :classification-id classification-id :position 2 :plate-number "212" :rider-id (find-rider-id "Александр" "Зверев") :start "11:26:31" :finish "15:17:21" :total "3:50:50" :total-no-penalty "3:50:50" :penalty "0:00:00" :checkpoints-count 9 :city "Златоуст"]
         [:type :result :event-id event-id :classification-id classification-id :position 3 :plate-number "202" :rider-id (find-rider-id "Василий" "Решетков") :start "11:24:34" :finish "14:53:59" :total "3:59:25" :total-no-penalty "3:29:25" :penalty "0:30:00" :checkpoints-count 8 :city "Еманжелинск"]
         [:type :result :event-id event-id :classification-id classification-id :position 4 :plate-number "208" :rider-id (find-rider-id "Арсен" "Байрамуков") :start "11:26:04" :finish "15:41:22" :total "4:15:18" :total-no-penalty "4:15:18" :penalty "0:00:00" :checkpoints-count 9 :city "Златоуст"]
         [:type :result :event-id event-id :classification-id classification-id :position 5 :plate-number "204" :rider-id (find-rider-id "Владимир" "Тясин") :start "11:25:01" :finish "15:55:20" :total "4:30:19" :total-no-penalty "4:30:19" :penalty "0:00:00" :checkpoints-count 9 :city "Екатеринбург"]
         [:type :result :event-id event-id :classification-id classification-id :position 6 :plate-number "201" :rider-id (find-rider-id "Дмитрий" "Тимошевский") :start "11:24:31" :finish "16:08:49" :total "4:44:18" :total-no-penalty "4:44:18" :penalty "0:00:00" :checkpoints-count 9 :city "Челябинск"]
         [:type :result :event-id event-id :classification-id classification-id :position 7 :plate-number "222" :rider-id (find-rider-id "Александр" "Полянин") :start "11:27:02" :finish "16:33:04" :total "5:06:02" :total-no-penalty "5:06:02" :penalty "0:00:00" :checkpoints-count 9 :city "Златоуст"]
         [:type :result :event-id event-id :classification-id classification-id :position 8 :plate-number "223" :rider-id (find-rider-id "Сергей" "Баранов") :start "11:26:59" :finish "16:35:43" :total "5:08:44" :total-no-penalty "5:08:44" :penalty "0:00:00" :checkpoints-count 9 :city "Нягань"]
         [:type :result :event-id event-id :classification-id classification-id :position 9 :plate-number "215" :rider-id (find-rider-id "Леонид" "Асташов") :start "11:25:30" :finish "16:41:17" :total "5:15:47" :total-no-penalty "5:15:47" :penalty "0:00:00" :checkpoints-count 9 :city "Половинный"]
         [:type :result :event-id event-id :classification-id classification-id :position 10 :plate-number "207" :rider-id (find-rider-id "Лев" "Кислицын") :start "11:26:00" :finish "16:45:21" :total "5:19:21" :total-no-penalty "5:19:21" :penalty "0:00:00" :checkpoints-count 9 :city "Кыштым"]
         [:type :result :event-id event-id :classification-id classification-id :position 11 :plate-number "219" :rider-id (find-rider-id "Вадим" "Мезенцев") :start "11:28:01" :finish "16:47:57" :total "5:19:56" :total-no-penalty "5:19:56" :penalty "0:00:00" :checkpoints-count 9 :city "Карабаш"]
         [:type :result :event-id event-id :classification-id classification-id :position 12 :plate-number "248" :rider-id (find-rider-id "Александр" "Мальков") :start "11:28:03" :finish "17:14:07" :total "5:46:04" :total-no-penalty "5:46:04" :penalty "0:00:00" :checkpoints-count 9 :city "Челябинск"]
         [:type :result :event-id event-id :classification-id classification-id :position 13 :plate-number "246" :rider-id (find-rider-id "Максим" "Паршаков") :start "11:27:31" :finish "17:29:54" :total "6:02:23" :total-no-penalty "6:02:23" :penalty "0:00:00" :checkpoints-count 9 :city "Челябинск"]
         [:type :result :event-id event-id :classification-id classification-id :position 14 :plate-number "247" :rider-id (find-rider-id "Александр" "Копытов") :start "11:27:34" :finish "17:36:07" :total "6:08:33" :total-no-penalty "6:08:33" :penalty "0:00:00" :checkpoints-count 9 :city "Челябинск"]
         [:type :result :event-id event-id :classification-id classification-id :position 15 :plate-number "228" :rider-id (find-rider-id "Александр" "Беспалов") :start "11:28:30" :finish "16:58:03" :total "6:29:33" :total-no-penalty "5:29:33" :penalty "1:00:00" :checkpoints-count 7 :city "Челябинск"]
         [:type :result :event-id event-id :classification-id classification-id :position 16 :plate-number "230" :rider-id (find-rider-id "Илья" "Ефимов") :start "11:29:01" :finish "17:48:59" :total "7:49:58" :total-no-penalty "6:19:58" :penalty "1:30:00" :checkpoints-count 6 :city "Каменск-Уральский"]
         [:type :result :event-id event-id :classification-id classification-id :position 17 :plate-number "257" :rider-id (find-rider-id "Егор" "Красько") :start "11:29:03" :finish "17:33:16" :total "7:34:13" :total-no-penalty "6:04:13" :penalty "1:30:00" :checkpoints-count 6 :city "Челябинск"]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "234" :rider-id (find-rider-id "Егор" "Камалов") :start "11:30:40" :finish "19:03:34" :total "11:02:54" :total-no-penalty "7:32:54" :penalty "3:30:00" :checkpoints-count 2 :city "Златоуст" :timebar? true :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "259" :rider-id (find-rider-id "Сергей" "Поздеев") :start "11:31:44" :finish "15:44:19" :total "сошел" :total-no-penalty "сошел" :penalty "—" :checkpoints-count nil :city "Новая Ляля" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "242" :rider-id (find-rider-id "Станислав" "Зубков") :start "11:28:33" :finish "16:06:19" :total "сошел" :total-no-penalty "сошел" :penalty "—" :checkpoints-count nil :city "Челябинск" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "260" :rider-id (find-rider-id "Сергей" "Горбенко") :start "11:29:34" :finish "15:48:57" :total "сошел" :total-no-penalty "сошел" :penalty "—" :checkpoints-count nil :city "Нижневартовск" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "258" :rider-id (find-rider-id "Дмитрий" "Смаль") :start "11:29:29" :finish "15:45:40" :total "сошел" :total-no-penalty "сошел" :penalty "—" :checkpoints-count nil :city "Нижневартовск" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "206" :rider-id (find-rider-id "Савелий" "Кунакбаев") :start "11:25:04" :finish "15:45:01" :total "сошел" :total-no-penalty "сошел" :penalty "—" :checkpoints-count nil :city "Полевской" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position nil :plate-number "232" :rider-id (find-rider-id "Алексей" "Захаров") :start "11:25:32" :finish "12:06:33" :total "сошел" :total-no-penalty "сошел" :penalty "—" :checkpoints-count nil :city "Екатеринбург" :dnf? true]]))))

(def gornaz
  (let [event-id "EwVvETw"
        laps 1
        points-multiplier 0.8
        multiplier-description "Было прямо сухо-сухо, поэтому ехалось ощутимо легче чем в прошлом году"
        ]
    (concat
      [{:type         :event
        :name         "Горназ - Затерянный мир"
        :location     "г. Горнозаводск, Пермский край"
        :date         "2025-08-10"
        :event-url    "https://enduro-club.ru/745"
        :telegram-url "https://t.me/gornaz_enduro"
        :event-id     event-id}]

      (let [classification-id "CRwAtd8UHp3s"]
        [{:type              :classification
          :classification-id classification-id
          :event-id          event-id
          :order             1
          :name              "Золото"
          :equivalent        :gold
          :laps              laps
          ;; Тут не уверен - не знаю какой трек в горназе у золота по сложности
          :lap-difficulty    300
          :points-multiplier points-multiplier
          :multiplier-description multiplier-description
          :started-count     22
          :laps-info?        false}

         [:type :result :event-id event-id :classification-id classification-id :position 1 :plate-number "11" :rider-id (find-rider-id "Дмитрий" "Рогожкин") :start "09:00:00" :finish "13:13:44" :total "04:13:44" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 2 :plate-number "20" :rider-id (find-rider-id "Евгений" "Цицимушкин") :start "09:00:30" :finish "13:33:34" :total "04:33:04" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 3 :plate-number "21" :rider-id (find-rider-id "Николай" "Кокорин") :start "09:00:00" :finish "13:40:14" :total "04:40:14" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 4 :plate-number "23" :rider-id (find-rider-id "Виталий" "Клеменков") :start "09:02:30" :finish "14:01:57" :total "04:59:27" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 5 :plate-number "3" :rider-id (find-rider-id "Александр" "Караксин") :start "09:00:30" :finish "14:03:52" :total "05:03:22" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 6 :plate-number "18" :rider-id (find-rider-id "Максим" "Золотов") :start "09:02:30" :finish "14:19:48" :total "05:17:18" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 7 :plate-number "14" :rider-id (find-rider-id "Максим" "Львов") :start "09:00:30" :finish "14:18:56" :total "05:18:26" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 8 :plate-number "6" :rider-id (find-rider-id "Кирилл" "Кириллов") :start "09:03:00" :finish "14:24:30" :total "05:21:30" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 9 :plate-number "15" :rider-id (find-rider-id "Дмитрий" "Молчанов") :start "09:01:00" :finish "14:39:47" :total "05:38:47" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 10 :plate-number "5" :rider-id (find-rider-id "Григорий" "Альматов") :start "09:03:00" :finish "14:50:32" :total "05:47:32" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 11 :plate-number "9" :rider-id (find-rider-id "Михаил" "Ушаков") :start "09:04:30" :finish "15:13:32" :total "06:09:02" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 12 :plate-number "10" :rider-id (find-rider-id "Алексей" "Казаков") :start "09:04:00" :finish "14:45:30" :total "06:11:30" :penalty "30"]
         [:type :result :event-id event-id :classification-id classification-id :position 13 :plate-number "17" :rider-id (find-rider-id "Виталий" "Саитов") :start "09:02:00" :finish "15:15:34" :total "06:13:34" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 14 :plate-number "7" :rider-id (find-rider-id "Вячеслав" "Ярулин") :start "09:01:00" :finish "14:41:49" :total "06:20:49" :penalty "40"]
         [:type :result :event-id event-id :classification-id classification-id :position 15 :plate-number "19" :rider-id (find-rider-id "Дамир" "Юсупов") :start "09:03:30" :finish "15:30:01" :total "06:26:31" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 16 :plate-number "8" :rider-id (find-rider-id "Николай" "Швед") :start "09:04:30" :finish "15:46:03" :total "06:41:33" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 17 :plate-number "2" :rider-id (find-rider-id "Андрей" "Рогожников") :start "09:01:00" :finish "15:50:32" :total "06:49:32" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 18 :plate-number "4" :rider-id (find-rider-id "Игорь" "Дунин") :start "09:03:30" :finish "16:03:29" :total "06:59:59" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 19 :plate-number "1" :rider-id (find-rider-id "Владимир" "Федотов") :start "09:04:00" :finish "17:46:59" :total "08:42:59" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 20 :plate-number "12" :rider-id (find-rider-id "Александр" "Фёдоров") :start "09:05:00" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 21 :plate-number "13" :rider-id (find-rider-id "Роберт" "Рахимов") :start "09:05:00" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 22 :plate-number "16" :rider-id (find-rider-id "Вадим" "Черевко") :start "09:02:00" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         ])
      (let [classification-id "CNIgmBLCMjrw"]
        [{:type              :classification
          :classification-id classification-id
          :event-id          event-id
          :order             2
          :name              "Серебро"
          :equivalent        :silver
          :laps              laps
          ;; Как-то так, трек ощутимо сложнее чем СЛГ плюс один круг на все про все
          :lap-difficulty    200
          :points-multiplier points-multiplier
          :multiplier-description multiplier-description
          :started-count     77
          :laps-info?        false}

         [:type :result :event-id event-id :classification-id classification-id :position 1 :plate-number "51" :rider-id (find-rider-id "Артур" "Хатмуллин") :start "09:07:00" :finish "12:29:40" :total "03:22:40" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 2 :plate-number "82" :rider-id (find-rider-id "Александр" "Лабутин") :start "09:06:30" :finish "12:34:41" :total "03:28:11" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 3 :plate-number "68" :rider-id (find-rider-id "Матвей" "Захаров") :start "09:07:00" :finish "12:50:32" :total "03:43:32" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 4 :plate-number "57" :rider-id (find-rider-id "Денис" "Шилов") :start "09:08:30" :finish "12:52:51" :total "03:44:21" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 5 :plate-number "52" :rider-id (find-rider-id "Евгений" "Журавский") :start "09:09:30" :finish "12:57:29" :total "03:47:59" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 6 :plate-number "87" :rider-id (find-rider-id "Вячеслав" "Макаров") :start "09:17:30" :finish "13:07:25" :total "03:49:55" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 7 :plate-number "91" :rider-id (find-rider-id "Евгений" "Боярских") :start "09:08:00" :finish "13:02:27" :total "03:54:27" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 8 :plate-number "127" :rider-id (find-rider-id "Артем" "Свяжин") :start "09:18:30" :finish "13:15:11" :total "03:56:41" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 9 :plate-number "55" :rider-id (find-rider-id "Илья" "Полежаев") :start "09:10:00" :finish "13:11:12" :total "04:01:12" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 10 :plate-number "89" :rider-id (find-rider-id "Александр" "Удачин") :start "09:07:30" :finish "13:10:35" :total "04:03:05" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 11 :plate-number "113" :rider-id (find-rider-id "Владимир" "Килунин") :start "09:13:30" :finish "13:28:36" :total "04:15:06" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 12 :plate-number "90" :rider-id (find-rider-id "Александр" "Миронов") :start "09:15:00" :finish "13:33:10" :total "04:18:10" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 13 :plate-number "94" :rider-id (find-rider-id "Виталий" "Голов") :start "09:08:30" :finish "13:27:03" :total "04:18:33" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 14 :plate-number "110" :rider-id (find-rider-id "Евгений" "Путов") :start "09:16:00" :finish "13:35:31" :total "04:19:31" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 15 :plate-number "105" :rider-id (find-rider-id "Роман" "Кузнецов") :start "09:09:00" :finish "13:28:33" :total "04:19:33" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 16 :plate-number "61" :rider-id (find-rider-id "Дмитрий" "Аверин") :start "09:13:00" :finish "13:33:01" :total "04:20:01" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 17 :plate-number "99" :rider-id (find-rider-id "Денис" "Земцов") :start "09:14:30" :finish "13:35:09" :total "04:20:39" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 18 :plate-number "79" :rider-id (find-rider-id "Алексей" "Кокорин") :start "09:14:30" :finish "13:37:28" :total "04:22:58" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 19 :plate-number "76" :rider-id (find-rider-id "Илья" "Кузнецов") :start "09:11:00" :finish "13:35:28" :total "04:24:28" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 20 :plate-number "131" :rider-id (find-rider-id "Артем" "Копытов") :start "09:14:00" :finish "13:38:58" :total "04:24:58" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 21 :plate-number "134" :rider-id (find-rider-id "Степан" "Филатов") :start "09:07:30" :finish "13:33:29" :total "04:25:59" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 22 :plate-number "80" :rider-id (find-rider-id "Артем" "Калинин") :start "09:24:30" :finish "13:11:05" :total "04:26:35" :penalty "40"]
         [:type :result :event-id event-id :classification-id classification-id :position 23 :plate-number "62" :rider-id (find-rider-id "Юрий" "Бороздин") :start "09:13:30" :finish "13:40:36" :total "04:27:06" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 24 :plate-number "54" :rider-id (find-rider-id "Дмитрий" "Колобов") :start "09:16:30" :finish "13:43:41" :total "04:27:11" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 25 :plate-number "122" :rider-id (find-rider-id "Антон" "Швецов") :start "09:12:00" :finish "13:40:57" :total "04:28:57" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 26 :plate-number "75" :rider-id (find-rider-id "Антон" "Толкачев") :start "09:09:30" :finish "13:39:07" :total "04:29:37" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 27 :plate-number "81" :rider-id (find-rider-id "Султан" "Хабибрахманов") :start "09:12:00" :finish "13:41:51" :total "04:29:51" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 28 :plate-number "128" :rider-id (find-rider-id "Тимофей" "Максимов") :start "09:14:00" :finish "13:48:30" :total "04:34:30" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 29 :plate-number "125" :rider-id (find-rider-id "Александр" "Попцов") :start "09:12:30" :finish "13:47:59" :total "04:35:29" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 30 :plate-number "58" :rider-id (find-rider-id "Алексей" "Семилетов") :start "09:09:00" :finish "13:54:24" :total "04:45:24" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 31 :plate-number "69" :rider-id (find-rider-id "Евгений" "Данилов") :start "09:20:30" :finish "14:06:11" :total "04:45:41" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 32 :plate-number "53" :rider-id (find-rider-id "Александр" "Вебер") :start "09:15:30" :finish "14:02:46" :total "04:47:16" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 33 :plate-number "133" :rider-id (find-rider-id "Александр" "Симачёв") :start "09:20:30" :finish "14:07:51" :total "04:47:21" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 34 :plate-number "124" :rider-id (find-rider-id "Иван" "Швейкерт") :start "09:20:00" :finish "14:10:44" :total "04:50:44" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 35 :plate-number "103" :rider-id (find-rider-id "Константин" "Кетов") :start "09:24:00" :finish "14:20:43" :total "04:56:43" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 36 :plate-number "96" :rider-id (find-rider-id "Андрей" "Склюев") :start "09:15:00" :finish "14:12:23" :total "04:57:23" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 37 :plate-number "88" :rider-id (find-rider-id "Александр" "Плаксин") :start "09:12:30" :finish "14:10:51" :total "04:58:21" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 38 :plate-number "108" :rider-id (find-rider-id "Владимир" "Бодрин") :start "09:10:30" :finish "14:13:01" :total "05:02:31" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 39 :plate-number "93" :rider-id (find-rider-id "Иван" "Филиппов") :start "09:16:00" :finish "14:20:48" :total "05:04:48" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 40 :plate-number "95" :rider-id (find-rider-id "Илья" "Садовой") :start "09:10:30" :finish "14:15:20" :total "05:04:50" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 41 :plate-number "63" :rider-id (find-rider-id "Сергей" "Кондратьев") :start "09:11:00" :finish "14:16:53" :total "05:05:53" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 42 :plate-number "92" :rider-id (find-rider-id "Ильфар" "Сарваров") :start "09:10:00" :finish "14:18:24" :total "05:08:24" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 43 :plate-number "116" :rider-id (find-rider-id "Александр" "Мельников") :start "09:19:30" :finish "14:28:23" :total "05:08:53" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 44 :plate-number "109" :rider-id (find-rider-id "Игорь" "Ситников") :start "09:13:00" :finish "14:28:55" :total "05:15:55" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 45 :plate-number "97" :rider-id (find-rider-id "Евгений" "Белькевич") :start "09:17:00" :finish "14:47:30" :total "05:30:30" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 46 :plate-number "83" :rider-id (find-rider-id "Александр" "Отинов") :start "09:17:00" :finish "14:47:34" :total "05:30:34" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 47 :plate-number "98" :rider-id (find-rider-id "Евгений" "Киселёв") :start "09:18:00" :finish "14:53:04" :total "05:35:04" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 48 :plate-number "56" :rider-id (find-rider-id "Артём" "Душин") :start "09:11:30" :finish "14:47:36" :total "05:36:06" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 49 :plate-number "100" :rider-id (find-rider-id "Максим" "Клевцов") :start "09:16:30" :finish "14:53:04" :total "05:36:34" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 50 :plate-number "59" :rider-id (find-rider-id "Матвей" "Степанов") :start "09:18:00" :finish "14:55:58" :total "05:57:58" :penalty "20"]
         [:type :result :event-id event-id :classification-id classification-id :position 51 :plate-number "121" :rider-id (find-rider-id "Анатолий" "Харитонов") :start "09:19:00" :finish "15:21:15" :total "06:02:15" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 52 :plate-number "129" :rider-id (find-rider-id "Максим" "Кузнецов") :start "09:20:00" :finish "15:25:55" :total "06:05:55" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 53 :plate-number "115" :rider-id (find-rider-id "Леонид" "Леонтьев") :start "09:17:30" :finish "15:25:00" :total "06:07:30" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 54 :plate-number "114" :rider-id (find-rider-id "Сергей" "Демаков") :start "09:21:30" :finish "15:30:37" :total "06:09:07" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 55 :plate-number "126" :rider-id (find-rider-id "Алексей" "Петров") :start "09:22:00" :finish "15:34:56" :total "06:12:56" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 56 :plate-number "64" :rider-id (find-rider-id "Андрей" "Бадьин") :start "09:11:30" :finish "13:29:03" :total "06:17:33" :penalty "120"]
         [:type :result :event-id event-id :classification-id classification-id :position 57 :plate-number "70" :rider-id (find-rider-id "Максим" "Моторин") :start "09:23:00" :finish "15:51:48" :total "06:28:48" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 58 :plate-number "73" :rider-id (find-rider-id "Александр" "Петров") :start "09:22:30" :finish "15:53:00" :total "06:30:30" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 59 :plate-number "72" :rider-id (find-rider-id "Владислав" "Чибаков") :start "09:19:00" :finish "15:52:13" :total "06:33:13" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 60 :plate-number "86" :rider-id (find-rider-id "Александр" "Мугулов") :start "09:15:30" :finish "15:51:52" :total "06:36:22" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 61 :plate-number "112" :rider-id (find-rider-id "Сергей" "Репин") :start "09:25:00" :finish "16:06:34" :total "06:41:34" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 62 :plate-number "74" :rider-id (find-rider-id "Ален" "Кокшаров") :start "09:19:30" :finish "15:12:40" :total "07:53:10" :penalty "120"]
         [:type :result :event-id event-id :classification-id classification-id :position 63 :plate-number "107" :rider-id (find-rider-id "Иван" "Абрамов") :start "09:22:30" :finish "13:04:40" :total "03:42:10" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 64 :plate-number "130" :rider-id (find-rider-id "Евгений" "Беспятых") :start "09:18:30" :finish "14:38:32" :total "05:20:02" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 65 :plate-number "119" :rider-id (find-rider-id "Андрей" "Азегов") :start "09:21:00" :finish "15:42:24" :total "06:21:24" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 66 :plate-number "132" :rider-id (find-rider-id "Артем" "Максимовских") :start "09:22:00" :finish "16:01:04" :total "06:39:04" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 67 :plate-number "66" :rider-id (find-rider-id "Дмитрий" "Волегов") :start "09:23:00" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 68 :plate-number "67" :rider-id (find-rider-id "Александр" "Мерзляков") :start "09:23:30" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 69 :plate-number "77" :rider-id (find-rider-id "Виктор" "Юшков") :start "09:08:00" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 70 :plate-number "78" :rider-id (find-rider-id "Егор" "Калинин") :start "09:24:30" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 71 :plate-number "84" :rider-id (find-rider-id "Александр" "Савонин") :start "09:23:30" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 72 :plate-number "106" :rider-id (find-rider-id "Юлий" "Вискунов") :start "09:24:00" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 73 :plate-number "111" :rider-id (find-rider-id "Павел" "Иванов") :start "09:25:00" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 74 :plate-number "117" :rider-id (find-rider-id "Максим" "Гладких") :start "09:25:30" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 75 :plate-number "118" :rider-id (find-rider-id "Максим" "Макаров") :start "09:21:00" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 76 :plate-number "120" :rider-id (find-rider-id "Олег" "Галкин") :start "09:21:30" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 77 :plate-number "123" :rider-id (find-rider-id "Илья" "Баранов") :start "09:06:30" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]])

      (let [classification-id "CwqxS9ZaWL8"]
        [{:type              :classification
          :classification-id classification-id
          :event-id          event-id
          :order             3
          :name              "Бронза"
          :equivalent        :bronze
          :laps              laps
          :lap-difficulty    100
          :points-multiplier points-multiplier
          :multiplier-description multiplier-description
          :started-count     133
          :laps-info?        false}

         [:type :result :event-id event-id :classification-id classification-id :position 1 :plate-number "260" :rider-id (find-rider-id "Сергей" "Киселев") :start "09:33:30" :finish "12:06:26" :total "02:32:56" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 2 :plate-number "161" :rider-id (find-rider-id "Евгений" "Мирзаметов") :start "09:31:00" :finish "12:05:27" :total "02:34:27" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 3 :plate-number "152" :rider-id (find-rider-id "Игорь" "Солодовник") :start "09:27:30" :finish "12:06:31" :total "02:39:01" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 4 :plate-number "182" :rider-id (find-rider-id "Юрий" "Варанкин") :start "09:29:30" :finish "12:12:07" :total "02:42:37" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 5 :plate-number "213" :rider-id (find-rider-id "Антон" "Карелин") :start "09:27:00" :finish "12:10:44" :total "02:43:44" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 6 :plate-number "281" :rider-id (find-rider-id "Владимир" "Шестаков") :start "09:27:00" :finish "12:11:23" :total "02:44:23" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 7 :plate-number "191" :rider-id (find-rider-id "Александр" "Рахмеев") :start "09:34:30" :finish "12:19:09" :total "02:44:39" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 8 :plate-number "257" :rider-id (find-rider-id "Виталий" "Грачев") :start "09:29:30" :finish "12:15:11" :total "02:45:41" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 9 :plate-number "177" :rider-id (find-rider-id "Семен" "Отинов") :start "09:35:30" :finish "12:24:24" :total "02:48:54" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 10 :plate-number "163" :rider-id (find-rider-id "Никита" "Овчинников") :start "09:27:30" :finish "12:16:29" :total "02:48:59" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 11 :plate-number "265" :rider-id (find-rider-id "Владимир" "Киселёв") :start "09:36:30" :finish "12:27:16" :total "02:50:46" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 12 :plate-number "275" :rider-id (find-rider-id "Михаил" "Тясин") :start "09:31:00" :finish "12:25:07" :total "02:54:07" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 13 :plate-number "251" :rider-id (find-rider-id "Евгений" "Сухоносов") :start "09:43:00" :finish "12:37:57" :total "02:54:57" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 14 :plate-number "284" :rider-id (find-rider-id "Василий" "Решетков") :start "09:33:30" :finish "12:28:36" :total "02:55:06" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 15 :plate-number "190" :rider-id (find-rider-id "Денис" "Козлов") :start "09:29:00" :finish "12:24:22" :total "02:55:22" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 16 :plate-number "285" :rider-id (find-rider-id "Дмитрий" "Тимошевский") :start "09:28:30" :finish "12:28:35" :total "03:00:05" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 17 :plate-number "210" :rider-id (find-rider-id "Данил" "Кварацхелия") :start "09:32:30" :finish "12:34:09" :total "03:01:39" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 18 :plate-number "200" :rider-id (find-rider-id "Никита" "Завьялов") :start "09:40:00" :finish "12:41:50" :total "03:01:50" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 19 :plate-number "230" :rider-id (find-rider-id "Евгений" "Ярославцев") :start "09:32:00" :finish "12:34:06" :total "03:02:06" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 20 :plate-number "271" :rider-id (find-rider-id "Александр" "Перевозчиков") :start "09:30:30" :finish "12:33:00" :total "03:02:30" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 21 :plate-number "185" :rider-id (find-rider-id "Леонид" "Асташов") :start "09:37:00" :finish "12:39:34" :total "03:02:34" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 22 :plate-number "164" :rider-id (find-rider-id "Егор" "Шаравьёв") :start "09:37:30" :finish "12:40:16" :total "03:02:46" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 23 :plate-number "192" :rider-id (find-rider-id "Антон" "Коробейников") :start "09:32:30" :finish "12:35:46" :total "03:03:16" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 24 :plate-number "231" :rider-id (find-rider-id "Владимир" "Тясин") :start "09:34:00" :finish "12:37:30" :total "03:03:30" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 25 :plate-number "155" :rider-id (find-rider-id "Максим" "Кокшаров") :start "09:30:00" :finish "12:34:41" :total "03:04:41" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 26 :plate-number "272" :rider-id (find-rider-id "Аркадий" "Баландин") :start "09:28:00" :finish "12:34:42" :total "03:06:42" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 27 :plate-number "283" :rider-id (find-rider-id "Артем" "Тараненко") :start "09:35:30" :finish "12:42:48" :total "03:07:18" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 28 :plate-number "301" :rider-id (find-rider-id "Дмитрий" "Аленьковский") :start "09:37:00" :finish "12:47:09" :total "03:10:09" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 29 :plate-number "234" :rider-id (find-rider-id "Валерий" "Попов") :start "09:41:30" :finish "12:54:05" :total "03:12:35" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 30 :plate-number "184" :rider-id (find-rider-id "Антон" "Титов") :start "09:43:00" :finish "12:55:44" :total "03:12:44" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 31 :plate-number "238" :rider-id (find-rider-id "Алексей" "Захаров") :start "09:33:00" :finish "12:46:17" :total "03:13:17" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 32 :plate-number "299" :rider-id (find-rider-id "Денис" "Чистополов") :start "09:43:30" :finish "12:59:06" :total "03:15:36" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 33 :plate-number "193" :rider-id (find-rider-id "Денис" "Миков") :start "09:34:00" :finish "12:49:39" :total "03:15:39" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 34 :plate-number "176" :rider-id (find-rider-id "Иван" "Ведерников") :start "09:40:30" :finish "12:56:12" :total "03:15:42" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 35 :plate-number "291" :rider-id (find-rider-id "Роман" "Афанасьев") :start "09:39:00" :finish "12:55:47" :total "03:16:47" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 36 :plate-number "295" :rider-id (find-rider-id "Иван" "Колягин") :start "09:46:30" :finish "13:03:45" :total "03:17:15" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 37 :plate-number "290" :rider-id (find-rider-id "Максим" "Суслопаров") :start "09:31:30" :finish "12:51:04" :total "03:19:34" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 38 :plate-number "286" :rider-id (find-rider-id "Антон" "Зырянов") :start "09:46:30" :finish "13:07:24" :total "03:20:54" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 39 :plate-number "248" :rider-id (find-rider-id "Евгений" "Баштовой") :start "09:28:00" :finish "12:51:09" :total "03:23:09" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 40 :plate-number "214" :rider-id (find-rider-id "Амир" "Сарваритдинов") :start "09:45:30" :finish "13:10:02" :total "03:24:32" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 41 :plate-number "278" :rider-id (find-rider-id "Даниил" "Саначёв") :start "09:38:30" :finish "13:03:35" :total "03:25:05" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 42 :plate-number "198" :rider-id (find-rider-id "Алексей" "Ложкин") :start "09:50:00" :finish "13:15:09" :total "03:25:09" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 43 :plate-number "181" :rider-id (find-rider-id "Дмитрий" "Мальцев") :start "09:30:30" :finish "12:55:40" :total "03:25:10" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 44 :plate-number "282" :rider-id (find-rider-id "Михаил" "Захаров") :start "09:29:00" :finish "12:55:40" :total "03:26:40" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 45 :plate-number "256" :rider-id (find-rider-id "Андрей" "Мальчиков") :start "09:49:30" :finish "13:16:57" :total "03:27:27" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 46 :plate-number "208" :rider-id (find-rider-id "Константин" "Табанин") :start "09:42:00" :finish "13:09:43" :total "03:27:43" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 47 :plate-number "288" :rider-id (find-rider-id "Владимир" "Носков") :start "09:33:00" :finish "13:01:52" :total "03:28:52" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 48 :plate-number "298" :rider-id (find-rider-id "Константин" "Васильев") :start "09:38:30" :finish "13:07:40" :total "03:29:10" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 49 :plate-number "166" :rider-id (find-rider-id "Артём" "Кислухин") :start "09:38:00" :finish "13:11:22" :total "03:33:22" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 50 :plate-number "211" :rider-id (find-rider-id "Владимир" "Додонов") :start "09:34:30" :finish "13:21:23" :total "03:46:53" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 51 :plate-number "302" :rider-id (find-rider-id "Максим" "Кабаненко") :start "09:40:00" :finish "13:28:30" :total "03:48:30" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 52 :plate-number "264" :rider-id (find-rider-id "Даниил" "Одинцов") :start "09:43:30" :finish "13:33:55" :total "03:50:25" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 53 :plate-number "173" :rider-id (find-rider-id "Иван" "Николаев") :start "09:36:30" :finish "13:27:06" :total "03:50:36" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 54 :plate-number "195" :rider-id (find-rider-id "Александр" "Ишонин") :start "09:49:30" :finish "13:40:47" :total "03:51:17" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 55 :plate-number "205" :rider-id (find-rider-id "Владимир" "Задровский") :start "09:39:30" :finish "13:34:00" :total "03:54:30" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 56 :plate-number "280" :rider-id (find-rider-id "Алексей" "Коротаев") :start "09:42:30" :finish "13:37:31" :total "03:55:01" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 57 :plate-number "178" :rider-id (find-rider-id "Иван" "Чедаев") :start "09:53:30" :finish "13:50:06" :total "03:56:36" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 58 :plate-number "197" :rider-id (find-rider-id "Сергей" "Завьялов") :start "09:35:00" :finish "13:38:40" :total "04:03:40" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 59 :plate-number "228" :rider-id (find-rider-id "Денис" "Хунцелиа") :start "09:35:00" :finish "13:38:40" :total "04:03:40" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 60 :plate-number "263" :rider-id (find-rider-id "Иван" "Тихонов") :start "09:44:00" :finish "13:51:08" :total "04:07:08" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 61 :plate-number "250" :rider-id (find-rider-id "Анна" "Шилова") :start "09:41:00" :finish "13:49:03" :total "04:08:03" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 62 :plate-number "167" :rider-id (find-rider-id "Вадим" "Лопатин") :start "09:51:00" :finish "14:01:29" :total "04:10:29" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 63 :plate-number "189" :rider-id (find-rider-id "Александр" "Чудинов") :start "09:45:00" :finish "13:56:44" :total "04:11:44" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 64 :plate-number "194" :rider-id (find-rider-id "Данил" "Лесников") :start "09:41:30" :finish "13:55:29" :total "04:13:59" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 65 :plate-number "233" :rider-id (find-rider-id "Владимир" "Новиков") :start "09:47:30" :finish "14:02:38" :total "04:15:08" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 66 :plate-number "215" :rider-id (find-rider-id "Ростислав" "Зиязов") :start "09:32:00" :finish "13:48:53" :total "04:16:53" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 67 :plate-number "253" :rider-id (find-rider-id "Юрий" "Хицов") :start "09:50:30" :finish "14:07:56" :total "04:17:26" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 68 :plate-number "220" :rider-id (find-rider-id "Иван" "Коновалов") :start "09:39:30" :finish "13:57:09" :total "04:17:39" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 69 :plate-number "269" :rider-id (find-rider-id "Алексей" "Полыгалов") :start "09:58:30" :finish "14:16:22" :total "04:17:52" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 70 :plate-number "199" :rider-id (find-rider-id "Сергей" "Варанкин") :start "09:44:30" :finish "14:02:37" :total "04:18:07" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 71 :plate-number "172" :rider-id (find-rider-id "Сергей" "Анисимов") :start "09:37:30" :finish "13:59:45" :total "04:22:15" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 72 :plate-number "162" :rider-id (find-rider-id "Евгений" "Исупов") :start "09:49:00" :finish "14:12:21" :total "04:23:21" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 73 :plate-number "247" :rider-id (find-rider-id "Евгений" "Чурин") :start "09:31:30" :finish "13:55:25" :total "04:23:55" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 74 :plate-number "187" :rider-id (find-rider-id "Андрей" "Шаров") :start "09:57:00" :finish "14:24:02" :total "04:27:02" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 75 :plate-number "188" :rider-id (find-rider-id "Иван" "Адам") :start "09:49:00" :finish "14:17:13" :total "04:28:13" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 76 :plate-number "153" :rider-id (find-rider-id "Константин" "Лямин") :start "09:39:00" :finish "14:08:13" :total "04:29:13" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 77 :plate-number "156" :rider-id (find-rider-id "Артем" "Тимаев") :start "09:44:30" :finish "14:19:56" :total "04:35:26" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 78 :plate-number "268" :rider-id (find-rider-id "Алексей" "Злобин") :start "09:40:30" :finish "14:16:41" :total "04:36:11" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 79 :plate-number "157" :rider-id (find-rider-id "Даниил" "Жуланов") :start "09:36:00" :finish "14:16:48" :total "04:40:48" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 80 :plate-number "255" :rider-id (find-rider-id "Олег" "Сухарев") :start "09:51:00" :finish "14:31:53" :total "04:40:53" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 81 :plate-number "186" :rider-id (find-rider-id "Юрий" "Денисов") :start "09:48:00" :finish "14:29:30" :total "04:41:30" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 82 :plate-number "171" :rider-id (find-rider-id "Виктор" "Блинов") :start "09:48:00" :finish "14:29:52" :total "04:41:52" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 83 :plate-number "224" :rider-id (find-rider-id "Кирилл" "Трубников") :start "09:46:00" :finish "14:33:48" :total "04:47:48" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 84 :plate-number "169" :rider-id (find-rider-id "Дмитрий" "Прыкин") :start "09:42:00" :finish "14:37:58" :total "04:55:58" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 85 :plate-number "232" :rider-id (find-rider-id "Шамиль" "Рашитов") :start "09:28:30" :finish "14:28:08" :total "04:59:38" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 86 :plate-number "226" :rider-id (find-rider-id "Илья" "Локаткин") :start "09:47:30" :finish "14:49:56" :total "05:02:26" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 87 :plate-number "158" :rider-id (find-rider-id "Александр" "Рязанов") :start "09:51:30" :finish "14:56:54" :total "05:05:24" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 88 :plate-number "266" :rider-id (find-rider-id "Александр" "Исупов") :start "09:57:00" :finish "15:05:18" :total "05:08:18" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 89 :plate-number "243" :rider-id (find-rider-id "Вячеслав" "Хорошев") :start "09:51:30" :finish "15:04:17" :total "05:12:47" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 90 :plate-number "202" :rider-id (find-rider-id "Сергей" "Щин") :start "09:57:00" :finish "15:25:58" :total "05:28:58" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 91 :plate-number "207" :rider-id (find-rider-id "Олег" "Поленков") :start "09:54:30" :finish "15:40:53" :total "05:46:23" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 92 :plate-number "168" :rider-id (find-rider-id "Андрей" "Рякин") :start "09:56:00" :finish "15:44:48" :total "05:48:48" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 93 :plate-number "203" :rider-id (find-rider-id "Артур" "Поздеев") :start "09:44:00" :finish "15:35:04" :total "05:51:04" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 94 :plate-number "300" :rider-id (find-rider-id "Мунир" "Маннапов") :start "09:59:00" :finish "15:57:40" :total "05:58:40" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 95 :plate-number "259" :rider-id (find-rider-id "Максим" "Килин") :start "09:52:30" :finish "15:25:15" :total "06:02:45" :penalty "30"]
         [:type :result :event-id event-id :classification-id classification-id :position 96 :plate-number "180" :rider-id (find-rider-id "Матвей" "Сидоревич") :start "09:52:30" :finish "15:55:54" :total "06:03:24" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 97 :plate-number "159" :rider-id (find-rider-id "Ренат" "Юнеев") :start "09:55:30" :finish "16:16:47" :total "06:21:17" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 98 :plate-number "293" :rider-id (find-rider-id "Дмитрий" "Бурыкин") :start "09:52:00" :finish "16:27:17" :total "06:35:17" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 99 :plate-number "154" :rider-id (find-rider-id "Егор" "Пересада") :start "09:53:00" :finish "16:34:04" :total "06:41:04" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 100 :plate-number "165" :rider-id (find-rider-id "Михаил" "Даудрих") :start "09:57:30" :finish "16:48:20" :total "07:50:50" :penalty "60"]
         [:type :result :event-id event-id :classification-id classification-id :position 101 :plate-number "209" :rider-id (find-rider-id "Артём" "Лесников") :start "09:57:00" :finish "16:46:58" :total "06:49:58" :penalty "0"]
         [:type :result :event-id event-id :classification-id classification-id :position 102 :plate-number "160" :rider-id (find-rider-id "Яков" "Цыганков") :start "09:56:00" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 103 :plate-number "170" :rider-id (find-rider-id "Александр" "Кузнецов") :start "09:53:30" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 104 :plate-number "174" :rider-id (find-rider-id "Александр" "Осколков") :start "09:59:00" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 105 :plate-number "175" :rider-id (find-rider-id "Константин" "Черанёв") :start "09:30:00" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 106 :plate-number "179" :rider-id (find-rider-id "Николай" "Сосунов") :start "09:54:00" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 107 :plate-number "196" :rider-id (find-rider-id "Максим" "Соколов") :start "09:36:00" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 108 :plate-number "201" :rider-id (find-rider-id "Николай" "Ичетовкин") :start "09:48:30" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 109 :plate-number "204" :rider-id (find-rider-id "Михаил" "Митяшин") :start "09:48:30" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 110 :plate-number "206" :rider-id (find-rider-id "Сергей" "Корнилков") :start "09:50:00" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 111 :plate-number "212" :rider-id (find-rider-id "Александр" "Александровский") :start "09:54:00" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 112 :plate-number "221" :rider-id (find-rider-id "Михаил" "Антипин") :start "09:57:00" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 113 :plate-number "223" :rider-id (find-rider-id "Антон" "Мохов") :start "09:50:30" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 114 :plate-number "225" :rider-id (find-rider-id "Павел" "Коновалов") :start "09:41:00" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 115 :plate-number "236" :rider-id (find-rider-id "Николай" "Глущенко") :start "09:55:30" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 116 :plate-number "239" :rider-id (find-rider-id "Роман" "Иванов") :start "09:54:30" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 117 :plate-number "241" :rider-id (find-rider-id "Дмитрий" "Холкин") :start "09:46:00" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 118 :plate-number "242" :rider-id (find-rider-id "Алексей" "Жуков") :start "09:57:30" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 119 :plate-number "244" :rider-id (find-rider-id "Егор" "Тиунов") :start "09:58:00" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 120 :plate-number "245" :rider-id (find-rider-id "Роман" "Данилевский") :start "09:55:00" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 121 :plate-number "252" :rider-id (find-rider-id "Александр" "Дубовой") :start "09:52:00" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 122 :plate-number "254" :rider-id (find-rider-id "Вячеслав" "Попков") :start "09:55:00" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 123 :plate-number "261" :rider-id (find-rider-id "Сергей" "Поздеев") :start "09:45:00" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 124 :plate-number "262" :rider-id (find-rider-id "Федот" "Леонтьев") :start "09:45:30" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 125 :plate-number "267" :rider-id (find-rider-id "Эдуард" "Яхин") :start "09:58:30" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 126 :plate-number "270" :rider-id (find-rider-id "Денис" "Бирюков") :start "09:59:00" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 127 :plate-number "273" :rider-id (find-rider-id "Александр" "Коновалов") :start "09:47:00" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 128 :plate-number "274" :rider-id (find-rider-id "Динар" "Сибагатуллин") :start "09:59:00" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 129 :plate-number "276" :rider-id (find-rider-id "Федор" "Попов") :start "09:53:00" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 130 :plate-number "277" :rider-id (find-rider-id "Андрей" "Чежегов") :start "09:38:00" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 131 :plate-number "279" :rider-id (find-rider-id "Леонид" "Зыков") :start "09:42:30" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 132 :plate-number "296" :rider-id (find-rider-id "Антон" "Антонов") :start "09:47:00" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         [:type :result :event-id event-id :classification-id classification-id :position 133 :plate-number "297" :rider-id (find-rider-id "Артём" "Галкин") :start "00:00:00" :finish "00:00:00" :total "00:00:00" :penalty "0" :dnf? true]
         ])

      )))

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
                              (concat
                                slg1
                                stalker1
                                lesnik1
                                bogdanovich1
                                emanzhelinsk1
                                kyshtim1
                                kyshtim2
                                kosmost1
                                kosmost2
                                gornaz
                                ))))
