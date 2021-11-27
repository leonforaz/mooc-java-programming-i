
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string: ");
        String userinputstring = (scanner.nextLine());
                
        System.out.println("Give an integer:");
        int userinputinteger = Integer.valueOf(scanner.nextLine());        
        
        System.out.println("Give a double:");
        double userinputdub = Double.valueOf(scanner.nextLine());        
        
        System.out.println("Give a boolean:");
        boolean userinputbool = Boolean.valueOf(scanner.nextLine());        
        
        System.out.println("You gave the string " + userinputstring);
        System.out.println("You gave the integer " + userinputinteger);
        System.out.println("You gave the double " + userinputdub);
        System.out.println("You gave the boolean " + userinputbool);

    }
}
