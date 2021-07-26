package za.ac.cput.repository;

public interface IRepository <Type, ID> {

    Type create(Type x);
    Type read(ID id);
    Type update(Type x, ID id);
    boolean delete(ID id);

}
