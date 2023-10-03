FROM openjdk:17
EXPOSE 8081
ADD target/dockerfirst.jar dockerfirst.jar
ENTRYPOINT ["java","-jar","/dockerfirst.jar"]