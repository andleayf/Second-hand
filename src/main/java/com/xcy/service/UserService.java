package com.xcy.service;

import com.xcy.pojo.Identify;
import com.xcy.pojo.Result;
import com.xcy.pojo.SearchHistory;


import java.util.List;

public interface UserService {

    List<SearchHistory> getUserSearchHistory(int id);

    int deleteSearchHistory(int id);

    List<Identify> selectIdentify();
}
