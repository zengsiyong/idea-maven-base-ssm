package com.zengsy.ssm.module.user.service;

import com.zengsy.ssm.module.user.pojo.Category;

import java.util.List;

/**
 * Created by xlc on 2017-10-10.
 */
public interface TestService {
    void addCategory(Category categoryBean);
    int getCategoryTotal();
    Category getCategoryById(int id);
    void updateCategory(Category categoryBean);
    void delete(int id);
    List<Category> listCategoryByLimit(int startNum, int countNum);
}
