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
   {:type :rider-info :name "Артём" :surname "Калинин" :patronymic "Сергеевич" :city "Челябинск" :rider-id "R9uAyYY"}
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
   {:type :rider-info :name "Денис" :surname "Козлов" :city "Челябинск" :rider-id "RUrUNbCg" :patronymic "Сергеевич"}
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

   {:type :rider-info :name "Артем" :surname "Дурницын" :city "Нижний Тагил" :rider-id "RaK406oo"}
   {:type :rider-info :name "Александр" :surname "Огорелышев" :city "Нижний Тагил" :rider-id "R9Gw6exE"}
   {:type :rider-info :name "Станислав" :surname "Максимов" :city "Кыштым" :rider-id "R1lC0FD4"}
   {:type :rider-info :name "Данил" :surname "Старцев" :city "Алапаевск" :rider-id "RVQ07Amc"}
   {:type :rider-info :name "Григорий" :surname "Подкорытов" :city "Алапаевск" :rider-id "RHfCudI"}
   {:type :rider-info :name "Антон" :surname "Коробейников" :city "Кунгур" :rider-id "R0rMwU4"}
   {:type :rider-info :name "Виталий" :surname "Горбачев" :city "Екатеринбург" :rider-id "R1qNSSBM"}
   {:type :rider-info :name "Евгений" :surname "Константинов" :city "Екатеринбург" :rider-id "RfFRWsvM"}
   {:type :rider-info :name "Сергей" :surname "Шайбаков" :city "Екатеринбург" :rider-id "R9hVPxc"}
   {:type :rider-info :name "Евгений" :surname "Габдулханов" :city "Верхняя Салда" :rider-id "R6UCEGOM"}
   {:type :rider-info :name "Сергей" :surname "Чигвинцев" :city "Екатеринбург" :rider-id "R0jYdMrU"}
   {:type :rider-info :name "Алексей" :surname "Донских" :city "Березовский" :rider-id "RoxRkUZw"}
   {:type :rider-info :name "Олег" :surname "Карелин" :city "п. Растущий" :rider-id "Rv8IpNjc"}
   {:type :rider-info :name "Игорь" :surname "Чечулин" :city "Екатеринбург/Алапаевск" :rider-id "RwurohWA"}
   {:type :rider-info :name "Александр" :surname "Волков" :city "Алапаевск" :rider-id "RshouR04"}
   {:type :rider-info :name "Константин" :surname "Захаров" :city "Екатеринбург" :rider-id "R10PqxEw"}
   {:type :rider-info :name "Андрей" :surname "Кондовин" :city "Екатеринбург" :rider-id "RmBjZyEY"}
   {:type :rider-info :name "Александр" :surname "Храмцов" :city "Екатеринбург" :rider-id "RCz8kS6k"}
   {:type :rider-info :name "Иван" :surname "Заполоцкий" :city "Екатеринбург" :rider-id "RIKqozno"}
   {:type :rider-info :name "Андрей" :surname "Ковалев" :city "Екатеринбург" :rider-id "RiMGf7oI"}
   {:type :rider-info :name "Дмитрий" :surname "Кандышев" :city "Алапаевск" :rider-id "RxeCrUAk"}
   {:type :rider-info :name "Дамир" :surname "Резванов" :city "Верхняя Пышма" :rider-id "RFzBrKHY"}
   {:type :rider-info :name "Александр" :surname "Федяев" :city "Екатеринбург" :rider-id "RDH4HTck"}
   {:type :rider-info :name "Борис" :surname "Гладышев" :city "Верхняя Пышма" :rider-id "RCZyas8"}
   {:type :rider-info :name "Степан" :surname "Алексеев" :city "Екатеринбург" :rider-id "RCoCA6Xs"}
   {:type :rider-info :name "Роман" :surname "Важенин" :city "Екатеринбург" :rider-id "RW5zQztI"}
   {:type :rider-info :name "Владимир" :surname "Лазеев" :city "Екатеринбург" :rider-id "RKXKEmkA"}
   {:type :rider-info :name "Владислав" :surname "Шорохов" :city "Нейво-Рудянка" :rider-id "RFPjegVg"}
   {:type :rider-info :name "Владимир" :surname "Килунин" :city "с. Кировское" :rider-id "RKoZfzks"}
   {:type :rider-info :name "Владислав" :surname "Фатеев" :city "Верхняя Пышма" :rider-id "R8i7hTp0"}
   {:type :rider-info :name "Павел" :surname "Митрофанов" :city "п. Растущий" :rider-id "RbbnMh9g"}
   {:type :rider-info :name "Никита" :surname "Полозников" :city "Нейво-Рудянка" :rider-id "RRVuYbVc"}
   {:type :rider-info :name "Вячеслав" :surname "Алферьев" :city "Реж" :rider-id "RcIoMI10"}
   {:type :rider-info :name "Дмитрий" :surname "Аленьковский" :city "Екатеринбург" :rider-id "RGdCqHQo"}
   {:type :rider-info :name "Константин" :surname "Сыров" :city "Екатеринбург" :rider-id "RlQJzaP4"}
   {:type :rider-info :name "Семен" :surname "Волков" :city "Екатеринбург" :rider-id "RO4OQFE"}
   {:type :rider-info :name "Дмитрий" :surname "Бахарев" :city "Арамиль" :rider-id "RuwaqKHI"}
   {:type :rider-info :name "Евгений" :surname "Захаров" :city "Березовский" :rider-id "RiipdHG4"}
   {:type :rider-info :name "Иван" :surname "Ведерников" :city "Кунгур" :rider-id "R4amJcM"}
   {:type :rider-info :name "Константин" :surname "Табанин" :city "Екатеринбург" :rider-id "RB3WiZSU"}
   {:type :rider-info :name "Андрей" :surname "Кожемяков" :city "Артемовский" :rider-id "RTGWNTkI"}
   {:type :rider-info :name "Владислав" :surname "Чибаков" :city "Сысерь" :rider-id "Ra4cOCKE"}
   {:type :rider-info :name "Геронтий" :surname "Гогиберидзе" :city "Екатеринбург" :rider-id "RUvIZr2U"}
   {:type :rider-info :name "Александр" :surname "Рахмеев" :city "Екатеринбург" :rider-id "RXbZSoP8"}
   {:type :rider-info :name "Павел" :surname "Хисамутдинов" :city "Лосиный" :rider-id "RhBlsahU"}
   {:type :rider-info :name "Руслан" :surname "Кунакбаев" :city "п. Октябрьский" :rider-id "RFugjCM"}
   {:type :rider-info :name "Денис" :surname "Пастухов" :city "п. Октябрьский" :rider-id "R7udvraU"}
   {:type :rider-info :name "Артем" :surname "Сердитых" :city "п. Северка" :rider-id "RR4Z2d8k"}
   {:type :rider-info :name "Сергей" :surname "Солодянкин" :city "Екатеринбург" :rider-id "RnHhhav8"}
   {:type :rider-info :name "Андрей" :surname "Озорнин" :city "Первоуральск" :rider-id "ROZFKhdo"}
   {:type :rider-info :name "Лев" :surname "Буторин" :city "Ишим" :rider-id "RYOzKqCA"}
   {:type :rider-info :name "Павел" :surname "Андреев" :city "Челябинск" :rider-id "RNi1mywA"}
   {:type :rider-info :name "Тимофей" :surname "Доросинский" :city "Екатеринбург" :rider-id "R0pkDxsU"}
   {:type :rider-info :name "Алексей" :surname "Власов" :city "Ишим" :rider-id "RJ1kvjHw"}
   {:type :rider-info :name "Николай" :surname "Авдюшев" :city "Верхняя Тура" :rider-id "RmLkjDWY"}
   {:type :rider-info :name "Константин" :surname "Вилисов" :city "Ревда" :rider-id "RfkWVeDY"}
   {:type :rider-info :name "Петр" :surname "Хардин" :city "Тюмень" :rider-id "R5xLQcmM"}
   {:type :rider-info :name "Алексей" :surname "Мамашев" :city "Среднеуральск" :rider-id "RVT7XLBU"}
   {:type :rider-info :name "Денис" :surname "Румянцев" :city "Нижняя Тура" :rider-id "RSWx1pX0"}
   {:type :rider-info :name "Сергей" :surname "Блохин" :city "Качканар" :rider-id "R15PNRJE"}
   {:type :rider-info :name "Сергей" :surname "Андраманов" :city "Качканар" :rider-id "RoMTDrYc"}
   {:type :rider-info :name "Андрей" :surname "Корелин" :city "Качканар" :rider-id "R3iQuMIU"}
   {:type :rider-info :name "Михаил" :surname "Пашов" :city "Качканар" :rider-id "Rapi1Vw"}
   {:type :rider-info :name "Александр" :surname "Беляков" :city "Ревда" :rider-id "R3m8ykk"}
   {:type :rider-info :name "Евгений" :surname "Морозов" :city "Тюмень" :rider-id "RRrdvThM"}
   {:type :rider-info :name "Владимир" :surname "Мыкалов" :city "Челябинск" :rider-id "RAE7vMAA"}
   {:type :rider-info :name "Павел" :surname "Гостюхин" :city "Тюмень" :rider-id "Rtm0K93E"}
   {:type :rider-info :name "Артем" :surname "Савичев" :city "Екатеринбург" :rider-id "RkbyURS0"}
   {:type :rider-info :name "Алексей" :surname "Васильев" :city "Екатеринбург" :rider-id "RJQcd0J4"}
   {:type :rider-info :name "Дмитрий" :surname "Никитин" :city "Пермь" :rider-id "RnViecow"}
   {:type :rider-info :name "Сергей" :surname "Авдюков" :city "-" :rider-id "RLOzwBRw"}
   {:type :rider-info :name "Алексей" :surname "Санаров" :city "Березовский" :rider-id "R13DH1B8"}
   {:type :rider-info :name "Игорь" :surname "Хайруллов" :city "Екатеринбург" :rider-id "REOHRffQ"}
   {:type :rider-info :name "Максим" :surname "Морозов" :city "Екатеринбург" :rider-id "Ru9Fv0YY"}
   {:type :rider-info :name "Роман" :surname "Максимов" :city "Кыштым" :rider-id "RjyhFtjE"}
   {:type :rider-info :name "Макар" :surname "Шангареев" :city "Верхняя Пышма" :rider-id "R9q8UDpM"}
   {:type :rider-info :name "Спартак" :surname "Шангареев" :city "Верхняя Пышма" :rider-id "R245JNpI"}
   {:type :rider-info :name "Матвей" :surname "Донских" :city "Березовский" :rider-id "RBVWDgx0"}
   {:type :rider-info :name "Никита" :surname "Зырянов" :city "Березовский" :rider-id "R5qBedXo"}
   {:type :rider-info :name "Егор" :surname "Султангалеев" :city "Березовский" :rider-id "RG3J3ehQ"}
   {:type :rider-info :name "Иван" :surname "Моисеевских" :city "Березовский" :rider-id "R4JMxDSs"}
   {:type :rider-info :name "Антон" :surname "Юрин" :city "Тюмень" :rider-id "RRz0RTtY"}
   {:type :rider-info :name "Артем" :surname "Баранов" :city "Екатеринбург" :rider-id "RaCyVjM"}
   {:type :rider-info :name "Егор" :surname "Павлов" :city "Екатеринбург" :rider-id "R1ryt6MA"}
   {:type :rider-info :name "Юрий" :surname "Дьячков" :city "Нижняя Салда" :rider-id "Re9k9pyU"}
   {:type :rider-info :name "Антон" :surname "Бородин" :city "Верхняя Салда" :rider-id "R9eRtwwY"}
   {:type :rider-info :name "Антон" :surname "Кадников" :city "Екатеринбург" :rider-id "R47au04w"}
   {:type :rider-info :name "Илья" :surname "Болотов" :city "Алапаевск" :rider-id "Rm2tfVsc"}
   {:type :rider-info :name "Леонид" :surname "Чепиль" :city "Верхняя Пышма" :rider-id "Rjuvljh0"}
   {:type :rider-info :name "Владимир" :surname "Кадырин" :city "Верхняя Пышма" :rider-id "RpXYEGVs"}
   {:type :rider-info :name "Станислав" :surname "Карелин" :city "п. Растущий" :rider-id "Raje9iys"}
   {:type :rider-info :name "Петр" :surname "Антонов" :city "Верхняя Салда" :rider-id "RQYglj8"}
   {:type :rider-info :name "Антон" :surname "Юнусов" :city "Екатеринбург" :rider-id "RkTd518"}
   {:type :rider-info :name "Дмитрий" :surname "Канюков" :city "Тюмень" :rider-id "RkE2rJlQ"}
   {:type :rider-info :name "Михаил" :surname "Чесноков" :city "Нижний Тагил" :rider-id "Rq9Kleac"}
   {:type :rider-info :name "Никита" :surname "Насонов" :city "Екатеринбург" :rider-id "RhzP0hhM"}
   {:type :rider-info :name "Алексей" :surname "Ширяев" :city "Екатеринбург" :rider-id "RNKyY124"}
   {:type :rider-info :name "Иван" :surname "Баранков" :city "Екатеринбург" :rider-id "RFebzKsQ"}
   {:type :rider-info :name "Владислав" :surname "Куклин" :city "Алапаевск" :rider-id "Rfzi8xw4"}
   {:type :rider-info :name "Иван" :surname "Кенчин" :city "Верхняя Салда" :rider-id "Rih2p458"}
   {:type :rider-info :name "Павел" :surname "Татаринов" :city "Верхняя Салда" :rider-id "RnJ9ysYI"}
   {:type :rider-info :name "Равиль" :surname "Сарваров" :city "Верхняя Салда" :rider-id "RN15YAlM"}
   {:type :rider-info :name "Егор" :surname "Новопашин" :city "Верхняя Салда" :rider-id "RBs2OaGA"}
   {:type :rider-info :name "Кирилл" :surname "Новопашин" :city "Верхняя Салда" :rider-id "RUY7AHxY"}
   {:type :rider-info :name "Артем" :surname "Новопашин" :city "Верхняя Салда" :rider-id "RKdJAdQU"}
   {:type :rider-info :name "Федор" :surname "Колпаков" :city "Нейво-Рудянка" :rider-id "RGoZomf0"}
   {:type :rider-info :name "Андрей" :surname "Русинов" :city "Нейво-Рудянка" :rider-id "RJG0H3hE"}
   {:type :rider-info :name "Александр" :surname "Локшин" :city "Екатеринбург" :rider-id "RQv5yLo0"}
   {:type :rider-info :name "Артем" :surname "Максимов" :city "Верхняя Салда" :rider-id "Rz7dsdxU"}
   {:type :rider-info :name "Дмитрий" :surname "Максимов" :city "Челябинк" :rider-id "RiYBYhJE"}
   {:type :rider-info :name "Александр" :surname "Матвеев" :city "Верхняя Пышма" :rider-id "R0IwJYs"}
   {:type :rider-info :name "Евгений" :surname "Перевощиков" :city "Верхняя Пышма" :rider-id "RqT69jy0"}
   {:type :rider-info :name "Алексей" :surname "Шестаков" :city "Алапаевск" :rider-id "RCCLhGQY"}
   {:type :rider-info :name "Даниил" :surname "Доронин" :city "пгт. В. Синячиха" :rider-id "RcOS0DM"}
   {:type :rider-info :name "Сергей" :surname "Клевцов" :city "пгт. В. Синячиха" :rider-id "Rg6oOkao"}
   {:type :rider-info :name "Михаил" :surname "Бобыкин" :city "Алапаевск" :rider-id "RODIVUbQ"}
   {:type :rider-info :name "Сергей" :surname "Кузьмин" :city "Каменск-Уральский" :rider-id "RUOxeVd0"}
   {:type :rider-info :name "Константин" :surname "Никитин" :city "Верхняя Салда" :rider-id "RasgwV9o"}
   {:type :rider-info :name "Никита" :surname "Глухов" :city "Алапаевск" :rider-id "R3iVGez4"}
   {:type :rider-info :name "Александр" :surname "Перов" :city "Екатеринбург" :rider-id "RgRXNjfU"}
   {:type :rider-info :name "Владимир" :surname "Архипов" :city "Тюмень" :rider-id "RqbgKc9U"}
   {:type :rider-info :name "Алексей" :surname "Опаков" :city "Екатеринбург" :rider-id "RI314EdI"}
   {:type :rider-info :name "Станислав" :surname "Карнаухов" :city "Екатеринбург" :rider-id "RBGJ1FYw"}
   {:type :rider-info :name "Александр" :surname "Полехин" :city "Нижний Тагил" :rider-id "RfldnoFM"}
   {:type :rider-info :name "Рашид" :surname "Ибрагимов" :city "Тюмень" :rider-id "RGLxFvt4"}
   {:type :rider-info :name "Дмитрий" :surname "Бобков" :city "Верхняя Пышма" :rider-id "RAPHMjw"}
   {:type :rider-info :name "Вячеслав" :surname "Лопатин" :city "Березовский" :rider-id "RLEtUs0"}
   {:type :rider-info :name "Сергей" :surname "Сивинских" :city "Березовский" :rider-id "RCgJdXEo"}
   {:type :rider-info :name "Денис" :surname "Борисов" :city "Екатеринбург" :rider-id "RJpsjJxk"}
   {:type :rider-info :name "Евгений" :surname "Сухотин" :city "Екатеринбург" :rider-id "RaTSEFYk"}
   {:type :rider-info :name "Александр" :surname "Кайнов" :city "пгт. В. Синячиха" :rider-id "RUDEy064"}
   {:type :rider-info :name "Анатолий" :surname "Середкин" :city "пгт. В. Синячиха" :rider-id "RZrIYVuc"}
   {:type :rider-info :name "Владислав" :surname "Светлаков" :city "Ревда" :rider-id "RX1YPxl0"}
   {:type :rider-info :name "Матвей" :surname "Мангилев" :city "Екатеринбург" :rider-id "RlssEWwM"}
   {:type :rider-info :name "Дмитрий" :surname "Пудов" :city "Екатеринбург" :rider-id "Rsfzc8"}
   {:type :rider-info :name "Михаил" :surname "Пудов" :city "Екатеринбург" :rider-id "RtSEodUo"}
   {:type :rider-info :name "Вячеслав" :surname "Волков" :city "Алапаевск" :rider-id "R1kZx8bY"}
   {:type :rider-info :name "Леонид" :surname "Старков" :city "Екатеринбург" :rider-id "Rxx7EU"}
   {:type :rider-info :name "Иван" :surname "Коркин" :city "Екатеринбург" :rider-id "RUnKy7UQ"}
   {:type :rider-info :name "Павел" :surname "Пудов" :city "Екатеринбург" :rider-id "Rfz3myis"}
   {:type :rider-info :name "Алексей" :surname "Родионов" :city "Екатеринбург" :rider-id "RoCpoHuA"}
   {:type :rider-info :name "Олег" :surname "Гоголев" :city "Екатеринбург" :rider-id "R5ZFeTb0"}
   {:type :rider-info :name "Константин" :surname "Яковлев" :city "Екатеринбург" :rider-id "ReIhirxc"}
   {:type :rider-info :name "Михаил" :surname "Сычев" :city "Екатеринбург" :rider-id "RMtAf7lM"}
   {:type :rider-info :name "Роман" :surname "Лукин" :city "Екатеринбург" :rider-id "RVEHnFdA"}
   {:type :rider-info :name "Олег" :surname "Садыков" :city "Верхняя Пышма" :rider-id "RpvZyTE"}
   {:type :rider-info :name "Константин" :surname "Бачев" :city "Первоуральск" :rider-id "RMMsBXMM"}
   {:type :rider-info :name "Андрей" :surname "Богомолов" :city "Екатеринбург" :rider-id "RnLl06h4"}
   {:type :rider-info :name "Павел" :surname "Федоровых" :city "Богданович" :rider-id "RknjLHyw"}
   {:type :rider-info :name "Андрей" :surname "Ляшенко" :city "Екатеринбург" :rider-id "RxLMHjc"}
   {:type :rider-info :name "Андрей" :surname "Антонов" :city "Первоуральск" :rider-id "RydBK9rs"}
   {:type :rider-info :name "Виталий" :surname "Фуртаев" :city "Первоуральск" :rider-id "Rc7d3KAA"}
   {:type :rider-info :name "Тимофей" :surname "Тихонов" :city "Верхняя Салда" :rider-id "ReKi5pc4"}
   {:type :rider-info :name "Евгений" :surname "Подъезжих" :city "Асбест" :rider-id "RDsqHZrs"}
   {:type :rider-info :name "Егор" :surname "Борняков" :city "Екатеринбург" :rider-id "RVr71meE"}
   {:type :rider-info :name "Андрей" :surname "Крюков" :city "Арамиль" :rider-id "Rzb3Okfw"}
   {:type :rider-info :name "Илья" :surname "Саргин" :city "Н. Шайтанский" :rider-id "RLuDXd0Q"}
   {:type :rider-info :name "Савелий" :surname "Кунакбаев" :city "Полевской" :rider-id "RVohUR30"}
   {:type :rider-info :name "Денис" :surname "Кунакбаев" :city "Полевской" :rider-id "RLdxpdQ8"}
   {:type :rider-info :name "Андрей" :surname "Каратаев" :city "-" :rider-id "RqNVmi4"}
   {:type :rider-info :name "Алексей" :surname "Пилипчук" :city "Екатеринбург" :rider-id "RXMKzTVM"}
   {:type :rider-info :name "Александр" :surname "Доросинский" :city "Екатеринбург" :rider-id "ROkEDfJA"}
   {:type :rider-info :name "Николай" :surname "Карпенко" :city "Верхняя Салда" :rider-id "RajpdO5I"}
   {:type :rider-info :name "Матвей" :surname "Иванов" :city "Тюмень" :rider-id "RY8eGyUM"}
   {:type :rider-info :name "Игорь" :surname "Куценко" :city "Тюмень" :rider-id "RrHnVXA"}
   {:type :rider-info :name "Денис" :surname "Булатов" :city "Нейво-Рудянка" :rider-id "RHDH590"}
   {:type :rider-info :name "Федор" :surname "Щвецов" :city "Верхняя Синячиха" :rider-id "RbWUUNqk"}
   {:type :rider-info :name "Евгений" :surname "Камаев" :city "Сухой лог" :rider-id "RQ7mxw"}
   {:type :rider-info :name "Сергей" :surname "Гулонян" :city "Сухой лог" :rider-id "RWI1Sp0U"}
   {:type :rider-info :name "Алексей" :surname "Кузнецов" :city "Сухой лог" :rider-id "RAs7f1Z4"}
   {:type :rider-info :name "Евгений" :surname "Жилин" :city "Екатеринбург" :rider-id "RVyo06go"}
   {:type :rider-info :name "Аркадий" :surname "Баландин" :city "Пермь" :rider-id "R8El9DK8"}
   {:type :rider-info :name "Дмитрий" :surname "Брызгалов" :city "Екатеринбург" :rider-id "RjL3uLjI"}
   {:type :rider-info :name "Максим" :surname "Бормотов" :city "Екатеринбург" :rider-id "RVulNtM"}
   {:type :rider-info :name "Сергей" :surname "Тронин" :patronymic "Александрович" :city "Тюмень" :rider-id "RkmtXQ14"}
   {:type :rider-info :name "Андрей" :surname "Журавлев" :patronymic "Александрович" :city "Екатеринбург" :rider-id "R9UqVsMY"}
   {:type :rider-info :name "Сергей" :surname "Мезенцев" :patronymic "Дмитриевич" :city "Пермь" :rider-id "RBVCjRco"}
   {:type :rider-info :name "Семён" :surname "Костяев" :patronymic "Сергеевич" :city "Екатеринбург" :rider-id "RJlxVhA"}
   {:type :rider-info :name "Вадим" :surname "Черевко" :patronymic "Владимирович" :city "Пермь" :rider-id "RRgXbmME"}
   {:type :rider-info :name "Артем" :surname "Копытов" :patronymic "-" :city "Тюмень" :rider-id "RQ79KDD0"}
   {:type :rider-info :name "Константин" :surname "Бортничук" :patronymic "Сергеевич" :city "Каменск-Уральский" :rider-id "Rf2SYcVI"}
   {:type :rider-info :name "Кирилл" :surname "Пешков" :patronymic "Геннадьевич" :city "Краснокамск" :rider-id "RRZcoLV0"}
   {:type :rider-info :name "Владимир" :surname "Мусихин" :patronymic "Алексеевич" :city "Горнозаводск" :rider-id "R5MGRdUM"}
   {:type :rider-info :name "Владимир" :surname "Богомолов" :patronymic "Леонидович" :city "Екатеринбург" :rider-id "RrgUnWCg"}
   {:type :rider-info :name "Леонид" :surname "Леонтьев" :patronymic "Сергеевич" :city "Тюмень" :rider-id "RPCnm9kU"}
   {:type :rider-info :name "Александр" :surname "Удачин" :patronymic "Леонидович" :city "Катайск" :rider-id "RqRVZPVU"}
   {:type :rider-info :name "Антон" :surname "Ершов" :patronymic "-" :city "Камышлов" :rider-id "Rn15S8Wk"}
   {:type :rider-info :name "Иван" :surname "Замиралов" :patronymic "Михайлович" :city "Талица" :rider-id "RbrdNpCs"}
   {:type :rider-info :name "Иван" :surname "Швейкерт" :patronymic "Валерьевич" :city "Челябинск" :rider-id "Rgaeuw9I"}
   {:type :rider-info :name "Дмитрий" :surname "Чистяков" :patronymic "Александрович" :city "Полевской" :rider-id "R61oBnFc"}
   {:type :rider-info :name "Михаил" :surname "Харламенков" :patronymic "Владимирович" :city "Ирбит" :rider-id "R7pRl6w"}
   {:type :rider-info :name "Матвей" :surname "Филимонов" :patronymic "-" :city "Полевской" :rider-id "RoBB8IgA"}
   {:type :rider-info :name "Кирилл" :surname "Терентьев" :patronymic "-" :city "Полевской" :rider-id "RF6D081w"}
   {:type :rider-info :name "Алексей" :surname "Петров" :patronymic "Алексеевич" :city "Екатеринбург" :rider-id "RylS2lxg"}
   {:type :rider-info :name "Александр" :surname "Громов" :patronymic "Николаевич" :city "Полевской" :rider-id "RDHZ6Svg"}
   {:type :rider-info :name "Денис" :surname "Меньшиков" :patronymic "Сергеевич" :city "Катайск" :rider-id "Rwhc7PU"}
   {:type :rider-info :name "Михаил" :surname "Ялунин" :patronymic "-" :city "Богданович" :rider-id "RynfBofk"}
   {:type :rider-info :name "Александр" :surname "Ковелин" :patronymic "Алексеевич" :city "Камышлов" :rider-id "RqF6uQx8"}
   {:type :rider-info :name "Сергей" :surname "Тимофеев" :patronymic "Владимирович" :city "Тюмень" :rider-id "ReDE2Ti8"}
   {:type :rider-info :name "Андрей" :surname "Кокшаров" :patronymic "Анатольевич" :city "Екатеринбург" :rider-id "RPDszJms"}
   {:type :rider-info :name "Иван" :surname "Черемисов" :patronymic "Полевской," :city "Свердловская" :rider-id "R7TNs9vQ"}
   {:type :rider-info :name "Артём" :surname "Белых" :patronymic "Юрьевич" :city "Косулино" :rider-id "RC9K7A0g"}
   {:type :rider-info :name "Иван" :surname "Бояркин" :patronymic "Витальевич" :city "Ирбит" :rider-id "RdsdWrKQ"}
   {:type :rider-info :name "Арсен" :surname "Байрамуков" :patronymic "Парисбиевич" :city "Златоуст" :rider-id "R0j8dnFg"}
   {:type :rider-info :name "Сергей" :surname "Попов" :patronymic "Дмитриевич" :city "Тюмень" :rider-id "R1YYTekw"}
   {:type :rider-info :name "Андрей" :surname "Коковин" :patronymic "Валерьевич" :city "Сухой Лог" :rider-id "RHSfZmUI"}
   {:type :rider-info :name "Евгений" :surname "Горин" :patronymic "Юрьевич" :city "Богданович" :rider-id "RiyaVa6E"}
   {:type :rider-info :name "Алексей" :surname "Любимов" :patronymic "Иванович" :city "Екатеринбург" :rider-id "RMhNyvsY"}
   {:type :rider-info :name "Евгений" :surname "Бекетов" :patronymic "Викторович" :city "Богданович" :rider-id "RWeycbjI"}
   {:type :rider-info :name "Денис" :surname "Токмин" :patronymic "Александрович" :city "Богданович" :rider-id "RLaXoHxE"}
   {:type :rider-info :name "Станислав" :surname "Сысков" :patronymic "Валерьевич" :city "Екатеринбург" :rider-id "RBJtVrOE"}
   {:type :rider-info :name "Андрей" :surname "Степанов" :patronymic "Владимирович" :city "Тюмень" :rider-id "RbO7L1I"}
   {:type :rider-info :name "Дмитрий" :surname "Бурыкин" :patronymic "Николаевич" :city "Екатеринбург" :rider-id "RWdbKm48"}
   {:type :rider-info :name "Денис" :surname "Ефимов" :patronymic "-" :city "Талица" :rider-id "RLKOJSow"}
   {:type :rider-info :name "Максим" :surname "Логинов" :patronymic "Игоревич" :city "Екатеринбург" :rider-id "RcEOklhY"}
   {:type :rider-info :name "Евгений" :surname "Шубин" :patronymic "Александрович" :city "Каменск-Уральский" :rider-id "RdPQQ760"}
   {:type :rider-info :name "Никита" :surname "Лебедев" :patronymic "Владимирович" :city "Екатеринбург" :rider-id "RNOk7Unw"}
   {:type :rider-info :name "Артём" :surname "Потапов" :patronymic "Николаевич" :city "Сухой Лог" :rider-id "RMVglTOA"}
   {:type :rider-info :name "Андрей" :surname "Садыков" :patronymic "Юрьевич" :city "Сухой Лог" :rider-id "RIpWbKmQ"}
   {:type :rider-info :name "Дмитрий" :surname "Тренин" :patronymic "Игоревич" :city "Мартюш" :rider-id "RooDMgB8"}
   {:type :rider-info :name "Андре" :surname "Долматов" :patronymic "Юрьевит" :city "Ирбит" :rider-id "RUEhlk8c"}
   {:type :rider-info :name "Михаил" :surname "Романенко" :patronymic "Александрович" :city "Екатеринбург" :rider-id "R9juVsQs"}
   {:type :rider-info :name "Роман" :surname "Коковин" :patronymic "Валерьевич" :city "Сухой Лог" :rider-id "RsPBmcOQ"}
   {:type :rider-info :name "Евгений" :surname "Каргапольцев" :patronymic "Александрович" :city "Екатеринбург" :rider-id "RMhnra8"}
   {:type :rider-info :name "Иван" :surname "Киприн" :patronymic "Валерьевич" :city "Ирбит" :rider-id "RlfLZPHU"}
   {:type :rider-info :name "Артём" :surname "Щукин" :patronymic "Александрович" :city "Полевской" :rider-id "RWPcEnGI"}
   {:type :rider-info :name "Антон" :surname "Боровских" :patronymic "Михайлович" :city "Асбест" :rider-id "RdkZTOSI"}
   {:type :rider-info :name "Денис" :surname "Дзюбин" :patronymic "Александрович" :city "Тюмень" :rider-id "RxeIKvzw"}
   {:type :rider-info :name "Александр" :surname "Зайцев" :patronymic "Алексеевич" :city "Екатеринбург" :rider-id "R8i5xzTo"}
   {:type :rider-info :name "Антон" :surname "Болныгин" :patronymic "Александрович" :city "Тюмень" :rider-id "R2uTxzQs"}
   {:type :rider-info :name "Роман" :surname "Панов" :patronymic "Николаевич" :city "Троицкий" :rider-id "RFMufn6A"}
   {:type :rider-info :name "Николай" :surname "Половников" :patronymic "Евгеньевич" :city "Камышлов" :rider-id "R3qlSVNc"}
   {:type :rider-info :name "Станислав" :surname "Макуха" :patronymic "Андреевич" :city "Тюмень" :rider-id "R1wge2wM"}
   {:type :rider-info :name "Максим" :surname "Солин" :patronymic "Александрович" :city "Екатеринбург" :rider-id "RIyFqG4Q"}
   {:type :rider-info :name "Борис" :surname "Коваленко" :patronymic "Игоревич" :city "Екатеринбург" :rider-id "R7LsAt1E"}
   {:type :rider-info :name "Кирилл" :surname "Ауэрбах" :patronymic "Дмитриевич" :city "Екатеринбург" :rider-id "RZnvBAmY"}
   {:type :rider-info :name "Андрей" :surname "Щипунов" :patronymic "Николаевич" :city "Копейск" :rider-id "RutyJmGw"}
   {:type :rider-info :name "Владимир" :surname "Боровских" :patronymic "Александрович" :city "Камышлов" :rider-id "Reyvt7xo"}
   {:type :rider-info :name "Дмитрий" :surname "Григоренко" :patronymic "Александрович" :city "Курган" :rider-id "RpTMGbB4"}
   {:type :rider-info :name "Александр" :surname "Капустин" :patronymic "Владимирович" :city "Богданович" :rider-id "RKc2o85M"}
   {:type :rider-info :name "Андрей" :surname "Тужилов" :patronymic "Анатольевич" :city "Екатеринбург" :rider-id "RkvTD2Uo"}
   {:type :rider-info :name "Андрей" :surname "Кудин" :patronymic "Анатольевич" :city "Талица" :rider-id "RUhaQxnM"}

   {:city "Касли" :name "Юлия" :surname "Сирбаева" :patronymic "Радиковна" :rider-id "RsB6iL8Q"}
   {:city "Екатеринбург" :name "Алиса" :surname "Белоногова" :patronymic "Антоновна" :rider-id "ReQeG7tA"}
   {:city "Екатеринбург" :name "Мария" :surname "Бессонова" :patronymic "Александровна" :rider-id "RnTKEIbc"}
   {:city "Сургут" :name "Наталья" :surname "Дроздова" :patronymic "Владимировна" :rider-id "RlkocRA8"}
   {:city "Коркино" :name "Анжелика" :surname "Гареева" :patronymic "Геннадьевна" :rider-id "RHWynxnw"}
   {:city "Тюмень" :name "Роман" :surname "Алёхин" :patronymic "Андреевич" :rider-id "RCY9qSVo"}
   {:city "Коркино" :name "Алексей" :surname "Угрюмов" :patronymic "Владимирович" :rider-id "RCSd4AkM"}
   {:city "Челябинск" :name "Валерий" :surname "Варгасов" :patronymic "Викторович" :rider-id "RsHke85o"}
   {:city "Каменск-Уральский" :name "Андрей" :surname "Строшков" :patronymic "Сергеевич" :rider-id "RZSmBDLw"}
   {:city "Губкинский" :name "Роман" :surname "Данилевский" :patronymic "Романович" :rider-id "RPOFca5Y"}
   {:city "Екатеринбург" :name "Евгений" :surname "Ганичев" :patronymic "Александрович" :rider-id "RwfO6nqY"}
   {:city "Челябинск" :name "Александр" :surname "Мальков" :rider-id "RN6tnqw"}
   {:city "Челябинск" :name "Евгений" :surname "Полунин" :patronymic "Михайлович" :rider-id "R4TPVxKU"}
   {:city "Тюмень" :name "Денис" :surname "Саликов" :patronymic "Сафаевич" :rider-id "RSE1Wbr0"}
   {:city "Горнозаводск" :name "Денис" :surname "Копытов" :patronymic "Алексеевич" :rider-id "RoD3S0Vg"}
   {:city "Екатеринбург" :name "Илья" :surname "Луценко" :patronymic "Сергеевич" :rider-id "RtiLXImk"}
   {:city "Челябинск" :name "Дмитрий" :surname "Абдрахманов" :patronymic "Гауситдинович" :rider-id "REa5mJKo"}
   {:city "Екатеринбург" :name "Евгений" :surname "Папулов" :patronymic "Александрович" :rider-id "RKuaEM3w"}
   {:city "Озёрск" :name "Dmitrii" :surname "Prikin" :patronymic "Аleksandrovich" :rider-id "R5pwNdWg"}
   {:city "Митино" :name "Вадим" :surname "Плеханов" :patronymic "Сергеевич" :rider-id "RuMf6qc"}
   {:city "Златоуст" :name "Кирилл" :surname "Кузнецов" :patronymic "Константинович" :rider-id "RFQDkfBQ"}
   {:city "Ревда" :name "Евгений" :surname "Соловьев" :rider-id "RILfOFnI"}
   {:city "Екатеринбург" :name "Александр" :surname "Обухов" :patronymic "Алексеевич" :rider-id "RuCVk0Pg"}
   {:city "Красногорский" :name "Илья" :surname "Чебыкин" :patronymic "Евгеньевич" :rider-id "RUEqRFnE"}
   {:city "Екатеринбург" :name "Николай" :surname "Мишунин" :patronymic "Сергеевич" :rider-id "RNGhE530"}
   {:city "Екатеринбург" :name "Иван" :surname "Першин" :patronymic "Алексеевич" :rider-id "RLAjXprU"}
   {:city "Сысерть" :name "Эдуард" :surname "Лысцов" :rider-id "RnYBKbw"}
   {:city "Екатеринбург" :name "Олег" :surname "Лазарев" :rider-id "RkhuJ6oU"}
   {:city "Еманжелинск" :name "Арсений" :surname "Вшивков" :patronymic "Вадимович" :rider-id "RWRsXuVU"}
   {:city "Полевской" :name "Иван" :surname "Вострецов" :patronymic "Сергеевич" :rider-id "RmLK3CU4"}
   {:city "Нягань" :name "Владислав" :surname "Николаев" :patronymic "Алексеевич" :rider-id "RApMDEIA"}
   {:city "Казань" :name "Линар" :surname "Яруллин" :rider-id "RF45YTtc"}
   {:city "Миасс" :name "Денис" :surname "Деренченко" :patronymic "Александрович" :rider-id "RkfVl2E"}
   {:city "Челябинск" :name "Марк" :surname "Хашковский" :patronymic "Андреевич" :rider-id "RbYXgyrg"}
   {:city "Тюмень" :name "Иван" :surname "Чедаев" :patronymic "Михайлович" :rider-id "RuLctGp8"}
   {:city "Новый Уренгой" :name "Евгений" :surname "Осадчий" :patronymic "Александрович" :rider-id "RfQILJAw"}
   {:city "Магнитогорск" :name "Андрей" :surname "Бадьин" :patronymic "Николаевич" :rider-id "RjroNjDY"}
   {:city "Озёрск" :name "Егор" :surname "Харитонов" :patronymic "Владимирович" :rider-id "RrnOKmU"}
   {:city "Петропавловск" :name "Дмитрий" :surname "Резницкий" :patronymic "Владимирович" :rider-id "RcYeOj4w"}
   {:city "Екатеринбург" :name "Илья" :surname "Садовой" :patronymic "Александрович" :rider-id "R5SOvLQA"}
   {:city "Усть-Катав" :name "Александр" :surname "Ремесленников" :patronymic "Анатольевич" :rider-id "RJatDMI"}
   {:city "Усть-Катав" :name "Артём" :surname "Ремесленников" :patronymic "Александрович" :rider-id "RU3iOrTk"}
   {:city "Челябинск" :name "Анатолий" :surname "Горбачев" :patronymic "Анатольевич" :rider-id "RRjFfjE0"}
   {:city "Златоуст" :name "Артем" :surname "Кремлев" :patronymic "Сергеевич" :rider-id "RczQc2kA"}
   {:city "Губкинский" :name "Виталий" :surname "Голов" :patronymic "Витальевич" :rider-id "R1gySRMQ"}
   {:city "Миасс" :name "Илья" :surname "Юдин" :patronymic "Алексеевич" :rider-id "Rz2s4kQ0"}
   {:city "Новый Уренгой" :name "Рустам" :surname "Еникеев" :patronymic "Вилюрович" :rider-id "RNGObAvo"}
   {:city "Новый Уренгой" :name "Павел" :surname "Водовозов" :patronymic "Андреевич" :rider-id "R0mlkw5E"}
   {:city "Челябинск" :name "Павел" :surname "Иванов" :patronymic "Евгеньевич" :rider-id "ROMw2JU8"}
   {:city "Озёрск" :name "Александр" :surname "Лабутин" :patronymic "Евгеньевич" :rider-id "RimfdCS0"}
   {:city "Уфа" :name "Александр" :surname "Любченко" :patronymic "Валерьевич" :rider-id "RmsIUMkM"}
   {:city "Южноуральск" :name "Михаил" :surname "Соловьев" :patronymic "Сергеевич" :rider-id "RrVmG4Wc"}
   {:city "Челябинск" :name "Арсений" :surname "Исмагилов" :patronymic "Алексеевич" :rider-id "RkUtMM0s"}
   {:city "Учалы" :name "Ильдус" :surname "Сулейманов" :rider-id "R4RqSnNs"}
   {:city "Екатеринбург" :name "Дмитрий" :surname "Дьяков" :rider-id "RvPRMJeg"}
   {:city "Нижний Тагил" :name "Александр" :surname "Антипин" :rider-id "RN3YvdG8"}
   {:city "Озёрск" :name "Дмитрий" :surname "Прикин" :rider-id "Rvd0qqhI"}
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
