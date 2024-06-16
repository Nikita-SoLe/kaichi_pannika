FROM openjdk:21.0.3-slim-bullseye

COPY src/target/*.jar app.jar

ENTRYPOINT [ "java", "-jar", "/app.jar" ]