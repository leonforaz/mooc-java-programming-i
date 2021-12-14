
import java.util.Scanner;

public class UserInterface {

    private GradeRegister register;
    private Scanner scanner;

    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        readPoints();
        System.out.println("");
        System.out.println("Point average(all): " + register.averageOfPoints());
        System.out.println("Point average(passing): " + register.averageOfPassingPoints());
        System.out.println("Pass percentage: " + register.percentageOfPassingPoints());
        //System.out.println(register.gradeDistribution());
    }

    public void readPoints() {
        System.out.print("Enter point totals, -1 stops: ");
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }

            if (input < 0 || input > 100) {
                continue;
            }

            this.register.addGradeBasedOnPoints(input);
        }
    }
}
