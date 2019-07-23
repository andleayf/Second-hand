package com.xcy.service.impl;

import com.xcy.mapper.GoodsMapper;
import com.xcy.pojo.Goods;
import com.xcy.pojo.GoodsType;
import com.xcy.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    GoodsMapper goodsMapper;

    @Override
    public List<Goods> getLatestGoodsList() {
        return goodsMapper.getLatestGoodsList();
    }

    @Override
    public List<GoodsType> getHotGoodsType() {
        return goodsMapper.getHotGoodsType();
    }
}
