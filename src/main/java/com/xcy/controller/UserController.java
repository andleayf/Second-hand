package com.xcy.controller;

import com.xcy.pojo.Address;
import com.xcy.pojo.Result;
import com.xcy.pojo.SearchHistory;
import com.xcy.service.AddressService;
import com.xcy.service.UserService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
@CrossOrigin//允许跨域访问
@ApiModel("关于用户的接口")
public class UserController {

//    @Autowired
//    UserService userService;

    @Autowired
    AddressService addressService;

    @Autowired
    UserService userService;

    @RequestMapping(value = "/address",method = RequestMethod.GET)
    @ApiOperation(value="获取该用户的所有地址")
    @ResponseBody
    public List<Address> userAddress(@ApiParam(name = "id",value = "用户Id",required = true) @RequestParam(name = "id",required = true)int id){
       List<Address> addressList =addressService.selectUserAddress(id);
        //String u= JsonUtils.objectToJson(addressList);
        return addressList;
    }

    @RequestMapping(value = "/getSearchHistory",method = RequestMethod.GET)
    @ApiOperation("获取用户的搜索记录，按照搜索次数排列，显示前五条,如果用户未登录，不调用此接口")
    @ResponseBody
    public List<SearchHistory> getUserSearchHistory(@ApiParam(name = "id",value = "用户名",required = true) @RequestParam() int id){
        return  userService.getUserSearchHistory(id);
    }

    @RequestMapping("/deleteSearchHisotry")
    @ApiOperation("根据用户的id删除用户的搜索历史")
    @ResponseBody
    public Result<Map<String,Integer>> deleteSearchHistory(@ApiParam(name = "id",value = "用户id") @RequestParam() int id){
        int rs = userService.deleteSearchHistory(id);
        Result<Map<String,Integer>> result = new Result<Map<String,Integer>>();
        result.setOperationType("清空搜索历史");
        if( rs > 0){
            Map<String,Integer> delete = new HashMap<String,Integer>();
            delete.put("删除数量",rs);
            result.setStatus(1);
            result.setObject(delete);
        }else {
            result.setStatus(0);
        }
        return  result;
    }
}
