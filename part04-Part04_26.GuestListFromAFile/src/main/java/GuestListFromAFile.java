//Modify the program so that the names on the guest list are read from the file.
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = inputScanner.nextLine();

        ArrayList<String> list = new ArrayList<>();
        // implement reading the file here.
        
        //defines the scope
        //if an error is thrown within the try, go to the catch
        //try is like an if, needs catch.
        //can do an if without an else
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }//can't infinite loop because all files are finite
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        //stock code
        System.out.println("");

        System.out.println("Enter names, an empty line quits.");
        while (true) {
            String name = inputScanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            if (list.contains(name)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }
        System.out.println("Thank you!");
    }
}