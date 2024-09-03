package dowhiletests;
import java.util.Random;

public class PhoneCall {
    public static void main(String[] args) {
        int ringCount = 0;
        System.out.println("Dialing...");
        do { 
            System.out.println("Phone is ringing");
            ringCount++;
        } while (ringing());


        System.out.println("Hey!!!\nIt rang for " + ringCount + " times before you picked it up!");
    }

    public static boolean ringing () {
        // if nextInt, generate randomly is 1, then
        // the condition is TRUE, else is FALSE
        boolean attend = new Random().nextInt(3)==1;
        System.out.println("Attended? " + attend);

        return !attend;
    }
}
