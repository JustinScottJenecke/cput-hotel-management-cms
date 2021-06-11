/**
 * GeneralEmployeeFactoryTest.java
 * Test for GeneralEmployeeFactory
 * Author: Kevin Michael Karelse (219000859)
 * Date:11/06/2021
 */
package za.ac.cput.factoryTest.staff;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.staff.GeneralEmployee;
import za.ac.cput.factory.staff.GeneralEmployeeFactory;

import static org.junit.jupiter.api.Assertions.*;

class GeneralEmployeeFactoryTest {

    @Test
    public void createGeneralEmployee(){
        GeneralEmployee generalEmployee = GeneralEmployeeFactory.createGeneralEmployee(
                "e001",
                "Arjuna",
                "Alter",
                200,
                40,
                "Accountant");

        assertEquals("e001",generalEmployee.getStaffId());
        assertEquals("Arjuna",generalEmployee.getFirstName());
        assertEquals("Alter",generalEmployee.getLastName());
        assertEquals(200,generalEmployee.getShift());
        assertEquals(40,generalEmployee.getHoursWorked());
        assertEquals("Accountant",generalEmployee.getGenEmpJob());

        assertSame(true,generalEmployee.equals(generalEmployee));



    }

}