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