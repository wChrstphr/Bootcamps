package fortests;
public class ImprimeAlunos {
    public static void main(String[] args) {
        String alunos [] = {"Felipe", "Joao", "Marcela", "Christopher"};

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno no indice " + i + " eh " + alunos[i]);
        }
        
        // Forma abreviada
        for (String aluno : alunos) {
            System.out.println("Alunos da classe: " + aluno);

        }
    }
}
