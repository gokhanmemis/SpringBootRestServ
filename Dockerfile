FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=/eafad/test02/target/SpringBootRest-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","-Dserver.port=8080","/app.jar"]