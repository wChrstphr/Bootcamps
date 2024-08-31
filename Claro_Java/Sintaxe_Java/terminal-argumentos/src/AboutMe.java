public class AboutMe {
    public static void main(String[] args) throws Exception {
        if (args.length > 0 ) {   
            String name = args [0];
            String surname = args [1];
            int age = Integer.valueOf(args[2]);
            double height = Double.valueOf(args[3]);
            String courseName = args [4].concat(" " + args[5]);
            String collegeName = args [6].concat(" ".concat(args[7].concat(" ").concat(args[8].concat(" ").concat(args[9]))));
    
    
            System.out.println("Hi there! I'm " + name + " " + surname);
            System.out.println("I'm " + age);
            System.out.println("My height is " + height);
            System.out.println("I study " + courseName + " at " + collegeName);
        } else {
            throw new Exception ("Invalid arguments");
        }
    }
}
