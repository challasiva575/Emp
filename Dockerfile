FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY build/libs/Emp-0.0.1-SNAPSHOT.jar emp.jar

EXPOSE 8080

CMD ["java", "-jar", "emp.jar"]