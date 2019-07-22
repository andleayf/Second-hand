package com.xcy.service.impl;

import com.xcy.mapper.UserMapper;
import com.xcy.pojo.Result;
import com.xcy.pojo.SearchHistory;
import com.xcy.pojo.User;
import com.xcy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public List<SearchHistory> getUserSearchHistory(int id) {
        return userMapper.getUserSearchHistory(id);
    }

    @Override
    public int deleteSearchHistory(int id) {
        return userMapper.getDeleteSearchHistory(id);
    }

    @Override
    public int selectUserPhone(String phone) {
        return userMapper.selectUserPhone(phone);
    }

    @Override
    public int userAdd(User user) {
        return userMapper.userAdd(user);
    }

    @Override
    public int userLogin(User user) {
        return userMapper.userLogin(user);
    }

    @Override
    public int userChangePassword(User user) {
        return userMapper.userChangePassword(user);
    }

    @Override
    public int selectUserCode(User user) {
        return userMapper.selectUserCode(user);
    }
}
