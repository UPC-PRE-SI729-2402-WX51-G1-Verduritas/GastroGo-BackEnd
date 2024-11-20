# Usar una imagen base con JDK 21
FROM eclipse-temurin:21-jdk AS build

WORKDIR /app

# Copiar archivos del proyecto
COPY . .

# Compilar usando Maven Wrapper
RUN ./mvnw -DskipTests clean package

# Imagen final para ejecutar
FROM eclipse-temurin:21-jdk

WORKDIR /app

# Copiar el jar generado
COPY --from=build /app/target/*.jar app.jar

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "app.jar"]
