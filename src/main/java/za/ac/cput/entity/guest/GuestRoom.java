package za.ac.cput.entity.guest;
/**
 * Student Number: 217050743
 * Author: Shameel Kiyang
 */



public class GuestRoom {
    private String  roomNo,idNo,bill;

    private GuestRoom(Builder g){
        this.roomNo=g.roomNo;
        this.idNo=g.idNo;
        this.bill=g.bill;
    }

    @Override
    public String toString() {
        return "GuestRoom{" +
                "roomNo='" + roomNo + '\'' +
                ", idNo='" + idNo + '\'' +
                ", bill='" + bill + '\'' +
                '}';
    }

    public static class Builder {
        private String  roomNo,idNo,bill;

        public Builder setRoomNo(String roomNo) {
            this.roomNo = roomNo;

            return this;
        }

        public Builder setIdNo(String idNo) {
            this.idNo = idNo;

            return this;
        }

        public Builder setBill(String bill) {
            this.bill = bill;

            return this;
        }

        public GuestRoom build(){
            return new GuestRoom(this);

        }
        public Builder copy (GuestRoom guestroom){
            this.roomNo=guestroom.roomNo;
            this.idNo=guestroom.idNo;
            this.bill=guestroom.bill;

            return this;

        }

    }
}



