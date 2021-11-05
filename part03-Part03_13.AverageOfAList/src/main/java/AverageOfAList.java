
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0, inputAmount = 0;
        
        while (true) {
            int input = scanner.nextInt();
            
            if (input == -1) {
                break;
            }
            
            list.add(input);
        }
        
        for (int i : list) {
            sum += i;
            inputAmount++;// inputAmount = inputAmount + 1;
        }
        System.out.println("Average: " + 1.0 * sum/inputAmount);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}
