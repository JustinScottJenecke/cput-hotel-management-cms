package za.ac.cput.entity.guest;

import java.time.LocalDate;

public class Booking {
    private String bookingId;
    private int idNo;
    private String roomNo;
    private LocalDate checkIn, checkOut;

    private Booking(Builder builder) {
        this.bookingId = builder.bookingId;
        this.idNo = builder.idNo;
        this.roomNo = builder.roomNo;
        this.checkIn = builder.checkIn;
        this.checkOut = builder.checkOut;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", idNo=" + idNo +
                ", roomNo='" + roomNo + '\'' +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                '}';
    }

    public static class Builder{
        private String bookingId;
        private int idNo;
        private String roomNo;
        private LocalDate checkIn, checkOut;

        public Builder setBookingId(String bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public Builder setIdNo(int idNo) {
            this.idNo = idNo;
            return this;

        }

        public Builder setRoomNo(String roomNo) {
            this.roomNo = roomNo;
            return this;

        }

        public Builder setCheckIn(LocalDate checkIn) {
            this.checkIn = checkIn;
            return this;

        }

        public Builder setCheckOut(LocalDate checkOut) {
            this.checkOut = checkOut;
            return this;

        }
        public Booking build(){

            return new Booking(this);
        }

        private Builder copy (Booking booking){
            this.bookingId = booking.bookingId;
            this.idNo = booking.idNo;
            this.roomNo = booking.roomNo;
            this.checkIn = booking.checkIn;
            this.checkOut = booking.checkOut;

            return this;
        }

    }



}
