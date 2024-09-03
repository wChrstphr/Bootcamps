package breakcontinuetests;
public class ImprimeNumeros {
    public static void main(String[] args) {
        for (int num = 1; num <= 10; num++) {
            if (num == 3) {
                System.out.println("Break\n");
                break;
            }
            // imprime 1, 2 e PARA
            System.out.println(num);
        }
        
        for (int num = 1; num <= 10; num++) {
            if (num == 3) {
                System.out.println("Continue");
                continue;
            }
            // imprime 1, 2, PULA o 3, imprime ate 10
            System.out.println(num);
        }
    }

}
