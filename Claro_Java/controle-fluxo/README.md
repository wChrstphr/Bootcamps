## Estruturas Condicionais em Java

### **Condicional Simples**

É uma estrutura que contempla apenas um fluxo, ou a condição é verdadeira e então o bloco é executado, ou não é verdadeira e o bloco é **ignorado**.

```java
public class CashMachine {
    public static void main(String[] args) {
        double balance = 25.0;
        double solicitedValue = 17.0;

        // Estrutura condicional SIMPLES
        if (solicitedValue < balance) {
            balance -= solicitedValue;
        }
        System.out.println(balance);
    }
}
```

### Condicional Composta

É uma estrutura que contempla dois fluxos, `if` e `else`.

```java
public class SchoolGrades {
    public static void main(String[] args) {
        int grade = 8;
        // Estrutura condicional COMPOSTA
        if (grade >= 7){
            System.out.println("Aproved");
        } else {
            System.out.println("Failed");
        }
    }
}
```

### Condicional Encadeada

Estrutura condicional que contempla dois ou mais fluxos.

```java
public class SchoolGrades {
    public static void main(String[] args) {
        int grade = 8;
        // Estrutura condicional ENCADEADA
        if (grade >= 7)
            System.out.println("Aproved");
         else if (grade >= 5 && grade < 7)
            System.out.println("Recovery Test");
         else 
            System.out.println("Failed");
    }
}

```

### Condição Ternária

Com operadores ternários, podemos abreviar nossos algorítimos condicionais.

```java
public class SchoolGradesTernary {
    public static void main(String[] args) {
        int grade = 7;
        String result;

        /* Estrutura composta
        result = grade >= 7 ? "Aproved" : "Failed";
        */

        // Estrutura encadeada utilizando ternario
        result = grade >= 7 ? "Aproved" : grade >= 5 && grade < 7 ? "Recovery Test" : "Failed";
        // Representa o mesmo que utilizar if, else if e else, porem com uma estrutura mais limpa

        System.out.println(result);
    }
}
```

### Switch / Case

O método switch/case tem diversas utilizações. Podemos utilizá-lo ao ter muitas opções, sendo preciso escolher uma, ou quando se quer executar uma parte do código e apenas as subsequentes a esse código, dentre outras funcionalidades.

```java

public class PlanoOperadora {
    public static void main(String[] args) throws Exception {
        String plano = "a"; // T, M ou B
        
        // Com esse método, acabamos REPETINDO 
        // muitas linhas de código, deixando o código 
        // mais pesado sem necessariamente melhorar 
        // sua performance ou adicionar features
        System.out.println("Fluxo if / else");
        if (plano.equalsIgnoreCase("B")) {
            System.out.println("100 minutos de ligacao");
        } else if (plano.equalsIgnoreCase("M")) {
            System.out.println("Whats e Insta gratis");
            System.out.println("100 minutos de ligacao");
        } else if (plano.equalsIgnoreCase("T")) {
            System.out.println("5GB de Youtube");
            System.out.println("Whats e Insta gratis");
            System.out.println("100 minutos de ligacao");
        }

        
        // Neste caso, podemos utilizar do switch case
        // e sem utilizar o comando 'break;', podemos
        // fazer um codigo em cascata, que rodará
        // do plano mais "Alto" para o mais "Baixo"
        // imprimindo pro usuário todos os beneficios
        System.out.println("\nFluxo switch / case");
        switch (plano) {
            case "T": {
                System.out.println("5GB de Youtube");
            }
            case "M": {
                System.out.println("Whats e Insta gratis");
            }
            case "B": {
                System.out.println("100 minutos de ligacao");
            }
            default: 
            throw new Exception("Plano nao especificado");
        }
        
    }
}
```
### Laços de Repetição

**For**

O comando `for` testa uma variável suporte, geralmente `int i = 0;` por meio de uma condição, e se a condição for verdadeira, incrementa a cada iteração daquele bloco de código

```java
// estrutura base para o fluxo for
final String INICIAR = "inicializacao de variavel";
final String VALIDAR = "expressao booleana para validacao";
final String INCREMENTAR = "bloco de incremento da variavel";

for (INICIAR ; VALIDAR ; INCREMENTAR ) {
		// codigo que sera executado
		// ate que a validacao seja falsa
}
```

**Exemplo for convencional**

```java
public class ExemploFor {
    public static void main(String[] args) {
        for (int count = 1; count <= 20; count++) {
            System.out.println("Counting up to 20. Currently at: " + count);
        }
    }
}
```

Pode-se também utilizar o controle de fluxo `for` para interagir com arrays da seguinte maneira:

```java
public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"Felipe", "Joao", "Marcela", "Christopher"};

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno no indice " + i + " eh " + alunos[i]);
        }
    }
}
```

**Estrutura For : Each**

Essa estrutura pode ser utilizada quando a iteração a ser feita é baseada nos elementos do array ou de uma coleção

```java
public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"Felipe", "Joao", "Marcela", "Christopher"};

// Forma abreviada
        for (String aluno : alunos) {
            System.out.println("Alunos da classe: " + aluno);
        }
    }
}
```

**While**

O laço de repetição `while` testa uma condição **antes** de executar o código. Caso a condição seja válida, o bloco será executado, caso contrário, o bloco não será executado

```java
// estrutura de controle de fluxo while

while (expressao booleana para validacao) {
				// codigo que sera executado
				// ate que a expressao seja falsa
}
```

```java
import java.util.concurrent.ThreadLocalRandom;

// Neste codigo, temos uma criança, Melissa, que ganhou mesada e quer gastar em doces
// No algoritmo a seguir, geramos valores aleatorios para doces
// utilizando o metodo randomCandyValue, adicionando o doce ao carrinho
// e subtraindo da mesada de Melissa, ate que ela nao tenha mais 
// dinheiro para comprar doces, assim exibimos o que restou e a
// quantidade de doces comprados

public class ExemploWhile {
    public static void main(String[] args) {
        double balance = 50.0;
        int candyNumber = 0;
        while (balance > 0) {
            double candyValue = randomCandyValue();
        
            if (candyValue > balance) 
                break;

            System.out.println("The candy costing R$" + String.format("%.2f", candyValue) + " was added to the bag");
            balance -= candyValue;
            candyNumber++;
        }
        System.out.println("Balance: " + String.format("%.2f", balance));
        System.out.println("Melissa spent all her money on " + candyNumber + " candies!!!");
    }

    public static double randomCandyValue() {
        return ThreadLocalRandom.current().nextDouble(2,15);
    }
}
```

**Do While**

A estrutura de repetição `do / while` **executa o código pelo menos uma vez**, mesmo que a condição seja inválida

```java
// estrutura de controle de fluxo do while

do {
		// codigo que sera executado ate que 
		// a expressao de validacao seja falsa
} while (expressao booleana para validacao);
```
Aqui exemplifico o uso de do/while para uma ligação
```java
import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        int ringCount = 0;
        System.out.println("Dialing...");
        do { 
            System.out.println("Phone is ringing");
            ringCount++;
        } while (ringing());

        System.out.println("Hey!!!\nIt rang for " + ringCount + " times before you picked it up!");
    }

    public static boolean ringing () {
        // if nextInt, generated randomly, is 1 then
        // the condition is TRUE, else is FALSE
        boolean attend = new Random().nextInt(3)==1;
        System.out.println("Attended? " + attend);

        return !attend;
    }
}

```
