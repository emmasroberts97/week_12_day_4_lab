package Player.Mage;

import Defenders.Dragon;
import Enemy.LordFarquad;
import Spells.ExcessiveTalking;
import Spells.Explosion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FionaTest {

    private Fiona fiona;
    private Explosion spell;
    private Dragon dragon;
    private LordFarquad lordFarquad;

    @Before
    public void before(){
        spell = new Explosion(60);
        dragon = new Dragon("Tina");
        fiona = new Fiona("Fiona", 120, spell, dragon);
        lordFarquad = new LordFarquad(200);
    }

    @Test
    public void hasName(){
        assertEquals("Fiona", fiona.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(120, fiona.getHealthPoints());
    }

    @Test
    public void hasSpell(){
        assertEquals(spell, fiona.getSpell());
    }

    @Test
    public void hasFamiliar(){
        assertEquals(dragon, fiona.getFamiliar());
    }

    @Test
    public void canDefend(){
        fiona.defend(lordFarquad);

        assertEquals(150, lordFarquad.getHealthPoints());
    }

    @Test
    public void canCastSpell(){
        fiona.useSpell(lordFarquad);

        assertEquals(140, lordFarquad.getHealthPoints());
    }
}
