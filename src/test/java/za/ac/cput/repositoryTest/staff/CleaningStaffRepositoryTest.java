package za.ac.cput.repositoryTest.staff;

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

}
