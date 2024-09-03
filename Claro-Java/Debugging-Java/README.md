## Debugging Java

### Pilha de Execução de um Programa Java

Pilha de execução nada mais é que o modus operandi de toda aplicação java contendo métodos.

Exemplo:

1. Temos um programa que contêm 3 métodos: a, b e c;
2. Chamo o método `a`, dentro do método `a` eu chamo o método `b`, e dentro do método `b` eu chamo o método `c`

A pilha de execução correta desse algoritmo será: `a` → `b` → `c`, `c` foi concluído? Então `c` → `b`, `b` foi concluído? Então `b` → `a`, `a` foi concluído? Então `a` → `main`. Vejamos a seguir:

```java

public class PilhaExecucao {
    public static void main(String[] args) {
        System.out.println("Inicio do programa no método main.");
        a();
        System.out.println("Finalização do programa no método main.");
    }

    public static void a() {
        System.out.println("Entrou no método a.");
        b();
        System.out.println("Finalizou o método a.");
    }

    public static void b() {
        System.out.println("Entrou no método b.");
        for(int i = 0; i < 7; i++) {
            System.out.println("Contando no metodo b: " + i);
        }
        c();
        System.out.println("Finalizou o método b.");
    }

    public static void c() {
        System.out.println("Entrou no método c.");
        // Esse metodo serve para sabermos a trilha, ou pilha
        // de execucao do metodo c e de onde ele veio
        // ! A leitura deve ser feita de BAIXO para CIMA !
        Thread.dumpStack();
        System.out.println("Finalizou o método c.");
    }
}

```

Terminal:

```
Inicio do programa no método main.
Entrou no método a.
Entrou no método b.
Contando no metodo b: 0
Contando no metodo b: 1
Contando no metodo b: 2
Contando no metodo b: 3
Contando no metodo b: 4
Contando no metodo b: 5
Contando no metodo b: 6
Entrou no método c.
java.lang.Exception: Stack trace
					at java.base/java.lang.Thread.dumpStack(Thread.java:2177)
					at PilhaExecucao.c(PilhaExecucao.java:29)
					at PilhaExecucao.b(PilhaExecucao.java:20)
					at PilhaExecucao.a(PilhaExecucao.java:11)
					at PilhaExecucao.main(PilhaExecucao.java:5)
Finalizou o método c.
Finalizou o método b.
Finalizou o método a.
Finalização do programa no método main.
```
-------------
### Depurando na IDE Visual Studio Code

Para debugar um código na IDE VsCode, primeiro precisamos setar os breakpoints. Breakpoints nada mais são que “pontos de parada”, onde o código deve ser observado, geralmente são locais onde erros podem ocorrer, como por exemplo:

- Atribuições de variáveis;
- Loops;
- Processamento de dados…

![Pontos vermelhos representam Breakpoints em nosso código](https://github.com/wChrstphr/Bootcamps/blob/066654cd9aa96ea74eeffadb7bf59f9df2c1972a/Claro-Java/Debugging-Java/img/breakpoints.png)

Pontos vermelhos representam Breakpoints em nosso código

Após indicar os pontos de parada, entramos em modo Debug. Acessar o modo Debug pode ser feito de diversas formas:

1. Clique direito do mouse → Debug Java;
2. Pela IDE, na parte superior direita da tela:
    
    ![Debug na IDE](https://github.com/wChrstphr/Bootcamps/blob/066654cd9aa96ea74eeffadb7bf59f9df2c1972a/Claro-Java/Debugging-Java/img/debug_IDE.png)
    
3. Se tiver a extensão Java, no próprio código:
    
    ![Debug em linha de código](https://github.com/wChrstphr/Bootcamps/blob/066654cd9aa96ea74eeffadb7bf59f9df2c1972a/Claro-Java/Debugging-Java/img/debug_code.png)
    

**Em modo Debug**

Aqui podemos verificar variáveis locais e até mesmo adicionar outras que queremos verificar o valor no campo “Watch”

**Principais comandos:**

- Step Over (F10) ir para a próxima linha de exeução do código;
- Step Into (F11) entrar num método;
- Step Out (F12) sair do método;
- Stop (shift + F10) sair do modo debug.

![Controles Depuração de Código](https://github.com/wChrstphr/Bootcamps/blob/066654cd9aa96ea74eeffadb7bf59f9df2c1972a/Claro-Java/Debugging-Java/img/debug_controls.jpg)

**Breakpoint Condicional**

Um breakpoint condicional serve para depurar códigos de pequena a larga escala, onde se precisa **ir direto para quando uma condição é verdadeira ou quando o laço foi iterado $n$ vezes**.

Suponha uma situação onde o erro esteja ocorrendo ao registrar um produto e este produto está na posição 985. Seria inviável ir linha a linha até a posição 985. Por isso adicionamos um breakpoint com a condicional i == 985. Supondo que i seja a posição do produto.

É importante salientar que **o breakpoint deve ser posionado dentro do loop**, não na declaração dele

Referenciando o código disposto acima, queremos ir direto para a posição **5**

![Condicionais em Depuração de Código](https://github.com/wChrstphr/Bootcamps/blob/066654cd9aa96ea74eeffadb7bf59f9df2c1972a/Claro-Java/Debugging-Java/img/debug_conditional.png)

E este é o output disposto no terminal, em método debug:

```
Inicio do programa no método main.
Entrou no método a.
Entrou no método b.
Contando no metodo b: 0
Contando no metodo b: 1
Contando no metodo b: 2
Contando no metodo b: 3
Contando no metodo b: 4
```

Assim temos maior controle sobre a depuração de nossos códigos, otimizando nosso tempo e utilizando todas as ferramentas que a IDE nos oferece.

--------
<p align="center"> Feito com 🤍 por <a href="https://www.linkedin.com/in/christopherparaizo/">Chrstphr</a></p>
