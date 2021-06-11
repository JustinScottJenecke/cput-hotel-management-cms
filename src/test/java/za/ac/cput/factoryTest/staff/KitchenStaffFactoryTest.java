package za.ac.cput.factoryTest.staff;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.staff.KitchenStaff;
import za.ac.cput.factory.staff.KitchenStaffFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class KitchenStaffFactoryTest {

    @Test
    public void createKitchenStaff(){

        KitchenStaff kitchenStaff = KitchenStaffFactory.createKitchenStaffMember(
                "k185",
                "Joe",
                "Slow",
                120,
                20,
                "Cook"
        );

        assertEquals("k185", kitchenStaff.getStaffId());
        assertEquals("Joe", kitchenStaff.getFirstName());
        assertEquals("Slow", kitchenStaff.getLastName());
        assertEquals(120, kitchenStaff.getShift());
        assertEquals(20, kitchenStaff.getHoursWorked());
        assertEquals("Cook", kitchenStaff.getJob());

    }

}
