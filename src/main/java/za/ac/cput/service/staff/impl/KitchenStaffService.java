package za.ac.cput.service.staff.impl;

import za.ac.cput.entity.staff.KitchenStaff;
import za.ac.cput.repository.staff.impl.KitchenStaffRepository;
import za.ac.cput.service.staff.IKitchenStaffService;

public class KitchenStaffService implements IKitchenStaffService {

    private static KitchenStaffService service = null;
    private KitchenStaffRepository repository = null;

    private KitchenStaffService(){
        this.repository = KitchenStaffRepository.getKitchenStaffRepository();
    }

    public static KitchenStaffService getService() {
        if ( service== null)
            service = new KitchenStaffService();
        return service;
    }

    @Override
    public KitchenStaff create(KitchenStaff x) {
        return this.repository.create(x);
    }

    @Override
    public KitchenStaff read(String ID) {
        return this.repository.read(ID);
    }

    @Override
    public KitchenStaff update(KitchenStaff x) {
        return this.repository.update(x);
    }

    @Override
    public boolean delete(String ID) {
        return this.repository.delete(ID);
    }
}
