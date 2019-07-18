package com.xcy.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/goods")
public class GoodsController {


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

}
