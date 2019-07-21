package com.xcy.controller;

import com.xcy.pojo.Goods;
import com.xcy.pojo.GoodsType;
import com.xcy.service.GoodsService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/goods")
@CrossOrigin
@ApiOperation("有关商城商品的接口")
public class GoodsController {

    @Autowired
    GoodsService goodsService;

    @RequestMapping(value = "/goMainPage",method = RequestMethod.GET)
    public String goMainPage(){
        return "html/goods/main";
    }

    @RequestMapping(value="/test",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation("用于测试，没有实际意义")
    public String  testInterface(){
        return "test";
    }


    /**
     * 返回最新的上架的商品列表，用于主页面轮播图的展示
     * @return
     */
    @RequestMapping(value = "/getLatestGoodsList",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation("获取最新上架的商品的id和图片，用于商城主页的轮播图")
    public List<Goods> getLatestGoodsList(){
       List<Goods> goodsList =  goodsService.getLatestGoodsList();
       return goodsList;
    }

    @RequestMapping("/getHotGoodsType")
    @ApiOperation("获取热门搜索，根据搜索次数排序，显示前五条")
    @ResponseBody
    public List<GoodsType> getHotGoodsType(){
        return goodsService.getHotGoodsType();
    }
}
