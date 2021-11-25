FROM adoptopenjdk/openjdk11:jre-11.0.11_9-alpine

ENV SERVER_PORT=8080
EXPOSE $SERVER_PORT

WORKDIR /usr/app
COPY build/libs/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]