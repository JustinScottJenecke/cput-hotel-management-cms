package za.ac.cput.repository.staff.impl;

import za.ac.cput.entity.staff.KitchenStaff;
import za.ac.cput.repository.staff.IKitchenStaffRepository;

import java.util.ArrayList;
import java.util.List;

public class KitchenStaffRepository implements IKitchenStaffRepository {

    private static KitchenStaffRepository kitchenStaffRepository = null;
    private List<KitchenStaff> kitchenStaffDB = null;

    private KitchenStaffRepository(){
        kitchenStaffDB = new ArrayList<KitchenStaff>();
    }

    public static KitchenStaffRepository getKitchenStaffRepository(){

        if (kitchenStaffRepository == null)
            kitchenStaffRepository = new KitchenStaffRepository();

        return kitchenStaffRepository;
    }

    @Override
    public KitchenStaff create(KitchenStaff x) {
        boolean created = kitchenStaffDB.add(x);
        if (created)
            return x;
        else
            return null;
    }

    @Override
    public KitchenStaff read(String s) {
        for (KitchenStaff man:kitchenStaffDB) {
            if (man.getStaffId() == s)
                return man;
        }
        return null;
    }

    @Override
    public KitchenStaff update(KitchenStaff x) {
        KitchenStaff oldManager = read(x.getStaffId());
        if (oldManager != null){
            kitchenStaffDB.remove(oldManager);
            kitchenStaffDB.add(x);
            return x;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {

        KitchenStaff delManager = read(s);
        if (delManager == null)
            return false;
        kitchenStaffDB.remove(delManager);
        return true;


    }

}
