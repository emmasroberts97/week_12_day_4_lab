package Weapons;

import Enemy.Enemy;

public class Axe implements IWeapon{

    private int damagePoints;

    public Axe(int damagePoints){
        this.damagePoints = damagePoints;
    }

    public void attack(Enemy attacker){
        attacker.takeDamage(damagePoints);
    }
}
