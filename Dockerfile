FROM openjdk:17
WORKDIR /code
COPY . .
EXPOSE 8080
CMD ["./mvnw","spring-boot:run"]