# Baixando a imagem do OpenJDK 17
FROM openjdk:17

# Define a pasta de trabalho do container
WORKDIR /app

# Copia todos os arquivos para a pasta de trabalho do container
COPY . /app

# Executa o build do projeto
RUN ./mvnw -B -DskipTests clean package

# Define a porta dentro do container onde o projeto irá rodar
EXPOSE 8082

# Executa o projeto quando o container for inicializado
CMD ["java", "-jar", "target/ProductsApi-0.0.1-SNAPSHOT.jar"]