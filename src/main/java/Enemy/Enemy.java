package Enemy;

public abstract class Enemy {

    private int healthPoints;

    public Enemy(int healthPoints){
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void takeDamage(int damage){
        int newHealth = healthPoints -= damage;
        setHealthPoints(newHealth);
    }
}
