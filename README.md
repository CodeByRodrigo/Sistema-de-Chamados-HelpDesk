# 🎫 Sistema de Chamados HelpDesk

Sistema de gerenciamento de chamados desenvolvido em Java puro, sem frameworks ou banco de dados. O projeto utiliza Programação Orientada a Objetos (POO) com classes, enums e ArrayList para gerenciar os chamados em memória.

---

## 📁 Estrutura do Projeto

```
TicketHelpdesk/
├── model/
│   ├── Ticket.java         # Representa um chamado
│   └── Prioridade.java     # Enum com os níveis de prioridade
├── service/
│   └── TicketService.java  # Lógica de negócio
├── menu/
│   └── Menu.java           # Interação com o usuário
└── Main.java               # Ponto de entrada do programa
```

---

## ⚙️ Funcionalidades

- **Abrir chamado** — cadastra um novo chamado informando nome, título, descrição, prioridade e data
- **Listar chamados** — exibe todos os chamados abertos com seus detalhes
- **Buscar por ID** — localiza um chamado específico pelo seu identificador
- **Complexidade automática** — calculada com base na prioridade do chamado

---

## 🧠 Conceitos utilizados

- Programação Orientada a Objetos (POO)
- Encapsulamento com `private`, getters e setters
- `enum` com atributos e construtor
- `ArrayList` para armazenamento dinâmico
- `Scanner` para leitura de input do usuário
- Estruturas de controle: `while`, `switch`, `if/else`

---

## 👨‍💻 Autor

**Rodrigo Lourenço da Silva**  
[![LinkedIn](https://img.shields.io/badge/LinkedIn-blue?logo=linkedin)](https://www.linkedin.com/in/rodrigo-louren%C3%A7o-da-silva/)

Desenvolvido como projeto de estudo de Java puro com foco em POO.
