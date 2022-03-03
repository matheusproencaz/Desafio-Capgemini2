<div align="center">
  <img alt="Academia-Capgemini" src="https://capgemini.proway.com.br/assets/img/logo-capgemini.png"/>
</div>



# Desafio

O Desafio de programação é a terceira etapa do processo de seleção para a Academia Capgemini 2022. O objetivo é testar os conhecimentos em lógica de programação.
Ele foi separado em 3 questões diferentes as quais foram implementadas em JAVA utilizando a IDE Eclipse.

## Programas necessários:

<div>
  <img align="center" width="50" height="50" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg" />
  <img align="center" width="40" height="40" src="https://seeklogo.com/images/E/eclipse-logo-85FE4BEA34-seeklogo.com.png" />
</div>

## Questão 1

A mediana de uma lista de números é basicamente o elemento que se encontra no meio da lista após a ordenação. Dada uma lista de números com um número ímpar de elementos, desenvolva um algoritmo que encontre a mediana.

**Exemplo:**

**Entrada:**
```java
arr = [9,2,1,4,6]
```
**Saída:**
```java
4
```

## Questão 2
        
Dado um vetor de inteiros n e um inteiro qualquer x. Construa um algoritmo que determine o número de elementos pares do vetor que tem uma diferença igual ao valor de x.

**Exemplo:**
 
**Entrada:**

```java
n = [1, 5, 3, 4, 2]
```

**Saída:**

```java
3
```
**Explicação:**

Existem 3 pares de inteiros no vetor com uma diferença de 2: [5, 3], [4, 2] e [3, 1].

## Questão 3

Um texto precisa ser encriptado usando o seguinte esquema. Primeiro, os espaços são removidos do texto. Então, os caracteres são escritos em um grid, no qual as linhas e colunas tem as seguintes regras:
  <div align="center" >
    <div style="background-color: #ff0000;width: 200px; height: 30px;" >
      <img src="https://user-images.githubusercontent.com/94996691/156665704-3aff17a3-98ae-4f68-8c7c-8a0c7de82811.png"/>
      <=linha<=coluna<=
      <img src="https://user-images.githubusercontent.com/94996691/156665704-3aff17a3-98ae-4f68-8c7c-8a0c7de82811.png"/>
    </div>
  </div>
  
 - Considere T, como o tamanho do texto.
 - Se certifique de que linhas x colunas >= .
 - Se múltiplos grids satisfazem as condições, escolha aquele com a menor área.
Escreva um algoritmo que ao receber uma string s, mostre a mensagem encriptada de acordo com as regras descritas.

**Exemplo:**

**Entrada:**

```java
s = tenha um bom dia
```
**Saída:**
```java
taoa eum nmd hbi
```
**Explicação:**

Depois de remover os espaços, a string tem 13 caracteres.  A raiz de 13 está entre 3 e 4, então a string é rescrita na forma de um grid com 4 linhas e 4 colunas:

```java
tenh
aumb
omdi
a
```

O resultado é obtido ao mostrar os caracteres de cada coluna, com um espaço entre as colunas de texto. A mensagem encriptada é obtida ao mostrar os caracteres de cada linha com um espaço entre as colunas.

**Exemplo2:**

**Entrada**

```java
s = ola mundo
```
**Saída**
```java
omd luo an
```
**Explicação**

Explicação:

Depois de remover os espaços a string tem 8 caracteres.  A raiz de 8 está entre 2 e 3, então a string é reescrita na forma de um grid com 3 linhas e 3 colunas:
 
```
ola
mun
do
```

## Instação do Open JDK 17 - Windows

1. Baixar o openjdk-17.0.1;

2. Copiar o caminho da instalção do java. Ex: C:\Program Files\Java\jdk-17.0.1

3. Ir para o Editar as variáveis de ambiente do sistema

4. Clicar no botão "Variáveis de Ambiente..."

5. Clicar em Novo...

6. No campo "Nome da variável" digitar JAVA_HOME

7. No campo "Valor da variável" digitar o caminho de instalação. Ex: C:\Program Files\Java\jdk-17.0.1

8. Se a variável já existir clicar em Editar e mudar o valor da variável com o caminho

9. Conferir se a variável Path, o valor precisa estar %JAVA_HOME%\bin

## Após a instalação de todos os programas:

File > Open Projects from File System... > Directory... > Selecione a pasta com os arquivos baixados > Finish.
Com o projeto aberto, abrir o pacote questoes e clicar com o botão esquerdo na classe das questões ir em, Run as, Java Application.

## **Utilize a IDE que preferir!**
