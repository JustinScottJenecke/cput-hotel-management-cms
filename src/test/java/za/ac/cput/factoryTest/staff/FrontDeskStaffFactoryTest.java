package za.ac.cput.factoryTest.staff;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.staff.FrontDeskStaff;
import za.ac.cput.factory.staff.FrontDeskStaffFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    FrontDeskStaffFactoryTest.java
    Test cases for the FrontDeskStaffFactory
    Author: Justin Scott Jenecke 215163052
    Date: 11 June 2021
*/

public class FrontDeskStaffFactoryTest {

    @Test
    public void createFrontDeskStaff(){

        FrontDeskStaff frontDeskStaff = FrontDeskStaffFactory.createFrontDeskStaff(
                "fd3s",
                "Plain",
                "Jane",
                90,
                0,
                "Jane7778",
                "rotaryLife7"
        );

                assertEquals("fd3s",frontDeskStaff.getStaffId());
                assertEquals("Plain",frontDeskStaff.getFirstName());
                assertEquals("Jane",frontDeskStaff.getLastName());
                assertEquals(90,frontDeskStaff.getShift());
                assertEquals(0,frontDeskStaff.getHoursWorked());
                assertEquals("Jane7778",frontDeskStaff.getUserName());
                assertEquals("rotaryLife7",frontDeskStaff.getPassword());

    }
}
