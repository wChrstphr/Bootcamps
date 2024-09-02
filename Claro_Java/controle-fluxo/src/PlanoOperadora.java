

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
