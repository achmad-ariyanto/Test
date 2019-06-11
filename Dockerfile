FROM openjdk:8
ADD target/demo-spring-booth-with-docker.jar demo-spring-booth-with-docker.jar
EXPOSE 80
ENTRYPOINT ["java", "-jar", "demo-spring-booth-with-docker.jar"]
