package Defenders;

import Enemy.Enemy;

public class Dragon implements IDefend{

    private String name;

    public Dragon(String name){
        this.name = name;
    }

    public void defend(Enemy attacker){
        attacker.takeDamage(50);
    }
}
