
//Declare a public constructor for classSuitcase : public Suitcase(int maximumWeight)
//The constructor Suitcase(int) is missing
//Check that the addItem method in the suitcase class adds items to the suitcase. 
//Make sure that the class has an ArrayList for storing the items.
//the addItem method of the Suitcase class does not add a new item to the suitcase if the suitcase is full.
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> suitcases;
    private int maximumWeight;

    //(), gitgud
    public Suitcase(int maximumWeight) {
        this.suitcases = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= this.maximumWeight) {
            this.suitcases.add(item);
        }
    }

    public int totalWeight() {
        int weight = 0;
        for (Item item : this.suitcases) {
            weight = weight + item.getWeight();
        }
        return weight;
    }

    public void printItems() {
        for (Item item : this.suitcases) {
            System.out.println(item);
        }
    }
    
    //return an OBJECT so put it in the method
    public Item heaviestItem() {
        if (this.suitcases.isEmpty()) {
            return null;
        }
        
        //make a new Item from the arrayList, "starts" at 0 because
        Item heaviestItem = this.suitcases.get(0);
        for (Item item : this.suitcases) {
            //go through the arrayList
            if (heaviestItem.getWeight() < item.getWeight()) {
                //just like earlier for loops but with an object
                heaviestItem = item;
            }
        }
        //return an Item, because that's what the method is
        return heaviestItem;
    }
    
    public String toString() {
        if (this.suitcases.isEmpty()) {
            return "no items " + this.totalWeight() + " kg)";
        }

        String suitcaseItems = "";
        if (this.suitcases.size() == 1) {
            suitcaseItems = this.suitcases.size() + " item (" + this.totalWeight() + " kg)";
        } else {
            suitcaseItems = this.suitcases.size() + " items (" + this.totalWeight() + " kg)";
        }
        return suitcaseItems;
    }

}
