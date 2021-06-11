package za.ac.cput.factory.staff;

/*
    KitchenStaffFactory.java
    Factory for the KitchenStaff
    Author: Justin Scott Jenecke 215163052
    Date: 11 June 2021
*/

import za.ac.cput.entity.staff.KitchenStaff;

public class KitchenStaffFactory {

    public static KitchenStaff createKitchenStaffMember(
            String staffId,
            String firstName,
            String lastName,
            int shift,
            int hoursWorked,
            String job){

        KitchenStaff kitchenStaff = new KitchenStaff.Builder()
                .setStaffId(staffId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setShift(shift)
                .setHoursWorked(hoursWorked)
                .setJob(job)
                .build();

        return kitchenStaff;
    }
}
