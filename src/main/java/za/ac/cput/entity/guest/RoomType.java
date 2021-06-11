/*
RoomType.java
Entity for the guests room type
Author: Sihle Lucia Jijana (216273919)
Date: 11 June 2021
 */
package za.ac.cput.entity.guest;

public class RoomType {
   String roomTypeCode;
   boolean smoking;

    private RoomType(Builder builder) {
        this.roomTypeCode = builder.roomTypeCode;
        this.smoking = builder.smoking;
    }

    @Override
    public String toString() {
        return "RoomType{" +
                "roomTypeCode='" + roomTypeCode + '\'' +
                ", smoking=" + smoking +
                '}';
    }

    public static class Builder{
       private String roomTypeCode;
       private boolean smoking;

       public Builder setRoomTypeCode(String roomTypeCode){
           this.roomTypeCode = roomTypeCode;
           return this;
       }

       public Builder setSmoking(boolean smoking){
           this.smoking = smoking;
           return this;
       }
       public RoomType build(){
           return new RoomType(this);
       }
       public Builder copy(RoomType roomType){
           this.roomTypeCode = roomType.roomTypeCode;
           this.smoking = roomType.smoking;

           return this;
       }
   }
}
