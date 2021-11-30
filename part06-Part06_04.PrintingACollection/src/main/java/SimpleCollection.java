
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;
    private int count;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
        this.count = count;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public String getName() {
        return this.name;
    }

    public void add(String element) {
        this.elements.add(element);
        this.count++;
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
        public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        } 
        else if (this.elements.size() == 1) {
            return "The collection " + this.name + " has " + this.elements.size() + " element: " + this.elements;
        }
        else {
            return "The collection " + this.name + " has " + this.elements.size() + " elements: " + this.elements;
        }
    }
}


