package za.ac.cput.entity.guest;
/* RoomTypeFactory.java
   Entity for the RoomType
   Author: Themba Khanyile (217238173)
   Date:6 June2021
 */


public class RoomType
{
    private double roomTypeCode;
    private String roomTypeDescription;

    private RoomType(Builder builder)
    {
        this.roomTypeCode=builder.roomTypeCode;
        this.roomTypeDescription=builder.roomTypeDescription;
    }

    @Override
    public String toString() {
        return "RoomType{" +
                "roomTypeCode=" + roomTypeCode +
                ", roomTypeDescription='" + roomTypeDescription + '\'' +
                '}';
    }

    public static class Builder{
        private double roomTypeCode;
        private String roomTypeDescription;

       //Getters
        public double getRoomTypeCode()
        {
            return roomTypeCode;
        }

        public String getRoomTypeDescription()
        {
            return roomTypeDescription;
        }

        //Setters
        public Builder setroomTypeCode(double roomTypeCode)
        {
            this.roomTypeCode = roomTypeCode;
            return  this;
        }


        public Builder setroomTypeDescription(String roomTypeDescription )
        {
            this.roomTypeDescription = roomTypeDescription;
            return this;
        }
        public RoomType build(){
            return  new RoomType(this);
        }
       public  Builder copy(RoomType roomType)
       {
            this.roomTypeCode=roomType.roomTypeCode;
            this.roomTypeDescription=roomType.roomTypeDescription;
            return this;
       }



    }


}
