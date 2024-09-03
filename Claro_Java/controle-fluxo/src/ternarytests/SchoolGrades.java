package ternarytests;
public class SchoolGrades {
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
