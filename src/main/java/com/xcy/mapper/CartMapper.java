package com.xcy.mapper;

import com.xcy.pojo.Cart;

import java.util.List;

public interface CartMapper {
    List<Cart> selectCartByUserId(int userId);
}
