# curso-java-1

## Seção 1: Introdução

### 1. Introdução: visão geral do curso

* Profissional Java
	* Fundamentos
		* Lógica de programação
			* Estrutura de dados
			* Programação Orientada a objetos
		* Banco de dados
		* Análise e Design de Sistemas
	* Comercial
		* Backend
		* Web
		* Mobile
		* Desktop

* Assuntos abordados
  * Lógica de Programação e Algoritmo usando Java
    * Conceitos de programação
    * Introdução à linguagem Java
    * Estrutura sequencial
    * Estrutura condicional
    * Estruturas repetitivas
  * Java e Programação Orientada a Objetos (Parte 1)
    * Introdução à programação Orientada a Objetos
    * Construtores, palavra *this*, sobrecarga e encapsulamento
    * Comportamento de memória, array, listas
    * Tópicos especiais em Java
    * *Bônus* - Nivelamento sobre Git e Github
    * Enumeração, composição
    * Herança e polimorfismo
    * Tratamento de exceções
  * Projeto - Sistema Jogo de Xadrez
    * Composição de objetos, herança, coleções, etc.
    * Desenvolvemento em camadas
    * Padrões de projetos
  * Java e Programação Orientada a Objetos (parte 2) + Programação Funcional (lambda)
    * Trabalhando com arquivos
    * Interfaces
    * Generics, Set, map
    * Programação funcional e expressões lambda
    * *Bônus* - Nivelamento Álgebra Relacional, SQL, MySQL
    * Acesso a banco de dados com JDBC
    * Interface Gráfica com JavaFX
  * Projeto - Aplicação desktop com JavaFX e banco de dados MySQL com JDBC
    * Padrão MVC - Model View Controller
    * Padrão Camadas
    * FXML, SceneBuilder
    * Tratamento de eventos de UI
    * CRUD completo
    * Padrão de projetos
  * Projeto - Web Services com Spring Boot e JPA / Hibernate
    * *Bônus* - Nivelamento ORM com JPA / Hibernate
    * Padrão camadas
    * Web e HTTP
    * REST / Web Services
    * Modelo de domínio complexo
    * Maven
    * Banco de dados H2
    * Spring Data JPA
    * CRUD completo
    * Tratamento de exceções
  * Projeto - Web Services com Spring Boot e NoSQL (MongoDB)
    * *Bônus* - Nivelamento NoSQL e MongoDB
    * Modelo de domínio: agregados e desnormalização
    * Padrão DTO
    * Spring Data MongoDB
    * CRUD complemento
    * Tratamento de exceções

[Arquivo Curso Java Completo](PDFs/Aula%20001%20-%20Curso%20Java%20Completo.pdf)

## Seção 2: Conceitos de programação

### 2. Visão geral do capítulo

### 3. Material de apoio do capítulo

[Conceitos de programação](PDFs/Aula%20003%20-%20Conceitos%20de%20programação.pdf)

### 4. Algoritmo, Automação, Programa de Computador

* **Algoritmo** - Sequência finita de instruções para se resolver um problema. Este conceito aplica-se a diversas áreas do conhecimento.

* **Automação** - Consiste em utilizar máquina(s) para executar o procedimento desejado de forma automática ou semiautomática.

* **Computador** - É composto de *Hardware* e *Software*
    * **Hardware** - Parte física, a máquina em si.
    * **Software** - Parte lógica, que são os programas:
        * **Sistema Operacional** - Windows, linux, iOS, ...
        * **Aplicativos** - apps de escritório, apps de câmera, navegador web, ...
        * **Jogos**
        * **Utilitários** - Antivirus, compactador de arquivos
        * **entre outros**

* **Programas** - São *Algoritmos* executados pelo computador. Assim podemos dizer que o computador é uma máquina que *automatiza* a execução de algoritmos computacionais, como por exemplo, processamento de dados, cálculos, etc.

### 5. O que é preciso para se fazer um programa de computador

* Para construir um programa de computador nós vamos precisar:
    * Uma **linguagem de programação**: regras **léxicas** e **sintáticas** para se escrever o programa.
    * Uma **IDE**: Software para editar e testar o programa
    * Um **compilador**: software para transformar o **código fonte** em **código objeto**
    * Um **gerador de código** ou **máquina virtual**: software que permite que o programa seja executado

### 6. Linguagem de programação, léxica e sintática

* **Linguagem de programação** - É um conjunto de regras **léxicas** (ortografia) e **sintáticas** (gramática) para se escrever programas.
* **Léxica** - Diz respeito à correção das **palavras** "*isoladas*" (ortografia).
* **Sintática** - Diz respeito à correção das **sentenças** (gramática).
* **Exemplos de linguagens de programação** - C, Pascal, C++, Java, C#, Python, Ruby, PHP, JavaScript, etc.

### 7. IDE - Ambiente Integraedo de Desenvolvimento

* **IDE** - É um conjunto de softwares utilizado para a construção de programas.
    * Exemplos:
        * C/C++: **Code Blocks**
        * Java: **Eclipse**, **Netbeans**
        * C#: **Microsoft Visual Studio**
* **Funcionalidades de uma IDE**:
    * Edição de código fonte (indentação, autocompletar, destaque de palavras, etc.)
    * Depuração e testes
    * Construção do produto final (build)
    * Sugestão de modelos (templates)
    * Auxiliar em várias tarefas do seu projeto
    * Etc.

### 8. Compilação, interpretação, código fonte, código objeto e máquina virtual

* **Código fonte** - É o código escrito pelo programador em linguagem de programação. Este código não é entendido pelo computador, precisando ser convertido em código objeto.
* **Compilação** - É o processo que transforma código fonte em código objeto. Este código objeto, posteriormente passará por um processo de *build* para a geração do arquivo executável. Exemplos de linguagens compiladas: C, C++ e etc.
* **Interpretação** - É o processo em que a partir do código fonte, um interpretador irá realizar a análise léxica, sintática e a geração do código executável, sob demanda. Exemplo de linguagens interpretadas: PHP, JavaScript, Python, Ruby e etc.
* **Abordagem híbrida** - Além da compilação e a interpretação, existe uma abordagem híbrida. Nela, um compilador realiza uma "*pré-compilação*", neste processo será realizada a análise léxica e sintática gerando um código objeto chamado de *Bytecode*. Este *Bytecode* será interpretado sob demanda por uma máquina virtual. Exemplo de linguagens híbridas: Java e C#.

#### Vantagens:
  * **Compilação**:
    * Velocidade do programa
    * Auxílio do compilador antes da execução
  * **Interpretação**:
    * Flexibilidade de manutenção do aplicativo em produção
    * Expressividade da linguagem (menos verbosidade, normalmente são linguagens fracamente tipadas)
    * Código fonte não precisa ser recompilado para rodar em plataformas diferentes
  * **Híbridas**:
    * Auxílio do compilador antes da execução
    * Código fonte não precisa ser recompilado para rodar em plataformas diferentes
    * Auxílio do compilador antes da execução
    * Flexibilidade de manutenção do aplicativo em produção

## Seção 3: Introdução à linguagem Java

### 9. Visão geral do capítulo

### 10. Material de apoio do capítulo

[Introdução Linguagem Java](PDFs/Aula%20009%20-%20Introdução%20a%20linguagem%20Java.pdf)

### 11. Entendendo as versões do Java

[Página do download](https://www.oracle.com/java/technologies/java-se-glance.html)

* Será instalada a versão do jdk-11, por ser a mais recente versão LTS disponível.