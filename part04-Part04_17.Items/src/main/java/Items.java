
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        // implement here your program that uses the class Item
        
        while (true) {
            System.out.print("Enter a name, empty will stop: ");
            System.out.println("");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            items.add(new Item(name));
        }//end of while loop
        System.out.println();
        for(Item item : items) {
        System.out.println(item.toString());
        }
    }
}
