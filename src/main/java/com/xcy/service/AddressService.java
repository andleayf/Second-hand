package com.xcy.service;

import com.xcy.pojo.Address;

import java.util.List;

public interface AddressService {
     List<Address> selectUserAddress(int id);
}
