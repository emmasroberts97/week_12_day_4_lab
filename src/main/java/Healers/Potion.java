package Healers;

import Player.Player;

public class Potion implements IHeal{

    private int healPoints;

    public Potion(int healPoints){
        this.healPoints = healPoints;
    }

    public void heal(Player player){
        player.getHealed(healPoints);
    }
}
