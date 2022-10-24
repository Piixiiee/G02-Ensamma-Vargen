package CharacterTests;

import Model.Entities.Creature;
import Model.Factories.CreatureFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class MonsterTests
{


    @Test
    public void testCreateRabbit()
    {
        Creature TestRabbit1 = CreatureFactory.createRabbit();
        assertEquals(1, TestRabbit1.getStrength(), 0.01);

    }
    @Test
    public void testCreateOrc(){
        Creature TestOrc1 = CreatureFactory.createOrc();
        assertEquals(4, TestOrc1.getStrength(), 0.01);
    }
}

