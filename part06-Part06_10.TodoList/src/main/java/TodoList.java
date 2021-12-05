
import java.util.ArrayList;


public class TodoList {
    private ArrayList<String> items;
    
    public TodoList() {
        this.items = new ArrayList<String>();
    }
    
    public void add(String task) {
        items.add(task);
    }
    
    public void print() {
        int itemNumber = 1;
        for (String item : items) {
            System.out.println(itemNumber + ": " + item);
            itemNumber++;
        }
    }
    
    public void remove(int number) {
        items.remove(number - 1);
    }
    
    public ArrayList<String> getItems() {
        return items;
    }
    
}
