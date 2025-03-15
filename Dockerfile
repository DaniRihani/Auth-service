# Use Eclipse Temurin JRE
FROM eclipse-temurin:17-jre-jammy

WORKDIR /app

# Copy the JAR file
COPY target/auth-service.jar app.jar

# Run as non-root user
RUN useradd -m appuser && chown -R appuser /app
USER appuser

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "app.jar"]