package za.ac.cput.repository.staff.impl;

import za.ac.cput.entity.staff.FrontDeskStaff;
import za.ac.cput.repository.staff.IFrontDeskStaffRepository;

import java.util.ArrayList;
import java.util.List;

public class FrontDeskStaffRepository implements IFrontDeskStaffRepository {

    private static FrontDeskStaffRepository frontDeskStaffRepository = null;
    private List<FrontDeskStaff> frontDeskStaffDB = null;

    private FrontDeskStaffRepository(){
        frontDeskStaffDB = new ArrayList<FrontDeskStaff>();
    }

    public static FrontDeskStaffRepository getFontDeskStaffRepository(){

        if (frontDeskStaffRepository == null)
            frontDeskStaffRepository = new FrontDeskStaffRepository();

        return frontDeskStaffRepository;
    }

    @Override
    public FrontDeskStaff create(FrontDeskStaff x) {
        boolean created = frontDeskStaffDB.add(x);
        if (created)
            return x;
        else
            return null;
    }

    @Override
    public FrontDeskStaff read(String s) {
        for (FrontDeskStaff man:frontDeskStaffDB) {
            if (man.getStaffId() == s)
                return man;
        }
        return null;
    }

    @Override
    public FrontDeskStaff update(FrontDeskStaff x) {
        FrontDeskStaff oldManager = read(x.getStaffId());
        if (oldManager != null){
            frontDeskStaffDB.remove(oldManager);
            frontDeskStaffDB.add(x);
            return x;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {

        FrontDeskStaff delManager = read(s);
        if (delManager == null)
            return false;
        frontDeskStaffDB.remove(delManager);
        return true;


    }

}
