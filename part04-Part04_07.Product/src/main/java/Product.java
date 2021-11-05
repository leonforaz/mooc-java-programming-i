//Create a class Product that represents a store product. 
//The product should have a price (double), a quantity (int) and a name (String).

public class Product {
    private String name;
    private double price;
    private int quantity;
    
    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;  
          
}
        public void printProduct() {
            System.out.println(name + price + quantity);
        } 
    
}
