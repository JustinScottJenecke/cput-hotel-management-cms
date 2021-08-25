package za.ac.cput.repository.staff.impl;

/**
 *     ManagerRepository.java
 *     Repository implementation class for Manager Entity
 *     Author: Justin Scott Jenecke 215163052
 *     Date: 25 August 2021
 **/

import za.ac.cput.entity.staff.Manager;
import za.ac.cput.repository.staff.IManagerRepository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ManagerRepository implements IManagerRepository {

    private static ManagerRepository managerRepository = null;
    private List<Manager> managerDb = null;

    private ManagerRepository(){
        managerDb = new ArrayList<Manager>();
    }

    public static ManagerRepository getManagerRepository(){

        if (managerRepository == null)
            managerRepository = new ManagerRepository();

        return managerRepository;
    }

    @Override
    public Manager create(Manager x) {
        boolean created = managerDb.add(x);
        if (created)
            return x;
        else
            return null;
        /*    try {
            managerDb.add(x);
        } catch (Exception e) {

            e.printStackTrace();
            return null;
        }
        */
    }

    @Override
    public Manager read(String s) {
        for (Manager man:managerDb) {
            if (man.getStaffId() == s)
                return man;
        }
        return null;
    }

    @Override
    public Manager update(Manager x) {
        Manager oldManager = read(x.getStaffId());
        if (oldManager != null){
            managerDb.remove(oldManager);
            managerDb.add(x);
            return x;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {

        Manager delManager = read(s);
        if (delManager == null)
            return false;
        managerDb.remove(delManager);
        return true;


    }
}
