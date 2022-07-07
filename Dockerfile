FROM openjdk:17
COPY target/kcdafricaspringboot-0.0.1-SNAPSHOT.jar kcdafricaspringboot-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar", "kcdafricaspringboot-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080
