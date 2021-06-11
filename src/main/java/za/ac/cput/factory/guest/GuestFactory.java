/*
GuestFactory.java
Factory class for creating guest
Author: Sihle Lucia Jijana (216273919)
Date: 11 June 2021
 */
package za.ac.cput.factory.guest;

import za.ac.cput.entity.guest.Guest;

public class GuestFactory {
    public static Guest createGuest(int idNo, String firstName, String lastName, String phone, String address){

        Guest guest = new Guest.Builder()
                .setIdNo(idNo)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setPhone(phone)
                .setAddress(address)
                .build();

        return guest;
    }
}
