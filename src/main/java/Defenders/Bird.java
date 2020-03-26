package Defenders;

import Enemy.Enemy;

public class Bird implements IDefend{

    private String species;

    public Bird(String species){
        this.species = species;
    }

    public void defend(Enemy attacker){
        attacker.getDamage(20);
    }

}
