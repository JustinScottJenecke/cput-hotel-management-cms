package za.ac.cput.repositoryTest.staff;

/**
 *     FrontDeskStaffRepositoryTest.java
 *     Test implementation class for FrontDeskStaff Repository
 *     Author: Justin Scott Jenecke 215163052
 *     Date: 25 August 2021
 **/

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.staff.FrontDeskStaff;
import za.ac.cput.factory.staff.FrontDeskStaffFactory;
import za.ac.cput.repository.staff.impl.FrontDeskStaffRepository;

import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.MethodName.class)
public class FrontDeskStaffRepositoryTest {

    private static FrontDeskStaffRepository frontDeskStaffRepository = FrontDeskStaffRepository.getFontDeskStaffRepository();
    private static FrontDeskStaff frontDeskStaff = FrontDeskStaffFactory.createFrontDeskStaff(
            "fd3s",
            "Plain",
            "Jane",
            90,
            0,
            "Jane7778",
            "rotaryLife7"
    );

    @Test
    void a_create() {

        FrontDeskStaff newMan = frontDeskStaffRepository.create(frontDeskStaff);
        assertEquals(newMan.getFirstName(), frontDeskStaff.getFirstName());
    }

    @Test
    void b_read(){

        FrontDeskStaff readMan = frontDeskStaffRepository.read("fd3s");
        assertEquals(frontDeskStaff.getFirstName(), readMan.getFirstName());
        System.out.println(readMan.toString());
    }

    @Test
    void c_update(){

        FrontDeskStaff updateMan = new FrontDeskStaff.Builder().copy(frontDeskStaff)
                .setFirstName("John")
                .build();
        System.out.println(updateMan);
        assertNotNull(frontDeskStaffRepository.update(updateMan));
    }

    @Test
    void d_delete(){
        boolean deleted = frontDeskStaffRepository.delete("fd3s");
        assertTrue(deleted);
    }

}
