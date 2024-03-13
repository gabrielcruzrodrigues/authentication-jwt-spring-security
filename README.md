# Spring Security JWT

## Tecnologias
* Spring Boot
* Spring MVC
* Spring Security
* Spring Data JDBC
* H2
## Como Executar
* Clonar repositório git:
```
https://github.com/gabrielcruzrodrigues/authentication-jwt-spring-security
```
* Construir o projeto:
```
./mvnw clean package
```
* Executar:
```
java -jar ./target/spring-security-jwt-0.0.1-SNAPSHOT.jar
```
## Endpoints:
* Authenticação, recebendo o Jwt:<br>
POST - http://localhost:8080/authenticate - username:password (httpBasic)

* authorização, conseguindo acesso a rota privada: <br>
GET - http://localhost:8080/private
