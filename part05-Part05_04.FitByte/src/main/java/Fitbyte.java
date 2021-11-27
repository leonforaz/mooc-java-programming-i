
public class Fitbyte {

    private int age;
    private int resting;

    public Fitbyte(int age, int resting) {
        this.age = age;
        this.resting = resting;
    }

    public int getAge() {
        return this.age;
    }
    
    public int getResting() {
        return this.resting;
    }

     public double targetHeartRate(double percentageOfMaximum) {
        double max = 206.3 - (0.711 * this.age);
        return (max - this.resting) * percentageOfMaximum + this.resting;
    }
}
