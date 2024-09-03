package trycatchtests;

import java.text.NumberFormat;
import java.text.ParseException;

public class FormatNumber {
    public static void main(String[] args) {
        Number valor = null;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);

        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("Number can't be parseable: " + valor);
        }
    }
}
