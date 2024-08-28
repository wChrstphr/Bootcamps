package dio.christopher.operadores;

public class Operadores {
    public static void main(String[] args) {
        // Testando operador de adicao para concatenar valores
        System.out.println("Operadores Aritmeticos em String");

        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + 3 + "1" + "?" + 1 + 2 + 3 + (9+9);
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1) + "1";
        System.out.println(concatenacao);
        
        
        // Testando a negacao de valores com operador unario
        int numero = 3;

        numero = -numero;
        System.out.println(numero);
        numero *= -1;
        System.out.println(numero);

        // Incremento de valor
        System.out.println(++numero);
        System.out.println(--numero);


        // Operador de negacao
        boolean variavel = true;

        System.out.println("\nOperadores Unarios de Negacao");
        System.out.println(!variavel); //aqui a variável não muda em memória, continuando como 'true'
        System.out.println(variavel);

        // para mudar de true para false, utiliza-se
        variavel = !variavel;
        System.out.println(variavel);
        

        // Operador ternario
        int a = 5;
        int b = 6;
        String resultado = "";

        // estrutura if convencional
        if (a == b)
            resultado = "verdadeiro";
        else   
            resultado = "falso";

        // estrutura do operador ternario
        resultado = (a == b) ? "verdadeiro" :  "falso";
        System.out.println("\nOperador Ternario");
        System.out.println(resultado);

        // Testando operador relacional == em duas Strings
        String nomeUm = "Christopher";
        String nomeDois = "Christopher";
        boolean simNao = true;

        simNao = nomeUm == nomeDois;

        nomeDois = new String("Christopher");

        simNao = nomeUm == nomeDois;
        // forma correta para se compara duas Strings e conteudos em objetos
        simNao = nomeUm.equals(nomeDois);
        System.out.println("\nOperador Relacional de Igualdade");
        System.out.println(simNao);
        // Operadores logicos
        boolean condicao1 = true;
        boolean condicao2 = false;

        String verificacao = condicao1 && condicao2 ? "As duas condicoes sao verdadeiras" : "As duas condicoes nao sao verdadeiras";

        System.out.println("\nOperador logico");
        System.out.println(verificacao);
        
        verificacao = condicao1 || condicao2 ? "Uma das condicoes e verdadeira" : "Nenhuma das condicoes e verdadeira";
        System.out.println(verificacao);
    }
}
