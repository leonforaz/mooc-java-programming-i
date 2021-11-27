
public class Team {

    private String name;
    private int wins;
    private int losses;

    public Team(String name) {
        this.name = name;
        this.wins = 0;
        this.losses = 0;
    }
    
    public void win() {
        wins++;
    }
    
    public void lose() {
        losses++;
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }
    
    public int getLosses() {
        return losses;
    }

    @Override
    public String toString() {
        String value = "Games: " + (wins + losses) + "\nWins: " + wins + "\nLosses: " + losses;
        return value;
    }

}
