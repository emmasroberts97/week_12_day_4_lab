package Enemy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FairyGodMotherTest {

    private FairyGodMother fairyGodMother;

    @Before
    public void before(){
        fairyGodMother = new FairyGodMother(200);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(200, fairyGodMother.getHealthPoints());
    }

    @Test
    public void canSetHealthPoints(){
        fairyGodMother.setHealthPoints(100);
        assertEquals(100, fairyGodMother.getHealthPoints());
    }

    @Test
    public void canTakeDamange(){
        fairyGodMother.takeDamage(50);
        assertEquals(150, fairyGodMother.getHealthPoints());
    }
}
