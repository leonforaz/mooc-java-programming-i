
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money addition) {
        // create a new Money object that has the correct worth
        return new Money(this.euros + addition.euros(), this.cents + addition.cents());
    }

    public boolean lessThan(Money compared) {
        return compared.intoCents() > this.intoCents();
    }

    public Money minus(Money decreaser) {
        int newMoney = this.intoCents() - decreaser.intoCents();
        if (newMoney > 0) {
            return new Money(0, newMoney);
        } else {
            return new Money(0, 0);
        }
    }
    
    public int intoCents() {
        return this.euros * 100 + this.cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
