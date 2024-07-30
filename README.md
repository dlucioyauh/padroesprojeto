# Projeto Spring Boot com Padrões de Projeto

## Descrição

Este projeto é uma aplicação Spring Boot que explora a implementação de padrões de design clássicos (Gang of Four - GoF) em um cenário de back-end. O objetivo é demonstrar como utilizar padrões de design na prática, aplicando conceitos como Singleton, Factory Method, Observer e outros dentro de uma aplicação Java baseada em Spring Framework.

## Funcionalidades

- **Padrões de Projeto**: Implementação de padrões de design como Singleton, Factory Method, Observer e outros.
- **API REST**: Exposição de endpoints REST para interagir com a aplicação.
- **Persistência de Dados**: Utilização de JPA (Java Persistence API) para persistência de dados.
- **Spring Boot**: Configuração e desenvolvimento com o Spring Boot.

## Estrutura do Projeto

- **`src/main/java/com/exemplo/padroesprojeto`**: Código-fonte da aplicação.
  - **`model`**: Classes de modelo e entidades JPA.
  - **`repository`**: Interfaces de repositório para persistência de dados.
  - **`service`**: Serviços que implementam a lógica de negócios.
  - **`controller`**: Controladores que expõem endpoints REST.
  - **`config`**: Configurações da aplicação.

- **`src/test/java/com/exemplo/padroesprojeto`**: Código de teste.
  - **`model`**: Testes das classes de modelo.
  - **`repository`**: Testes dos repositórios.
  - **`service`**: Testes dos serviços.
  - **`controller`**: Testes dos controladores.

- **`pom.xml`**: Arquivo de configuração do Maven com as dependências do projeto.

## Requisitos

- Java 17 ou superior
- Maven 3.8 ou superior

## Configuração do Ambiente

1. **Navegue até o Diretório do Projeto**

   ```bash
   cd padroesprojeto
