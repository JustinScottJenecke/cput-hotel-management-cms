package za.ac.cput.factory.staff;

/*
    ManagerFactory.java
    Factory for the Manager
    Author: Justin Scott Jenecke 215163052
    Date: 10 June 2021
*/

import za.ac.cput.entity.staff.Manager;

public class ManagerFactory {

    public static Manager createManager(
            String staffId,
            String firstName,
            String lastName,
            int shift,
            int hoursWorked,
            String userName,
            String password,
            String role){

        Manager manager = new Manager.Builder()
                .setStaffId(staffId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setShift(shift)
                .setHoursWorked(hoursWorked)
                .setUserName(userName)
                .setPassword(password)
                .setRole(role)
                .build();

        return manager;
    }

}
