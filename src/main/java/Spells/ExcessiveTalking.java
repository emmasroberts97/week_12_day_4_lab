package Spells;

import Enemy.Enemy;

public class ExcessiveTalking implements ISpell{

    private int damagePoints;

    public ExcessiveTalking(int damagePoints){
        this.damagePoints = damagePoints;
    }

    public void cast(Enemy attacker){
        attacker.takeDamage(damagePoints);
    }
}
