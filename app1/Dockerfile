FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/app1-1.0.0.jar app1.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app1.jar"]