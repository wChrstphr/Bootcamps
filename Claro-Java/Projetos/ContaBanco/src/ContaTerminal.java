/*
 * Este programa Java deve realizar as seguintes intruções:
 * 1. Solicitar informações do usuario
 *      Nome
 *      Agencia
 *      Numero de conta
 *      Saldo
 * 2. Imprimir ao usuario do sistema o seguinte:
 *      "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, 
 *      sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está   
 *      disponível para saque".
 */


import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
            // Inicializando minha classe Scanner, com nome "scan"
            Scanner scan = new Scanner(System.in);
            String cadastrar = "sim";
            while (cadastrar.equalsIgnoreCase("sim")) {
                // Limpando a tela
                System.out.print("\033[H\033[2J");
                System.out.flush();
    
                System.out.println("Seja bem-vindo ao sistema de criação de contas da Wobank\nPor favor, forneça as informações a seguir:");
                System.out.println("Digite seu nome completo:");
                String nome = scan.nextLine();
        
                System.out.println("Digite o número de sua agencia (000-0):");
                String agencia = scan.nextLine();
        
                System.out.println("Digite o número de sua conta (0000):");
                int conta = scan.nextInt();
                // Limpando o buffer para evitar problemas no próximo valor a ser digitado
                scan.nextLine();
        
                System.out.println("Digite o valor a ser sacado:");
                double saque = scan.nextDouble();
                // Limpando o buffer
                scan.nextLine();
                
                // Limpando a tela
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\nOlá ".concat(nome + ", ") + "obrigado por criar uma conta em nosso banco, sua agência é ".concat(agencia + ", ") + "conta ".concat(conta + " ") + "e seu saldo R$".concat(saque + " ") + "já está disponível para saque.");

                System.out.println("\nDeseja cadastrar mais uma conta?");
                System.out.println("Sim/Não");
                cadastrar = scan.nextLine();
            }

    }
}
