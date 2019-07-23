package com.xcy.mapper;

import com.xcy.pojo.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    List<Order> selectOrderById(@Param("orderId") int orderId, @Param("status") int status);
}
