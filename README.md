Descrição

First Spring App é uma API REST completa desenvolvida com Java e Spring Boot, que permite o CRUD de usuários com integração a MySQL, incluindo criação automática de tabelas via JPA/Hibernate.

O projeto demonstra boas práticas de programação orientada a objetos, arquitetura modular e tratamento centralizado de exceções, sendo um excelente exemplo de backend moderno para portfólio ou aplicações profissionais.

🏗 Arquitetura do Projeto

O projeto está organizado em camadas, seguindo boas práticas de design:

com.example.first_spring_app
├── controller   # Endpoints REST
├── domain       # Entidades JPA (User)
├── repository   # Repositórios Spring Data JPA
├── service      # Lógica de negócio
├── infra        # Tratamento global de exceções
├── exceptions   # Exceções customizadas
└── FirstSpringAppApplication.java  # Classe principal Spring Boot

⚙ Funcionalidades

✅ Criar usuário (POST /users)

✅ Listar todos os usuários (GET /users)

✅ Buscar usuário por ID (GET /users/{id})

✅ Atualizar usuário (PUT /users/{id})

✅ Deletar usuário (DELETE /users/{id})

✅ Tratamento centralizado de erros (@ControllerAdvice)

✅ Persistência de dados com MySQL e JPA/Hibernate

✅ Criação automática de tabelas pelo Hibernate

🔧 Tecnologias

Java 17+

Spring Boot 3+

Spring Web

Spring Data JPA

Hibernate

MySQL

REST API

Maven

Postman

💡 Exemplos de Uso
Criar usuário
POST /users
Content-Type: application/json

{
  "name": "Daniel",
  "email": "daniel@example.com"
}


Resposta:

{
  "id": 1,
  "name": "Daniel",
  "email": "daniel@example.com"
}

Listar todos os usuários
GET /users


Resposta:

[
  {
    "id": 1,
    "name": "Daniel",
    "email": "daniel@example.com"
  },
  {
    "id": 2,
    "name": "Maria",
    "email": "maria@example.com"
  }
]

Tratamento de erros
GET /users/999


Resposta:

{
  "error": "Usuário não encontrado"
}

🛠 Como Rodar o Projeto

Clone o repositório:

git clone https://github.com/seuusuario/first-spring-app.git
cd first-spring-app


Configure o MySQL no application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/first_spring_db
spring.datasource.username=root
spring.datasource.password=1234
spring.jpa.hibernate.ddl-auto=update


Rode a aplicação:

mvn spring-boot:run


Teste os endpoints com Postman, Insomnia ou curl.

🚀 Possíveis Extensões

Paginação e filtros avançados

Autenticação JWT e controle de acesso

Testes unitários e de integração 

Transformar em microservice com Docker e Kubernetes

Integração com frontend (React / Angular / Vue)

📈 Visão Geral

Demonstra fluxo completo do backend, da requisição HTTP à persistência no MySQL.

🧑‍💻 Autor

Daniel de Almeida – Linkedin: https://www.linkedin.com/in/daniel-de-almeida-dev/ 
