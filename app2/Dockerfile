FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/app2-1.0.0.jar app2.jar

EXPOSE 8081

ENTRYPOINT ["java","-jar","app2.jar"]