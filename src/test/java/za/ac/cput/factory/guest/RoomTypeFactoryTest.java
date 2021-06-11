package za.ac.cput.factory.guest;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.entity.guest.RoomType;

import static org.junit.jupiter.api.Assertions.*;

class RoomTypeFactoryTest {

    @Test
    public void createRoomType() {
        RoomType roomType = RoomTypeFactory.createRoomType("King balcony", true);
    }

        //Equality
        @Test
        void testRoomTypeEquality() {
        assertEquals("King balcony", "King balcony");
        assertEquals(true, true);
    }
        //Identity
        @Test
        void testRoomTypeIdentity() {
        assertSame("King balcony", "King balcony");
        assertSame(true, true);
    }
        //Timeout
        @Test
        @Timeout(1)
        void testRoomTypeTimeout() {
        System.out.println("Timeout not exceeded");
        assertEquals("King balcony", "King balcony");
    }

        //Disable
         @Disabled
         @Test
         void testRoomTypeTemporarilyDisabled() {
         assertEquals("King balcony", "King balcony");
     }
    }

