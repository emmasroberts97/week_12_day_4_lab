package Healers;

import Player.Fighter.Shrek;
import Weapons.Club;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DulocMascotTest {

    private DulocMascot dulocMascot;
    private Potion potion;
    private Shrek shrek;
    private Club club;

    @Before
    public void before(){
        dulocMascot = new DulocMascot();
        potion = new Potion(20);
        club = new Club(50);
        shrek = new Shrek("Shrek", 500, club);
    }

    @Test
    public void hasNoRemedies(){
        assertEquals(0, dulocMascot.getSatchelSize());
    }

    @Test
    public void canAddRemedy(){
        dulocMascot.addHeal(potion);
        assertEquals(1, dulocMascot.getSatchelSize());
    }

    @Test
    public void canHealPlayer(){
        dulocMascot.addHeal(potion);
        dulocMascot.healPlayer(shrek);
        assertEquals(520, shrek.getHealthPoints());
    }
}
