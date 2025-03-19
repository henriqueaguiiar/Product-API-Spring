
# Product API - Spring Boot

## Descrição

Este é um projeto de uma **API REST** para o **gerenciamento de produtos**, desenvolvida com **Spring Boot**. A API permite realizar operações CRUD (Create, Read, Update, Delete) em uma entidade de produtos. Cada produto possui atributos como nome, descrição e preço. A persistência dos dados é feita em um banco de dados **H2** em memória, ideal para testes e desenvolvimento rápido.

## Funcionalidades Implementadas

A API oferece os seguintes endpoints:

- **Criação de Produto**  
  `POST /produtos`  
  Cria um novo produto e o salva no banco de dados.

- **Leitura de Produto por ID**  
  `GET /produtos/{id}`  
  Retorna os dados de um produto pelo seu ID.

- **Atualização de Produto**  
  `PUT /produtos/{id}`  
  Atualiza os dados de um produto existente.

- **Exclusão de Produto**  
  `DELETE /produtos/{id}`  
  Remove um produto do banco de dados pelo ID.

- **Busca de Produtos por Nome**  
  `GET /produtos?nome={nome}`  
  Retorna uma lista de produtos que correspondem ao nome fornecido.

## Tecnologias Utilizadas

- **Java 17**: Linguagem de programação.
- **Spring Boot**: Framework para desenvolvimento de aplicações Java.
- **Spring Data JPA**: Para a integração com o banco de dados.
- **H2 Database**: Banco de dados em memória para persistência.
- **Lombok** (opcional): Para simplificação de getters/setters (não utilizado diretamente neste projeto).

## Como Rodar o Projeto Localmente

1. Clone este repositório:

```bash
git clone https://github.com/henriqueaguiiar/Product-API-Spring.git
```

2. Navegue até o diretório do projeto e rode o comando Maven para iniciar a aplicação:

```bash
./mvnw spring-boot:run
```

3. A API estará disponível em `http://localhost:8080`.

## Como Contribuir

1. Faça um fork deste repositório.
2. Crie uma branch para suas alterações (`git checkout -b minha-feature`).
3. Faça suas modificações e commit (`git commit -am 'Adiciona minha feature'`).
4. Envie suas alterações para o repositório (`git push origin minha-feature`).
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a **MIT License**. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## Autor

[Henrique Aguiar Pacheco](https://www.linkedin.com/in/henrique-aguiar-35945520b/)


