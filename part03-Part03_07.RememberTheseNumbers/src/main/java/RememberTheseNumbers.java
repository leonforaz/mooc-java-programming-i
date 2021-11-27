//The exercise template contains a base that reads numbers from the user 
//and adds them to a list. Reading is stopped once the user enters the number -1.

//Expand the functionality of the program so that after reading the numbers, 
//it prints all the numbers received from the user. 
//The number used to indicate stopping should not be printed.


import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int luku = Integer.valueOf(scanner.nextLine());

            if (luku == -1) {
                break;//end of if loop
            }

            numbers.add(luku);//end of while loop
        }

        for (Integer i : numbers){
        System.out.println(i);
        }
    }
}