
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }
    // implement the required methods here

    public void addMeal(String meal) {
        //adds a meal to the menu. 
        //If the meal is already on the list, it should not be added again.
        if (this.meals.contains(meal)) {
        } else {
            this.meals.add(meal);
        }
        //option
        //git gud at !, scrub
        //if (!this.meals.contains(meal)) {
            //this.meals.add(meal);
    }

    public void printMeals() {
        //prints the meals.
        for (String meal : this.meals) {
            System.out.println(meal);
        }
    }

    public void clearMenu() {
        this.meals.clear();
        //scroll down on the lesson page for this.
        //option
        //this.meals.removeAll(meals);
    }
}
