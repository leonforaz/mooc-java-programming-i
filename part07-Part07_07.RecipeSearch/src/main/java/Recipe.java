
import java.io.File;
import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int cookingTime) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>();
    }
    
    public void addIngredient(String ingredient){
        this.ingredients.add(ingredient);
    }
    
    //should not be 'public void getIngredient()'
    public ArrayList<String> getIngredient() {
        return ingredients;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getCookingTime() {
        return this.cookingTime;
    }
    
    public String toString() {
        return getName() + ", cooking time: " + getCookingTime();
    }
}
