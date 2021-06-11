package za.ac.cput.factory.guest;
/* GuestFactory.java
   Factory for the GuestFactory
   Author: Themba Khanyile (217238173)
   Date:6 June2021
*/
import za.ac.cput.entity.guest.Guest;
public class GuestFactory {
    public static Guest createGuest(long idNo, String firstName, String lastName, String address) {
        Guest guest = new Guest.Builder()
                .setidNo(idNo)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setAddress(address)
                .build();
        return guest;
    }
}