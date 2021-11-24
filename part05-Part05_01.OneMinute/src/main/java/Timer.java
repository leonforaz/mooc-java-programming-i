
public class Timer {
    private ClockHand seconds;
    private ClockHand milliseconds;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.milliseconds = new ClockHand(100);
    }

    //moves the timer forward by a hundredth of a second.
     public void advance() {
         this.milliseconds.advance();

        if (this.milliseconds.value() == 0) {
            this.seconds.advance();

        }
    }

    public String toString() {
        return seconds + ":" + milliseconds;

    }

}