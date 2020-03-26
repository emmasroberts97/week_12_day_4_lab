package Defenders;

import Enemy.FairyGodMother;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    private Dragon dragon;
    private FairyGodMother fairyGodMother;

    @Before
    public void before(){
        dragon = new Dragon("Tina");
        fairyGodMother = new FairyGodMother(200);
    }

    @Test
    public void canDefend(){
        dragon.defend(fairyGodMother);
        assertEquals(150, fairyGodMother.getHealthPoints());
    }
}
