FROM openjdk:21-jdk-slim
VOLUME /APP
ADD target/ems-backend.jar  ems-backend.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","ems-backend.jar"]