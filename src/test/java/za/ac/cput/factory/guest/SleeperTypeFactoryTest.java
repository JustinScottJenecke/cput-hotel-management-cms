package za.ac.cput.factory.guest;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.guest.SleeperType;

import static org.junit.jupiter.api.Assertions.*;

class SleeperTypeFactoryTest {
    @Test
    public void createSleepType(){

        SleeperType sleeperType = SleeperTypeFactory.createSleepType(
                "1fbsc",
                "1xDoubleBed-1xSleeperCouch");

        assertEquals("1fbsc", sleeperType.getSleepTypeCode());
        assertEquals("1xDoubleBed-1xSleeperCouch", sleeperType.getSleepDetails());

    }
}
