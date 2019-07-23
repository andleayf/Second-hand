package com.xcy.controller;

import com.xcy.pojo.User;
import com.xcy.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;
    @RequestMapping("/getUserHeadImgById")
    @ResponseBody
    @ApiOperation(value = "该方法通过用户id获取用户的头像")
    public User getUserHeadImgById(int id){
        return userService.getUserHeadImgById(id);
    }
}
