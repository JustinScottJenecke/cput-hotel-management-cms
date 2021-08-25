package za.ac.cput.repository.staff.impl;

/**
 *     CleaningStaffRepository.java
 *     Repository implementation class for CleaningStaff Entity
 *     Author: Justin Scott Jenecke 215163052
 *     Date: 25 August 2021
 **/

import za.ac.cput.entity.staff.CleaningStaff;
import za.ac.cput.repository.staff.ICleaningStaffRepository;

import java.util.ArrayList;
import java.util.List;

public class CleaningStaffRepository implements ICleaningStaffRepository {

    private static CleaningStaffRepository cleaningStaffRepository = null;
    private List<CleaningStaff> cleaningStaffDB = null;

    private CleaningStaffRepository() {
        cleaningStaffDB = new ArrayList<CleaningStaff>();
    }

    public static CleaningStaffRepository getCleaningStaffRepository() {

        if (cleaningStaffRepository == null)
            cleaningStaffRepository = new CleaningStaffRepository();

        return cleaningStaffRepository;
    }

    @Override
    public CleaningStaff create(CleaningStaff x) {
        boolean created = cleaningStaffDB.add(x);
        if (created)
            return x;
        else
            return null;
    }

    @Override
    public CleaningStaff read(String s) {
        for (CleaningStaff man : cleaningStaffDB) {
            if (man.getStaffId() == s)
                return man;
        }
        return null;
    }

    @Override
    public CleaningStaff update(CleaningStaff x) {
        CleaningStaff oldManager = read(x.getStaffId());
        if (oldManager != null) {
            cleaningStaffDB.remove(oldManager);
            cleaningStaffDB.add(x);
            return x;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {

        CleaningStaff delManager = read(s);
        if (delManager == null)
            return false;
        cleaningStaffDB.remove(delManager);
        return true;

    }
}