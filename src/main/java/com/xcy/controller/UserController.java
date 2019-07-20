package com.xcy.controller;

import com.xcy.pojo.Address;
import com.xcy.service.AddressService;
import com.xcy.service.UserService;
import com.xcy.utils.JsonUtils;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
@CrossOrigin//允许跨域访问
public class UserController {

//    @Autowired
//    UserService userService;

    @Autowired
    AddressService addressService;

    @RequestMapping(value = "/address",method = RequestMethod.GET)
    @ApiOperation(value="获取该用户的所有地址")
    @ResponseBody
    public List<Address> userAddress(@ApiParam(name = "id",value = "用户Id",required = true) @RequestParam(name = "id",required = true)int id){
       List<Address> addressList =addressService.selectUserAddress(id);
        //String u= JsonUtils.objectToJson(addressList);
        return addressList;
    }
}
