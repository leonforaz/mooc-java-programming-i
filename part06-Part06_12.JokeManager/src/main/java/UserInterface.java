
//Create a class called UserInterface and move the UI functionality of 
//the program there. The class must have a constructor with two parameters. 
//The first parameter is an instance of the JokeManager class, 
//and the second parameter is an instance of the Scanner class. 
//In addition, the class should have the method public void start() that 
//can be used to start the user interface.
//x, 1, 2, 3
import java.util.Scanner;

public class UserInterface {

    private JokeManager manager;
    private Scanner scanner;

    //JokeManager is not JokeScanner
    public UserInterface(JokeManager manager, Scanner jokeScanner) {
        this.manager = manager;
        this.scanner = jokeScanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");

            String command = this.scanner.nextLine();
            if (command.equals("X")) {
                break;
            } else if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = this.scanner.nextLine();
                this.manager.addJoke(joke);
            } else if (command.equals("2")) {
                System.out.println("Drawing a joke.");
                System.out.println(this.manager.drawJoke());
                //drawJoke() already has an ifEmpty statement
            } else if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                this.manager.printJokes();
            }
        }
    }
}

//JokeManager manager = new JokeManager();
//Scanner scanner = new Scanner(System.in);
//
//UserInterface interface = new UserInterface(manager, scanner);
//interface.start();
