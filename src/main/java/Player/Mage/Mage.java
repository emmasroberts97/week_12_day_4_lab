package Player.Mage;

import Defenders.IDefend;
import Enemy.Enemy;
import Spells.ISpell;
import Player.Player;

public abstract class Mage extends Player{

    public ISpell spell;
    public IDefend familiar;

    public Mage(String name, int healthPoints, ISpell spell, IDefend familiar){
        super(name, healthPoints);
        this.spell = spell;
        this.familiar = familiar;
    }

    public void defend(Enemy attacker){
        familiar.defend(attacker);
    }

    public void useSpell(Enemy attacker){
        spell.cast(attacker);
    }


    public ISpell getSpell() {
        return spell;
    }

    public IDefend getFamiliar() {
        return familiar;
    }
}
