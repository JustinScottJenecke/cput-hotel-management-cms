/**
 * BookingFactoryTest.java
 * Test for BookingFactory
 * Author: Kevin Michael Karelse (219000859)
 * Date:11/06/2021
 */
package za.ac.cput.factoryTest.guest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.guest.Booking;
import za.ac.cput.factory.guest.BookingFactory;

import java.time.LocalDate;

class BookingFactoryTest {

    @Test
    public void createBooking(){
        Booking booking = BookingFactory.createBooking(
                "b001",
                20,
                "201",
                LocalDate.now(),
                LocalDate.of(2021,06,20));




       assertEquals("b001",booking.getBookingId());
       assertEquals(20,booking.getIdNo());
       assertEquals("201",booking.getRoomNo());
       assertEquals(LocalDate.now(),booking.getCheckIn());
       assertEquals(LocalDate.of(2021,06,20),booking.getCheckOut());

       assertSame(true,booking.equals(booking));//Check if object exists






    }


}