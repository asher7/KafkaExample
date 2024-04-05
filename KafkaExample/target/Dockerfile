# Use AdoptOpenJDK 17 as the base image
FROM openjdk17

# Set the working directory inside the container
WORKDIR /app

COPY KafkaExample/target/KafkaExample-0.0.1-SNAPSHOT.jar app.jar

# Specify the entry point for the container
ENTRYPOINT ["java", "-jar", "app.jar"]
# Copy the packaged JAR file into the container
# COPY target/kafkaExample-0.0.1-SNAPSHOT.jar kafkaExample.jar

# Specify the entry point for the container
# ENTRYPOINT ["java", "-jar", "kafkaExample.jar"]
