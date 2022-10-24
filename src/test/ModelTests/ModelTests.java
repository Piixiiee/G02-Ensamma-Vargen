package ModelTests;

import Model.Entities.Player;
import Model.Events.Event;
import Model.Model;
import org.junit.Test;

import static Model.Model.getInstance;
import static Model.Model.setGameModel;
import static org.junit.jupiter.api.Assertions.*;

public class ModelTests {
    Player testPlayer1 = new Player(2,2,2, "Stocken");
    Player testPlayer2 = new Player(3,3,3, "Pixie");
    Event testEvent1 = Event.getEvent("/xml/TestEvent1.xml");
    Model testModel = new Model(testPlayer1, testEvent1);
    Model testModel2 = new Model(testPlayer2, testEvent1);


    @Test
    public void testGetInstance(){
        setGameModel(testModel);
        assertEquals(testModel, getInstance());
    }
    @Test
    public void testSetModel(){
        assertEquals(getInstance().getPlayerName(), "Stocken");
        setGameModel(testModel2);
        assertEquals(getInstance().getPlayerName(), "Pixie");
    }
    @Test
    public void testGetPlayerStrength(){
        assertEquals(2, testModel.getPlayerStrength());
    }

    @Test
    public void testGetPlayerArmour(){
        assertEquals(2, testModel.getPlayerArmour());
    }

    @Test
    public void testGetPlayerHealth(){
        assertEquals(2, testModel.getPlayerHealth());
    }

    @Test
    public void testGetPlayerName(){
        assertEquals("Stocken", testModel.getPlayerName());
    }

    @Test
    public void testResetPlayer(){
        testPlayer1.removeHealth(1);
        testModel.resetPlayer();
        assertEquals(2, testModel.getPlayerHealth());
    }

    @Test
    public void testShutDown(){
        testModel.shutDown();
    }

    /* @Test
    public void testSubscribe(){
        testModel.subscribe(testEvent1);
    }

    @Test
    public void testNotifyObservers(){
        testModel.notifyObservers(testEvent1);
    } */

    @Test
    public void testGetCurrentEvent(){
        assertEquals(testEvent1, testModel.getCurrentEvent());
    }

    @Test
    public void testGetActionName(){
        assertEquals(" Look around even more where you are right now", testModel.getActionName(0));
    }

    @Test
    public void testSelectAction(){
        testModel.selectAction(0);
        assertEquals(" Walk closer to the bush and investigate", testModel.getCurrentEvent().getActionText(0));
    }



}
