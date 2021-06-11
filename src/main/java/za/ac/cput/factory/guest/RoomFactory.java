/*
Room.java
Sihle Jijana 216273919
 */
package za.ac.cput.factory.guest;


import za.ac.cput.entity.guest.Room;

public class RoomFactory {
    public static Room createRoom(
            String roomNo,
            String roomTypeCode,
            String sleepTypeCode,
            double roomCost,
            boolean serviced){

        Room room = new Room.Builder()
                .setRoomNo(roomNo)
                .setRoomTypeCode(roomTypeCode)
                .setSleepTypeCode(sleepTypeCode)
                .setRoomCost(roomCost)
                .setServiced(serviced)
                .build();

        return room;
    }



}
