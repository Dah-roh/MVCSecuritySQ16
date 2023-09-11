FROM amazoncorretto:17-al2-jdk
WORKDIR /app
EXPOSE 8082
COPY SecuritySquad16-0.0.1-SNAPSHOT.jar secApp.jar
CMD ["java", "-jar", "secApp.jar"]