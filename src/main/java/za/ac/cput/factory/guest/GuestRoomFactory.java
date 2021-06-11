package za.ac.cput.factory.guest;

import za.ac.cput.entity.guest.GuestRoom;
/**
 * Student Number: 217050743
 * Author: Shameel Kiyang
 */

public class GuestRoomFactory {
    public static GuestRoom createGuestRoom(String roomNo,String idNo,String bill){
        GuestRoom guestRoom = new GuestRoom.Builder().setRoomNo(roomNo).setIdNo(idNo).setBill(bill).build();

        return guestRoom;
    }
}
