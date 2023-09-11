FROM amazoncorretto:17-al2-jdk
WORKDIR /app
EXPOSE 8082
COPY /target/*.jar secApp.jar
CMD ["java", "-jar", "secApp.jar"]