# 🔹 Desafio Técnico Mérito Júnior #1 – Cadastro e Consulta de Abastecimentos

[Acesso ao planejamento](https://tree.taiga.io/project/libiamanoela-desafio-merito/backlog)

Este projeto é a solução para o Desafio Técnico Júnior de desenvolvimento de uma aplicação para gestão de abastecimentos em um posto de combustível. A aplicação foi desenvolvida utilizando **Java** com o framework **Spring Boot** para oferecer uma **API RESTful** e uma interface web simples para cadastro e consulta dos dados.

## 🛠 Tecnologias Utilizadas

* **Linguagem:** Java
* **Framework:** Spring Boot
* **Persistência (ORM):** Spring Data JPA / Hibernate
* **Banco de Dados:** H2 Database (em memória para o desenvolvimento/teste)
* **Documentação:** SpringDoc/Swagger UI
* **Dependências Auxiliares:** Lombok (para simplificar entidades)

## 📌 Funcionalidades Implementadas

A aplicação cobre as operações básicas de CRUD e consulta para as três entidades principais:

### ✅ Entidades e Operações (CRUD)

| Entidade | Campos Principais | Relacionamentos |
| :--- | :--- | :--- |
| **Combustível** | Nome, Preço por Litro | - |
| **Bomba** | Nome da Bomba | Relacionada a um `Combustível` (`@ManyToOne`) |
| **Abastecimento** | Data, Litros, Valor Total | Relacionado a uma `Bomba` (`@ManyToOne`) |

### ✅ Requisitos Atendidos

* **Estrutura do Projeto:** Utilizando **Maven** com estrutura organizada (pacotes `entidades`, `repository`, `service`, `controllers`).
* **Relacionamentos:** As entidades possuem relacionamentos JPA implementados corretamente (`@ManyToOne`, `@OneToMany`).
* **Interface:** Implementação de uma **API RESTful** para cadastro e consulta, documentada com **Swagger UI**, e uma **Interface Web Simples** (arquivos HTML/JS/CSS estáticos) para visualização e CRUD.
* **Persistência:** Utilização do banco de dados **H2** em memória (`application.properties`) para persistência em tempo de execução.
* **Organização de Código:** Separação em camadas de Controller, Service e Repository (boas práticas DAO).

## 🚀 Como Executar o Projeto

### Pré-requisitos
* Java 17 ou superior
* Maven

### Passos
1.  **Clone o repositório:**
    ```bash
    git clone [LINK_DO_SEU_REPOSITORIO]
    cd desafio-vaga-junior
    ```
2.  **Compile e execute com Maven:**
    ```bash
    ./mvn spring-boot:run
    ```
3.  A aplicação será iniciada na porta padrão do Spring Boot (`8080`).

## 🌐 Acesso à Aplicação e Documentação

Após a execução da aplicação, você pode acessar as interfaces através dos seguintes links:

| Recurso | URL de Acesso | Descrição |
| :--- | :--- | :--- |
| **Documentação Swagger UI** | [http://localhost:8080/swagger-ui/index.html#/](http://localhost:8080/swagger-ui/index.html#/) | Interface interativa para testar e visualizar todos os endpoints da API RESTful. |
| **Interface Web Simples** | [http://localhost:8080/index.html](http://localhost:8080/index.html) | Página principal com links para as interfaces de cadastro e consulta das entidades (Combustível, Bomba, Abastecimento). |
| **Console H2 (Opcional)** | `http://localhost:8080/h2-console` | Para visualização e gerenciamento direto do banco de dados em memória. User: libia e sem senha. |

## 🗺 Endpoints da API RESTful

Para interagir via requisições HTTP, utilize os seguintes endpoints:

### 1. Combustível (Fuel Type) - `http://localhost:8080/combustiveis`

| Método | Descrição |
| :--- | :--- |
| **GET** | Lista todos os Tipos de Combustível. |
| **GET /{id}** | Busca um Tipo de Combustível pelo ID. |
| **POST** | Cadastra um novo Tipo de Combustível. |
| **PUT /{id}** | Atualiza um Tipo de Combustível existente. |
| **DELETE /{id}** | Deleta um Tipo de Combustível. |

### 2. Bomba (Fuel Pump) - `http://localhost:8080/bombas`

| Método | Descrição |
| :--- | :--- |
| **GET** | Lista todas as Bombas de Combustível. |
| **GET /{id}** | Busca uma Bomba pelo ID. |
| **POST** | Cadastra uma nova Bomba (requer `combustivel_id`). |
| **PUT /{id}** | Atualiza uma Bomba existente. |
| **DELETE /{id}** | Deleta uma Bomba. |

### 3. Abastecimento (Refueling) - `http://localhost:8080/abastecimentos`

| Método | Descrição |
| :--- | :--- |
| **GET** | Lista todos os Abastecimentos realizados. |
| **GET /{id}** | Busca um Abastecimento pelo ID. |
| **POST** | Cadastra um novo Abastecimento (requer `bomba_id`, `litros`, `valorTotal`). |
| **PUT /{id}** | Atualiza um Abastecimento. |
| **DELETE /{id}** | Deleta um Abastecimento. |

---
*Desenvolvido por Libia*
