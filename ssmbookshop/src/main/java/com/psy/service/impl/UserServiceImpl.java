package com.psy.service.impl;

import com.psy.model.User;
import com.psy.service.IUserService;

import java.util.Map;

public class UserServiceImpl implements IUserService {
    @Override
    public int deleteByPrimaryKey(Long userId) {
        return 0;
    }

    @Override
    public int insert(User record) {
        return 0;
    }

    @Override
    public int insertSelective(User record) {
        return 0;
    }

    @Override
    public User selectByPrimaryKey(Long userId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return 0;
    }

    @Override
    public Map<String, Object> login(User user) {
        return null;
    }
}
