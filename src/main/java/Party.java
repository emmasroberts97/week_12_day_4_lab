import Enemy.Enemy;
import Healers.DulocMascot;
import Player.Fighter.Fighter;
import Player.Mage.Mage;
import Player.Player;
import Treasure.ITreasure;

import java.util.ArrayList;

public class Party {

    private ArrayList<Player> players;
    private DulocMascot dulocMascot;
    private int treasureValue;

    public Party(DulocMascot dulocMascot){
        this.players = new ArrayList<Player>();
        this.dulocMascot = dulocMascot;
        this.treasureValue = 0;
    }

    public void addPartyPlayer(Player player){
        this.players.add(player);
    }

    public void addTreasure(ITreasure treasure){
        this.treasureValue += treasure.getValue();
    }

    public void partyAttack(Enemy enemy){
        for (Player player: this.players){
            if (player instanceof Mage){
                ((Mage) player).useSpell(enemy);
            } else if (player instanceof Fighter){
                ((Fighter) player).attack(enemy);
            }
        }
    }

    public void partyHeal(){
        for (Player player: this.players){
            this.dulocMascot.healPlayer(player);
        }
    }



}
