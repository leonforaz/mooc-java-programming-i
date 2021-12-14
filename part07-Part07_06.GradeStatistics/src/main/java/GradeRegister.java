//check 6.11 Averages

import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;
    private ArrayList<Integer> passingPoints;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
        this.passingPoints = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
//        this.grades.add(pointsToGrade(points));
        this.points.add(points);

        if (points >= 50) {
            this.passingPoints.add(points);

        }
        this.grades.add(gradeDistribution(points));
    }

    public double averageOfPoints() {
        int sum = 0;

        if (this.points.isEmpty()) {
            return -1;
        } else {
            for (Integer points : this.points) {
                sum = sum + points;
            }
        }
        return 1.0 * sum / this.points.size();
    }

    public double averageOfPassingPoints() {
        int sum = 0;

        if (this.passingPoints.isEmpty()) {
            return 0.00;
        } else {
            for (Integer points : this.passingPoints) {
                sum = sum + points;
            }
        }
        return 1.0 * sum / this.passingPoints.size();
    }

    public double percentageOfPassingPoints() {
        
        if (this.points.size() == 0) {
            return -1;
        } else {
            return (100.00 * passingPoints.size()) / points.size();
        }
    }

// from Averages 6.11
//    public static int pointsToGrade(int points) {
    public static int gradeDistribution(int points) {

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
    
public void printStars() {
  int[] gradesArray = new int[]{ 0,0,0,0,0,0 }; // Create an array with 6 elements, each initialized to 0

  // Update grades for each of your grades
  for (int grade : this.grades) {
    gradesArray[grade]++; // Hacky way to quickly update the corresponding grade
  }

  // Now you can print the stars for each grade

  // Iterate all grades
  for (int i = 5; i >= 0; i--) {
     System.out.print(i + ": ");
     for (int star = 0; star < gradesArray[i]; star++) {
      System.out.print("*"); // this prints a star for each   grade in this category
     }
     System.out.println(""); // newline
  }
  return;
}

}
