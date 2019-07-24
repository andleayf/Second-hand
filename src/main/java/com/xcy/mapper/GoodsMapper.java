package com.xcy.mapper;

import com.xcy.pojo.Goods;
import com.xcy.pojo.GoodsType;

import java.util.List;

public interface GoodsMapper {

    List<Goods> getLatestGoodsList();

    List<GoodsType> getHotGoodsType();

    List<Goods> getGoodsByGoodsId(int goodsId);
}
