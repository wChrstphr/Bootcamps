public class SistemaMedida {
    public static void main(String[] args) {
        char option = 'S';
        /*
        switch (option) {
            case 'S':  {
                System.out.println("Small");
                break;
            }
            case 'M':  {
                System.out.println("Medium");
                break;
            }
            case 'B':  {
                System.out.println("Big");
                break;
            }
            default: throw new AssertionError();
        }
         */
        System.out.println(
            switch (option) {
                case 'S' -> "Small";
                case 'M' -> "Medium";
                case 'B' -> "Big";
                default -> throw new AssertionError();
            }
        );
        int x = 1;
        System.out.println(
            switch (x) {
                case 1 -> "one";
                case 2 -> "two";
                default -> null;
            }
        );
    }
}
