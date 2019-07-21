package com.xcy.controller;

import com.xcy.pojo.Order;
import com.xcy.service.OrderService;
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
@RequestMapping("/order")
@CrossOrigin//允许跨域访问
public class OrderController {
    @Autowired
    OrderService orderService;
    @RequestMapping(value="/selectOrderById",method = RequestMethod.GET ,produces={"application/json;charset=UTF-8"})
    @ResponseBody
    @ApiOperation(value="该方法的作用利用id（orderStatus）查我的订单")
    public String selectOrderById(int orderId ){
        List<Order> list=orderService.selectOrderById(orderId);
        System.out.println(list);
        String orderJson = JsonUtils.objectToJson(list);
        return orderJson;
    }
}
