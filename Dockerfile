FROM eclipse-temurin:21-jdk

ADD target/pulsewatch-app.jar pulsewatch-app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "pulsewatch-app.jar"]