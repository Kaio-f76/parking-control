# Parking Control API

API RESTful para gerenciamento de vagas de estacionamento, desenvolvida com Spring Boot e seguindo a arquitetura MVC. Este projeto permite o controle de vagas ocupadas, registros de veículos e gerenciamento de dados via endpoints HTTP.

🧩 Tecnologias Utilizadas
✔️ Spring Framework

    Spring Boot – Inicialização e configuração simplificada da aplicação.

    Spring MVC – Estrutura para criação da API REST seguindo a arquitetura MVC (Model-View-Controller).

    Spring Data JPA – Persistência de dados com mapeamento objeto-relacional.

    Spring Validation – Validação automática de dados de entrada com anotações.

✔️ Ferramentas e Ambiente

    Java – OpenJDK 17

    Maven – Gerenciador de dependências e build

    PostgreSQL – Banco de dados relacional (acessado via PgAdmin)

    Postman – Testes de requisições HTTP

    IDE – NetBeans

🧱 Arquitetura do Projeto

O projeto segue a arquitetura MVC (Model-View-Controller):

    Model – Representação das entidades persistidas no banco de dados (ex: ParkingSpotModel)

    Repository – Interface de acesso a dados usando Spring Data JPA (ParkingSpotRepository)

    Controller – Camada que lida com as requisições HTTP (ParkingSpotController)

    Service – Contém a lógica de negócio, separando responsabilidades da camada de controle

📂 Estrutura de Diretórios

```plaintext
src/
└── main/
    ├── java/
    │   └── com/
    │       └── example/
    │           └── parkingcontrol/
    │               ├── controller/
    │               ├── model/
    │               ├── repository/
    │               ├── service/
    │               └── dto/
    └── resources/
        ├── application.properties
        └── ...
```


▶️ Como Rodar o Projeto

    Clone o repositório: https://github.com/Kaio-f76/parking-control.git
    cd parking-control

Configure o banco de dados no application.properties:
```plaintext
spring.datasource.url=jdbc:postgresql://localhost:5432/parking-control-db
spring.datasource.username=seu-usuario
spring.datasource.password=sua-senha
```
Compile e rode o projeto com Maven:
```plaintext
mvn spring-boot:run
ou no netbeans de run no direto no arquivo main.
```
Acesse a API:

    http://localhost:8080/parking-spot

📫 Endpoints Expostos (exemplos)

    POST /parking-spot – Cadastra uma nova vaga

    GET /parking-spot – Lista todas as vagas

    GET /parking-spot/{id} – Retorna uma vaga específica

    PUT /parking-spot/{id} – Atualiza os dados de uma vaga

    DELETE /parking-spot/{id} – Remove uma vaga

✅ Validações Incluídas

    Placa do carro única

    Número da vaga único

    Validação de campos obrigatórios com anotações do Bean Validation

