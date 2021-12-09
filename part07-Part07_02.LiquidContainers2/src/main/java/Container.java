
public class Container {

    private int amount;
    private int max;
    private int min;

    public Container() {
        this.amount = 0;
        this.max = 100;
        this.min = 0;
    }

    public int contains() {
        return this.amount;
    }

    public void add(int amount) {
        if ((amount >= 0) && (this.amount + amount <= this.max)) {
            this.amount = this.amount + amount;
        } else {
            this.amount = this.max;
        }
    }
    
    public void remove(int amount) {
        if ((amount >= this.min) && ((this.amount - amount) >= this.min)) {
            this.amount = this.amount - amount;
        } else if ((this.amount - amount) < this.min) {
            this.amount = this.min;
        }
    }

    public String toString() {
        return this.amount + "/" + this.max;
    }
}
