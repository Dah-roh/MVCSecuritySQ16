FROM openjdk:17-slim-bullseye
WORKDIR /app
EXPOSE 1233
COPY SecuritySquad16-0.0.1-SNAPSHOT.jar sec-app.jar
CMD ["java", "-jar", "sec-app.jar"]