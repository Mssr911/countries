FROM openjdk:8u201-jdk-alpine3.9
ADD target/countries-0.0.1-SNAPSHOT.jar .
EXPOSE 7070
CMD java -jar countries-0.0.1-SNAPSHOT.jar

