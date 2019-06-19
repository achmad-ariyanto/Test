FROM openjdk:8
ADD target/account-0.0.3.jar account-0.0.3.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","account-0.0.3.jar"]
