
import java.util.Scanner;

public class UserInterface {

    private Container firstContainer;
    private Container secondContainer;
    private Scanner scanner;
    private int min;

    public UserInterface(Container firstContainer, Container secondContainer, Scanner scanner) {
        this.firstContainer = firstContainer;
        this.secondContainer = secondContainer;
        this.scanner = scanner;
        this.min = 0;
    }

    public void start() {
        while (true) {
            System.out.println("First: " + this.firstContainer);
            System.out.println("Second: " + this.secondContainer);

            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                this.firstContainer.add(amount);

            } else if (command.equals("move")) {
                int available = this.firstContainer.contains();
                if (available < amount) {
                    amount = available;
                }
                this.firstContainer.remove(amount);
                this.secondContainer.add(amount);

            } else if (command.equals("remove")) {
                this.secondContainer.remove(amount);
            }
        }
    }
}
//        System.out.println("");
//        System.out.println("First: " + this.firstContainer);
//        System.out.println("Second: " + this.secondContainer);

