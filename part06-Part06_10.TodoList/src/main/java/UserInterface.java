
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }
    
    public void start() {
        String command;
        while (true) {
            System.out.print("Command: ");
            command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.print("To add: ");
                String nextToAdd = scanner.nextLine();
                this.list.add(nextToAdd);
            } else if (command.contains("list")) {
                int itemNumber = 1;
                for (String task : this.list.getItems()) {
                    System.out.println(itemNumber + ": " + task);
                    itemNumber++;
                }
            } else if (command.equals("remove")) {
                int itemNumber;
                System.out.print("Which one is removed? ");
                itemNumber = Integer.parseInt(scanner.nextLine());
                this.list.remove(itemNumber);
            }
        }
    }
}

// parseInt
// added getItems() to TodoList