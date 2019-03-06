FROM maven:3.6-jdk-8-alpine
MAINTAINER Nikita Porshnjakov (n.porshnjakov@gmail.com)

COPY pom.xml /usr/local/service/pom.xml
COPY src /usr/local/service/src
WORKDIR /usr/local/service
EXPOSE 80
RUN mvn package
CMD ["java","-jar","target/stack-service-1.0-SNAPSHOT-jar-with-dependencies.jar", "com.task.stack.Main"]