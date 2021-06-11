package za.ac.cput.factory.staff;

/*
    CleaningStaffFactory.java
    Factory for the CleaningStaff
    Author: Justin Scott Jenecke 215163052
    Date: 11 June 2021
*/


import za.ac.cput.entity.staff.CleaningStaff;

public class CleaningStaffFactory {

    public static CleaningStaff createCleaningStaffMember(
            String staffId,
            String firstName,
            String lastName,
            int shift,
            int hoursWorked,
            int floor){

        CleaningStaff cleaningStaff = new CleaningStaff.Builder()
                .setStaffId(staffId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setShift(shift)
                .setHoursWorked(hoursWorked)
                .setFloor(floor)
                .build();

        return cleaningStaff;
    }

}
