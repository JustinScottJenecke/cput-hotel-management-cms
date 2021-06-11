package za.ac.cput.factoryTest.guest;
/* GuestFactoryTest.java
   Test for the GuestFactoryTest
   Author: Themba Khanyile (217238173)
   Date:6 June2021
*/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import  za.ac.cput.entity.guest.Guest;
import za.ac.cput.factory.guest.GuestFactory;


class GuestFactoryTest{
private Guest idNo;
private Guest firstName;
private Guest lastName;
private Guest address;


    @Test
    public void createGuest()
{
    Guest guest = GuestFactory.createGuest(96041869,"James","Bond","25 Main Road Cape Town 8001");
    System.out.println(guest);
}
//Equality
@Test
    void testEquality()
{

    assertEquals(firstName,lastName);
}
//Identity
@Test
    void testIdentity()
{
    assertSame(lastName,firstName);
}
//Disable
@Test
@Disabled
    void createGuestDisable()
{
    System.out.println("Error: Test is Disabled");
}

//TimeOut
@Test
    void timeOut() throws InterruptedException
    {
       Thread.sleep(50);
        System.out.println("Exceeded Time");
    }
}