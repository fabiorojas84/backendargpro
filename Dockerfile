FROM amazoncorretto:19
MAINTAINER fabiorojas84
COPY target/fabiorojas84-0.0.1-SNAPSHOT.jar fabiorojas-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/fabiorojas84-0.0.1-SNAPSHOT.jar"]

