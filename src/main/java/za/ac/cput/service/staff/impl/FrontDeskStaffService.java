package za.ac.cput.service.staff.impl;

/**
 *     FrontDeskStaffService.java
 *     FrontDesk Staff Service to provide access to datastore and repository
 *     Author: Justin Scott Jenecke 215163052
 *     Date: 25 August 2021
 **/

import za.ac.cput.entity.staff.FrontDeskStaff;
import za.ac.cput.repository.staff.impl.FrontDeskStaffRepository;
import za.ac.cput.service.staff.IFrontDeskStaffService;

public class FrontDeskStaffService implements IFrontDeskStaffService {

    private static FrontDeskStaffService service = null;
    private FrontDeskStaffRepository repository = null;

    private FrontDeskStaffService(){
        this.repository = FrontDeskStaffRepository.getFontDeskStaffRepository();
    }

    public static FrontDeskStaffService getService() {
        if ( service== null)
            service = new FrontDeskStaffService();
        return service;
    }

    @Override
    public FrontDeskStaff create(FrontDeskStaff x) {
        return this.repository.create(x);
    }

    @Override
    public FrontDeskStaff read(String ID) {
        return this.repository.read(ID);
    }

    @Override
    public FrontDeskStaff update(FrontDeskStaff x) {
        return this.repository.update(x);
    }

    @Override
    public boolean delete(String ID) {
        return this.repository.delete(ID);
    }
}
