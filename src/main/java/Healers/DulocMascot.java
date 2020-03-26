package Healers;

import Player.Player;

import java.util.ArrayList;

public class DulocMascot {

    private ArrayList<IHeal> satchel;

    public DulocMascot(){
        this.satchel = new ArrayList<IHeal>();
    }

    public void addHeal(IHeal remedy){
        this.satchel.add(remedy);
    }

    public int getSatchelSize(){
        return this.satchel.size();
    }

    public void healPlayer(Player player){
        IHeal remedy = this.satchel.get(0);
        remedy.heal(player);
    }
}
