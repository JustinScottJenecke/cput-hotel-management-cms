package za.ac.cput.service.staff.impl;

import za.ac.cput.entity.staff.Manager;
import za.ac.cput.repository.staff.impl.ManagerRepository;
import za.ac.cput.service.staff.IMangerService;

public class ManagerService implements IMangerService {

    private static ManagerService service = null;
    private ManagerRepository repository = null;

    private ManagerService(){
        this.repository = ManagerRepository.getManagerRepository();
    }

    public static ManagerService getService() {
        if ( service== null)
            service = new ManagerService();
        return service;
    }

    @Override
    public Manager create(Manager x) {
        return this.repository.create(x);
    }

    @Override
    public Manager read(String ID) {
        return this.repository.read(ID);
    }

    @Override
    public Manager update(Manager x) {
        return this.repository.update(x);
    }

    @Override
    public boolean delete(String ID) {
        return this.repository.delete(ID);
    }
}
