FROM openjdk:8u201-jdk-alpine3.9
VOLUME /tmp
EXPOSE 7070
RUN mkdir -p /app/
RUN mkdir -p /app/logs/
ADD target/countries-0.0.1-SNAPSHOT.jar /app/app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=container", "-jar", "/app/app.jar"]

