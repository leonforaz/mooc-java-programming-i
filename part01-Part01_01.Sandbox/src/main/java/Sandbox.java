// Write a program that prompts the user to input a number. 
// The number is expected to be an integer (no error handling necessary). 
// If the number is a multiple of 3, print "fizz", if the number is a multiple of 5, print "buzz", 
// if the number is both a multiple of 3 and 5, print "fizzbuzz".

import java.util.Scanner;

public class Sandbox {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int inputFromUser;

    System.out.println("Input a number: ");

    while (true) {
        inputFromUser = Integer.valueOf(scanner.nextLine());   

    if (inputFromUser == 0) {
        break;
    }   
        
    else if (inputFromUser %3 == 0 && inputFromUser %5 == 0)
        System.out.println("fizzbuzz");
    
    else if (inputFromUser %3 == 0) {
        System.out.println("fizz");
        }

    else if (inputFromUser %5 == 0) {
        System.out.println("buzz");
        }
            
            System.out.println("Input a number: ");
            
            
        }
    }
}   