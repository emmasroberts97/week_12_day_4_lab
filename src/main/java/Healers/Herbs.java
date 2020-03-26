package Healers;

import Player.Player;

public class Herbs implements IHeal{

    private int healPoints;

    public Herbs(int healPoints){
        this.healPoints = healPoints;
    }

    public void heal(Player player){
        player.getHealed(healPoints);
    }

}
