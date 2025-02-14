FROM eclipse-temurin:18-jdk-alpine
WORKDIR /app
COPY target/notification-service.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"] 