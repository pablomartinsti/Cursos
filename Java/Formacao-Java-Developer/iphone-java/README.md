# 📱 Simulador de iPhone - Desafio POO em Java

Projeto desenvolvido como parte do **Desafio de Programação Orientada a Objetos (POO)** da Trilha Java Básico da [Digital Innovation One (DIO)](https://www.dio.me/).

---

## 🧠 Objetivo

Aplicar os principais pilares da Programação Orientada a Objetos em Java, simulando as funcionalidades de um iPhone com as seguintes capacidades:

- Reprodutor Musical 🎵
- Aparelho Telefônico 📞
- Navegador de Internet 🌐

---

## 🔧 Funcionalidades

O menu interativo no terminal permite:

| Opção | Ação                           |
| ----- | ------------------------------ |
| 1     | Tocar música selecionada       |
| 2     | Pausar música                  |
| 3     | Selecionar nova música         |
| 4     | Ligar para um número           |
| 5     | Atender chamada recebida       |
| 6     | Iniciar correio de voz         |
| 7     | Exibir uma página da web       |
| 8     | Abrir nova aba                 |
| 9     | Atualizar página               |
| 10    | Simular recebimento de ligação |
| 0     | Encerrar o programa            |

---

## 🧩 Estrutura do Projeto

O projeto segue os princípios da POO utilizando:

- **Interfaces**
  - `ReprodutorMusical.java`
  - `AparelhoTelefonico.java`
  - `NavegadorInternet.java`
- **Classe principal**
  - `Iphone.java`: implementa todas as interfaces e gerencia as ações do sistema via menu interativo no terminal

---

## 🛠️ Tecnologias Utilizadas

- Java 17+
- VS Code
- Terminal / Console para entrada e saída de dados

---

## 🚀 Como Executar

1. Compile os arquivos:

   ```bash
   javac src/*.java -d bin

   ```

2. Execute o programa:
   java -cp bin Iphone

📚 Conceitos Aplicados

Abstração

Encapsulamento

Herança (por meio da implementação de múltiplas interfaces)

Polimorfismo

👨‍💻 Autor
Desenvolvido por Pablo Ferreira Martins.
Desafio proposto pela DIO.
