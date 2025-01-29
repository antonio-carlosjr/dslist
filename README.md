# DSList

DSList é um projeto desenvolvido durante a **Semana DevSuperior**. 
Ele consiste em uma aplicação de lista de games, com funcionalidades completas para exibir, organizar e gerenciar informações sobre jogos. 
O projeto segue boas práticas de desenvolvimento, com uma stack moderna e uma abordagem full-stack.

## Tecnologias Utilizadas

### Backend
- **Java**: Linguagem principal para o desenvolvimento da API.
- **Spring Boot**: Framework utilizado para construção da API RESTful.
- **JPA/Hibernate**: Para mapeamento objeto-relacional.
- **H2 Database**: Banco de dados em memória para desenvolvimento e testes.
- **PostgreSQL**: Banco de dados em produção.
- **Maven**: Gerenciamento de dependências.

Modelo de domínio DSList

![dslist-model](https://github.com/user-attachments/assets/9e96723f-bf61-4505-a5a0-2216ced305bc)

## Funcionalidades

1. **Listagem de Games**: 
   - Os jogos são apresentados em listas organizadas e estilizadas.
   - As listas são recuperadas do banco de dados via API REST.

2. **Ordenação Personalizada**:
   - Os usuários podem personalizar a ordem dos jogos em uma lista específica.

3. **API Documentada**:
   - A API foi documentada para facilitar o consumo por outros desenvolvedores.

4. **Banco de Dados Relacional**:
   - Relacionamento entre as entidades do sistema (ex.: Games e Lists).


## 🌐 Como Rodar o Projeto Localmente

### Pré-requisitos
Certifique-se de ter as seguintes ferramentas instaladas:
- **Java 21**
- **Maven**
- **Node.js (versão LTS)**
- **PostgreSQL**

### Passos para rodar o backend
1. Clone o repositório:
   ```bash
   git clone https://github.com/antonio-carlosjr/dslist.git
   ```
2. Navegue até o diretório do backend:
   ```bash
   cd backend
   ```
3. Configure o arquivo `application.properties` com as credenciais do banco de dados PostgreSQL.
4. Compile e rode o projeto:
   ```bash
   ./mvnw spring-boot:run
   ```
5. A API estará disponível em: `http://localhost:8080`


## 📚 Estrutura do Projeto

### Backend
```
backend/
├── src/
│   ├── main/
│   │   ├── java/com/dslist/
│   │   ├── resources/
│   ├── test/
├── pom.xml
```


## Endpoints Principais

### GET /games
Retorna a lista de todos os jogos.

### GET /lists
Retorna a lista de coleções.

### POST /lists/{listId}/replacement
Permite reordenar jogos dentro de uma lista.

## Autor

- **Antônio Carlos da Silva Júnior**  
  Webdesigner | Técnico em Desenvolvimento de Software | Graduando em Sistemas de Informação

📧 Entre em contato: [profissional.contatocarlos@gmail.com](mailto:profissional.contatocarlos@gmail.com)

🌐 LinkedIn: [linkedin.com/in/antonio-carlosjr](https://linkedin.com/in/antonio-carlosjr)

## Licença

Este projeto é licenciado sob a [MIT License](https://opensource.org/licenses/MIT).
