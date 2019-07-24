package com.xcy.controller;

import com.xcy.pojo.Package;
import com.xcy.service.PackageService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PackageController {

    @Autowired
    PackageService packageService;

    @RequestMapping("/getAllPackage")
    @ResponseBody
    @ApiOperation(value = "获取所有package")
    public List<Package> getAllPackage(){
        return packageService.getAllPackage();
    }
}
