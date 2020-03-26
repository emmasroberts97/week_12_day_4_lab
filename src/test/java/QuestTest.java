import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class QuestTest {

    Quest quest;

    @Before
    public void before(){
        quest = new Quest();
    }

    @Test
    public void startsWithRooms(){
        System.out.println("Number of Rooms: " + quest.numberOfRooms());
        assertNotEquals(0, quest.numberOfRooms());
    }

    @Test
    public void canCheckIfQuestComplete(){
        quest.getRooms().clear();
        assertEquals(true, quest.isQuestComplete());
    }

}
