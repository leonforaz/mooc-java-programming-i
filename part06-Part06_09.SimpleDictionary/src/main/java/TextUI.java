
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }
    
    private void add() {
        String word;
        String translation;
        System.out.print("Word: ");
        word = scanner.nextLine();
        System.out.print("Translation: ");
        translation = scanner.nextLine();
        simpleDictionary.add(word, translation);
    }//return
    
    private void search() {
        String word;
        System.out.println("To be translated: ");
        word = scanner.nextLine();
        String translation = simpleDictionary.translate(word);
        if (translation == null) {
            System.out.println("Word " + word + " was not found");
        } else {
            System.out.println("Translation: " + translation);
        }
    }
    
    public void start() {
        String command;
        while (true) {
            System.out.print("Command: ");
            command = scanner.nextLine();
            if (command.equals("end")) {
                break;
            } else if (command.equals("add")) {
                add();
            } else if (command.equals("search")) {
                search();
            }
            else {
                System.out.println("Unknown command");
            }
        }
        System.out.println("Bye bye!");
    }
}
