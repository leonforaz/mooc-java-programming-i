
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Stock> list = new ArrayList<>();
        
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Stock newStock = new Stock(identifier, name);
            boolean duplicate = false;
            for (Stock item : list) {
                if (identifier.equals(item.getIdentifier())) {
                    // duplicate found
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                list.add(newStock);
            }
        }

        // Print all items in the list
        System.out.println("==Items==");
        for (Stock item : list) {
            System.out.println(item);
        }
    }
}
