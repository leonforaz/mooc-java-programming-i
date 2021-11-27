
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        int number = scanner.nextInt();
        
        if (number >= 0 && number <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible");
        }

    }
}
