/*
Room.java
Sihle Jijana 216273919
 */
package za.ac.cput.entity.guest;

public class Room {

    private String roomNo;
    private String roomTypeCode;
    private String sleepTypeCode;
    private double roomCost;
    private boolean serviced;

    private Room(){

    }

    private Room (Builder b){

        this.roomNo = b.roomNo;
        this.roomTypeCode = b.roomTypeCode;
        this.sleepTypeCode = b.sleepTypeCode;
        this.roomCost = b.roomCost;
        this.serviced = b.serviced;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    public String getSleepTypeCode() {
        return sleepTypeCode;
    }

    public double getRoomCost() {
        return roomCost;
    }

    public boolean isServiced() {
        return serviced;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNo='" + roomNo + '\'' +
                ", roomTypeCode='" + roomTypeCode + '\'' +
                ", sleepTypeCode='" + sleepTypeCode + '\'' +
                ", roomCost=" + roomCost +
                ", serviced=" + serviced +
                '}';
    }

    public static class Builder {

        private String roomNo;
        private String roomTypeCode;
        private String sleepTypeCode;
        private double roomCost;
        private boolean serviced;

        public Builder setRoomNo(String roomNo) {
            this.roomNo = roomNo;
            return this;
        }

        public Builder setRoomTypeCode(String roomTypeCode) {
            this.roomTypeCode = roomTypeCode;
            return this;
        }

        public Builder setSleepTypeCode(String sleepTypeCode) {
            this.sleepTypeCode = sleepTypeCode;
            return this;
        }

        public Builder setRoomCost(double roomCost) {
            this.roomCost = roomCost;
            return this;
        }

        public Builder setServiced(boolean serviced) {
            this.serviced = serviced;
            return this;
        }

        public Room build(){ return new Room(this);}

        public Builder copy (Room c){

            this.roomNo = c.roomNo;
            this.roomTypeCode = c.roomTypeCode;
            this.sleepTypeCode = c.sleepTypeCode;
            this.roomCost = c.roomCost;
            this.serviced = c.serviced;
            return this;
        }
    }

}
