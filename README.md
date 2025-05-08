# 🛒 Sistema de Supermercado – FATEC Ipiranga

Este repositório contém o projeto desenvolvido para as disciplinas de **Programação Orientada a Objetos (POO)** e **Laboratório de Banco de Dados (LBD)** da **FATEC Ipiranga**. O sistema simula as operações de um supermercado, incluindo cadastro de produtos, gerenciamento de estoque e processamento de vendas.

---

## 📦 Funcionalidades

- **Cadastro de Produtos**: Adição, edição e remoção de produtos com informações como nome, preço e quantidade em estoque.
- **Gerenciamento de Estoque**: Atualização automática do estoque com base nas vendas realizadas.
- **Processamento de Vendas**: Registro de vendas com cálculo automático de valores totais.
- **Relatórios**: Geração de relatórios de vendas e estoque para análise.

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem**: Java
- **Banco de Dados**: MySQL
- **IDE**: IntelliJ IDEA
- **Controle de Versão**: Git

---

## 📁 Estrutura do Projeto

```
mercado/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── mercado/
│                   ├── Main.java
│                   ├── models/
│                   │   ├── Produto.java
│                   │   └── Venda.java
│                   ├── controllers/
│                   │   ├── ProdutoController.java
│                   │   └── VendaController.java
│                   └── utils/
│                       └── DatabaseConnection.java
├── resources/
│   └── application.properties
├── pom.xml
└── README.md
```

---

## 🚀 Como Executar o Projeto

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/nataliataira/mercado.git
   ```

2. **Importe o projeto na sua IDE (IntelliJ IDEA):**

   - Selecione a opção "Open" e escolha a pasta do projeto.

3. **Configure o banco de dados:**

   - Certifique-se de que o MySQL está instalado e em execução.
   - Crie um banco de dados chamado `mercado`.
   - Atualize o arquivo `application.properties` com as credenciais do seu banco de dados.

4. **Execute a aplicação:**

   - Execute a classe `Main.java`.

---

## 🧪 Testes

- Os testes podem ser executados utilizando o JUnit.
- Certifique-se de que o banco de dados de teste está configurado corretamente antes de executar os testes.

---

## 📄 Licença

Este projeto está licenciado sob a Licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais informações.
