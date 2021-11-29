
import java.util.ArrayList;

public class Stack {
    private ArrayList<String> array;

    public Stack() {
        this.array = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        //returns a boolean-type value (true or false) that tells whether or not the stack is empty.
        if (array.isEmpty()) {
            return true;
        } else {
            return false;
        }
    
    //option
    //return this.values.isEmpty();
    }

    public void add(String value) {
        //Adds the value given as a parameter to the top of the stack.
        array.add(value);
    }

    public ArrayList<String> values() {
        //returns the values ​​contained in the stack as a list.
        return array;
        //option
        // return this.array
    }
    
    public String take() {
        return array.remove(array.size()- 1);
    }
    //option
    // return this.array.remove(this.array.size() - 1);
}
