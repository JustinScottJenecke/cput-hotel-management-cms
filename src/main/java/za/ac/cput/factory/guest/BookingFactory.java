/**
 * BookingFactory.java
 * Factory for Booking
 * Author: Kevin Michael Karelse (219000859)
 * Date:11/06/2021
 */

package za.ac.cput.factory.guest;

import za.ac.cput.entity.guest.Booking;

import java.time.LocalDate;


public class BookingFactory {
    public static Booking createBooking(
            String bookingId,
            int idNo,
            String roomNo,
            LocalDate checkIn,
            LocalDate checkOut)
        {
            Booking booking = new Booking.Builder()
                .setBookingId(bookingId)
                .setIdNo(idNo)
                .setRoomNo(roomNo)
                .setCheckIn(checkIn)
                .setCheckOut(checkOut)
                .build();

            return booking;


        }

}
