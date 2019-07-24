package com.xcy.mapper;

import com.xcy.pojo.Identify;
import com.xcy.pojo.SearchHistory;
import com.xcy.pojo.User;

import java.util.List;

public interface UserMapper {
    List<SearchHistory> getUserSearchHistory(int id);

    int getDeleteSearchHistory(int id);

    int selectUserPhone(String phone);

    int userAdd(User user);

    int userLogin(User user);

    int userChangePassword(User user);

    int selectUserCode(User user);

    List<Identify> selectIdentify();

    User getUserHeadImg(int id);
}
