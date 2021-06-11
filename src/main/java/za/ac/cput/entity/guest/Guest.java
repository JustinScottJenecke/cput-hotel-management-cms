package za.ac.cput.entity.guest;
/* GuestFactory.java
   Entity for the GuestFactory
   Author: Themba Khanyile (217238173)
   Date:6 June2021
 */

public class Guest
{
    long idNo;
    String firstName;
    String lastName;
    String address;

    private Guest(Guest.Builder builder)
    {
        this.idNo=builder.idNo;
        this.firstName=builder.firstName;
        this.lastName=builder.lastName;
        this.address=builder.address;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "idNo=" + idNo +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder{
        private long idNo;
        private String firstName;
        private String lastName;
        private String address;

//Getters
        public long getIdNo()
        {
            return idNo;
        }

        public String getFirstName()
        {
            return firstName;
        }

        public String getLastName()
        {
            return lastName;
        }

        public String getAddress()
        {
            return address;
        }

//Setters
        public Builder setidNo(long idNo)
        {
            this.idNo = idNo;
            return  this;
        }

        public Builder setFirstName(String firstName)
        {
            this.firstName = firstName;
            return this;
        }
        public Builder setLastName(String lastName)
        {
            this.lastName = lastName;
            return this;
        }
        public Builder setAddress(String address)
        {
            this.address = address;
            return this;
        }
        public Guest build(){
            return  new Guest(this);
        }
        public Guest.Builder copy(Guest guest)
        {
            this.idNo=guest.idNo;
            this.firstName=guest.firstName;
            this.lastName=guest.lastName;
            this.address=guest.address;
            return this;
        }



    }

}
