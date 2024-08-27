package dio.christopher.anatomiaclasses;
public class MyClass {
    
    public static void main (String [] args) {
        String firstName = "Wanjo";
        String secondName = "Christopher";
        String fullName;

        fullName = concatName(firstName, secondName);

        System.out.println(fullName);
    }

    public static String concatName (String firstName, String secondName) {
        return "Resultado do metodo " + firstName.concat(" " + secondName);
    }

}
