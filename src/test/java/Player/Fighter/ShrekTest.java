package Player.Fighter;

import Enemy.FairyGodMother;
import Weapons.Club;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShrekTest {

    private Shrek shrek;
    private Sword sword;
    private FairyGodMother fairyGodMother;
    private Club club;

    @Before
    public void before(){
        sword = new Sword(30);
        shrek = new Shrek("Shrek", 200, sword);
        fairyGodMother = new FairyGodMother(150);
        club = new Club(40);
    }

    @Test
    public void hasName(){
        assertEquals("Shrek", shrek.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(200, shrek.getHealthPoints());
    }

    @Test
    public void hasWeapon(){
        assertEquals(sword, shrek.getWeapon());
    }

    @Test
    public void canSetWeapon(){
        shrek.setWeapon(club);

        assertEquals(club, shrek.getWeapon());
    }

    @Test
    public void canAttack(){
        shrek.attack(fairyGodMother);

        assertEquals(120, fairyGodMother.getHealthPoints());
    }
}
