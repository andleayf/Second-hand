package com.xcy.mapper;

import com.xcy.pojo.Order;

import java.util.List;

public interface OrderMapper {
    List<Order> selectOrderById(int orderId);
}
