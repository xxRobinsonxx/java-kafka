FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests -Dproject.build.sourceEncoding=UTF-8 -Dmaven.resources.encoding=UTF-8

FROM eclipse-temurin:21-jdk-jammy
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
ARG APP_PORT=8080
ENV SERVER_PORT=${APP_PORT}
EXPOSE ${APP_PORT}
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=prod", "-Dserver.port=${SERVER_PORT}", "app.jar"]