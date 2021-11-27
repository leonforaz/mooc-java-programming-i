
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int number = Integer.valueOf(reader.nextLine());
        
        if (number < 0) { // if the sum is over 100
            System.out.println(number*-1);
        } else if (number > 0) { // if the sum is less than 0
            System.out.println(number);
        }      
        
    }
}
