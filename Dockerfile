FROM openjdk:11
LABEL maintainer="emirhan.dogandemir"
ADD target/bestcloudforme-0.0.1-SNAPSHOT.jar bestcloudforme.jar
ENTRYPOINT ["java","-jar","bestcloudforme.jar"]