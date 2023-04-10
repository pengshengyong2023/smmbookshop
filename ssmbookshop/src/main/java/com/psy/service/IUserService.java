package com.psy.service;

import com.psy.model.User;

import java.util.Map;

public interface IUserService {
    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    Map<String,Object> login(User user);
}
