
import java.util.ArrayList;

public class Item {
    private String name;
    private int weight;
    
    //don't forget the (), and to put stuff inside like String name, int weight
    //this is not constructorless
    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getWeight() {
        return this.weight;
    }
    
    public String toString() {
        return this.name + "(" + this.weight + " kg)";
    }
}
