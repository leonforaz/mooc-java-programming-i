
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        int first = this.squares * this.pricePerSquare;
        int second = compared.squares * compared.pricePerSquare;
        if (first > second) {
            int difference = (first - second);
            return difference;
        }
        else { 
            int difference = (second - first);
            return difference;
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int first = this.squares * this.pricePerSquare;
        int second = compared.squares * compared.pricePerSquare;
        if (first > second) {
            return true;
        }
        else { 
            return false;
        }
    }
}

//    private int price() {
//        return princePerSquare * squares;
//    }
//
//    public int priceDifference(Apartment compared) {
//        // Math.abs returns the absolute value
//        return Math.abs(this.price() - compared.price());
//    }
//
//    public boolean moreExpensiveThan(Apartment compared) {
//        return this.price() > compared.price();
//    }