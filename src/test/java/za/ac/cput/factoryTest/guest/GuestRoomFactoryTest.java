package za.ac.cput.factoryTest.guest;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.guest.GuestRoom;
import za.ac.cput.factory.guest.GuestRoomFactory;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Student Number: 217050743
 * Author: Shameel Kiyang
 */

class GuestRoomFactoryTest {
    @Test
    public void createGuestRoom(){
        GuestRoom guestRoom= GuestRoomFactory.createGuestRoom("15","0045","350");
        assertNotNull(guestRoom);
        System.out.println(guestRoom);

    }

}