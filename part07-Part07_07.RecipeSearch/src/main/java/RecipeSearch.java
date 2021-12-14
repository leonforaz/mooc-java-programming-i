
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("File to read: ");
        String file = scan.nextLine();
        ArrayList<Recipe> recipes = readRecipesFromFile(file);
        System.out.println("");
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("");

        while (true) {
            System.out.print("Enter command: ");
            String command = scan.nextLine();
            System.out.println("");
            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
            } else if (command.equals("find name")) {
                System.out.println("Searched word: ");
                String name = scan.nextLine();
                System.out.println("Recipes: ");
                for (Recipe recipe : recipes) {
                    if (recipe.getName().contains(name)) {
                        System.out.println(recipe);
                    }
                }
            } else if (command.equals("find cooking time")){
                System.out.println("Max cooking time: ");
                int time = Integer.valueOf(scan.nextLine());
                System.out.println("Recipes: ");
                for(Recipe recipe : recipes) {
                    if(recipe.getCookingTime() <= time){
                        System.out.println(recipe);
                    }
                }
            } else if (command.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String ingredient = scan.nextLine();
                for(Recipe recipe : recipes) {
                    if(recipe.getIngredient().contains(ingredient)){
                        System.out.println(recipe);
                    }
                }
            }
        }//end of while loop

    }

    public static ArrayList<Recipe> readRecipesFromFile(String file) {
        ArrayList<Recipe> recipes = new ArrayList<>();

        try ( Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String recipeName = fileScanner.nextLine();
                int cookingTime = Integer.valueOf(fileScanner.nextLine());
                Recipe recipe = new Recipe(recipeName, cookingTime);

                recipes.add(recipe);

                while (fileScanner.hasNextLine()) {
                    String ingredient = fileScanner.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    recipe.addIngredient(ingredient);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return recipes;
    }

}
//csv is comma seperated value

//irst create the functionality to read and list recipes. 
//The user interface of the program is described below. 
//You may assume that the user only enters files that exist. 
//Below we assume that the example recipes given earlier in 
//the exercise description are stored in the file recipes.txt.
