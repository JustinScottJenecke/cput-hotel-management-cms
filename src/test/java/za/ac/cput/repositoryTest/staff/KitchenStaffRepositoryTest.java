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

    @Test
    void a_create() {

        KitchenStaff newKitchen = kitchenStaffRepository.create(kitchenStaff);
        assertEquals(newKitchen.getFirstName(), kitchenStaff.getFirstName());
    }

    @Test
    void b_read(){

        KitchenStaff readMan = kitchenStaffRepository.read("k185");
        assertEquals(kitchenStaff.getFirstName(), readMan.getFirstName());
        System.out.println(readMan.toString());

    }

    @Test
    void c_update(){

        KitchenStaff updateMan = new KitchenStaff.Builder().copy(kitchenStaff)
                .setFirstName("John")
                .build();
        System.out.println(updateMan);
        assertNotNull(kitchenStaffRepository.update(updateMan));
        /*Manager readMan = managerRepository.read("m101");
        assertNotNull(readMan);

        Manager updateMan = new Manager.Builder().copy(readMan)
                .setFirstName("Piedt")
                .setLastName("Retief")
                .build();

        managerRepository.delete("m101");
        managerRepository.create(updateMan);
        assertNotEquals(managerRepository.read("m101").toString(), manager.toString());
        System.out.println(managerRepository.read("m101"));
        System.out.println(manager);*/

    }

    @Test
    void d_delete(){
        boolean deleted = kitchenStaffRepository.delete("k185");
        assertTrue(deleted);
    }


}
