# Use a slim OpenJDK base image
FROM eclipse-temurin:23-jdk

# Create app directory
WORKDIR /app

# Copy the assembled JAR
COPY target/service-runner-1.0-SNAPSHOT.jar app.jar

# Run the app
CMD ["java", "-jar", "app.jar"]