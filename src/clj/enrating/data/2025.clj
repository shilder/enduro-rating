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
   [:type :result :event-id "EALkbw" :classification-id "CQuv6rI64Fg" :position 2 :plate-number "325" :rider-id (find-rider-id "Сергей" "Кузнецов") :start "12:28:00" :finish "15:23:05" :penalty "0:40:00" :total "3:35:05"]
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
     {:type :result :event-id event-id :classification-id "C1gLPX9AUjc" :position 2 :plate-number "237" :rider-id (find-rider-id "Сергей" "Кузнецов") :team "KATAYENDURO"}
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
          :started-count     20}

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
          :started-count     76}

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

         ;; TODO: сходы

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
          :started-count     89}

         [:type :result :event-id event-id :classification-id classification-id :position 1 :plate-number "223" :rider-id (find-rider-id "Савелий" "Кунакбаев") :start "12:19:00" :finish "13:48:48" :penalty "00:00:00" :total "01:29:48" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 2 :plate-number "231" :rider-id (find-rider-id "Матвей" "Тиунов") :start "12:20:30" :finish "13:55:38" :penalty "00:00:00" :total "01:35:08" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 3 :plate-number "267" :rider-id (find-rider-id "Сергей" "Кузнецов") :start "12:25:00" :finish "14:01:30" :penalty "00:00:00" :total "01:36:30" :laps 3]
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
          :started-count     10}

         [:type :result :event-id event-id :classification-id classification-id :position 1 :plate-number "304" :rider-id (find-rider-id "Анна" "Шилова") :start "12:29:30" :finish "13:50:58" :penalty "00:00:00" :total "01:21:28" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 2 :plate-number "305" :rider-id (find-rider-id "Анна" "Медведева") :start "12:29:30" :finish "14:11:50" :penalty "00:00:00" :total "01:42:20" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 3 :plate-number "300" :rider-id (find-rider-id "Марина" "Аверина") :start "12:29:30" :finish "14:29:17" :penalty "00:00:00" :total "01:59:47" :laps 3]
         [:type :result :event-id event-id :classification-id classification-id :position 4 :plate-number "309" :rider-id (find-rider-id "Юлия" "Березинских") :start "12:29:30" :finish "14:01:19" :penalty "00:40:00" :total "02:11:49" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 5 :plate-number "302" :rider-id (find-rider-id "Ульяна" "Храмцова") :start "12:29:30" :finish "14:03:42" :penalty "00:40:00" :total "02:14:12" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 6 :plate-number "307" :rider-id (find-rider-id "Ксения" "Потапович") :start "12:29:30" :finish "14:10:27" :penalty "00:40:00" :total "02:20:57" :laps 2]
         [:type :result :event-id event-id :classification-id classification-id :position 7 :plate-number "308" :rider-id (find-rider-id "Наталья" "Дроздова") :start "12:29:30" :finish "15:04:39" :penalty "00:40:00" :total "03:15:09" :laps 2]
         ]))))

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
                                      bogdanovich1
                                      emanzhelinsk1))))
