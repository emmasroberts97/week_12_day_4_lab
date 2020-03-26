package Weapons;

import Enemy.Enemy;

public class Club implements IWeapon{

    private int damagePoints;

    public Club(int damagePoints){
        this.damagePoints = damagePoints;
    }

    public void attack(Enemy attacker){
        attacker.takeDamage(damagePoints);
    }
}

