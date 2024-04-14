# ToDoList API

Esta é uma API simples de lista de tarefas (ToDoList) desenvolvida em Spring Boot.

### Descrição

Esta aplicação fornece endpoints RESTful para gerenciar uma lista de tarefas (to-dos). Os usuários podem criar, listar, atualizar e excluir tarefas da lista.

### Pré-requisitos

Certifique-se de ter o seguinte instalado em sua máquina:
- Java JDK 21 ou superior
- Maven 3.6.3 ou superior
- MySQL 8.0 ou superior

### Configuração do Banco de Dados

Esta aplicação utiliza o MySQL como banco de dados. Certifique-se de criar um banco de dados chamado 'todolist' antes de executar a aplicação. As configurações de conexão com o banco de dados estão no arquivo 'application.properties'.

### Como Executar

1. Clone este repositório:
   - git clone https://github.com/seu-usuario/todolist.git
3. Navegue até o diretório do projeto:
   - cd todolist
5. Compile o projeto:
   - mvn clean install
8. Execute a aplicação:
   - java -jar target/todolist-0.0.1-SNAPSHOT.jar

A aplicação estará disponível em 'http://localhost:8080'.

### Endpoints

- POST /todos: Cria uma nova tarefa.
- GET /todos: Lista todas as tarefas.
- PUT /todos: Atualiza uma tarefa existente.
- DELETE /todos/{id}: Exclui uma tarefa pelo ID.

Para mais detalhes sobre como usar cada endpoint, consulte a documentação da API.

### Tecnologias Utilizadas

- Spring Boot 3.2.4
- Maven
- MySQL
- Hibernate
- Spring Data JPA
- Spring Web

### Contribuindo

Sinta-se à vontade para contribuir com este projeto. Basta seguir as etapas abaixo:

1. Faça um fork do projeto.
2. Crie sua branch de feature (`git checkout -b feature/MinhaNovaFeature`).
3. Faça commit de suas alterações (`git commit -am 'Adicionando uma nova feature'`).
4. Faça push para a branch (`git push origin feature/MinhaNovaFeature`).
5. Crie um novo Pull Request.
