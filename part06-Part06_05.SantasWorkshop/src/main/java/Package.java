
//A parameterless constructor
//Method public void addGift(Gift gift), 
//which adds the gift passed as a parameter to the package. 
//The method returns no value.
//Method public int totalWeight(), 
//which returns the total weight of the package's gifts.
//It's recommended to store the items in an ArrayList object.

import java.util.ArrayList;

public class Package {
    //remember the ArrayList is of the Gift object
    private ArrayList<Gift> list;
    
    public Package() {
        this.list = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        this.list.add(gift);
    }
    
    public int totalWeight() {
        int total = 0;
        //remember to use 'this.list' and not 'list'
        for (Gift gift : this.list) {
            //Don't need to .split, .split is for strings into arrays
            //Call/invoke method/function getWeight() from Gift class
            total = total + gift.getWeight();
        }
        return total;
    }
}

//When running the code: 
//Gift l1 = new Gift("book",2);
//Gift l2 = new Gift("teddy",1);
//Gift l3 = new Gift("turnip",4);
//Package p = new Package();
//p.addGift(l1);
//p.addGift(l2);
//p.addGift(l3);
//System.out.println(p.totalWeight());
//The output should be 7.

