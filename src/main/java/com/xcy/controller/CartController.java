package com.xcy.controller;

import com.xcy.pojo.Cart;
import com.xcy.service.CartService;
import com.xcy.utils.JsonUtils;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/cart")
@CrossOrigin//允许跨域访问
public class CartController {
    @Autowired
    CartService cartService;

    @RequestMapping(value = "/selectCartByUserId", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    @ApiOperation(value = "该方法的作用利用userId查我的购物车")
    public String selectCartByUserId(int userId) {
        List<Cart> cartList = cartService.selectCartByUserId(userId);
        System.out.println(cartList);
        String orderJson = JsonUtils.objectToJson(cartList);
        return orderJson;
    }
}