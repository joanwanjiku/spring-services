FROM openjdk:17-jdk-slim
# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot fat JAR into the container
COPY target/*.jar app.jar

# Expose the port your app listens on (adjust if different)
EXPOSE 8080

# Run the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]