package my.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import my.entity.Address;
import my.mapper.AddressMapper;
import my.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressMapper addressMapper;

  public   List<Address> selectAllAddress(){
        return addressMapper.selectAllAddress();
    }

    @Override
    public void insert(Address address) {
        addressMapper.insert(address);
    }

    @Override
    public List<Address> queryList() {
        PageHelper.startPage(1,5);
        PageInfo<Address> pageInfo = new PageInfo<>(addressMapper.selectAllAddress());
        return pageInfo.getList();
    }
}
