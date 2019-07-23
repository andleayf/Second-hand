package com.xcy.service;

import com.xcy.pojo.Cart;

import java.util.List;

public interface CartService {
    List<Cart> selectCartByUserId(int userId);
}
