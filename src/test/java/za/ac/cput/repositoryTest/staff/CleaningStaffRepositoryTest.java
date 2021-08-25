package za.ac.cput.repositoryTest.staff;

/**
 *     CleaningStaffRepositoryTest.java
 *     Test implementation class for CleaningStaff Repository
 *     Author: Justin Scott Jenecke 215163052
 *     Date: 25 August 2021
 **/

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.staff.CleaningStaff;
import za.ac.cput.factory.staff.CleaningStaffFactory;
import za.ac.cput.repository.staff.impl.CleaningStaffRepository;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class CleaningStaffRepositoryTest {

    private static CleaningStaffRepository cleaningStaffRepository = CleaningStaffRepository.getCleaningStaffRepository();
    private static CleaningStaff cleaningStaff = CleaningStaffFactory.createCleaningStaffMember(
            "CR32",
            "Take",
            "Zato",
            180,
            32,
            4
    );

    @Test
    void a_create() {

        CleaningStaff newKitchen = cleaningStaffRepository.create(cleaningStaff);
        assertEquals(newKitchen.getFirstName(), cleaningStaff.getFirstName());
    }

    @Test
    void b_read(){

        CleaningStaff readMan = cleaningStaffRepository.read("CR32");
        assertEquals(cleaningStaff.getFirstName(), readMan.getFirstName());
        System.out.println(readMan.toString());
    }

    @Test
    void c_update(){

        CleaningStaff updateMan = new CleaningStaff.Builder().copy(cleaningStaff)
                .setFirstName("John")
                .build();
        System.out.println(updateMan);
        assertNotNull(cleaningStaffRepository.update(updateMan));
    }

    @Test
    void d_delete(){
        boolean deleted = cleaningStaffRepository.delete("CR32");
        assertTrue(deleted);
    }

}
