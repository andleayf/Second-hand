package com.xcy.service.impl;

import com.xcy.mapper.AddressMapper;
import com.xcy.pojo.Address;
import com.xcy.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressMapper addressMapper;

    public List<Address> selectUserAddress(int id) {
        return addressMapper.selectUserAddress(id);
    }
}
