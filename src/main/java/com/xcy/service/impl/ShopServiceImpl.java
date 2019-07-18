package com.xcy.service.impl;

import com.xcy.mapper.ShopMapper;
import com.xcy.pojo.ShopSome;
import com.xcy.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    ShopMapper shopMapper;

    @Override
    public List<ShopSome> selectShopImg() {

        return shopMapper.selectShopImg();
    }
}
