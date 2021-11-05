import java.util.Scanner;
import java.util.ArrayList;

public class OnTheList {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String x = "";
        //String name;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals(x)) {
                break;
            }
            list.add(input);
        }
        System.out.println("Search for? ");
        String name = scanner.nextLine();
        if (list.contains(name)) {
            System.out.println(name + " was found");
        } else {
            System.out.println(name + " was not found");
        }
    }
}