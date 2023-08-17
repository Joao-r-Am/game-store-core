# Projeto Game Store - API de Gerenciamento de Jogos

O projeto **Game Store** é uma API desenvolvida em Java utilizando o framework Spring, que tem como objetivo proporcionar um sistema de gerenciamento de jogos. Através desta API, os usuários poderão consultar jogos existentes no banco de dados e também adicionar novos jogos. O projeto visa oferecer uma solução flexível e escalável para lojas de jogos e entusiastas da indústria de games.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Data JPA
- Spring MVC
- Banco de Dados (PostgreSQL)

## Funcionalidades

### Consulta de Jogos

A API oferece endpoints para consultar informações sobre os jogos presentes no banco de dados. Os usuários podem acessar detalhes como título, imagem e preço de cada jogo.

### Adição de Novos Jogos

Usuários têm a capacidade de adicionar novos jogos ao banco de dados por meio de um endpoint dedicado. A API valida os dados inseridos e armazena o novo jogo no banco de dados.

## Endpoints

A API possui os seguintes endpoints principais:

- `GET /games`: Retorna uma lista de todos os jogos presentes no banco de dados.
- `POST /games`: Permite a adição de um novo jogo ao banco de dados.

## Configuração do Ambiente

1. Clone o repositório do projeto: `git clone https://github.com/Joao-r-Am/game-store-core.git`
2. Importe o projeto em sua IDE preferida (por exemplo, IntelliJ, Eclipse).
3. Configure as informações do banco de dados no arquivo `application.properties` (ou `application.yml`).
