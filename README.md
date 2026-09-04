# 📚 Boletim Escolar

Projeto desenvolvido para a disciplina de **Técnicas de Programação**, com o objetivo de praticar o uso do **Git e GitHub** em trabalho realizado em dupla.

O sistema foi desenvolvido em **Java**, utilizando programação estruturada, vetores e métodos `static`, sem utilização de Programação Orientada a Objetos (POO).

## 🎯 Objetivo

O sistema permite cadastrar alunos, registrar suas notas, calcular suas médias e informar a situação de cada aluno.

As situações possíveis são:

- ✅ Aprovado
- ⚠️ Recuperação
- ❌ Reprovado

Além disso, o sistema apresenta um relatório geral da turma.

## 💻 Funcionalidades

O programa possui um menu com as seguintes opções:

```text
1 - Cadastrar aluno
2 - Listar alunos
3 - Exibir boletim
0 - Sair

1. Cadastrar aluno

Permite cadastrar:
Nome do aluno
Nota 1
Nota 2
As notas devem estar entre 0 e 10.
A média é calculada automaticamente:
Média = (Nota 1 + Nota 2) / 2

2. Listar alunos

Exibe os alunos cadastrados juntamente com:
Nome
Nota 1
Nota 2
Média

3. Exibir boletim

Apresenta o boletim completo da turma, mostrando:
Nome do aluno
Nota 1
Nota 2
Média
Situação
Também apresenta:
Média geral da turma
Maior média
Menor média

0. Sair

Encerra o programa.

📊 Regras de situação

A situação do aluno é definida de acordo com sua média:
Média	Situação
7,0 ou maior	Aprovado
5,0 até 6,9	Recuperação
Abaixo de 5,0	Reprovado

🗂️ Estrutura do projeto
tp01-boletim-escolar/
│
├── src/
│   └── Principal.java
│
├── bin/
│   └── arquivos compilados
│
├── .gitignore
└── README.md

🔧 Tecnologias utilizadas

Java
Git
GitHub
Terminal 
Visual Studio Code

📌 Estrutura do código

O programa utiliza vetores paralelos com capacidade para até 30 alunos:
String[] alunos
double[] nota1
double[] nota2
double[] medias
Também são utilizados métodos static para organizar as funcionalidades do programa.
Entre eles:
exibirCabecalho()
exibirMenu()
calcularMedia()
definirSituacao()
exibirRelatorio()
inserirNotas()
cadastrarAluno()
listarAlunos()

🌿 Branches

O desenvolvimento foi dividido em duas branches:
feature/cadastro-notas
Responsável por:
Cadastro dos alunos
Leitura das notas
Validação das notas
Listagem dos alunos
feature/relatorio-boletim
Responsável por:
Definição da situação do aluno
Cálculo das médias
Relatório do boletim
Média geral da turma
Maior média
Menor média

🔀 Conflito de merge
Durante o desenvolvimento, os dois integrantes realizaram alterações diferentes no método:
exibirCabecalho()
em suas respectivas branches.
As branches foram posteriormente unidas à main, gerando um conflito real de merge.
O conflito foi resolvido manualmente, mantendo as alterações necessárias para o funcionamento do sistema.
Após a resolução, o programa foi compilado e testado novamente.

▶️ Como executar
1. Clonar o repositório
git clone URL_DO_REPOSITORIO
2. Entrar na pasta
cd tp01-boletim-escolar
3. Compilar
javac -d bin src/Principal.java
4. Executar
java -cp bin Principal

📝 Exemplo de utilização
********************************
        BOLETIM ESCOLAR
        RELATORIO DA TURMA
********************************
1 - Cadastrar aluno
2 - Listar alunos
3 - Exibir boletim
0 - Sair
Escolha: 1

Nome do aluno: Guilherme
Digite a nota 1 do aluno: 8
Digite a nota 2 do aluno: 7

Aluno cadastrado com sucesso!
A média será:
(8 + 7) / 2 = 7,5
Situação:
Aprovado

👥 Desenvolvimento
Projeto desenvolvido em dupla como atividade prática de Git/GitHub.
O projeto utiliza branches, commits, merge, resolução de conflitos e versionamento para representar um fluxo de desenvolvimento colaborativo.
🏷️ Versão
v1.0 — Entrega final da atividade
