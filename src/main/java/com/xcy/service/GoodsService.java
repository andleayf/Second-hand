package com.xcy.service;

import com.xcy.pojo.Goods;
import com.xcy.pojo.GoodsType;

import java.util.List;

public interface GoodsService {

    /**
     * 获取最新上架的商品信息
     * @return
     */
    List<Goods> getLatestGoodsList();

    List<GoodsType> getHotGoodsType();

    List<Goods> getGoodsByGoodsId(int goodsId);
}
