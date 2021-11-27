import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        while(true){
            int in = scanner.nextInt();
            
            if (in == 9999) {
                break;
            }
            
            list.add(in);
        }//end of while loop
        
        int small = list.get(0);
        int num = 0;
        int index = 0;
        
        for (int i = 0; i < list.size(); i++) {
            num = list.get(i);
            if(small > num) {
                small = num;
                index = i;
            }
        }
        
        System.out.println("Smallest number: " + small);
        System.out.println("Found at index: " + index);
    }
}