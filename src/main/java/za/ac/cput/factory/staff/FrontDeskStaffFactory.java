package za.ac.cput.factory.staff;

import za.ac.cput.entity.staff.FrontDeskStaff;

public class FrontDeskStaffFactory{

    public static FrontDeskStaff createFrontDeskStaff(
            String staffId,
            String firstName,
            String lastName,
            int shift,
            int hoursWorked,
            String userName,
            String password){

        FrontDeskStaff frontDeskStaff = new FrontDeskStaff.Builder()
                .setStaffId(staffId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setShift(shift)
                .setHoursWorked(hoursWorked)
                .setUserName(userName)
                .setPassword(password)
                .build();

        return frontDeskStaff;

    }
}
