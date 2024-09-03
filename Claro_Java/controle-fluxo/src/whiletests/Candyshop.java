package whiletests;
import java.util.concurrent.ThreadLocalRandom;

// Neste codigo, temos uma criança, Melissa, que ganhou mesada e quer gastar em doces
// No algoritmo a seguir, geramos valores aleatorios para doces
// utilizando o metodo randomCandyValue, adicionando o doce ao carrinho
// e subtraindo da mesada de Melissa, ate que ela nao tenha mais 
// dinheiro para comprar doces, assim exibimos o que restou e a
// quantidade de doces comprados

public class Candyshop {
    public static void main(String[] args) {
        double balance = 50.0;
        int candyNumber = 0;
        while (balance > 0) {
            double candyValue = randomCandyValue();
        
            if (candyValue > balance) 
                break;

            System.out.println("The candy costing R$" + String.format("%.2f", candyValue) + " was added to the bag");
            balance -= candyValue;
            candyNumber++;
        }
        System.out.println("Balance: " + String.format("%.2f", balance));
        System.out.println("Melissa spent all her money on " + candyNumber + " candies!!!");
    }

    public static double randomCandyValue() {
        return ThreadLocalRandom.current().nextDouble(2,15);
    }
}
