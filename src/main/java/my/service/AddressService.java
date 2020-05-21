package my.service;

import my.entity.Address;

import java.util.List;


public interface AddressService{
    List<Address> selectAllAddress();
    void insert(Address address);
    List<Address> queryList();
}
