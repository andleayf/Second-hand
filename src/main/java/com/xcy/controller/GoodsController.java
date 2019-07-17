package com.xcy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    @RequestMapping("/goMainPage")
    public String goMainPage(){
        System.out.println("我是第一次进来");
        return "html/goods/main";
    }
}
