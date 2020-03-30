FROM openjdk:8-jdk-alpine
COPY target/*.jar purchase-service.jar
ENTRYPOINT ["java", "-jar", "/purchase-service.jar"]
EXPOSE 8089