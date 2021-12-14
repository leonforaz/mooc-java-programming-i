//check 6.11 Averages

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeRegister register = new GradeRegister();

        System.out.print("Enter point totals, -1 stops: ");
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }

            if (input < 0 || input > 100) {
                continue;
            }

            register.addGradeBasedOnPoints(input);
        }
        System.out.println("");
        System.out.println("Point average (all): " + register.averageOfPoints());
        System.out.println("Point average (passing): " + register.averageOfPassingPoints());
        System.out.println("Pass percentage: " + register.percentageOfPassingPoints());
        register.printStars();
    }
    
}



