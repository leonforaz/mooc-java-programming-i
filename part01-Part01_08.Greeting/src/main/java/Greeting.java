
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?"   );
        
        String message = scanner.nextLine();
        
       System.out.println("You wrote " + message); 
    }
}