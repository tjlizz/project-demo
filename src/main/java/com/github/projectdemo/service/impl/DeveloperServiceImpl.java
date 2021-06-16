package com.github.projectdemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.projectdemo.entity.DeveloperDO;
import com.github.projectdemo.mapper.DeveloperMapper;
import com.github.projectdemo.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lzz
 * @create 2021-06-15 17:31
 */
@Service
public class DeveloperServiceImpl implements DeveloperService {

    @Autowired
    private DeveloperMapper developerMapper;

    @Override
    public List<DeveloperDO> getList() {
        return developerMapper.selectList(new QueryWrapper<>());
    }
}
