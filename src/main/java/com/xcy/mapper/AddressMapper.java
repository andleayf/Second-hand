package com.xcy.mapper;

import com.xcy.pojo.Address;

import java.util.List;

public interface AddressMapper {
    List<Address> selectUserAddress(int id);
}
