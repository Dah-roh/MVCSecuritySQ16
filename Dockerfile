FROM amazoncorretto:17-al2-jdk
WORKDIR /app
EXPOSE 1233
COPY SecuritySquad16-0.0.1-SNAPSHOT.jar sec-app.jar
CMD ["java", "-jar", "sec-app.jar"]