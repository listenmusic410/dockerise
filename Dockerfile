#it is a running version- 1
FROM openjdk:17-jdk-slim
WORKDIR /app

COPY target/*.jar springrest.jar
CMD ["java", "-jar", "springrest.jar"]


#docker network create mynetwork

#docker build -t docotest .

#docker run -d -p 1234:7417 --name docotest --network mynetwork   docotest 



#set DOCKER_HOST = tcp://127.0.0.1:2375