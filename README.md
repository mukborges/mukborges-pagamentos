# API de Pagamentos
Api para pagamentos desenvolvida em Spring Boot com Java 17.

## Requisitos

Certifique-se de ter as seguintes ferramentas instaladas antes de começar:

- Java 17
- [Spring Boot](https://spring.io/projects/spring-boot)
- [MySQL](https://www.mysql.com/)
- [Model Mapper](http://modelmapper.org/)
- [Lombok](https://projectlombok.org/)
- [Flyway](https://flywaydb.org/)
- Outras dependências utilizadas no projeto (por exemplo, Spring Web, Dev Tools, Spring JPA)

## Configuração do Banco de Dados

Este projeto utiliza o Flyway para migração do banco de dados. Certifique-se de configurar as informações do banco de dados no arquivo `application.properties`.

Exemplo:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco_de_dados
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
