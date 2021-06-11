package za.ac.cput.factory.guest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.guest.Booking;
import za.ac.cput.factory.guest.BookingFactory;

import java.time.LocalDate;

class BookingFactoryTest {


    @Test
    public void createBooking(){
        Booking booking = new BookingFactory().createBooking(
                "b001",
                20,
                "201",
                LocalDate.now(),
                LocalDate.of(2021,06,20));
        System.out.println(booking);


       assertEquals("b001",booking);






    }


}