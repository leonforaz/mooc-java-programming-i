
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
    
    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        String quotes = "";
        for (String characters : elements) {
            quotes = quotes + "\n" + characters;
            //the main will print "j" the object.
            //toString will make the array into a string.
            //remember \n makes a new line. In the if statement below
            // quotes as a string, will print on new lines. But as one string
            //the printout of the solution is below
            // the not too different usual is below
        }

        if (this.elements.size() > 1) {
            return "The collection " + this.name + " has " + this.elements.size() + " elements:" + quotes;
        } else {
            return "The collection " + this.name + " has " + this.elements.size() + " element:" + quotes;

        }
    }
}

//The collection characters is empty.
//
//The collection characters has 1 element:
//magneto
//
//The collection characters has 2 elements:
//magneto
//mystique
//
//The collection characters has 3 elements:
//magneto
//mystique
//phoenix

//for (String item: arrayOfString) {
//  System.out.println(item);
//}
//String quotes = "";
//    for (String characters : elements) {
//        quotes = quotes + "\n" + characters;