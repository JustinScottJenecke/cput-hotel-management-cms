package za.ac.cput.factory.dining;

import za.ac.cput.entity.dining.DiningService;
/**
 * Student Number: 217050743
 * Author: Shameel Kiyang
 */

public class DiningServiceFactory {

    public static DiningService createDiningService(String  serviceType,String timeSlot, String cost){

        DiningService diningService = new DiningService.Builder().setServiceType(serviceType).setTimeSlot(timeSlot).setCost(cost).build();

        return diningService;
    }
}
