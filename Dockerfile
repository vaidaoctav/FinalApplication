FROM openjdk:17
COPY build/libs/*.jar testapp.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "testapp.jar"]