package CharacterTests;

import Model.Entities.Player;
import Model.Factories.PlayerFactory;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
        Player testPlayer1 = new Player(2,2,2, "Stocken");
        Player testPlayer2 = PlayerFactory.createPlayer(3, 4, 5, "Pixie");



    @Test
        public void test(){
            assertEquals(2, testPlayer1.getStrength());
            assertEquals(4, testPlayer2.getmaxHealth());
        }
    @Test
    public void testCreateWarrior(){
        Player testPlayer3 = PlayerFactory.createWarriorPlayer("Warrior");
        assertEquals(6, testPlayer3.getStrength());
    }
    @Test
    public void testCreateHunter(){
        Player testPlayer4 = PlayerFactory.createHunterPlayer("Hunter");
        assertEquals(3, testPlayer4.getStrength());
    }



}
