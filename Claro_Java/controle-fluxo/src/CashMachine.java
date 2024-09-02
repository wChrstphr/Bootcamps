public class CashMachine {
    public static void main(String[] args) {
        double balance = 25.0;
        double solicitedValue = 17.0;

        // Estrutura condicional SIMPLES
        if (solicitedValue < balance) {
            balance -= solicitedValue;
        }
        System.out.println(balance);
    }
}
