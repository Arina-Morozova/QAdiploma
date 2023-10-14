# План автоматизации тестирования сценариев покупки тура дебетовой и кредитной картами
## 1. Перечень автоматизируемых сценариев.
***
Валидные данные карты:
- Номер карты - 16 цифр
- Срок действия карты - месяц, год, дата не ранее текущей даты
- Фамилия и имя владельца - латинскими буквами
- Код cvc - 3 цифры

Номера карт: 4444 4444 4444 4441, 4444 4444 4444 4442
***

### Сценарий 1. Успешная оплата по дебетовой карте с валидными данными:
1. Нажать кнопку Купить
2. Ввести валидные данные дебетовой карты
3. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД появляются данные дебетовой карты с указанием успешной покупки, пользователь видит сообщение "Покупка совершена успешно".
***
### Сценарий 2. Неуспешная оплата по дебетовой карте с неверным номером карты:
1. Нажать кнопку Купить
2. Ввести неверный номер дебетовой карты
3. Ввести валидные данные дебетовой карты: срок действия карты, фамилия и имя владельца, код cvc
4. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, пользователь видит сообщение "Введены неверные данные карты".
***
### Сценарий 3. Неуспешная оплата по дебетовой карте с неверным сроком действия карты:
1. Нажать кнопку Купить
2. Ввести неверный срок действия дебетовой карты
3. Ввести валидные данные дебетовой карты: номер карты, фамилия и имя владельца, код cvc
4. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, пользователь видит сообщение "Введены неверные данные карты".
***
### Сценарий 4. Неуспешная оплата по дебетовой карте с неверными фамилией и именем владельца карты:
1. Нажать кнопку Купить
2. Ввести неверные фамилию и имя владельца дебетовой карты
3. Ввести валидные данные дебетовой карты: номер карты, срок действия, код cvc
4. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, пользователь видит сообщение "Введены неверные данные карты".
***
### Сценарий 5. Неуспешная оплата по дебетовой карте с неверным кодом cvc карты:
1. Нажать кнопку Купить
2. Ввести неверный код cvc дебетовой карты
3. Ввести валидные данные дебетовой карты: номер карты, срок действия, фамилия и имя владельца
4. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, пользователь видит сообщение "Введены неверные данные карты".
***
### Сценарий 6. Неуспешная оплата по заблокированной дебетовой карте:
1. Нажать кнопку Купить
2. Ввести валидные данные заблокированной дебетовой карты
3. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, пользователь видит сообщение "Карта заблокирована".
***
### Сценарий 7. Неуспешная оплата по дебетовой карте, когда во время покупки отключился интернет:
1. Нажать кнопку Купить
2. Ввести валидные данные дебетовой карты
3. Нажать кнопку Оплатить
4. Отключить интернет

*Ожидаемый результат:* в БД не появилось новых записей, покупка прервалась, пользователь видит сообщение "Нет подключения к Интернету".
***
### Сценарий 8. Неуспешная оплата по дебетовой карте с номером карты менее 16 цифр:
1. Нажать кнопку Купить
2. Ввести номер дебетовой карты из 15 цифр
3. Ввести валидные данные дебетовой карты: срок действия карты, фамилия и имя владельца, код cvc
4. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, пользователь видит сообщение "Неверный формат данных".
***
### Сценарий 9. Неуспешная оплата по дебетовой карте со сроком действия карты с прошедшей датой:
1. Нажать кнопку Купить
2. Ввести срок действия дебетовой карты прошедшую дату
3. Ввести валидные данные дебетовой карты: номер карты, фамилия и имя владельца, код cvc
4. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, покупка прервалась, пользователь видит сообщение "Неверный формат данных".
***
### Сценарий 10. Неуспешная оплата по дебетовой карте со сроком действия карты с несуществующим месяцем:
1. Нажать кнопку Купить
2. Ввести срок действия дебетовой карты с месяцем, большим чем 12
3. Ввести валидные данные дебетовой карты: номер карты, фамилия и имя владельца, код cvc
4. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, покупка прервалась, пользователь видит сообщение "Неверный формат данных".
***
### Сценарий 11. Неуспешная оплата по дебетовой карте с фамилией и именем владельца карты русскими буквами:
1. Нажать кнопку Купить
2. Ввести фамилию и имя владельца дебетовой карты русскими буквами
3. Ввести валидные данные дебетовой карты: номер карты, срок действия, код cvc
4. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, покупка прервалась, пользователь видит сообщение "Неверный формат данных".
***
### Сценарий 12. Неуспешная оплата по дебетовой карте с фамилией и именем владельца карты цифрами:
1. Нажать кнопку Купить
2. Ввести фамилию и имя владельца дебетовой карты цифрами
3. Ввести валидные данные дебетовой карты: номер карты, срок действия, код cvc
4. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, покупка прервалась, пользователь видит сообщение "Неверный формат данных".
***
### Сценарий 13. Неуспешная оплата по дебетовой карте с фамилией и именем владельца карты спец.символами:
1. Нажать кнопку Купить
2. Ввести фамилию и имя владельца дебетовой карты спец.символами
3. Ввести валидные данные дебетовой карты: номер карты, срок действия, код cvc
4. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, покупка прервалась, пользователь видит сообщение "Неверный формат данных".
***
### Сценарий 14. Неуспешная оплата по дебетовой карте с номером карты буквами:
1. Нажать кнопку Купить
2. Ввести номер дебетовой карты буквами
3. Ввести валидные данные дебетовой карты: срок действия карты, фамилия и имя владельца, код cvc
4. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, пользователь видит сообщение "Неверный формат данных".
***
### Сценарий 15. Неуспешная оплата по дебетовой карте с номером карты спец.символами:
1. Нажать кнопку Купить
2. Ввести номер дебетовой карты спец.символами
3. Ввести валидные данные дебетовой карты: срок действия карты, фамилия и имя владельца, код cvc
4. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, пользователь видит сообщение "Неверный формат данных".
***
### Сценарий 16. Неуспешная оплата по дебетовой карте с кодом cvc менее 3 цифр:
1. Нажать кнопку Купить
2. Ввести код cvc дебетовой карты менее 3 цифр
3. Ввести валидные данные дебетовой карты: номер карты, срок действия карты, фамилия и имя владельца
4. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, пользователь видит сообщение "Неверный формат данных".
***
### Сценарий 17. Неуспешная оплата по дебетовой карте с кодом cvc буквами:
1. Нажать кнопку Купить
2. Ввести код cvc дебетовой карты буквами
3. Ввести валидные данные дебетовой карты: номер карты, срок действия карты, фамилия и имя владельца
4. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, пользователь видит сообщение "Неверный формат данных".
***
### Сценарий 18. Неуспешная оплата по дебетовой карте с кодом cvc спец.символами:
1. Нажать кнопку Купить
2. Ввести код cvc дебетовой карты спец.символами
3. Ввести валидные данные дебетовой карты: номер карты, срок действия карты, фамилия и имя владельца
4. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, пользователь видит сообщение "Неверный формат данных".
***
### Сценарий 19. Неуспешная оплата по дебетовой карте с пустым полем номера карты:
1. Нажать кнопку Купить
2. Ввести валидные данные дебетовой карты: срок действия карты, фамилия и имя владельца, код cvc
3. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, пользователь видит сообщение "Неверный формат данных".
***
### Сценарий 20. Неуспешная оплата по дебетовой карте с пустым полем фамилия и имя владельца карты:
1. Нажать кнопку Купить
2. Ввести валидные данные дебетовой карты: номер карты, срок действия, код cvc
3. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, покупка прервалась, пользователь видит сообщение "Неверный формат данных".
***
### Сценарий 21. Неуспешная оплата по дебетовой карте с пустым полем кода cvc:
1. Нажать кнопку Купить
2. Ввести валидные данные дебетовой карты: номер карты, срок действия карты, фамилия и имя владельца
3. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, пользователь видит сообщение "Неверный формат данных".
***
### Сценарий 22. Успешная оплата по кредитной карте с валидными данными:
1. Нажать кнопку Купить в кредит
2. Ввести валидные данные кредитной карты
3. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД появляются данные кредитной карты с указанием успешной покупки, пользователь видит сообщение "Покупка совершена успешно".
***
### Сценарий 23. Неуспешная оплата по кредитной карте с неверным номером карты:
1. Нажать кнопку Купить в кредит
2. Ввести неверный номер кредитной карты
3. Ввести валидные данные кредитной карты: срок действия карты, фамилия и имя владельца, код cvc
4. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, пользователь видит сообщение "Введены неверные данные карты".
***
### Сценарий 24. Неуспешная оплата по кредитной карте с неверным сроком действия карты:
1. Нажать кнопку Купить в кредит
2. Ввести неверный срок действия кредитной карты
3. Ввести валидные данные кредитной карты: номер карты, фамилия и имя владельца, код cvc
4. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, пользователь видит сообщение "Введены неверные данные карты".
***
### Сценарий 25. Неуспешная оплата по кредитной карте с неверными фамилией и именем владельца карты:
1. Нажать кнопку Купить в кредит
2. Ввести неверные фамилию и имя владельца кредитной карты
3. Ввести валидные данные кредитной карты: номер карты, срок действия, код cvc
4. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, пользователь видит сообщение "Введены неверные данные карты".
***
### Сценарий 26. Неуспешная оплата по кредитной карте с неверным кодом cvc карты:
1. Нажать кнопку Купить в кредит
2. Ввести неверный код cvc кредитной карты
3. Ввести валидные данные кредитной карты: номер карты, срок действия, фамилия и имя владельца
4. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, пользователь видит сообщение "Введены неверные данные карты".
***
### Сценарий 27. Неуспешная оплата по заблокированной кредитной карте:
1. Нажать кнопку Купить в кредит
2. Ввести валидные данные заблокированной кредитной карты
3. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, пользователь видит сообщение "Карта заблокирована".
***
### Сценарий 28. Неуспешная оплата по кредитной карте, когда баланс меньше суммы покупки:
1. Установить лимит кредитной карты 10 000 руб.
2. Нажать кнопку Купить в кредит
3. Ввести валидные данные кредитной карты
4. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, лимит остался 10 000 руб., пользователь видит сообщение "Превышен лимит средств".
***
### Сценарий 29. Неуспешная оплата по кредитной карте, когда во время покупки отключился интернет:
1. Нажать кнопку Купить в кредит
2. Ввести валидные данные кредитной карты
3. Нажать кнопку Оплатить
4. Отключить интернет

*Ожидаемый результат:* в БД не появилочь новых записей, покупка прервалась, пользователь видит сообщение "Нет подключения к Интернету".
***
### Сценарий 30. Неуспешная оплата по кредитной карте с номером карты менее 16 цифр:
1. Нажать кнопку Купить в кредит
2. Ввести номер кредитной карты из 15 цифр
3. Ввести валидные данные кредитной карты: срок действия карты, фамилия и имя владельца, код cvc
4. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, пользователь видит сообщение "Неверный формат данных".
***
### Сценарий 31. Неуспешная оплата по кредитной карте со сроком действия карты с прошедшей датой:
1. Нажать кнопку Купить в кредит
2. Ввести срок действия кредитной карты прошедшую дату
3. Ввести валидные данные кредитной карты: номер карты, фамилия и имя владельца, код cvc
4. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, покупка прервалась, пользователь видит сообщение "Неверный формат данных".
***
### Сценарий 32. Неуспешная оплата по кредитной карте со сроком действия карты с несуществующим месяцем:
1. Нажать кнопку Купить в кредит
2. Ввести срок действия кредитной карты с месяцем, большим чем 12
3. Ввести валидные данные кредитной карты: номер карты, фамилия и имя владельца, код cvc
4. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, покупка прервалась, пользователь видит сообщение "Неверный формат данных".
***
### Сценарий 33. Неуспешная оплата по кредитной карте с фамилией и именем владельца карты русскими буквами:
1. Нажать кнопку Купить в кредит
2. Ввести фамилию и имя владельца кредитной карты русскими буквами
3. Ввести валидные данные кредитной карты: номер карты, срок действия, код cvc
4. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, покупка прервалась, пользователь видит сообщение "Неверный формат данных".
***
### Сценарий 34. Неуспешная оплата по кредитной карте с фамилией и именем владельца карты цифрами:
1. Нажать кнопку Купить в кредит
2. Ввести фамилию и имя владельца кредитной карты цифрами
3. Ввести валидные данные кредитной карты: номер карты, срок действия, код cvc
4. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, покупка прервалась, пользователь видит сообщение "Неверный формат данных".
***
### Сценарий 35. Неуспешная оплата по кредитной карте с фамилией и именем владельца карты спец.символами:
1. Нажать кнопку Купить в кредит
2. Ввести фамилию и имя владельца кредитной карты спец.символами
3. Ввести валидные данные кредитной карты: номер карты, срок действия, код cvc
4. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, покупка прервалась, пользователь видит сообщение "Неверный формат данных".
***
### Сценарий 36. Неуспешная оплата по кредитной карте с номером карты буквами:
1. Нажать кнопку Купить в кредит
2. Ввести номер кредитной карты буквами
3. Ввести валидные данные кредитной карты: срок действия карты, фамилия и имя владельца, код cvc
4. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, пользователь видит сообщение "Неверный формат данных".
***
### Сценарий 37. Неуспешная оплата по кредитной карте с номером карты спец.символами:
1. Нажать кнопку Купить в кредит
2. Ввести номер кредитной карты спец.символами
3. Ввести валидные данные кредитной карты: срок действия карты, фамилия и имя владельца, код cvc
4. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, пользователь видит сообщение "Неверный формат данных".
***
### Сценарий 38. Неуспешная оплата по кредитной карте с кодом cvc менее 3 цифр:
1. Нажать кнопку Купить в кредит
2. Ввести код cvc кредитной карты менее 3 цифр
3. Ввести валидные данные кредитной карты: номер карты, срок действия карты, фамилия и имя владельца
4. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, пользователь видит сообщение "Неверный формат данных".
***
### Сценарий 39. Неуспешная оплата по кредитной карте с кодом cvc буквами:
1. Нажать кнопку Купить в кредит
2. Ввести код cvc кредитной карты буквами
3. Ввести валидные данные кредитной карты: номер карты, срок действия карты, фамилия и имя владельца
4. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, пользователь видит сообщение "Неверный формат данных".
***
### Сценарий 40. Неуспешная оплата по кредитной карте с кодом cvc спец.символами:
1. Нажать кнопку Купить в кредит
2. Ввести код cvc кредитной карты спец.символами
3. Ввести валидные данные кредитной карты: номер карты, срок действия карты, фамилия и имя владельца
4. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, пользователь видит сообщение "Неверный формат данных".
***
### Сценарий 41. Неуспешная оплата по кредитной карте с пустым полем номера карты:
1. Нажать кнопку Купить в кредит
2. Ввести валидные данные кредитной карты: срок действия карты, фамилия и имя владельца, код cvc
3. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, пользователь видит сообщение "Неверный формат данных".
***
### Сценарий 42. Неуспешная оплата по кредитной карте с пустым полем фамилия и имя владельца карты:
1. Нажать кнопку Купить в кредит
2. Ввести валидные данные кредитной карты: номер карты, срок действия, код cvc
3. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, покупка прервалась, пользователь видит сообщение "Неверный формат данных".
***
### Сценарий 43. Неуспешная оплата по кредитной карте с пустым полем кода cvc:
1. Нажать кнопку Купить в кредит
2. Ввести валидные данные кредитной карты: номер карты, срок действия карты, фамилия и имя владельца
3. Нажать кнопку Оплатить

*Ожидаемый результат:* в БД не появилось новых записей, пользователь видит сообщение "Неверный формат данных".
***

Окружение:  
*Устройство:* ноутбук.  
*Операционная система:* Windows 10.  
*IDE:* IntelliJ IDEA 2023.1.3 (Community Edition).  
*Java:* OpenJDK 11.
***

## 2. Перечень используемых инструментов с обоснованием выбора.
***Java***. Являясь языком программирования с открытым исходным кодом, Java имеет ряд преимуществ. Во-первых, он снижает затраты на процесс разработки приложений. Во-вторых, разработчики легко изменяют язык и часто обновляют его, поскольку он имеет открытый код. Кроме того, Java обладает простым для чтения синтаксисом, который упрощает разработку приложений для интернета и мобильных устройств.

***JUnit5***. Обновления доступны немедленно и легко используемы, выполнение исключений, параметризованные тесты.

***Gradle***. Gradle - это инструмент автоматизации сборки с открытым исходным кодом, ориентированный на гибкость и производительность.

***Git***. Консольная утилита, для отслеживания и ведения истории изменения файлов, в вашем проекте. С помощью Git-a вы можете откатить свой проект до более старой версии, сравнивать, анализировать или сливать свои изменения в репозиторий.

***Selenide***. Библиотека для написания лаконичных и стабильных UI тестов с открытым исходным кодом. Selenide - идеальный выбор для разработчиков, потому что у неё очень низкая кривая обучения.

***IntelliJ IDEA***. Ведущая IDE для разработки на Java и Kotlin. Она помогает работать продуктивнее за счет интеллектуальной помощи в написании кода, надежных рефакторингов, быстрой навигации по коду, широкого набора встроенных инструментов разработчика, поддержки веб- и корпоративной разработки и многих других полезных возможностей.

***Postman***. Сервис для создания, тестирования, документирования, публикации и обслуживания API. Он позволяет создавать коллекции запросов к любому API, применять к ним разные окружения, настраивать мок-серверы, писать автотесты на JavaScript, анализировать и визуализировать результаты запросов.

***DBeaver***. Бесплатная система управления базами данных, позволяющая создавать новые базы, модифицировать данные в существующих, выполнять SQL-запросы. Данный инструмент совместим со многими известными СУБД, среди которых — MySQL и PostgreSQL.

## 3. Перечень и описание возможных рисков при автоматизации.
- высокие затраты времени, в следствие высокая стоимость;
- если приложение обновится, некоторые тесты не будут работать;
- если приложение упадёт, не будет возможности автоматизировать.

## 4. Интервальная оценка с учётом рисков в часах.
***Без учёта рисков:*** 40 часов  
***С учётом рисков:*** 50 часов

## 5. План сдачи работ.
Автотесты и результаты их прогона будут готовы к 25.10.2023.