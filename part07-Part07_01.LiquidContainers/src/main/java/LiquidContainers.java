
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int min = 0;
        int max = 100;

        while (true) {
            System.out.println("First: " + first + "/" + max);
            System.out.println("Second: " + second + "/" + max);            
            
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add") && (amount >= min)) {
                if (first <= max) {
                    first = first + amount;
                    if (first > max) {
                        first = max;
                    }
                }
            } else if (command.equals("move") && (amount >= min)) {
                if ((first - amount) >= min) {
                    second = second + amount;
                    first = first - amount;
                    if (second >= max) {
                        second = max;
                    }
                } else if ((first - amount) < min) {
                    second = second + first;
                    first = min;
                    if (second >= max) {
                        second = max;
                    }
                }
            } else if (command.equals("remove") && (amount >= min)) {
                if ((second - amount) >= min) {
                    second = second - amount;
                } else if ((second - amount) < min) {
                    second = min;
                }
            }
        }
    }
}

//        System.out.println("First: " + first + "/" + max);
//        System.out.println("Second: " + second + "/" + max);

//    public static int add(int amount, int first, int max) {
//        if (amount > 0) {
//            if (amount + first > max) {
//                return max;
//            }
//        }
//        return amount + first;
//    }
//    public static int move(int amount, int first, int second, int max) {
//        if (amount > 0) {
//            if (amount + second > max) {
//                return max;
//            }
//        }
//        return amount + second;
//    }
//    public static int remove(int amount, int second, int min) {
//        if (second - amount < 0) {
//            return min;
//        }
//        return second - amount;
//    }
//}
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
