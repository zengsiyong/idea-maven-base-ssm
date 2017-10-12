package com.zengsy.ssm.module.user.service.impl;

import com.zengsy.ssm.module.user.mapper.CategoryMapper;
import com.zengsy.ssm.module.user.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by xlc on 2017-10-10.
 */
@Service
public class TestServiceImpl implements TestService {
    @Resource
    private CategoryMapper categoryMapper;
    @Override
    public void addCategory(String name) {
        categoryMapper.add(name);
    }
}
