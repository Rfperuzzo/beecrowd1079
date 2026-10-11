# Exercício 1079 – Médias Ponderadas | Java

## 📌 Descrição

Este projeto resolve o exercício **1079 – Médias Ponderadas**, da plataforma [Beecrowd](https://judge.beecrowd.com/pt/problems/view/1079).

O programa recebe uma quantidade de casos de teste. Para cada caso, são informados três números reais e calculada sua **média ponderada**, considerando os pesos 2, 3 e 5.

O resultado de cada média é apresentado com uma casa decimal.

## 🛠️ Tecnologias utilizadas

- Java
- Scanner para entrada de dados
- Estrutura de repetição `while`
- Operações aritméticas
- Formatação de saída com `printf`

## 💻 Código-fonte

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = 1, n;
        double n1, n2, n3, soma, media;

        n = scanner.nextInt();

        while (i <= n) {
            n1 = scanner.nextDouble();
            n2 = scanner.nextDouble();
            n3 = scanner.nextDouble();

            n1 = n1 * 2;
            n2 = n2 * 3;
            n3 = n3 * 5;

            soma = n1 + n2 + n3;
            media = soma / 10;

            System.out.printf("%.1f%n", media);
            i++;
        }
    }
}
```

## 🧠 Lógica do programa

1. O programa recebe um número inteiro `n`, indicando a quantidade de casos de teste.
2. Inicializa o contador `i` com 1.
3. Utiliza um `while` para repetir o cálculo `n` vezes.
4. Em cada repetição, lê três números reais.
5. Multiplica o primeiro número por 2, o segundo por 3 e o terceiro por 5.
6. Soma os três valores ponderados.
7. Divide a soma por 10, correspondente à soma dos pesos.
8. Exibe a média com uma casa decimal utilizando `printf`.
9. Incrementa o contador e continua até finalizar todos os casos.

## 📐 Fórmula utilizada

A média ponderada é calculada pela seguinte fórmula:

**Média = (N1 × 2 + N2 × 3 + N3 × 5) / 10**

Os pesos utilizados são:

| Número | Peso |
|---|---|
| N1 | 2 |
| N2 | 3 |
| N3 | 5 |
| **Total** | **10** |

## 📥 Exemplo de entrada

```text
3
6.5 4.3 6.2
5.1 4.2 8.1
8.0 9.0 10.0
```

## 📤 Exemplo de saída

```text
5.7
6.3
9.3
```

## 🔎 Explicação do exemplo

Para o primeiro caso:

- N1 = 6.5 × 2 = 13.0
- N2 = 4.3 × 3 = 12.9
- N3 = 6.2 × 5 = 31.0

**Soma = 56.9**

**Média = 56.9 / 10 = 5.69**

Resultado formatado: `5.7`

O mesmo procedimento é realizado para os demais casos de teste.

## 📚 Conceitos praticados

- Entrada de dados com `Scanner`
- Estrutura de repetição `while`
- Manipulação de números reais com `double`
- Cálculo de média ponderada
- Multiplicação e divisão
- Contadores e incremento
- Formatação de números com `System.out.printf()`
- Uso de `%.1f` para exibir uma casa decimal
- Uso de `%n` para quebra de linha

## 🎯 Objetivo

Praticar estruturas de repetição e operações matemáticas em Java, desenvolvendo a capacidade de calcular médias ponderadas para múltiplos casos de teste.

---

**Plataforma:** Beecrowd  
**Problema:** 1079 – Médias Ponderadas  
**Linguagem:** Java
