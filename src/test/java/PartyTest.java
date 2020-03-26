import Defenders.Dragon;
import Healers.DulocMascot;
import Player.Fighter.Shrek;
import Player.Mage.Donkey;
import Spells.ExcessiveTalking;
import Weapons.Club;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PartyTest {

    private Party party;
    private Quest quest;
    private DulocMascot dulocMascot;
    private Shrek shrek;
    private Donkey donkey;
    private Dragon dragon;
    private Club club;
    private ExcessiveTalking spell;

    @Before
    public void before(){
        dulocMascot = new DulocMascot();
        party = new Party(dulocMascot);
        quest = new Quest();
        club = new Club(60);
        dragon = new Dragon("Tina");
        spell = new ExcessiveTalking(20);
        shrek = new Shrek("Shrek", 200, club);
        donkey = new Donkey("Donkey", 200, spell, dragon);

        party.addPartyPlayer(shrek);
        party.addPartyPlayer(donkey);
    }

    @Test
    public void hasPartyPlayers(){
        assertEquals(2, party.getPlayers().size());
    }

    @Test
    public void canWorkThroughRooms(){
        System.out.println(quest.numberOfRooms());
        System.out.println(party.workThroughQuest(quest));
        System.out.println(party.getTreasureValue());
    }
}
