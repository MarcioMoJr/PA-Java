# PA-Java

Exercícios em Java da disciplina de **Programação e Algoritmos**, do curso Técnico em Desenvolvimento de Sistemas (Etec de Cidade Tiradentes).

Cada lista de exercícios é um projeto do Eclipse (`prjlistaNN`), numerado na ordem em que as listas foram feitas. Os projetos ficam agrupados em pastas por assunto.

## Estrutura

| Pasta | Listas | Assunto |
|---|---|---|
| [`introducao-java`](introducao-java) | 01 a 03 | Variáveis, entrada com `Scanner`, operadores e cálculos |
| [`tomada-decisao`](tomada-decisao) | 04 a 08 | `if`, `if/else` e decisões compostas |
| [`switch-case`](switch-case) | 09 | `switch/case` |
| [`laco-repeticao`](laco-repeticao) | 10 a 14 | `while`, `do..while` e `for` |
| [`vetores`](vetores) | 15 e 16 | Vetores: leitura, busca, conjuntos e cálculos com `for` |

## Listas

### Introdução ao Java

| Lista | O que tem |
|---|---|
| `prjlista01` | Olá Mundo, soma dos quadrados, antecessor e sucessor, metros para km, IPVA, desconto, área de parede |
| `prjlista02` | Média aritmética, prestação com juros e atraso, soma de valores, Fahrenheit para Celsius |
| `prjlista03` | Conversão de euro para real, quantidades para uma festa, latas de tinta, reajuste de salário |

### Tomada de decisão

| Lista | O que tem |
|---|---|
| `prjlista04` | Maior ou menor de idade, par ou ímpar, salário em relação ao mínimo |
| `prjlista05` | Login com senha, resultado de jogo (time A, time B ou empate) |
| `prjlista06` | Lista da pág. 40: Bhaskara, IMC, IRPF, nota do aluno, ordem crescente, tipo de triângulo |
| `prjlista07` | Categoria de nadador por idade |
| `prjlista08` | Comparação de idades, validação do ano de nascimento, login, resultado de partida |

### Switch/case

| Lista | O que tem |
|---|---|
| `prjlista09` | Cantina da escola, categorias da escola de futebol, menção do aluno, signo do zodíaco |

### Laços de repetição

| Lista | Estrutura | O que tem |
|---|---|---|
| `prjlista10` | `while` | Pares até 200, somatória de 1 a 100, tabuada, idade de vários usuários |
| `prjlista11` | `while` | Altura, faixa etária, fatorial, Fibonacci, potência |
| `prjlista12` | `do..while` | Fatorial, Fibonacci e potência refeitos com `do..while` |
| `prjlista13` | `do..while` | Somatória dos ímpares de 1 a 1000, pares de 0 a 500 com múltiplos de 10, idade com repetição por S/N |
| `prjlista14` (nível 1) | `for` | Contagem de 1 a 10, de 10 a 1, de 0 a 20 e de 20 a 0 |
| `prjlista14` (nível 2) | `for` | Pares de 0 a 100, ímpares de 1 a 99, múltiplos de 5 entre 0 e 100, números de 1 a 50 maiores que 25 |
| `prjlista14` (nível 3) | `for` | Soma de 1 a 100, soma dos pares de 1 a 100, tabuada de um número informado pelo usuário, fatorial de 10 (1 × 2 × 3 × ... × 10) |

### Vetores

| Lista | O que tem |
|---|---|
| `prjlista15` | `QuadradoVetor` (quadrado de cada elemento), `SomaVetores` (soma posição por posição), `VetorInvertido` (A de trás para frente), `MediaVetor` (média dos valores) |
| `prjlista16` | Lista complementar, descrita abaixo |

#### `prjlista16`: lista complementar "Treinando para trabalhar com vetores"

| Classe | O que faz |
|---|---|
| `SepararParesImpares` | Separa os pares e ímpares de A em um vetor B (pares primeiro) |
| `TabuadaVetor` | Tabuada de cada elemento de A |
| `VerificaPrimos` | Diz se cada elemento de A é primo |
| `ParesAteElemento` | Pares de 0 até cada elemento de A |
| `DivisoresElemento` | Divisores de cada elemento de A |
| `PotenciasDeDois` | Preenche A com A[i] = 2^i |
| `FatorialVetor` | B recebe o fatorial de cada elemento de A |
| `SomatorioAcumulado` | B[i] = soma de A[j], de i até o final |
| `InterseccaoVetores` | C = elementos que existem em A e em B |
| `DiferencaVetores` | C = elementos de A que não existem em B |
| `BuscaElemento` | Busca um valor X em A, com repetição por S/N |
| `FilaMerenda` | Registra senhas da fila da merenda, barrando senhas repetidas |
| `VetorPalindromo` | Verifica se A é um palíndromo |
| `ParOuImpar` | B recebe 1 (A[i] par) ou 0 (A[i] ímpar) |
| `ComparaVetores` | C recebe 1, 0 ou -1 ao comparar A[i] com B[i] |
