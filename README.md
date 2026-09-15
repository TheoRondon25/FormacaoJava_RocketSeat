# 📚 Formação Java — RocketSeat

Repositório criado para reunir e documentar toda a minha evolução durante a **Formação Java da RocketSeat**: os projetos feitos em aula junto com a professora e os desafios/projetos que desenvolvo por conta própria para fixar o conteúdo.

A ideia é que este repositório funcione como um "diário de bordo" da minha jornada em Java — desde os fundamentos da linguagem até a construção de APIs REST completas com Spring Boot.

---

## 🗂️ Estrutura do repositório

O repositório é dividido em duas pastas principais, cada uma com um propósito diferente:

```
FormacaoJava_RocketSeat/
├── Formacao_Java_RocketSeat/           # Projetos feitos DURANTE as aulas (junto com a professora)
│   ├── meu-programa/                   # Fundamentos de Java (POO, coleções, JavaBeans...)
│   ├── maven-rocket/                   # Introdução ao Maven + JDBC (PostgreSQL)
│   ├── primeiro-projeto-springboot/    # Primeiros passos com Spring Boot (IoC/DI, Controllers)
│   └── gestao_vagas/                   # API completa de gestão de vagas (Spring Boot + Security + JWT)
│
└── Projetos_Praticos_Java_RocketSeat/  # Desafios práticos feitos POR CONTA PRÓPRIA, para treinar
    ├── api-de-cursos/                  # API REST de gerenciamento de cursos
    └── sistema-livraria/               # Sistema de gerenciamento de livraria (em desenvolvimento)
```

### 🎓 `Formacao_Java_RocketSeat/`
Aqui ficam os projetos construídos **durante as aulas do curso**, acompanhando o passo a passo ensinado pela professora. Servem como referência do conteúdo visto em cada módulo da formação.

### 💪 `Projetos_Praticos_Java_RocketSeat/`
Aqui ficam os **desafios propostos ao final de cada módulo**, que eu desenvolvo sozinho para colocar em prática o que foi aprendido nas aulas. São os "projetinhos de treino".

---

## 🚀 Projetos

### Formação (aulas)

#### 1. `meu-programa`
Projeto usado para praticar os **fundamentos da linguagem Java**, organizado por tópico dentro de pacotes:
- `je_poo` — introdução à Programação Orientada a Objetos (classes `Cliente`, `Sistema`)
- `je_pilares_poo` — os 4 pilares da POO (herança e polimorfismo com `MSNMessenger`, `FacebookMessenger`, `SistemaMensagemInstantanea`)
- `je_javaBeans` — conceito de JavaBeans (`Aluno`, `Objetos`)
- `je_arrays` — coleções em Java: Listas, Conjuntos, Mapas e Generics
- `je_expressoes` — expressões e operadores básicos
- `ContaCorrente.java` e `MinhaPrimeiraClasse.java` — exercícios iniciais de sintaxe e lógica

**Tecnologias:** Java puro (sem frameworks)

#### 2. `maven-rocket`
Primeiro contato com o **Maven** como gerenciador de dependências e build, integrado a um pequeno sistema de cadastro que se conecta a um banco **PostgreSQL** via **JDBC**.
- `SistemaCadastro` / `Cadastro` / `CadastroRepository` — camada de domínio e persistência
- `FabricaConexao` / `JDBCPostgres` — conexão manual com o banco via JDBC

**Tecnologias:** Java, Maven, JDBC, PostgreSQL

#### 3. `primeiro-projeto-springboot`
Primeiro projeto com **Spring Boot**, focado em entender os conceitos de **Inversão de Controle (IoC)** e **Injeção de Dependência (DI)**.
- `PrimeiraController` — primeiro endpoint REST criado no curso
- `ioc_di/MeuComponent` e `MeuControllerComponent` — exemplos práticos de IoC/DI com `@Component`

**Tecnologias:** Java, Spring Boot, Maven

#### 4. `gestao_vagas`
Projeto mais completo da formação até o momento: uma **API REST para gestão de vagas de emprego**, com autenticação separada para candidatos e empresas.

Principais features implementadas:
- Cadastro e autenticação de **candidatos** e **empresas** (módulos `candidate` e `company`)
- Autenticação via **JWT**, com providers próprios (`JWTProvider`, `JWTCandidateProvider`)
- Filtros de segurança customizados (`SecurityFilter`, `SecurityCandidateFilter`) e configuração central (`SecurityConfig`)
- CRUD de vagas (`JobController`, `JobEntity`, `JobRepository`)
- Perfil de candidato (`ProfileCandidateUseCase`)
- Tratamento global de exceções (`ExceptionHandlerController`, `UserFoundException`)
- Persistência com **Spring Data JPA** + **PostgreSQL**, com banco subindo via **Docker Compose**

**Tecnologias:** Java, Spring Boot, Spring Security, Spring Data JPA, PostgreSQL, JWT (`java-jwt`), Lombok, Docker

---

### Desafios práticos (treino)

#### 1. `api-de-cursos`
Desafio prático de construção de uma **API REST para gerenciamento de cursos**, aplicando os conceitos de Spring Boot e JPA vistos em aula sem o passo a passo guiado.

**Tecnologias:** Java, Spring Boot, Spring Data JPA, PostgreSQL, Lombok

#### 2. `sistema-livraria`
Desafio prático de um **sistema de gerenciamento de livraria**. 

---

## 🛠️ Tecnologias e ferramentas utilizadas

Ao longo da formação, as principais tecnologias trabalhadas são:

- **Java** (fundamentos, POO, coleções)
- **Maven** (gerenciamento de dependências e build)
- **Spring Boot** (Web, IoC/DI)
- **Spring Data JPA** (persistência)
- **Spring Security + JWT** (autenticação e autorização)
- **PostgreSQL** (banco de dados relacional)
- **Docker / Docker Compose** (subida do banco de dados em ambiente local)
- **Lombok** (redução de boilerplate)

---

## ▶️ Como rodar os projetos

A maioria dos projetos Spring Boot deste repositório segue o mesmo fluxo básico:

1. Acesse a pasta do projeto desejado, por exemplo:
   ```bash
   cd Formacao_Java_RocketSeat/gestao_vagas
   ```
2. Caso o projeto possua um `docker-compose.yml` (ex: `gestao_vagas`), suba o banco de dados:
   ```bash
   docker-compose up -d
   ```
3. Rode a aplicação usando o Maven Wrapper:
   ```bash
   ./mvnw spring-boot:run
   ```
   *(no Windows, use `mvnw.cmd spring-boot:run`)*

Cada projeto possui seu próprio `pom.xml` com as dependências específicas necessárias.

---

## 🎯 Objetivo do repositório

- Documentar minha evolução prática em Java, do zero até tópicos mais avançados (APIs REST, segurança, persistência).
- Servir como portfólio de estudo, mostrando tanto o conteúdo acompanhado em aula quanto minha capacidade de aplicar esse conteúdo sozinho nos desafios práticos.
- Ser uma referência futura para revisar conceitos e reaproveitar trechos de código em outros projetos.

---

## 👤 Autor

Feito por **Theo Rondon** durante a Formação Java da [RocketSeat](https://www.rocketseat.com.br/).
