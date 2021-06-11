package za.ac.cput.factoryTest.staff;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.staff.Manager;
import za.ac.cput.factory.staff.ManagerFactory;

import static org.junit.jupiter.api.Assertions.*;

/*
    ManagerFactoryTest.java
    Test cases for the ManagerFactory
    Author: Justin Scott Jenecke 215163052
    Date: 10 June 2021
*/

class ManagerFactoryTest {

    @Test
    public void createManager(){

        Manager manager = ManagerFactory.createManager(
                "m101",
                "Adam",
                "Smith",
                140,
                21,
                "manOne1",
                "pass1",
                "GM");

        assertEquals("m101", manager.getStaffId());;
        assertEquals("Adam",manager.getFirstName());
        assertEquals("Smith",manager.getLastName());
        assertEquals(140, manager.getShift());
        assertEquals(21, manager.getHoursWorked());
        assertEquals("manOne1",manager.getUserName());
        assertEquals("pass1", manager.getPassword());
        assertEquals("GM", manager.getRole());

    }

}