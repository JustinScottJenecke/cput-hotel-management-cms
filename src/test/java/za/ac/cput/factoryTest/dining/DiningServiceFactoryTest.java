package za.ac.cput.factoryTest.dining;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.dining.DiningService;
import za.ac.cput.factory.dining.DiningServiceFactory;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Student Number: 217050743
 * Author: Shameel Kiyang
 */

 class DiningServiceFactoryTest {


    @Test
    public void createDiningService(){
        DiningService diningService = DiningServiceFactory.createDiningService("nice","14:00","350");
        assertNotNull(diningService);
        System.out.println(diningService);


    }

}