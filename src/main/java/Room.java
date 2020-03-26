import Enemy.Enemy;
import Treasure.ITreasure;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import Enemy.LordFarquad;
import Enemy.FairyGodMother;
import Treasure.Slug;
import Treasure.Onion;
import Treasure.Boulder;

public class Room {

    private ArrayList<Exit> exits;
    private ArrayList<ITreasure> treasure;
    private Enemy enemy;

    public Room (){
        this.exits = new ArrayList<Exit>();
        this.generateExits();
        this.treasure = new ArrayList<ITreasure>();
        this.assignRoom();

    }

    public int numberOfExits(){
        return this.exits.size();
    }

    public void generateExits(){
            Random r = new Random();
            int position = r.nextInt((4 - 1) + 1) + 1;
            int i = 0;
            while (i < position){
                exits.add(Exit.getRandomExit());
                i++;
             }
        }

    public void assignRoom(){
        double random = Math.random();
        double enemy = Math.random();
        if (random < 0.6 && enemy < 0.5){
            this.enemy = new LordFarquad(100);
        } else if (random <= 0.6 && enemy >= 0.5){
            this.enemy = new FairyGodMother(120);
        } else if (random > 0.6 && random < 0.7) {
            this.treasure.add(new Slug());
        } else if (random > 0.7 && random < 0.8){
            this.treasure.add(new Onion());
        } else {
            this.treasure.add(new Boulder());
            this.treasure.add(new Slug());
        }
    }

    public ArrayList<ITreasure> getTreasure() {
        return treasure;
    }

    public Enemy getEnemy() {
        return enemy;
    }
}

