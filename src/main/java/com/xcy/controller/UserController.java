package com.xcy.controller;

import com.xcy.pojo.Address;
import com.xcy.pojo.Result;
import com.xcy.pojo.SearchHistory;
import com.xcy.pojo.User;
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

    @RequestMapping(value = "/deleteSearchHisotry",method = RequestMethod.GET)
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

    @RequestMapping(value = "/userPhoneExists",method = RequestMethod.POST)
    @ApiOperation("判断该手机号数据库中是否存在，存在返回字符串exist，不存在返回字符串notExist")
    @ResponseBody
    public String userPhoneExists(@ApiParam("用户输入的手机号") @RequestParam(name = "phone",required = true) String phone){
        System.out.println("phone:"+phone);
        int i = userService.selectUserPhone(phone);
        System.out.println(i);
        return i == 1? "exist":"notExist";
    }

    @RequestMapping(value = "/userAdd",method = RequestMethod.POST)
    @ApiOperation("用户注册")
    @ResponseBody
    public String userAdd(@ApiParam("用户输入的手机号userPhone") @RequestParam(name = "userPhone",required = true) String userPhone,
                          @ApiParam("用户输入的密码userPassword") @RequestParam(name = "userPassword",required = true) String userPassword,
                          @ApiParam("用户输入的验证码userCode") @RequestParam(name = "userCode",required = true) String userCode){

        User user = new User();
        user.setUserPhone(userPhone);
        user.setUserPassword(userPassword);
        user.setUserCode(userCode);
        int i = userService.userAdd(user);

        return i == 1? "addSuccess":"addFail";
    }

    @RequestMapping(value = "/userLogin",method = RequestMethod.POST)
    @ApiOperation("用户登录，登录成功返回字符串loginSuccess,登录失败返回字符串loginFail")
    @ResponseBody
    public String userLogin(@ApiParam("用户输入的手机号userPhone") @RequestParam(name = "userPhone",required = true) String userPhone,
                            @ApiParam("用户输入的密码userPassword") @RequestParam(name = "userPassword",required = true)String userPassword){
        User user = new User();
        user.setUserPhone(userPhone);
        user.setUserPassword(userPassword);
        int i = userService.userLogin(user);

        return i == 1? "loginSuccess":"loginFail";
    }

    @RequestMapping(value = "/userChangePassword",method = RequestMethod.POST)
    @ApiOperation("找回用户密码,修改成功返回字符串changeSuccess,修改失败返回字符串changeFail")
    @ResponseBody
    public String userChangePassword(@ApiParam("用户输入的手机号userPhone") @RequestParam(name = "userPhone",required = true) String userPhone,
                                     @ApiParam("用户输入的新修改的密码，userPassword") @RequestParam(name = "userPassword",required = true) String userPassword){
        User user = new User();
        user.setUserPassword(userPassword);
        user.setUserPhone(userPhone);
        int i = userService.userChangePassword(user);
        return i == 1? "changeSuccess":"changeFail";
    }

    @RequestMapping(value = "/userCodeCheck",method = RequestMethod.POST)
    @ApiOperation("检验用户验证码，如果验证码正确，返回字符串trueCode，如果不正确，返回字符串falseCode")
    @ResponseBody
    public String userCodeCheck(@ApiParam("用户输入的手机号userPhone") @RequestParam(name = "userPhone",required = true) String userPhone,
                                @ApiParam("用户输入的验证码userCode") @RequestParam(name = "userCode",required = true) String userCode){
        User user = new User();
        user.setUserPhone(userPhone);
        user.setUserCode(userCode);
        int i = userService.selectUserCode(user);
        return i == 1? "trueCode":"falseCode";
    }
}
