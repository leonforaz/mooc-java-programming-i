//Write a program that reads user input until an empty line is entered. 
//For each non-empty line the program splits the string by spaces and
//prints the last part of the string.

import java.util.Scanner;

public class LastWords {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals ("")) {
            break;
            }
        
        String[] pieces = input.split(" ");
        //for (String piece : pieces) {
            
        System.out.println(pieces[pieces.length -1]);
            
        }
    }
}
//System.out.println(pieces[0]);
//System.out.println(results[results.length - 1]);