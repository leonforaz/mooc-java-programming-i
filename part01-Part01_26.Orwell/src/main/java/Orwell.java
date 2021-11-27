
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int x = Integer.valueOf(scanner.nextLine());
        if (x == 1984) {
            System.out.println("Orwell!");
        }
    }
}
