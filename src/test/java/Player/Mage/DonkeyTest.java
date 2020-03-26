package Player.Mage;

import Defenders.Dragon;
import Enemy.LordFarquad;
import Spells.ExcessiveTalking;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DonkeyTest {

    private Donkey donkey;
    private ExcessiveTalking spell;
    private Dragon dragon;
    private LordFarquad lordFarquad;

    @Before
    public void before(){
        spell = new ExcessiveTalking(60);
        dragon = new Dragon("Tina");
        donkey = new Donkey("Donkey", 120, spell, dragon);
        lordFarquad = new LordFarquad(200);
    }

    @Test
    public void hasName(){
        assertEquals("Donkey", donkey.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(120, donkey.getHealthPoints());
    }

    @Test
    public void hasSpell(){
        assertEquals(spell, donkey.getSpell());
    }

    @Test
    public void hasFamiliar(){
        assertEquals(dragon, donkey.getFamiliar());
    }

    @Test
    public void canDefend(){
        donkey.defend(lordFarquad);

        assertEquals(150, lordFarquad.getHealthPoints());
    }

    @Test
    public void canCastSpell(){
        donkey.useSpell(lordFarquad);

        assertEquals(140, lordFarquad.getHealthPoints());
    }
}
