package com.xcy.service.impl;

import com.xcy.mapper.CartMapper;
import com.xcy.pojo.Cart;
import com.xcy.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CartServiceImpl implements CartService {
    @Autowired
    CartMapper cartMapper;
    @Override
    public List<Cart> selectCartByUserId(int userId) {
        return cartMapper.selectCartByUserId(userId);
    }
}
