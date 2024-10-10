FROM openjdk:21
ADD target/DockerPostGre.jar MyNewApp.jar
ENTRYPOINT ["java","-jar","MyNewApp.jar"]