md 📄 RADME.md — Projeto Archive404
 # 🎮 Archive404

Aplicativo mobile criado para auxiliar colecionadores de jogos de Playstation a organizarem sua coleção de forma prática e eficiente, diretamente pelo celular. O projeto foi desenvolvido pela Squad ALTF4 durante a Sprint I.

---

## 📱 Sobre o Projeto

Muitos colecionadores têm dificuldade em manter o controle da sua coleção física. O objetivo do Archive404 é oferecer uma ferramenta simples e acessível para adicionar, editar, visualizar e remover itens da coleção.

- 📥 Cadastro de novos jogos
- 📋 Listagem completa da coleção
- ✏️ Edição de informações (título, estado, nota etc.)
- ❌ Remoção de jogos que não pertencem mais à coleção

---

## 🧠 Tecnologias Utilizadas

- Front-end: React Native (Expo)
- Back-end: Java com Spring Boot
- Banco de dados: MongoDB
- Prototipação: Figma

---
``` md
archive404-api/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── archive404/
│       │           ├── controllers/     # 🎮 Controladores REST (ex: ColecionavelController.java)
│       │           ├── models/          # 📦 Modelos de dados (ex: Colecionavel.java)
│       │           ├── repositories/    # 🗄️ Interfaces para MongoDB (ex: ColecionavelRepository.java)
│       │           └── services/        # 🔧 Regras de negócio (ex: ColecionavelService.java)
│       └── resources/
│           ├── application.properties  # ⚙️ Configurações da aplicação (porta, URI do MongoDB)
│           └── static/                 # 🌐 Arquivos estáticos (se necessário)
├── .gitignore                          # 📁 Arquivos/pastas ignorados pelo Git
├── pom.xml                             # 📦 Gerenciador de dependências Maven
└── README.md                           # 📘 Documentação do projeto`
```


## 🌐 Endpoints da API

| Método | Rota                | Descrição                        |
|--------|---------------------|----------------------------------|
| GET    | /colecionaveis      | Lista todos os itens             |
| GET    | /colecionaveis/{id} | Retorna um item específico       |
| POST   | /colecionaveis      | Cadastra novo item               |
| PUT    | /colecionaveis/{id} | Atualiza informações do item     |
| DELETE | /colecionaveis/{id} | Remove item da coleção           |

⚠️ No momento, a API não possui autenticação. Funciona em ambiente local para testes rápidos.

---

## 🛠️ Como Rodar o Projeto (Back-end)

1. Clone o repositório:

```bash
git clone https://github.com/altf4/archive404-api.git
cd archive404-api
spring.data.mongodb.uri=mongodb+srv://<usuario>:<senha>@<cluster>.mongodb.net/archive404
server.port=8080
./mvnw spring-boot:run
http://localhost:8080/colecionaveis
👥 Equipe ALTF4
🎨 Thiago P. — Front-end (React Native / Figma)

🛠️ Kauã Marques — Back-end + MongoDB (Java / Spring Boot)

🛠️ Daniel — Back-end + MongoDB (Java / Spring Boot)

🗓️ Cronograma da Sprint I
 Planejamento e prototipação

 Desenvolvimento inicial do app e da API

 Integração front-end e back-end

13/05: Testes integrados

19/05: Entrega final

20/05: Apresentação
