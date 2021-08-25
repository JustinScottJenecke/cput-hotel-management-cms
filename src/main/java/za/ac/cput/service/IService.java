package za.ac.cput.service;

/**
 *     IService.java
 *     Generic Service interface to be implemented by other Services
 *     Author: Justin Scott Jenecke 215163052
 *     Date: 25 August 2021
 **/

public interface IService <Type, ID> {

    Type create(Type x);
    Type read(String ID);
    Type update(Type x);
    boolean delete(String ID);

}

