package za.ac.cput.factoryTest.guest;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.guest.Room;
import za.ac.cput.factory.guest.RoomFactory;

import static org.junit.jupiter.api.Assertions.*;

class RoomFactoryTest {
    @Test
    public void createRoom(){

        Room room = RoomFactory.createRoom(
                "roomNo",
                "roomTypeCode",
                "sleepTypeCode",
                100.75,
                true);

        assertEquals("roomNo", room.getRoomNo());
        assertEquals("roomTypeCode", room.getRoomTypeCode());
        assertEquals("sleepTypeCode", room.getSleepTypeCode());
        assertEquals(100.75, room.getRoomCost());
        assertEquals(true, room.isServiced());

    }



}