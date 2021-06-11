/*
RoomTypeFactory.java
Factory class for creating room type
Author: Sihle Lucia Jijana (216273919)
Date: 11 June 2021
 */
package za.ac.cput.factory.guest;

import za.ac.cput.entity.guest.RoomType;

public class RoomTypeFactory {
    public static RoomType createRoomType(String roomTypeCode, boolean smoking){

        RoomType roomType = new RoomType.Builder()
                .setRoomTypeCode(roomTypeCode)
                .setSmoking(smoking)
                .build();

        return roomType;
    }
}
