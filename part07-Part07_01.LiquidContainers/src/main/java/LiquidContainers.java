
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 100;

        System.out.println("First: " + a + "/" + d);
        System.out.println("Second: " + b + "/" + d);


        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

        }
    }
    
//    public int add(Integer a) {
//        
//    }
//    
//    public String print() {
//        System.out.println("First: " + a + "/" + b);
//        System.out.println("Second: " + c + "/" + d);
//    }
//
//}
