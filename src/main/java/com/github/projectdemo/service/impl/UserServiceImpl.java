package com.github.projectdemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.projectdemo.entity.UserDO;
import com.github.projectdemo.mapper.UserMapper;
import com.github.projectdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lzz
 * @create 2021-06-15 17:31
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDO> getList() {
        return userMapper.selectList(new QueryWrapper<>());
    }
}
