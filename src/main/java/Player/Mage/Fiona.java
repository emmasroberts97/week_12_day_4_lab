package Player.Mage;

import Defenders.IDefend;
import Spells.ISpell;

public class Fiona extends Mage {

    public Fiona(String name, int healthPoints, ISpell spell, IDefend familiar){
        super(name, healthPoints, spell, familiar);
    }
}
