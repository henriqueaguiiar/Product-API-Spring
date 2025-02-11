
##Product-API REST-SpringBoot##

Descrição do Projeto: API REST para Gerenciamento de Produtos
Este projeto é uma API REST desenvolvida com Spring Boot para realizar operações CRUD (Create, Read, Update, Delete) em uma entidade de produtos. Ele simula o gerenciamento de produtos, onde cada produto possui identificadores como nome, descrição, e preço. A API é integrada com um banco de dados H2 em memória para persistência dos dados.

Tecnologias Utilizadas
Linguagem: Java
Framework: Spring Boot
Spring Web: Para criação dos endpoints REST.
Spring Data JPA: Para interação com o banco de dados.
H2 Database: Banco de dados em memória.
Dependências:
Hibernate (via Spring Data JPA)
Lombok (opcional para simplificação de getters/setters, embora não utilizado aqui).

Funcionalidades Implementadas
Criação de Produto

Endpoint: POST /produtos
Recebe um produto no corpo da requisição, gera um ID único para ele e o salva no banco de dados.
Leitura de Produto por ID

Endpoint: GET /produtos/{id}
Retorna um produto correspondente ao ID fornecido.
Atualização de Produto

Endpoint: PUT /produtos/{id}
Atualiza os dados de um produto já existente com base no ID.
Exclusão de Produto

Endpoint: DELETE /produtos/{id}
Remove um produto do banco de dados com base no ID fornecido.
Busca de Produtos por Nome

Endpoint: GET /produtos?nome={nome}
Retorna uma lista de produtos que possuem o nome correspondente ao parâmetro de busca.
