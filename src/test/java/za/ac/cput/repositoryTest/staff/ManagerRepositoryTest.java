package za.ac.cput.repositoryTest.staff;

/**
 *     ManagerRepository.java
 *     Test implementation class for Manager Repository
 *     Author: Justin Scott Jenecke 215163052
 *     Date: 25 August 2021
 **/

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.staff.Manager;
import za.ac.cput.factory.staff.ManagerFactory;
import za.ac.cput.repository.staff.impl.ManagerRepository;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class ManagerRepositoryTest {

    private static ManagerRepository managerRepository = ManagerRepository.getManagerRepository();
    private static Manager manager = ManagerFactory.createManager(
                "m101",
                "Adam",
                "Smith",
                140,
                21,
                "manOne1",
                "pass1",
                "GM");

    @Test
    void a_create() {

        Manager newMan = managerRepository.create(manager);
        assertEquals(newMan.getFirstName(), manager.getFirstName());
    }

    @Test
    void b_read(){

        Manager readMan = managerRepository.read("m101");
        assertEquals(manager.getFirstName(), readMan.getFirstName());
        System.out.println(readMan.toString());

    }

    @Test
    void c_update(){

        Manager updateMan = new Manager.Builder().copy(manager)
                .setFirstName("John")
                .build();
        System.out.println(updateMan);
        assertNotNull(managerRepository.update(updateMan));
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
       boolean deleted = managerRepository.delete("m101");
       assertTrue(deleted);
    }


}
