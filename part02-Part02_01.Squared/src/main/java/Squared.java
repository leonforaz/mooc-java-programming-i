
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
                // Creating the Scanner
        Scanner reader = new Scanner(System.in);

        // Declaring the variables and assigning user input to them
        int first = Integer.valueOf(reader.nextLine());

        // Identifying the operation and declaring a variable for the result
        int sum = first * first;

        // Printing the result of the operation
        System.out.println(sum);
        
    }
    
}