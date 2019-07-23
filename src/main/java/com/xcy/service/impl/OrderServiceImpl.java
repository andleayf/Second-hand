package com.xcy.service.impl;

import com.xcy.mapper.OrderMapper;
import com.xcy.pojo.Order;
import com.xcy.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;
    @Override
    public List<Order> selectOrderById(int orderId,int status) {
        return orderMapper.selectOrderById(orderId,status);

    }
}
