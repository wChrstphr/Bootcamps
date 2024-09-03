import java.util.Locale;
import java.util.Scanner;

public class AboutMeScanner {
    public static void main(String[] args) throws Exception {  
            // initializing my scan class
            // useLocale is for the US convention for floating numbers. ex: 1.82 instead of 1,82
            Scanner scan = new  Scanner(System.in).useLocale(Locale.US);

            System.out.println("What's your name?");
            String name = scan.nextLine();

            System.out.println("How old are you?");
            int age = scan.nextInt();
            // cleaning the buffer
            scan.nextLine();

            System.out.println("Whats your height?");
            double height = scan.nextDouble();
            // cleaning the buffer
            scan.nextLine();

            System.out.println("What are you studying now?");
            String courseName = scan.nextLine();

            System.out.println("Where are you studying " + courseName + "?");
            String collegeName = scan.nextLine();
            
            scan.close();

            System.out.println("Hi there! I'm " + name);
            System.out.println("I'm " + age);
            System.out.println("My height is " + height);
            System.out.println("I study " + courseName + " at " + collegeName);
    
    }
}
