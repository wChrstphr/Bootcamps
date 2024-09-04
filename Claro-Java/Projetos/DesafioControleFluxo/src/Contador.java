// O sistema deve:
// Receber 2 (dois) parametros interios via terminal
// Realizar uma interacao for com esses dois numeros, num2 - num 1 == i
// num2 deve ser MAIOR que num1
// o loop for deve gerar um sysout  com a mensagem "Imprimindo o número 1"
// "Imprimindo o número 2", e assim sucessivamente

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * <h1> Contador </h1>
 * Imprime contagem de acordo com os parâmetros do usuário (numUm, numDois).
 * <p>
 * <b>Note:</b> Projeto feito com finalidade de execitar sobre os conteúdos de:
 * - Controle de Fluxo
 * - Tratamento de Exceções
 * 
 * @author Wanjo Christopher 
 * @version 1.0
 * @since 04/09/2024
 * 
 * 
 * 
 */

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System.in);

        try {
            System.out.println("Bem-vindo ao contador!\nContagem -> X = b - a\n");
            System.out.println("Digite o primeiro parametro (a)");
            int numUm = scan.nextInt();
            System.out.println("Digite o segundo parametro (b)");
            int numDois = scan.nextInt();
            scan.close();
            contar(numUm, numDois);
        } catch (InputMismatchException e) {
            System.out.println("Por favor, digite apenas numeros inteiros.");
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * Esse método  imprime a contagem ao usuario, de acordo com os parâmetros passados, além de verificar uma possível exceção.
     * @param numUm 
     * @param numDois 
     * @throws ParametrosInvalidosException
     */
    public static void contar (int numUm, int numDois) throws ParametrosInvalidosException{
        if (numUm > numDois) throw new ParametrosInvalidosException("Erro nos parâmetros: O segundo deve ser menor que o primeiro.");

        int contador = numDois - numUm;
        for (int i = 1; i <= contador; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
    }
}
