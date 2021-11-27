
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int x = Integer.valueOf(scanner.nextLine());

        if (x > 0) {
            System.out.println("The number is positive.");
        } else if (x < 0) {
            System.out.println("is not positive.");
        } else {
            System.out.println("is not positive");
        }
    }
}
