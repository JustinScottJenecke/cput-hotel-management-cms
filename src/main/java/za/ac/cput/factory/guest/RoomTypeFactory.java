package za.ac.cput.factory.guest;
/* RoomTypeFactory.java
   Factory for the RoomTypeFactory
   Author: Themba Khanyile (217238173)
   Date:6 June2021
*/
import za.ac.cput.entity.guest.RoomType;
public class RoomTypeFactory
{
    public static RoomType createRoomType(double roomTypeCode,String roomTypeDescription){
        RoomType roomType = new RoomType.Builder()
                .setroomTypeCode(roomTypeCode)
                .setroomTypeDescription(roomTypeDescription)
                .build();
        return  roomType;
    }

}
