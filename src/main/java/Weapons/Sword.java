package Weapons;

import Enemy.Enemy;

public class Sword implements IWeapon{

    private int damagePoints;

    public Sword(int damagePoints){
        this.damagePoints = damagePoints;
    }

    public void attack(Enemy attacker){
        attacker.takeDamage(damagePoints);
    }
}
