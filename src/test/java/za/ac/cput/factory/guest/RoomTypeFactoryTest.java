package za.ac.cput.factory.guest;
/* RoomTypeFactoryTest.java
   Test for the RoomTypeFactoryFactoryTest
   Author: Themba Khanyile (217238173)
   Date:6 June2021
*/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import  za.ac.cput.entity.guest.RoomType;

class RoomTypeFactoryTest
{
    private RoomType roomTypeCode;
    private RoomType roomTypeDescription;

    @Test
    public void createGuest()
    {
        RoomType roomType = RoomTypeFactory.createRoomType(2.5,"Double room");
        System.out.println(roomType);
    }
    //Equality
    @Test
    void testEquality()
    {

        assertEquals(roomTypeCode,roomTypeDescription);
    }
    //Identity
    @Test
    void testIdentity()
    {
        assertSame(roomTypeDescription,roomTypeCode);
    }
    //Disable
    @Test
    @Disabled
    void createGuestDisable()
    {
        System.out.println("Error Occured: Test is disabled");
    }

    //TimeOut
    @Test
    void timeOut() throws InterruptedException
    {
        Thread.sleep(100);
        System.out.println("Time Out");
    }
}