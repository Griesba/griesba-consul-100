version: '3'
services:
  hello-service:
    image: openjdk:14-alpine
    volumes:
      - "./hello-service/build/libs/hello-service-0.0.1-SNAPSHOT.jar:/app.jar"
    ports:
      - 8080:8080
    command: "java -jar app.jar"
  users-service:
    image: openjdk:14-alpine
    volumes:
      - "./user-service/build/libs/user-service-0.0.1-SNAPSHOT.jar:/app.jar"
    command: "java -jar app.jar"
  users-service-2:
    image: openjdk:14-alpine
    volumes:
      - "./user-service/build/libs/user-service-0.0.1-SNAPSHOT.jar:/app.jar"
    command: "java -jar app.jar"
  consul:
    image: consul:1.7
    network_mode: host