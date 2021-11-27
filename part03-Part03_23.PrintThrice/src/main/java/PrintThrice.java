//Write a program, that reads a string from the user 
//and then prints it three times.

import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a word:");
        String threeTimes = scanner.nextLine();
        
        System.out.print(threeTimes + threeTimes + threeTimes);
    }
}
