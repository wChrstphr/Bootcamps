public class SchoolGrades {
    public static void main(String[] args) {
        int grade = 8;
        // Estrutura composta ENCADEADA
        if (grade >= 7)
            System.out.println("Aproved");
         else if (grade >= 5 && grade < 7)
            System.out.println("Recovery Test");
         else 
            System.out.println("Failed");
    }
}
