package com.zengsy.ssm.module.user.service.impl;

import com.zengsy.ssm.module.user.mapper.CategoryMapper;
import com.zengsy.ssm.module.user.pojo.Category;
import com.zengsy.ssm.module.user.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xlc on 2017-10-10.
 */
@Service
public class TestServiceImpl implements TestService {
    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public void addCategory(Category categoryBean) {
        String name = categoryBean.getName();
        categoryMapper.add(name);
    }

    @Override
    public int getCategoryTotal() {
        int i = categoryMapper.getTotal();
        return i;
    }

    @Override
    public Category getCategoryById(int id) {
        Category category = categoryMapper.get(id);
        return category;
    }

    @Override
    public void updateCategory(Category categoryBean) {
        String categoryName = categoryBean.getName();
        int categoryId = categoryBean.getId();
        categoryMapper.update(categoryName,categoryId);
    }

    @Override
    public void delete(int id) {
        categoryMapper.delete(id);
    }

    @Override
    public List<Category> listCategoryByLimit(int startNum, int countNum) {
        return categoryMapper.list(startNum, countNum);
    }


}
