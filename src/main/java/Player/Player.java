package Player;

public abstract class Player {

    private String name;
    private int healthPoints;

    public Player(String name, int healthPoints){
        this.name = name;
        this.healthPoints = healthPoints;
    }
}
