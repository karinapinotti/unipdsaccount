# 💳 UNIPDS Account API

API REST desenvolvida com Spring Boot para simulação de operações bancárias.

O projeto foi criado para estudo de:

- Spring Boot
- JPA/Hibernate
- Controle transacional
- Services
- Repository Pattern
- Tratamento de exceções
- APIs REST

---

## 🚀 Tecnologias

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven
- MySQL
- REST API

---

## 📂 Estrutura do Projeto

```text
src/main/java/br/com/pinotti/account
├── controller
├── dto
├── exception
├── model
├── repo
└── service
```

---

## 🔄 Fluxo da Transferência

A API realiza transferência entre contas utilizando controle transacional.

### Fluxo:

1. Recebe a requisição REST
2. Busca conta de origem
3. Busca conta de destino
4. Valida se as contas existem
5. Credita valor na conta destino
6. Debita valor da conta origem
7. Salva transação
8. Commit automático

Caso qualquer etapa falhe:

- rollback automático
- nenhuma alteração é salva no banco

---

## 🔒 Controle Transacional

A transferência utiliza:

```java
@Transactional
```

Isso garante:

- Atomicidade
- Consistência
- Isolamento
- Durabilidade

---

## 📌 Endpoint Principal

### Transferência

```http
POST /transfer
```

### Body JSON

```json
{
  "debitAccountNumber": 1,
  "creditAccountNumber": 2,
  "amount": 100.0
}
```

---

## ⚠️ Tratamento de Exceções

### Conta inexistente

```json
{
  "message": "Account #1 does not exists"
}
```

### Saldo insuficiente

```json
{
  "message": "Insufficient balance"
}
```

---

## 🧠 Conceitos Aplicados

- Dependency Injection
- DTO Pattern
- Repository Pattern
- Services
- Exception Handling
- JPA
- Hibernate
- Transactions
- REST APIs

---

## ▶️ Executar Projeto

### Clonar

```bash
git clone https://github.com/karinapinotti/unipdsaccount.git
```

### Entrar na pasta

```bash
cd unipdsaccount
```

### Executar

```bash
mvn spring-boot:run
```

---

## ⚙️ Banco de Dados

Configurar no:

```properties
src/main/resources/application.properties
```

Exemplo:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/accountdb
spring.datasource.username=root
spring.datasource.password=123456

spring.jpa.hibernate.ddl-auto=update
```

---

## 📌 Linguagem do GitHub

Caso o GitHub não reconheça Java corretamente, criar arquivo:

```text
.gitattributes
```

Conteúdo:

```gitattributes
*.java linguist-detectable=true
*.html linguist-detectable=false
*.css linguist-detectable=false
*.js linguist-detectable=false
```

---

## 👩‍💻 Autora

Karina Pinotti

- Software Engineer
- Java Backend Developer
- Data Engineer

GitHub:
https://github.com/karinapinotti
