FROM gradle:7.3.0-jdk8 AS build

WORKDIR /app

COPY . /app

RUN gradle clean build


FROM openjdk:11-jre-slin-buster

EXPOSE 8080

COPY --from=build /app/build/libs/contribuyente-0.0.1-SNAPSHOT.jar /app/contribuyente-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/app/contribuyente-0.0.1-SNAPSHOT.jar"]