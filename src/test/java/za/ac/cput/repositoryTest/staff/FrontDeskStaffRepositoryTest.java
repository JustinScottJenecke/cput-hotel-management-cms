package za.ac.cput.repositoryTest.staff;

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



}
