package za.ac.cput.service;

public interface IService <Type, ID> {

    Type create(Type x);
    Type read(String ID);
    Type update(Type x);
    boolean delete(String ID);

}

