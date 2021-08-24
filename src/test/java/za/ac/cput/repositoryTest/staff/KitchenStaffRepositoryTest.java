package za.ac.cput.repositoryTest.staff;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.staff.KitchenStaff;
import za.ac.cput.factory.staff.KitchenStaffFactory;
import za.ac.cput.repository.staff.impl.KitchenStaffRepository;

import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.MethodName.class)
public class KitchenStaffRepositoryTest {

    private static KitchenStaffRepository kitchenStaffRepository = KitchenStaffRepository.getKitchenStaffRepository();
    private static KitchenStaff kitchenStaff = KitchenStaffFactory.createKitchenStaffMember(
            "k185",
            "Joe",
            "Slow",
            120,
            20,
            "Cook"
    );

}
