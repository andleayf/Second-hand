package com.xcy.service.impl;

import com.xcy.mapper.UserMapper;
import com.xcy.pojo.Identify;
import com.xcy.pojo.Result;
import com.xcy.pojo.SearchHistory;
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
    public List<Identify> selectIdentify() {
        return userMapper.selectIdentify();
    }
}
