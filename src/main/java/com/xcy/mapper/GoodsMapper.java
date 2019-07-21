package com.xcy.mapper;

import com.xcy.pojo.Goods;

import java.util.List;

public interface GoodsMapper {

    List<Goods> getLatestGoodsList();
}
