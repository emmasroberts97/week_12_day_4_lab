import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RoomTest {

    Room room;

    @Before
    public void before(){
        room = new Room();
    }

    @Test
    public void startsWithExits(){
        assertNotEquals(0, room.numberOfExits());
    }

    @Test
    public void canGenerateExits(){
        System.out.println("Number of Exits: " + room.numberOfExits());
    }

    @Test
    public void canAssignRoom(){
        room.assignRoom();
        System.out.println("Enemy: " + room.getEnemy());
        System.out.println("Treasure: " + room.getTreasure());
    }
}
