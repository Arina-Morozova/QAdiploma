# Шаги для запуска автотестов

## MySQL:
1. Склонировать репозиторий по ссылке с помощью команды `git clone` https://github.com/Arina-Morozova/QAdiploma
2. Открыть проект в программе `IntelliJ IDEA`
3. Запустить контейнер с помощью команды `docker-compose up -d`
4. Запустить приложение с помощью команды `java  "-Dspring.datasource.url=jdbc:mysql://localhost:3306/app" -jar .\artifacts\aqa-shop.jar`
5. Запустить тесты с помощью команды `./gradlew clean test '-Ddb.url=jdbc:mysql://localhost:3306/app'`
6. Открыть отчёт в браузере с помощью команды `./gradlew allureServe`
7. Остановить контейнер с помощью команды `docker compose down`

## PostgreSQL:
1. Склонировать репозиторий по ссылке с помощью команды `git clone` https://github.com/Arina-Morozova/QAdiploma
2. Открыть проект в программе `IntelliJ IDEA`
3. Запустить контейнер с помощью команды `docker-compose up -d`
4. Запустить приложение с помощью команды `java  "-Dspring.datasource.url=jdbc:postgresql://localhost:5432/app" -jar .\artifacts\aqa-shop.jar`
5. Запустить тесты с помощью команды `./gradlew clean test '-Ddb.url=jdbc:postgresql://localhost:5432/app'`
6. Открыть отчёт в браузере с помощью команды `./gradlew allureServe`
7. Остановить контейнер с помощью команды `docker compose down`
