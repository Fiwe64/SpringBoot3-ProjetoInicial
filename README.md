# Projeto API E-Commerce Spring Boot

Este projeto é uma **API REST** de um sistema de e-commerce desenvolvida com **Spring Boot** baseado no Curso de Java pela Plataforma Udemy ministrada pelo professor **Nelio Alvez**, utilizando **JPA/Hibernate** e **H2 em memória** (para testes), seguindo arquitetura em camadas (**Controller, Service, Repository**) e boas práticas de tratamento de exceções.

---

## 📝 Descrição

O sistema gerencia usuários, pedidos, produtos, categorias, itens de pedidos e pagamentos, permitindo operações **CRUD completas** e tratamento de exceções padronizado em **JSON**.

---

## ⚙️ Tecnologias

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database (perfil test)
- PostgreSQL (perfil dev e prod)
- Maven
- Jackson (serialização/JSON)

---

## 📂 Estrutura de Pacotes

```
com.projetowell.curso
├── entities         # Classes de domínio (User, Order, Product, Category, OrderItem, Payment)
├── repositories     # Interfaces JPARepository
├── services         # Lógica de negócios e tratamento de exceções (ResourceNotFoundException)
├── resources
│   └── exceptions   # Handler global de exceções (ResourceExceptionHandler, StandardError)
└── resources        # Controllers REST
```

---

## 🚀 Pré-requisitos

- Java 17 instalado
- Maven instalado
- (Opcional) PostgreSQL instalado para perfil dev

---

## 🛠️ Configuração

### Perfis de aplicação

- **test** (H2 em memória): configurado em `application-test.properties`
- **dev** (PostgreSQL local): configurado em `application-dev.properties`
- **prod** (Heroku ou outro): configurado em `application-prod.properties`

### application.properties

```
spring.profiles.active=test
```

### application-test.properties

```
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

## 🎬 Rodando a aplicação

```bash
# clonar repositório
git clone <URL_DO_REPOSITORIO>
cd projeto

# rodar em perfil de teste (H2 em memória)
mvn spring-boot:run
```

A API estará disponível em: **http://localhost:8080**

### Console H2

- URL: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
- JDBC URL: `jdbc:h2:mem:testdb`
- User Name: `sa`
- Password: (vazio)

---

## 📝 Endpoints principais

| Método | URL          | Descrição                  |
|--------|--------------|----------------------------|
| GET    | /users       | Listar todos usuários      |
| GET    | /users/{id}  | Buscar usuário por ID      |
| POST   | /users       | Criar novo usuário         |
| PUT    | /users/{id}  | Atualizar usuário existente|
| DELETE | /users/{id}  | Deletar usuário            |
| GET    | /orders      | Listar todos pedidos       |
| GET    | /orders/{id} | Buscar pedido por ID       |
| POST   | /orders      | Criar novo pedido          |

(... consulte todos os endpoints nos controllers correspondentes ...)

---

## ⚙️ Tratamento de Exceções

- **ResourceNotFoundException**: lançada quando entidade não é encontrada.

### Retorno padronizado em JSON via ResourceExceptionHandler:

```json
{
  "timestamp": "2025-07-27T10:00:00Z",
  "status": 404,
  "error": "Resource not found",
  "message": "Resource not found. Id 42",
  "path": "/users/42"
}
```

---

## ☁️ Deploy

Embora o curso ensine **Heroku** (agora pago), você pode usar plataformas gratuitas como **Render** ou **Railway** para deploy:

1. Configurar variáveis de ambiente (`DATABASE_URL`, `JWT_SECRET`, etc.).
2. Definir `spring.profiles.active=prod`.
3. Fazer build e push.

---

## 🎯 Próximos Passos

- Adicionar DTOs para requests/responses
- Implementar Bean Validation (@Valid, @NotNull, @Email)
- Testes unitários com JUnit e Mockito
- Segurança com Spring Security + JWT
- Documentação da API com Swagger (springdoc-openapi)

---

## 🖊️ Autor

**Well**  
🔗 [LinkedIn](https://linkedin.com/in/wellingnton-honney-a93a75241) | 💻 GitHub: [@Fiwe64](https://github.com/Fiwe64)
