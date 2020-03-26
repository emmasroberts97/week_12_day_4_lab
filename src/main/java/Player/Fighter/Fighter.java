package Player.Fighter;

import Enemy.Enemy;
import Weapons.IWeapon;
import Player.Player;

public abstract class Fighter extends Player{

    public IWeapon weapon;

    public Fighter(String name, int healthPoints, IWeapon weapon){
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public void attack(Enemy enemy){
        enemy.takeDamage(weapon.getDamagePoints());
    }
}
