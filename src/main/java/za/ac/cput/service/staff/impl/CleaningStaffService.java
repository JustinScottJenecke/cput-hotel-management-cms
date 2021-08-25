package za.ac.cput.service.staff.impl;

/**
 *     CleaningStaffService.java
 *     Cleaning Staff Service to provide access to datastore and repository
 *     Author: Justin Scott Jenecke 215163052
 *     Date: 25 August 2021
 **/

import za.ac.cput.entity.staff.CleaningStaff;
import za.ac.cput.repository.staff.impl.CleaningStaffRepository;
import za.ac.cput.service.staff.ICleaningStaffService;


public class CleaningStaffService implements ICleaningStaffService {

    private static CleaningStaffService cleaningStaffService = null;
    private CleaningStaffRepository cleaningStaffRepository = null;

    private CleaningStaffService(){
        this.cleaningStaffRepository = CleaningStaffRepository.getCleaningStaffRepository();
    }

    public static CleaningStaffService getService() {
        if (cleaningStaffService == null)
            cleaningStaffService = new CleaningStaffService();
        return cleaningStaffService;
    }

    @Override
    public CleaningStaff create(CleaningStaff x) {

        return this.cleaningStaffRepository.create(x);
    }

    @Override
    public CleaningStaff read(String ID) {
        return this.cleaningStaffRepository.read(ID);
    }

    @Override
    public CleaningStaff update(CleaningStaff x) {
        return this.cleaningStaffRepository.update(x);
    }

    @Override
    public boolean delete(String ID) {
        return this.cleaningStaffRepository.delete(ID);
    }
}
