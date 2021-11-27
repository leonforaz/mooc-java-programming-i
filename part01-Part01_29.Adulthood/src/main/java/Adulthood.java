
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        int x = Integer.valueOf(scanner.nextLine());

        if (x < 18) {
            System.out.println("You are not an adult");
        } else if (x > 17) {
            System.out.println("You are an adult.");
        }
    }
} 
