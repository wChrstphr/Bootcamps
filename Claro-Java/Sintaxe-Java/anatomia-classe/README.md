# Anatomia das Classes em Java
## **Padrão de nomenclatura**

### **Arquivos**
Todo arquivo .java deve começar com letra MAIÚSCULA. Se a palavra for composta, a segunda palavra deve começar com letra maiúscula também, exemplo:

- Calculator.java
- ScientificCalculator.java

### **Classes**:
Toda classe deve estar sempre dentro da pasta src do projeto, e possuir o mesmo nome do arquivo.java, exemplo:

- public class Calculator
- public class ScientificCalculator

### **Variável:** 
Toda variável deve ser escrita utilizando a convenção camelCase. Com a primeira palavra escrita em letra minúscula, e as seguintes, começando com letra MAIÚSCULA, exemplo:

- year
- fabricationYear

## **Declarando variáveis**

### **Variável imutável**
Para declarar uma variável imutável ao longo do código, podemos atribuir **final** a ela. Variável imutáveis TEM_ESSE_FORMATO, exemplo:

```java
final int ESTADOS_BRASIL = 27
```

### **Declaração de variáveis**

Na declaração de uma variável, pode-se utilizar números, caracteres e alguns símbolos.

- Deve conter apenas letras, _(underline), $ (cifrão) e números de 0 a 9;
- Obrigatoriamente inicia-se por letra ou $;
- Deve iniciar com letra minúscula;
- Não deve haver espaços;
- Não se pode utilizar palavras-chave da linguagem, como system;
- O nome deve único.

```java
// Estrutura Basica
Tipo nomeBemDefinido = Atribuicao;

// Exemplo
int idade = 23;
double altura = 1.72;
Dog misterio; // aqui apenas declaramos a variavel misterio
								// que pertence a classe Dog
```

### **Declarando métodos**

```java
//Estrutura Basica
TipoRetorno nomeObjetivoNoInfinitivo (Parametros)

// Exemplo
int subtrair (int numeroUm, int numeroDois)
String formatarCPF (long cpf)
```

```java
public class MyClass {
    
    public static void main (String [] args) {
		    // Declarando variaveis
        String firstName = "Wanjo";
        String secondName = "Christopher";
        String fullName;
					
				// Atribuindo o nome completo a variavel fullName por meio
				// do metodo connectName()
        fullName = connectName(firstName, secondName);
        
				// Imprimindo o nome
        System.out.println(fullName);
    }

    public static String connectName (String firstName, String secondName) {
        return "Resultado do metodo " + firstName.concat(" " + secondName);
    }
    
}
```

### **Indentação**

É uma forma de escrita do código do programa de forma **hierárquica**, a fim de facilitar a compreensão e visualização do programa

### **Organizando arquivos**

À medida que surgem novos arquivos de código-fonte em nossa estrutura através do desenvolvimento do sistema, a organização de arquivos mediante pacotes (**packages**), se torna essencial; 

Por convenção, utiliza-se a seguinte nomemclatura:

1. **finalidade.nome.tema.assunto**
2. **finalidade.organização.projeto.tema**

As **finalidades** podem ser: comercial, organizacional, open-source, etc. Exemplo:

- com.hypertech.notification.app
- com.hypertech.notification.util
- com.hypertech.notification.service
- opensource.git.branch.log
- unb.christopher.primeirasemana.anatomia-classe

### **Java Beans**

É uma iniciativa conceitual da comunidade Java, que sugere **convenções e formas de escrita universal** para classes, atributos, métodos e pacotes, **a fim de facilitar o compreendimento dos algoritmos** por todo seu time ou por você mesmo nos futuro

### **Variáveis** 

1. Uma variável deve ser clara, sem abreviações ou definição sem sentido;
2. Uma variável é sempre no **singular**, **exceto quando se referir a um array ou coleção;**
3. Defina um idioma **único** para as variáveis
    
    **Nomeando erroneamente**
    
    ```java
    // variavel abreviada
    double salMedio = 1500.25;
    
    // variavel no plural
    String emails = "aluno@escola.com";
    
    // se idioma pt-BR, todas as variaveis devem ser em pt-B
    String myName = "Joseph";
    ```
    
    **Nomeando corretamente**
    
    ```java
    // variavel com nome inteiro, sem abreviacoes
    double salarioMedio = 1500.25;
    
    // variavel no singular
    String email = "aluno@escola.com";
    
    // array no plural
    String [] emails = {"aluno@escola.com", "professor@escola.com"};
    
    // uso de apenas um idioma na nomeacao de variaveis
    String meuNome = "Joseph";
    
    ```
    

### **Métodos**
Métodos devem ser nomeados como verbos. Em princípio, todas as letras devem ser mantidas em minúsculo, exceto a primeira letra de cada palavra nomeada após a primeira palavra. Exemplo:

```java
sum (int n1, int n2){}

openConection(){}

processDate(){}

findById(int id){}

// metodo errado, cada metodo deve ter uma UNICA finalidade
calcularSomar(){}
somarImprimir(){}
``` 