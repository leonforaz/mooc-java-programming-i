
public class Stock {
    private String identifier;
    private String name;
    
    public Stock(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    public String getIdentifier() {
        return identifier;
    }
    
    public String getName() {
        return name;
    }
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Stock)) {
            return false;
        }

        Stock comparedStock = (Stock) compared;

        return this.identifier.equals(comparedStock.identifier)
                && this.name.equals(comparedStock.getName());
    }
    @Override
    public String toString() {
        return identifier + ": " + name;

    }
}