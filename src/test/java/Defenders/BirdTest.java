package Defenders;

import Enemy.LordFarquad;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BirdTest {

    private Bird bird;
    private LordFarquad lordFarquad;

    @Before
    public void before(){
        bird = new Bird("robin");
        lordFarquad = new LordFarquad(150);
    }

    @Test
    public void canDefend(){
        bird.defend(lordFarquad);
        assertEquals(130, lordFarquad.getHealthPoints());
    }
}
