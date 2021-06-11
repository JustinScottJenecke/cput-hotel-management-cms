package za.ac.cput.factoryTest.staff;

/*
    CleaningStaffFactoryTest.java
    Test cases for the CleaningStaffFactory
    Author: Justin Scott Jenecke 215163052
    Date: 11 June 2021
*/

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.staff.CleaningStaff;
import za.ac.cput.factory.staff.CleaningStaffFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CleaningStaffFactoryTest {

    @Test
    public void createCleaningStaff(){

        CleaningStaff cleaningStaff = CleaningStaffFactory.createCleaningStaffMember(
                "CR32",
                "Take",
                "Zato",
                180,
                32,
                4
        );

        assertEquals("CR32", cleaningStaff.getStaffId());
        assertEquals("Take", cleaningStaff.getFirstName());
        assertEquals("Zato", cleaningStaff.getLastName());
        assertEquals(180, cleaningStaff.getShift());
        assertEquals(32, cleaningStaff.getHoursWorked());
        assertEquals(4, cleaningStaff.getFloor());

    }

}
