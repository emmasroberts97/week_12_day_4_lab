package Enemy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LordFarquadTEst {

    private LordFarquad lordFarquad;

    @Before
    public void before(){
        lordFarquad = new LordFarquad(150);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(150, lordFarquad.getHealthPoints());
    }

    @Test
    public void canSetHealthPoints(){
        lordFarquad.setHealthPoints(200);
        assertEquals(200, lordFarquad.getHealthPoints());
    }

    @Test
    public void canTakeDamage(){
        lordFarquad.takeDamage(100);
        assertEquals(50, lordFarquad.getHealthPoints());
    }
}
