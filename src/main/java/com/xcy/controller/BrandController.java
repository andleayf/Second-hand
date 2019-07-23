package com.xcy.controller;

import com.xcy.pojo.Brand;
import com.xcy.service.BrandService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BrandController {

    @Autowired
    BrandService brandService;

    @RequestMapping("/getAllBrand")
    @ResponseBody
    @ApiOperation(value = "查询出所有品牌的名字")
    public List<Brand> selectAllBrand (){
        return brandService.selectAllBrand();
    }
}
