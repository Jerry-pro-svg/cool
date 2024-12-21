import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        try (Scanner jb = new Scanner(System.in)) {
            System.out.println("Hello Enter your name for this: ");
            String name = jb.nextLine();
            
            System.out.println("Enter your ur lucky number: ");
            int num = jb.nextInt();
            
            System.out.println("Hello user" + name + "Ur lucky number was" + "" + num);
        }



    }
    
}
