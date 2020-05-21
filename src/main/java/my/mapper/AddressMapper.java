package my.mapper;

import my.entity.Address;
import java.util.List;

public interface AddressMapper{
    List<Address> selectAllAddress();
    void insert(Address Address);
}
