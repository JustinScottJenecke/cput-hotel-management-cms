/*
Guest.java
Entity for the Guest
Author: Sihle Lucia Jijana (216273919)
Date: 11 June 2021
 */
package za.ac.cput.entity.guest;

public class Guest {
    private int idNo;
    private String firstName, lastName, phone, address;

    private Guest(Builder builder) {
        this.idNo = builder.idNo;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "idNo=" + idNo +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder{
       private int idNo;
       private String firstName, lastName, phone, address;

       public Builder setIdNo(int idNo){
           this.idNo = idNo;
           return this;
       }

       public Builder setFirstName(String firstName){
           this.firstName = firstName;
           return this;
       }

       public Builder setLastName(String lastName){
           this.lastName = lastName;
           return this;
       }

       public Builder setPhone(String phone){
           this.phone = phone;
           return this;
       }

       public Builder setAddress(String address){
           this.address = address;
           return this;
       }
       public Guest build(){
           return new Guest(this);
       }
       public Builder copy(Guest guest){
           this.idNo = guest.idNo;
           this.firstName = guest.firstName;
           this.lastName = guest.lastName;
           this.phone = guest.phone;
           this.address = guest.address;

           return this;
       }
    }
}
