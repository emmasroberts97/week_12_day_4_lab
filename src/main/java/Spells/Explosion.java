package Spells;

import Enemy.Enemy;

public class Explosion implements ISpell {

    private int damagePoints;

    public Explosion(int damagePoints){
        this.damagePoints = damagePoints;
    }

    public void cast(Enemy attacker){
        attacker.takeDamage(damagePoints);
    }
}
