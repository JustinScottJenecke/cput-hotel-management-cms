package za.ac.cput.factory.staff;

import za.ac.cput.entity.staff.GeneralEmployee;

public class GeneralEmployeeFactory {
    public static GeneralEmployee createGeneralEmployee(
            String staffId,
            String firstName,
            String lastName,
            int shift,
            int hoursWorked,

            String genEmpJob)


         {
             GeneralEmployee generalEmployee = new GeneralEmployee.Builder()
                     .setStaffId(staffId)
                     .setFirstName(firstName)
                     .setLastName(lastName)
                     .setShift(shift)
                     .setHoursWorked(hoursWorked)
                     .setGenEmpJob(genEmpJob)
                     .build();


             return generalEmployee;

         }
}
