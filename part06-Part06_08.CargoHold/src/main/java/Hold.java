
import java.util.ArrayList;

//a constructor, to which the maximum weight is given
public class Hold {

    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;

    //need a maximumWeight in the constructor to make this
    //make sure the ArrayList of object(Suitcase) is written properly
    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<Suitcase>();
    }

    public int totalWeight() {
        int weight = 0;
        for (Suitcase suitcase : this.suitcases) {
            weight = weight + suitcase.totalWeight();
        }
        return weight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= this.maximumWeight) {
            this.suitcases.add(suitcase);
        }
    }
    //Make sure that the printItems() method prints the contents of 
    //each suitcase in a hold
    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }

    //like this "2 suitcases (7 kg)"
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }

}
