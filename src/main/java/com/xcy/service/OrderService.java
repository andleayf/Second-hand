package com.xcy.service;

import com.xcy.pojo.Order;

import java.util.List;

public interface OrderService {
    List<Order> selectOrderById(int orderId);
}
