package Player.Mage;

import Defenders.IDefend;
import Spells.ISpell;

public class Donkey extends Mage {

    public Donkey(String name, int healthPoints, ISpell spell,  IDefend familiar){
        super(name, healthPoints, spell, familiar);
    }
}
