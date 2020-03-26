package Player.Fighter;

import Enemy.FairyGodMother;
import Weapons.Club;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PussNBootsTest {

    private PussNBoots pussNBoots;
    private Sword sword;
    private FairyGodMother fairyGodMother;
    private Club club;

    @Before
    public void before(){
        sword = new Sword(30);
        pussNBoots = new PussNBoots("Puss N Boots", 200, sword);
        fairyGodMother = new FairyGodMother(150);
        club = new Club(40);
    }

    @Test
    public void hasName(){
        assertEquals("Puss N Boots", pussNBoots.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(200, pussNBoots.getHealthPoints());
    }

    @Test
    public void hasWeapon(){
        assertEquals(sword, pussNBoots.getWeapon());
    }

    @Test
    public void canSetWeapon(){
        pussNBoots.setWeapon(club);

        assertEquals(club, pussNBoots.getWeapon());
    }

    @Test
    public void canAttack(){
        pussNBoots.attack(fairyGodMother);

        assertEquals(120, fairyGodMother.getHealthPoints());
    }
}
