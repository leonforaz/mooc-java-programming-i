
import java.util.ArrayList;

public class GradeRegister {
    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;
    //Give the class GradeRegister a new object variable: 
    //a list where you will store the exam points every time 
    //that the method addGradeBasedOnPoints is called.

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }
    
    public double averageOfPoints() {
        int sum = 0;
        int xCount = 0;
        
        if (this.points.isEmpty()) {
            return -1;
        } else {
            for (Integer grade : this.points) {
                sum = sum + grade;
                xCount++;
            }
        }
        return 1.0 * sum/xCount;
        //mooc.fi return 1.0 * sum / this.points.size();
    }

    public double averageOfGrades() {
        int sum = 0;
        int xCount = 0;

        if (this.grades.isEmpty()) {
            return -1;
        } else {
            for (Integer grade : this.grades) {
                sum = sum + grade;
                xCount++;
            }
        }
        return 1.0 * sum / xCount;
        //mooc.fi return 1.0 * sum / this.grades.size();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}
