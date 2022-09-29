import Model.Entities.Monster;
import Model.Factories.CreatureFactory;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MonsterTests
{
    Monster TestRabbit1 = CreatureFactory.createRabbit();
    Monster TestRabbit2 = CreatureFactory.createRabbit();

    @Test
    public void test()
    {
        assertEquals(1, TestRabbit1.getHealth());
        assertEquals(0, this.TestRabbit2.getArmour());

    }
}

