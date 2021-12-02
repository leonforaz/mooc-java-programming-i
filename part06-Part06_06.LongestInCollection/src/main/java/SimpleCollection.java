
//Implement the method public String longest() for the class, 
//which returns the longest string of the collection. 
//If the collection is empty, the method should return a null reference.
//Longest: null
//Longest: mystique
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        //return a null reference if there's nothing in the collection
        if (this.elements.isEmpty()) {
            return null;
        }
        //create an object reference for the object to be returned
        //its first value is the first object on the list
        String returnObject = this.elements.get(0);

        // go through the list
        for (String goThrough : this.elements) {
            // compare each object on the list
            // to the returnObject -- we compare length
            // since we're searching for the longest,
            if (returnObject.length() < goThrough.length()) {
                // if we find a longer object in the collection,
                // we assign it as the value of the returnObject
                returnObject = goThrough;
            }
        }
        // finally, the object reference describing the
        // return object is returned
        return returnObject;
    }
}
