package za.ac.cput.repository;

/**
 *     IRepository.java
 *     Generic Repository interface to be implemented by other repositories
 *     Author: Justin Scott Jenecke 215163052
 *     Date: 25 August 2021
 **/

public interface IRepository <Type, ID> {

    Type create(Type x);
    Type read(ID id);
    Type update(Type x);
    boolean delete(ID id);

}
