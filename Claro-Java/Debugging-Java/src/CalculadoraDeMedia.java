import java.util.Scanner;

public class CalculadoraDeMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos  = {"Joao", "Ricardo", "Marcela", "Vitoria"};

        double media = calculaMediaDaTurma(alunos, scan);

        System.out.println("A Média da turma é " + media);
    }

    public static double calculaMediaDaTurma (String alunos [], Scanner scanner) {
        double soma = 0;
        for (String aluno: alunos) {
            System.out.println("Nota do aluno: " + aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        } 

        return soma / (double) alunos.length;
    }
}
