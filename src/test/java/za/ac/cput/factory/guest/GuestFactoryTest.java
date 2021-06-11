package za.ac.cput.factory.guest;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.entity.guest.Guest;

import static org.junit.jupiter.api.Assertions.*;

class GuestFactoryTest {

    @Test
    public void createGuest(){
        Guest guest = GuestFactory.createGuest(622809951,
                                                "John",
                                                "Sam",
                                                "0652226565",
                                                "District Six");}
    //Equality
    @Test
    void testGuestEquality(){
        assertEquals("District Six", "District Six");
        assertEquals(622809951, 622809951);
    }

    //Identity
    @Test
    void testGuestIdentity(){
        assertSame("0652226565", 0652226565);
        assertSame("John", "John");
    }

    //Timeout
    @Test
    @Timeout(1)
    void testGuestTimeout(){
        System.out.println("Timeout not exceeded");
        assertEquals("Sam", "Sam");
    }

    //Disable
    @Disabled
    @Test
    void testGuestTemporarilyDisable(){
        assertEquals("District Six", "District Six");
    }
}

