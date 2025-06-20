(ns enrating.data.riders
  (:require [clojure.string :as str]
            [enrating.data.ids :refer [rider-id]]))

;; БД гонщиков

(def riders-data
  [
   {:type :rider-info :name "Никита" :surname "Поляков" :city "Челябинск" :rider-id "RZGtbq5Y"}
   {:type :rider-info :name "Евгений" :surname "Цицимушкин" :patronymic "Александрович" :team "Южный Урал мотоспорт" :city "Кыштым" :rider-id "R5EQjYxk"}
   {:type :rider-info :name "Андрей" :surname "Мишагин" :city "Челябинск" :rider-id "RVeOE5Ps"}
   {:type :rider-info :name "Павел" :surname "Лядецкий" :patronymic "Сергеевич" :team "TuPizza Enduro Team" :city "Челябинск" :rider-id "R4covr5U"}
   {:type :rider-info :name "Егор" :surname "Емельянов" :city "Полевской" :rider-id "RyHLA5DQ"}
   {:type :rider-info :name "Вахтанг" :surname "Гагуа" :patronymic "Николозович" :city "Горнозаводск" :rider-id "RJ6FR4C4"}
   {:type :rider-info :name "Артур" :surname "Пресняков" :patronymic "Михайлович" :city "Нижний Тагил" :rider-id "R8AVeLHE"}
   {:type :rider-info :name "Константин" :surname "Майбуров" :city "-" :rider-id "R0MafCGQ"}
   {:type :rider-info :name "Эрик" :surname "Ишмаков" :city "Уфа" :rider-id "RrXTCPdg"}
   {:type :rider-info :name "Роман" :surname "Кузнецов" :city "Ижевск" :rider-id "R9c7oqWc"}
   {:type :rider-info :name "Артём" :surname "Калинин" :city "Магнитогорск" :rider-id "R9uAyYY"}
   {:type :rider-info :name "Денис" :surname "Шилов" :patronymic "Владимирович" :city "Екатеринбург" :rider-id "Rx0m1M0g"}
   {:type :rider-info :name "Денис" :surname "Медведюк" :city "Тюмень" :rider-id "RhKqKX6M"}
   {:type :rider-info :name "Михаил" :surname "Ушаков" :city "Тюмень" :rider-id "RMBw4DLE"}
   {:type :rider-info :name "Дамир" :surname "Юсупов" :city "-" :rider-id "R5mNlf2k"}
   {:type :rider-info :name "Константин" :surname "Калмыков" :city "Челябинск" :rider-id "RSGAGI6I"}
   {:type :rider-info :name "Александр" :surname "Миронов" :city "Сургут" :rider-id "RTSmG5Fw"}
   {:type :rider-info :name "Алексей" :surname "Кошелев" :city "-" :rider-id "R1iNRbqY"}
   {:type :rider-info :name "Артём" :surname "Цуркан" :city "Екатеринбург" :rider-id "Rtw2Z5s"}
   {:type :rider-info :name "Виталий" :surname "Саитов" :city "Пермь" :rider-id "RFgsexEc"}
   {:type :rider-info :name "Николай" :surname "Швед" :city "-" :rider-id "RTBrJHc"}
   {:type :rider-info :name "Олег" :surname "Габбасов" :city "Челябинск" :rider-id "RvNsgYcI"}
   {:type :rider-info :name "Сергей" :surname "Терентьев" :city "Магнитогорск" :rider-id "RE6PrPUk"}
   {:type :rider-info :name "Вячеслав" :surname "Ярулин" :city "Екатеринбург" :rider-id "RFZVzLJI"}
   {:type :rider-info :name "Ильфар" :surname "Сарваров" :city "Сургут" :rider-id "Rsv9GdfQ"}
   {:type :rider-info :name "Артем" :surname "Иванов" :city "Екатеринбург" :rider-id "RSrMFWAA"}
   {:type :rider-info :name "Кирилл" :surname "Синченко" :city "Москва" :rider-id "R66KCYY4"}
   {:type :rider-info :name "Андрей" :surname "Полномочнов" :city "Лянтор" :rider-id "R3ItseA"}
   {:type :rider-info :name "Ростислав" :surname "Забродин" :city "Курган" :rider-id "RtxO7bX8"}
   {:type :rider-info :name "Петр" :surname "Адрианов" :city "Челябинск" :rider-id "RHmErscw"}
   {:type :rider-info :name "Евгений" :surname "Журавский" :city "Пермь" :rider-id "R4bBBZo"}
   {:type :rider-info :name "Константин" :surname "Романов" :city "с.Еткуль" :rider-id "RYerfEVI"}
   {:type :rider-info :name "Султан" :surname "Хабибрахманов" :city "Екатеринбург" :rider-id "Ro30lhE"}
   {:type :rider-info :name "Виктор" :surname "Цыбулин" :patronymic "Григорьевич" :city "Тюмень" :rider-id "RzpkfUNk"}
   {:type :rider-info :name "Дмитрий" :surname "Аверин" :city "Екатеринбург" :rider-id "R0pRoCY"}
   {:type :rider-info :name "Антон" :surname "Харитонов" :city "Уфа" :rider-id "RfT29QAE"}
   {:type :rider-info :name "Владимир" :surname "Бодрин" :city "Магнитогорск" :rider-id "RijKujQ"}
   {:type :rider-info :name "Алексей" :surname "Созинов" :city "-" :rider-id "RGohThp4"}
   {:type :rider-info :name "Алексей" :surname "Кокорин" :patronymic "Владимирович" :city "Курган" :rider-id "RnrerzE"}
   {:type :rider-info :name "Азат" :surname "Галимов" :city "Уфа" :rider-id "R2P6kF5s"}
   {:type :rider-info :name "Александр" :surname "Выгодский" :city "Верхняя Пышма" :rider-id "RHmC177M"}
   {:type :rider-info :name "Алексей" :surname "Семилетов" :city "Курган" :rider-id "RpFI4Fxs"}
   {:type :rider-info :name "Евгений" :surname "Федин" :city "Коркино" :rider-id "ROoLyTPU"}
   {:type :rider-info :name "Ринат" :surname "Хафизов" :city "-" :rider-id "RnpjEquA"}
   {:type :rider-info :name "Виталий" :surname "Ощепков" :city "Пермь" :rider-id "Rjm3p1po"}
   {:type :rider-info :name "Матвей" :surname "Захаров" :city "Озёрск" :rider-id "RxBVEEvA"}
   {:type :rider-info :name "Илья" :surname "Кузнецов" :city "Екатеринбург" :rider-id "RbvbFcPE"}
   {:type :rider-info :name "Андрей" :surname "Ломакин" :city "Трехгорный" :rider-id "R8JG72HU"}
   {:type :rider-info :name "Константин" :surname "Кетов" :city "Пермь" :rider-id "R8wPYl3k"}
   {:type :rider-info :name "Евгений" :surname "Боярских" :city "Екатеринбург" :rider-id "RBGYvtQ"}
   {:type :rider-info :name "Егор" :surname "Кочетов" :city "Уфа" :rider-id "RVWsk8Kg"}
   {:type :rider-info :name "Иван" :surname "Вербилович" :city "Екатеринбург" :rider-id "RY7keNGI"}
   {:type :rider-info :name "Денис" :surname "Зараменских" :city "Коркино" :rider-id "RgKzXGeg"}
   {:type :rider-info :name "Дмитрий" :surname "Ахманаев" :city "Екатеринбург" :rider-id "RoqJwcmI"}
   {:type :rider-info :name "Александр" :surname "Некрасов" :city "Копейск" :rider-id "R4GNPpE"}
   {:type :rider-info :name "Михаил" :surname "Жилин" :city "Курган" :rider-id "Rfx9GOZI"}
   {:type :rider-info :name "Евгений" :surname "Данилов" :patronymic "Николаевич" :city "Пермь" :rider-id "RgIVoEf0"}
   {:type :rider-info :name "Антон" :surname "Толкачев" :city "Талица" :rider-id "RERjfbfc"}
   {:type :rider-info :name "Денис" :surname "Козлов" :city "Челябинск" :rider-id "RUrUNbCg"}
   {:type :rider-info :name "Виктор" :surname "Калинин" :city "Магнитогорск" :rider-id "RQeHv4FY"}
   {:type :rider-info :name "Влад" :surname "Чибаков" :city "-" :rider-id "R0FDicNc"}
   {:type :rider-info :name "Вадим" :surname "Лугаськов" :city "Ревда" :rider-id "RePKnBNY"}
   {:type :rider-info :name "Владимир" :surname "Вязин" :city "Курган" :rider-id "Rw2bHkw"}
   {:type :rider-info :name "Евгений" :surname "Шигабеев" :city "Заречный" :rider-id "RmcKBZI"}
   {:type :rider-info :name "Вадим" :surname "Ахтямов" :city "Миасс" :rider-id "RYdJlohc"}
   {:type :rider-info :name "Юрий" :surname "Бороздин" :city "Екатеринбург" :rider-id "RMQDZFQ"}
   {:type :rider-info :name "Андрей" :surname "Склюев" :city "Тюмень" :rider-id "RnWrF0t8"}
   {:type :rider-info :name "Иван" :surname "Филиппов" :city "Екатеринбург" :rider-id "R7Zjzj88"}
   {:type :rider-info :name "Алексей" :surname "Лепаев" :city "Уфа" :rider-id "Ru34rEmI"}
   {:type :rider-info :name "Кирилл" :surname "Азаров" :city "Челябинск" :rider-id "RTEQ1zWs"}
   {:type :rider-info :name "Антон" :surname "Зырянов" :city "Магнитогорск" :rider-id "RIser7k"}
   {:type :rider-info :name "Владимир" :surname "Носков" :city "Магнитогорск" :rider-id "RlIWswJg"}
   {:type :rider-info :name "Артем" :surname "Свяжин" :patronymic "Владимирович" :city "Екатеринбург" :rider-id "RdXmJmeA"}
   {:type :rider-info :name "Дмитрий" :surname "Иванов" :city "Каменск-Уральский" :rider-id "RCVkfHTs"}
   {:type :rider-info :name "Константин" :surname "Маркелов" :city "Челябинск" :rider-id "R4wqeg3Y"}
   {:type :rider-info :name "Кирилл" :surname "Галкин" :city "-" :rider-id "RXADdFx0"}
   {:type :rider-info :name "Михаил" :surname "Фурсов" :city "Челябинск" :rider-id "RvuNKTMA"}
   {:type :rider-info :name "Андрей" :surname "Шаталин" :city "Челябинск" :rider-id "RYqL154U"}
   {:type :rider-info :name "Виктор" :surname "Попов" :city "Курган" :rider-id "RSsAHyfM"}
   {:type :rider-info :name "Андрей" :surname "Шафигулин" :city "Челябинск" :rider-id "RBbIfCI"}
   {:type :rider-info :name "Владислав" :surname "Пашнин" :city "Миасское" :rider-id "R13oyA7I"}
   {:type :rider-info :name "Федор" :surname "Сборошенко" :city "Челябинск" :rider-id "Rf1AYzi8"}
   {:type :rider-info :name "Евгений" :surname "Белькевич" :city "Челябинск" :rider-id "RElvtEdU"}
   {:type :rider-info :name "Алексей" :surname "Гуляев" :city "-" :rider-id "RxB5rvdE"}
   {:type :rider-info :name "Михаил" :surname "Унесихин" :city "Екатеринбург" :rider-id "RvqyN7c"}
   {:type :rider-info :name "Александр" :surname "Перевозчиков" :city "Екатеринбург" :rider-id "RQMZQV0Y"}
   {:type :rider-info :name "Данил" :surname "Кварацхелия" :city "Екатеринбург" :rider-id "RdARm68c"}
   {:type :rider-info :name "Николай" :surname "Семенов" :city "Екатеринбург" :rider-id "RDhyIcY"}
   {:type :rider-info :name "Матвей" :surname "Тиунов" :city "Сатка" :rider-id "Rhwl5jCM"}
   {:type :rider-info :name "Антон" :surname "Чикин" :city "Екатеринбург" :rider-id "Rd7VmtSY"}
   {:type :rider-info :name "Никитин" :surname "Дмитрий" :city "Пермь" :rider-id "RmSSN4aA"}
   {:type :rider-info :name "Виталий" :surname "Стаценков" :city "Екатеринбург" :rider-id "RjAK5bbk"}
   {:type :rider-info :name "Алексей" :surname "Мостовой" :city "Миасс" :rider-id "RZvRylg"}
   {:type :rider-info :name "Денис" :surname "Прошакин" :city "Тюмень" :rider-id "R81McJE4"}
   {:type :rider-info :name "Кирилл" :surname "Казанцев" :city "Камышлов" :rider-id "RRrmItqo"}
   {:type :rider-info :name "Денис" :surname "Скоров" :city "Магнитогорск" :rider-id "RkRCoz9g"}
   {:type :rider-info :name "Илья" :surname "Юзеев" :city "Миасс" :rider-id "RGjRkNIQ"}
   {:type :rider-info :name "Олег" :surname "Поленков" :city "Магнитогорск" :rider-id "RhJpssVA"}
   {:type :rider-info :name "Евгений" :surname "Ярославцев" :city "Пермь" :rider-id "RSa88uM"}
   {:type :rider-info :name "Михаил" :surname "Попов" :city "Каменск-Уральский" :rider-id "RVoN79do"}
   {:type :rider-info :name "Тимофей" :surname "Максимов" :city "Екатеринбург" :rider-id "RJ416QJs"}
   {:type :rider-info :name "Владимир" :surname "Тясин" :patronymic "Сергеевич" :city "Екатеринбург" :rider-id "Rb0ClCY"}
   {:type :rider-info :name "Алексей" :surname "Захаров" :city "Екатеринбург" :rider-id "RD9zvFlM"}
   {:type :rider-info :name "Андрей" :surname "Куцепендик" :city "-" :rider-id "RzHwJBxk"}
   {:type :rider-info :name "Амир" :surname "Сарваритдинов" :city "Кыштым" :rider-id "RRuQ3JdM"}
   {:type :rider-info :name "Александр" :surname "Белых" :city "Первоуральск" :rider-id "R7sBQi6s"}
   {:type :rider-info :name "Владимир" :surname "Киселёв" :city "Челябинск" :rider-id "RCrb244I"}
   {:type :rider-info :name "Дмитрий" :surname "Мокиенко" :city "Челябинск" :rider-id "RFLLcQhI"}
   {:type :rider-info :name "Артур" :surname "Поздеев" :city "Магнитогорск" :rider-id "R6N4POik"}
   {:type :rider-info :name "Анатолий" :surname "Ванчинов" :city "Екатеринбург" :rider-id "Rq0ZTyA"}
   {:type :rider-info :name "Иван" :surname "Тихонов" :city "Екатеринбург" :rider-id "RTOkkIv0"}
   {:type :rider-info :name "Иван" :surname "Чирков" :city "Камышлов" :rider-id "RBR64juk"}
   {:type :rider-info :name "Николай" :surname "Обожин" :city "Екатеринбург" :rider-id "RV8HDUts"}
   {:type :rider-info :name "Антон" :surname "Галюк" :city "Тюмень" :rider-id "RScmnQKg"}
   {:type :rider-info :name "Евгений" :surname "Чурин" :city "Екатеринбург" :rider-id "R9RJWgdU"}
   {:type :rider-info :name "Владимир" :surname "Николаев" :city "Тюмень" :rider-id "RqoPuMOI"}
   {:type :rider-info :name "Алексей" :surname "Залесов" :city "Екатеринбург" :rider-id "RLfVfHw"}
   {:type :rider-info :name "Сергей" :surname "Вакушин" :city "Миасс" :rider-id "R25LPFcs"}
   {:type :rider-info :name "Станислав" :surname "Тарасов" :city "Тюмень" :rider-id "Ru3atqx8"}
   {:type :rider-info :name "Никита" :surname "Баранов" :city "Челябинск" :rider-id "RwsA3ak"}
   {:type :rider-info :name "Данила" :surname "Фролов" :city "Тюмень" :rider-id "R29z8qQ"}
   {:type :rider-info :name "Иван" :surname "Адам" :city "Тюмень" :rider-id "Ra6PzAPc"}
   {:type :rider-info :name "Александр" :surname "Мугулов" :city "Ирбит" :rider-id "RZ71kDnU"}
   {:type :rider-info :name "Игорь" :surname "Мальков" :city "Челябинск" :rider-id "RPDtWgs"}
   {:type :rider-info :name "Игорь" :surname "Теплоухов" :city "Пермь" :rider-id "RJAnDw0"}
   {:type :rider-info :name "Игорь" :surname "Ситников" :city "Ижевск" :rider-id "RdU4jro"}
   {:type :rider-info :name "Владислав" :surname "Култышев" :city "Екатеринбург" :rider-id "RWANELXM"}
   {:type :rider-info :name "Александр" :surname "Мерзляков" :city "Пермь" :rider-id "Rx1zcVfs"}
   {:type :rider-info :name "Станислав" :surname "Зеленских" :city "Челябинск" :rider-id "Rn5HGvnc"}
   {:type :rider-info :name "Владимир" :surname "Гусев" :city "Курган" :rider-id "Rad6VbIo"}
   {:type :rider-info :name "Александр" :surname "Савонин" :city "Магнитогорск" :rider-id "Rjadjjs"}
   {:type :rider-info :name "Кирилл" :surname "Егоров" :city "Нижний Тагил" :rider-id "RNkMK9o4"}
   {:type :rider-info :name "Александр" :surname "Осколков" :city "Тюмень" :rider-id "ROPkhQ"}
   {:type :rider-info :name "Руслан" :surname "Сафин" :city "Учалы" :rider-id "RLP9OGb0"}
   {:type :rider-info :name "Юрий" :surname "Рысин" :city "-" :rider-id "RYMfkbvI"}
   {:type :rider-info :name "Дмитрий" :surname "Долженко" :city "Тюмень" :rider-id "RGmUrKj8"}
   {:type :rider-info :name "Владимир" :surname "Иванов" :city "Копейск" :rider-id "RrzVWnN0"}
   {:type :rider-info :name "Ален" :surname "Кокшаров" :city "Екатеринбург" :rider-id "Rlj1tJE"}
   {:type :rider-info :name "Иван" :surname "Колягин" :city "-" :rider-id "Rl6JBdEA"}
   {:type :rider-info :name "Вадим" :surname "Мезенцев" :city "Миасс" :rider-id "RNmug66w"}
   {:type :rider-info :name "Денис" :surname "Денисюк" :city "Екатеринбург" :rider-id "RFxkcx0s"}
   {:type :rider-info :name "Семён" :surname "Томилов" :city "-" :rider-id "R97hpB2U"}
   {:type :rider-info :name "Денис" :surname "Бирюков" :city "Пермь" :rider-id "RUISui9Q"}
   {:type :rider-info :name "Алексей" :surname "Злобин" :city "-" :rider-id "RxcxrhY"}
   {:type :rider-info :name "Рамиль" :surname "Хакимов" :city "Уфа" :rider-id "RWQj3Hp8"}
   {:type :rider-info :name "Юрий" :surname "Хицов" :city "Челябинск" :rider-id "Ri6bUn4"}
   {:type :rider-info :name "Дмитрий" :surname "Прыкин" :city "-" :rider-id "RTpSG8t4"}
   {:type :rider-info :name "Сергей" :surname "Максимов" :city "Верхняя Салда" :rider-id "RIkrqOOU"}
   {:type :rider-info :name "Сергей" :surname "Уфимцев" :city "Челябинск" :rider-id "RrwFdQfo"}
   {:type :rider-info :name "Сергей" :surname "Баранов" :city "Нягань" :rider-id "RCnd7C4Q"}
   {:type :rider-info :name "Андрей" :surname "Верещагин" :city "Екатеринбург" :rider-id "R5lSXMJM"}
   {:type :rider-info :name "Иван" :surname "Кукурузов" :city "Екатеринбург" :rider-id "RM7JWiI"}
   {:type :rider-info :name "Дамир" :surname "Хабибрахманов" :city "Екатеринбург" :rider-id "RKfNoisU"}
   {:type :rider-info :name "Алексей" :surname "Калашников" :city "Магнитогорск" :rider-id "RGlD9RwI"}
   {:type :rider-info :name "Сергей" :surname "Богатырёв" :city "-" :rider-id "RguERcK0"}
   {:type :rider-info :name "Александр" :surname "Жмаков" :city "Учалы" :rider-id "RIAUi2fw"}
   {:type :rider-info :name "Мыкалов" :surname "Владимир" :city "Челябинск" :rider-id "RK2ERsCs"}
   {:type :rider-info :name "Александр" :surname "Чикишев" :city "Березовский" :rider-id "R2muFek"}
   {:type :rider-info :name "Олег" :surname "Сухарев" :city "Екатеринбург" :rider-id "R1U7fCEQ"}
   {:type :rider-info :name "Евгений" :surname "Каширин" :city "Челябинск" :rider-id "R7VwdRpo"}
   {:type :rider-info :name "Ильшат" :surname "Нигматуллин" :city "Учалы" :rider-id "RWQbCIA0"}
   {:type :rider-info :name "Виталий" :surname "Шаяхметов" :city "Аргаяш" :rider-id "RznDN1oY"}
   {:type :rider-info :name "Руслан" :surname "Салыев" :city "Челябинск" :rider-id "RllQZvA"}
   {:type :rider-info :name "Станислав" :surname "Зубков" :city "Челябинск" :rider-id "RspRBkY"}
   {:type :rider-info :name "Данил" :surname "Береговой" :city "Миасс" :rider-id "RHFEdaY"}
   {:type :rider-info :name "Александр" :surname "Беспалов" :city "Челябинск" :rider-id "RNjrc1Mw"}
   {:type :rider-info :name "Егор" :surname "Камалов" :city "Златоуст" :rider-id "RkBeaqJs"}
   {:type :rider-info :name "Максим" :surname "Килин" :city "Березовский" :rider-id "RsfmQ7aY"}
   {:type :rider-info :name "Андрей" :surname "Ершов" :city "Екатеринбург" :rider-id "RnC04K9E"}
   {:type :rider-info :name "Николай" :surname "Савочкин" :city "Челябинск" :rider-id "REAoOvoM"}
   {:type :rider-info :name "Худорожков" :surname "Петр" :city "Екатеринбург" :rider-id "RJ9REowM"}
   {:type :rider-info :name "Владимир" :surname "Филимончук" :city "Тюмень" :rider-id "Rx4fm2U"}
   {:type :rider-info :name "Павел" :surname "Байдала" :city "Екатеринбург" :rider-id "RxreCaw0"}
   {:type :rider-info :name "Евгений" :surname "Шестаков" :city "Нягань" :rider-id "RqpJMaXg"}
   {:type :rider-info :name "Сергей" :surname "Беличев" :city "Тюмень" :rider-id "RcbSGZ4s"}
   {:type :rider-info :name "Сергей" :surname "Нелюбин" :city "Тюмень" :rider-id "Rw5q5arI"}
   {:type :rider-info :name "Дмитрий" :surname "Шматков" :city "Челябинск" :rider-id "ReaAmL8"}
   {:type :rider-info :name "Артём" :surname "Душин" :city "Ижевск" :rider-id "RZSYOrPw"}
   {:type :rider-info :name "Максим" :surname "Кабаненко" :city "Заречный" :rider-id "RuVI7q7c"}
   {:type :rider-info :name "Иван" :surname "Попов" :city "Екатеринбург" :rider-id "RgWWfGSA"}
   {:type :rider-info :name "Максим" :surname "Антонов" :city "Тюмень" :rider-id "RC1h5WK4"}
   {:type :rider-info, :name "Владимир", :surname "Пономарчук", :city "Челябинск", :rider-id "RsP6Hx8c"}
   {:type :rider-info, :name "Сергей", :surname "Кузнецов", :city "Катайск", :rider-id "RxQjoe4c"}
   {:type :rider-info, :name "Александр", :surname "Полянин", :city "Златоуст", :rider-id "RKsC864o"}
   {:type :rider-info, :name "Виктор", :surname "Шабуров", :city "Екатеринбург", :rider-id "RcSKpL8s"}
   {:type :rider-info, :name "Антон", :surname "Стелюк", :city "Тюмень", :rider-id "RVIcqE"}
   {:type :rider-info, :name "Сергей", :surname "Дубровин", :city "Миасс", :rider-id "RYmFrY1o"}
   {:type :rider-info, :name "Антон", :surname "Тырыкин", :city "Челябинск", :rider-id "R21j2Eo"}
   {:type :rider-info, :name "Артем", :surname "Денисов", :city "Трехгорный", :rider-id "RqngfM"}
   {:type :rider-info, :name "Андрей", :surname "Волков", :city "Каменск-Уральский", :rider-id "RRKF9oy4"}
   {:type :rider-info, :name "Ярослав", :surname "Саломатин", :city "Златоуст", :rider-id "RlC8D4hs"}
   {:type :rider-info, :name "Дмитрий", :surname "Холкин", :city "Екатеринбург", :rider-id "RCLgswY"}
   {:type :rider-info, :name "Ростислав", :surname "Зиязов", :city "Пермь", :rider-id "RtGi3JUE"}
   {:type :rider-info, :name "Евгений", :surname "Моисеев", :city "Челябинск", :rider-id "RrTX9w9A"}
   {:type :rider-info, :name "Андрей", :surname "Похващев", :city "-", :rider-id "Rf8pQeSI"}
   {:type :rider-info, :name "Артём", :surname "Кириллов", :city "Уфа", :rider-id "R0lsBZSM"}
   {:type :rider-info, :name "Евгений", :surname "Достовалов", :city "Курган", :rider-id "RbS2Rd24"}
   {:type :rider-info, :name "Иван", :surname "Заболоцкий", :city "-", :rider-id "RjYtWenA"}
   {:type :rider-info, :name "Вадим", :surname "Тихонов", :city "Уфа", :rider-id "RPE3ra6s"}
   {:type :rider-info, :name "Олег", :surname "Хвостенко", :city "Екатеринбург", :rider-id "Rt7uMnIo"}
   {:type :rider-info, :name "Александр", :surname "Анисимов", :city "Екатеринбург", :rider-id "RJ27n8Fo"}
   {:type :rider-info, :name "Андрей", :surname "Староватов", :city "Златоуст", :rider-id "ROa6Vgmc"}
   {:type :rider-info, :name "Иван", :surname "Соболев", :city "Каменск-Уральский", :rider-id "RWKEQX1c"}
   {:type :rider-info, :name "Олег", :surname "Копытов", :city "Нягань", :rider-id "RmYtCASg"}
   {:type :rider-info, :name "Эдуард", :surname "Мордюженко", :city "Каменск-Уральский", :rider-id "RmlwN54U"}
   {:type :rider-info, :name "Александр", :surname "Орбан", :city "Нижняя Салда", :rider-id "R5fP0AZ8"}
   {:type :rider-info, :name "Антон", :surname "Овчинников", :city "Тюмень", :rider-id "RIFt1FIo"}
   {:type :rider-info, :name "Максим", :surname "Кокшаров", :city "Пермь", :rider-id "R7rGlt9E"}
   {:type :rider-info, :name "Андрей", :surname "Маликов", :city "Нягань", :rider-id "RBrEottg"}
   {:type :rider-info, :name "Пётр", :surname "Петанов", :city "Нижний Тагил", :rider-id "RabCB0"}
   {:type :rider-info, :name "Дмитрий", :surname "Яруллин", :city "Екатеринбург", :rider-id "RBG1uTC4"}
   {:type :rider-info, :name "Александр", :surname "Демьянов", :patronymic "Владиславович", :city "Нижний Тагил", :rider-id "RQ9eaYto"}
   {:type :rider-info, :name "Илья", :surname "Кругликов", :patronymic "Андреевич", :city "Левиха", :rider-id "R24Dn4P4"}
   {:type :rider-info, :name "Евгений", :surname "Мирзаметов", :city "Тюмень", :rider-id "RUsz2eU4"}
   {:type :rider-info, :name "Артем", :surname "Чернецкий", :city "Екатеринбург", :rider-id "RhQwz4PY"}
   {:type :rider-info, :name "Роман", :surname "Карнаухов", :patronymic "Евгеньевич" :city "Екатеринбург", :rider-id "ROxmDDbY"}
   {:type :rider-info, :name "Артём", :surname "Тараненко" :city "Екатеринбург", :rider-id "Rf90xk8"}
   {:type :rider-info, :name "Александр", :surname "Тютиков", :patronymic "Анатольевич" :city "Екатеринбург", :rider-id "RFDtCSdI"}
   {:type :rider-info, :name "Алексей", :surname "Коротаев", :patronymic "Владимирович" :city "Екатеринбург", :rider-id "Rg5vYCtc"}
   {:type :rider-info, :name "Виталий", :surname "Грачев", :patronymic "Александрович" :city "Баранчинский", :rider-id "RHJPaQ"}
   {:type :rider-info, :name "Динар", :surname "Сибагатуллин" :patronymic "Халилович" :city "Югорск", :rider-id "RuSLqnkk"}
   {:type :rider-info, :name "Денис", :surname "Стафеев" :patronymic "Михайлович" :city "Нижний Тагил", :rider-id "RfH0nfek"}
   {:type :rider-info, :name "Алексей", :surname "Поздеев" :patronymic "Сергеевич" :city "Нижний Тагил", :rider-id "RjJP0GMs"}
   {:type :rider-info, :name "Даниил", :surname "Патокин" :patronymic "Вадимович" :city "Нижний Тагил", :rider-id "Rtel73pY"}
   {:type :rider-info, :name "Евгений", :surname "Беломестных" :patronymic "Сергеевич" :city "Нижний Тагил", :rider-id "RdM9iJhw"}
   {:type :rider-info, :name "Алексей", :surname "Судариков" :patronymic "Владимирович" :city "Екатеринбург,", :rider-id "RrrxQw70"}
   {:type :rider-info, :name "Виталий", :surname "Скульбашевский" :patronymic "Анатольевич" :city "Югорск", :rider-id "RTYj4Ol8"}
   {:type :rider-info, :name "Андрей", :surname "Муравьёв" :patronymic "Николаевич" :city "Екатеринбург", :rider-id "RgLJMe6E"}
   {:type :rider-info, :name "Николай", :surname "Глущенко" :patronymic "Иванович" :city "п.Светлый" :region "ХМАО" :rider-id "RckWkvUo"}
   {:type :rider-info, :name "Михаил", :surname "Тясин" :patronymic "Алексеевич" :city "Екатеринбург", :rider-id "RTFFOhU"}
   {:type :rider-info, :name "Анна", :surname "Шилова" :patronymic "Викторовна" :city "Екатеринбург", :rider-id "RhMlzqUY"}
   {:type :rider-info, :name "Александр", :surname "Новопашин" :city "Тюмень", :rider-id "Rhd5Iuk"}
   {:type :rider-info, :name "Александр", :surname "Бескровный" :city "Челябинск", :rider-id "Rv5qnd40"}
   {:type :rider-info, :name "Сергей", :surname "Борисов" :city "Челябинск", :rider-id "RVxvvSWg"}
   {:type :rider-info, :name "Дмитрий", :surname "Тимошевский" :city "Коркино", :rider-id "RN3H06Q"}
   {:type :rider-info, :name "Александр", :surname "Кабаев" :city "Челябинск", :rider-id "RuCHwPng"}
   {:type :rider-info, :name "Алексей", :surname "Слабочков" :city "Миасс", :rider-id "REJKjxI"}
   {:type :rider-info, :name "Василий", :surname "Дудников" :city "0", :rider-id "RcrLsGw0"}
   {:type :rider-info, :name "Евгений", :surname "Исупов" :city "Пермь", :rider-id "R6dbZJro"}
   {:type :rider-info, :name "Валера", :surname "Варгасов" :city "Челябинск", :rider-id "RZ0pHsk"}
   {:type :rider-info, :name "Артём", :surname "Котельников" :city "Челябинск", :rider-id "RrUd0HBA"}
   {:type :rider-info, :name "Алексей", :surname "Фадеев" :city "Миасс", :rider-id "RLPj40"}
   {:type :rider-info, :name "Константин", :surname "Тынкасов" :city "Златоуст", :rider-id "RzgLIss"}
   {:type :rider-info, :name "Владислав", :surname "Хонькин" :city "Еманжелинск", :rider-id "Rp0Z7lFM"}
   {:type :rider-info, :name "Антон", :surname "Аристахов" :city "-", :rider-id "RR64Q2Ng"}
   {:type :rider-info, :name "Денис", :surname "Воробьев" :city "Челябинск", :rider-id "RIAYhjo"}
   {:type :rider-info, :name "Александр", :surname "Исаев" :city "Южноуральск", :rider-id "RJwAJ5E"}
   {:type :rider-info, :name "Василий", :surname "Жук" :city "Еманжелинск", :rider-id "RrXH4HOI"}
   {:type :rider-info, :name "Сергей", :surname "Анисимов" :city "Пермь", :rider-id "RT3M4tC4"}
   {:type :rider-info, :name "Евгений", :surname "Василькин" :city "Тобольск", :rider-id "RLxHsPk"}
   {:type :rider-info, :name "Дмитрий", :surname "Прядко" :city "-", :rider-id "ReYBGEns"}
   {:type :rider-info, :name "Алексей", :surname "Полыгалов" :city "-", :rider-id "RU7qBxY"}
   {:type :rider-info, :name "Алексей", :surname "Ищук" :city "Екатеринбург", :rider-id "RfRPfCcs"}
   {:type :rider-info, :name "Александр", :surname "Сумин" :city "Челябинск", :rider-id "RSLZ2lMU"}
   {:type :rider-info, :name "Максим", :surname "Тимошевский" :city "Челябинск", :rider-id "Rz0xl8yw"}
   {:type :rider-info, :name "Владислав", :surname "Мочалов" :city "Миасс", :rider-id "RmRPadI"}
   {:type :rider-info, :name "Александр", :surname "Храмов" :city "Ревда", :rider-id "RTP80Tts"}
   {:type :rider-info, :name "Василий", :surname "Кармацких" :city "Тюмень", :rider-id "Rql6U6Co"}
   {:type :rider-info, :name "Андрей", :surname "Созыкин" :city "Копейск", :rider-id "RNQpcffo"}
   {:type :rider-info, :name "Алексей", :surname "Самойлов" :city "Копейск", :rider-id "RIEgAag4"}
   {:type :rider-info, :name "Сергей", :surname "Лазукин" :city "Снежинск", :rider-id "Re88AbYA"}
   {:type :rider-info, :name "Роман", :surname "Ахмадиев" :city "Копейск", :rider-id "RPErDg3A"}
   {:type :rider-info, :name "Александр", :surname "Михалев" :city "Екатеринбург", :rider-id "RxNM4zco"}
   {:type :rider-info, :name "Евгений", :surname "Симаков" :city "-", :rider-id "RjYk67E0"}
   {:type :rider-info, :name "Александр", :surname "Курчев" :city "Пермь", :rider-id "RnncBKdw"}
   {:type :rider-info, :name "Станислав", :surname "Евдокимов" :city "Курган", :rider-id "RepOIPMw"}
   {:type :rider-info, :name "Владимир", :surname "Жданов" :city "-", :rider-id "RrHfZrMo"}
   {:type :rider-info, :name "Денис", :surname "Деревенченко" :city "-", :rider-id "RSvQaWcs"}
   {:type :rider-info, :name "Алексей", :surname "Матвеев" :city "Верхняя Пышма", :rider-id "RJJknrag"}
   {:type :rider-info, :name "Антон", :surname "Кийко" :city "Екатеринбург", :rider-id "RBn5ONII"}
   {:type :rider-info, :name "Евгений", :surname "Максимов" :city "Челябинск", :rider-id "RqtYzcow"}
   {:type :rider-info, :name "Вячеслав", :surname "Салмин" :city "Миасс", :rider-id "RPPwQkc"}
   {:type :rider-info, :name "Константин", :surname "Одиноков" :city "Златоуст", :rider-id "RpawT2gw"}
   {:type :rider-info, :name "Юрий", :surname "Лобко" :city "Челябинск", :rider-id "RAOADH7c"}
   {:type :rider-info, :name "Сергей", :surname "Потлов" :city "Златоуст", :rider-id "R2s4adRQ"}
   {:type :rider-info, :name "Никита", :surname "Мохнин" :city "Тюмень", :rider-id "RMyhP5cI"}
   {:type :rider-info, :name "Иван", :surname "Мохнин" :city "Тюмень", :rider-id "RVxTvsPo"}
   {:type :rider-info, :name "Алексей", :surname "Сазанов" :city "Тюмень", :rider-id "RBwqEjsY"}
   {:type :rider-info, :name "Михаил", :surname "Дегтярёв" :city "-", :rider-id "Rkr2UoM8"}
   {:type :rider-info, :name "Андрей", :surname "Дегтярёв" :city "-", :rider-id "Rwh3jg5A"}
   {:type :rider-info, :name "Иван", :surname "Моисеев" :city "Челябинск", :rider-id "R0Hh2nfc"}
   {:type :rider-info, :name "Константин", :surname "Розенбаум" :city "Екатеринбург", :rider-id "RwRNSQb8"}
   {:type :rider-info, :name "Дмитрий", :surname "Чирков" :city "Екатеринбург", :rider-id "Ry8iLw"}
   {:type :rider-info, :name "Сергей", :surname "Уткин" :city "Тюмень", :rider-id "RvzWJ7bo"}
   {:type :rider-info, :name "Александр", :surname "Орешко" :city "Копейск", :rider-id "RjrGOiZ4"}
   {:type :rider-info, :name "Сергей", :surname "Ягудин" :city "Рощино", :rider-id "RVzjBKM"}

   {:type :rider-info :name "Семён" :surname "Скулкин" :city "-", :rider-id "RFEdyYC4"}
   {:type :rider-info :name "Леонид" :surname "Асташов" :city "Половинный", :rider-id "RSthrPY8"}
   {:type :rider-info :name "Павел" :surname "Стаин" :city "Екатеринбург", :rider-id "R8BRPzzE"}
   {:type :rider-info :name "Ринат" :surname "Нохов" :city "Миасс", :rider-id "RrVti2Ds"}
   {:type :rider-info :name "Василий" :surname "Тараторин" :city "Кременкуль", :rider-id "RaPYjmkQ"}
   {:type :rider-info :name "Александр" :surname "Талыгин" :city "Мирный", :rider-id "RB6KjuX8"}
   {:type :rider-info :name "Егор" :surname "Коноплев" :city "Екатеринбург", :rider-id "RHc2kdCM"}
   {:type :rider-info :name "Роман" :surname "Белоногов" :city "Каменск-Уральский", :rider-id "RIvaYO44"}
   {:type :rider-info :name "Виктор" :surname "Медведев" :city "Миасс", :rider-id "RK6ba40"}
   {:type :rider-info :name "Максим" :surname "Пестов" :city "Белорецк", :rider-id "RPlPlk3M"}
   {:type :rider-info :name "Илья" :surname "Ефимов" :city "Каменск-Уральский", :rider-id "Rr4206V8"}
   {:type :rider-info :name "Александр" :surname "Ишонин" :city "Озерск", :rider-id "RNE6P2g"}
   {:type :rider-info :name "Дмитрий" :surname "Сажин" :city "Екатеринбург", :rider-id "RiZbT3kQ"}
   {:type :rider-info :name "Сергей" :surname "Ужегов" :city "-", :rider-id "R3ex9tWc"}
   {:type :rider-info :name "Александр" :surname "Зверев" :city "Златоуст", :rider-id "RYhqpESw"}
   {:type :rider-info :name "Максим" :surname "Паршаков" :city "Челябинск", :rider-id "RswhUQE"}

   {:type :rider-info :name "Ксения" :surname "Потапович" :city "Екатеринбург", :rider-id "RuVGES28"}
   {:type :rider-info :name "Анна" :surname "Медведева" :city "Челябинск", :rider-id "ReMXNhQQ"}
   {:type :rider-info :name "Марина" :surname "Аверина" :city "Екатеринбург", :rider-id "RmIKVsuY"}
   {:type :rider-info :name "Ульяна" :surname "Храмцова" :city "Златоуст", :rider-id "RNjw4Jxc"}
   {:type :rider-info :name "Юлия" :surname "Березинских" :city "Тюмень", :rider-id "Re2vB3HY"}
   {:type :rider-info :name "Анастасия" :surname "Шилова" :city "Златоуст", :rider-id "R7A25T88"}
   {:type :rider-info :name "Маргарита" :surname "Гришина" :city "Магнитогорск", :rider-id "R7RSnt2E"}
   {:type :rider-info :name "Анна" :surname "Евграфова" :city "Москва", :rider-id "RZWMvasY"}
   {:type :rider-info :name "Наталья" :surname "Макеева" :city "-", :rider-id "RM8P8IZA"}
   {:type :rider-info :name "Дарья" :surname "Шабловская" :city "Екатеринбург", :rider-id "R0UPhTyg"}

   ])

(defn- normalize-string
  [s]
  (when s
    (if (or (nil? s)
            (= "-" s))
      ;; Пустые строки считаем как "nil"
      "nil"
      (-> s
          (str/trim)
          (str/lower-case)
          ;; для проверки дубликатов будем считать ё как е
          (str/replace "ё" "е")))))

(defn- normalized-string-getter
  [kw]
  (fn [m]
    (normalize-string (get m kw))))

(defn check-duplicates! []
  (reduce
    (fn [acc v]
      (if (contains? acc v)
        (throw (ex-info (str "Обнаружено дублирование данных для гонщика " v) {}))
        (conj acc v)))
    #{}
    (map (juxt (normalized-string-getter :name)
               (normalized-string-getter :surname))
         riders-data)))

;; Проверить на дублирование при загрузке
(check-duplicates!)

(defn find-rider-id
  "Возвращает `rider-id` для гонщика с указанными именем и фамилией.
  Выбрасывает ошибку если ничего не найдено или если найдено больше одного гонщика"
  [name surname]
  (let [matches (filter #(and (= (normalize-string (:name %)) (normalize-string name))
                              (= (normalize-string (:surname %)) (normalize-string surname))) riders-data)
        cnt (count matches)]
    (cond
      (zero? cnt)
      (throw (ex-info (format "Не найден гонщик с такими данными: %s %s" name surname) {}))

      (= 1 cnt)
      (:rider-id (first matches))

      :else
      (throw (ex-info (format "Больше чем один гонщик с такими данными: %s %s" name surname) {})))))

(def riders-map
  (reduce
    (fn [acc v]
      (if (contains? acc (:rider-id v))
        (throw (ex-info (str "Дублирующийся ключ для гонщика " v) {}))
        (assoc acc (:rider-id v) v)))
    {}
    riders-data))
