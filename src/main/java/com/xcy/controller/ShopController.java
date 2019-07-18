package com.xcy.controller;

import com.xcy.pojo.Shop;
import com.xcy.pojo.ShopSome;
import com.xcy.service.ShopService;
import com.xcy.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/shops")
@CrossOrigin//允许跨域访问
public class ShopController {

    @Autowired
    ShopService shopService;


    @RequestMapping("/slideShow")
    @ResponseBody
    public String slideShow(){
        List<ShopSome> shopSomes = shopService.selectShopImg();
        String s = JsonUtils.objectToJson(shopSomes);
        return s;
    }
}
