package com.xcy.mapper;

import com.xcy.pojo.Identify;
import com.xcy.pojo.SearchHistory;

import java.util.List;

public interface UserMapper {
    List<SearchHistory> getUserSearchHistory(int id);

    int getDeleteSearchHistory(int id);

    List<Identify> selectIdentify();
}
