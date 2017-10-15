package com.zengsy.ssm.module.user.mapper;

import com.zengsy.ssm.module.user.pojo.Category;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//import java.util.List;

/**
 * Created by xlc on 2017-10-10.
 */
public interface CategoryMapper {

    // 增加Category的记录
    void add(String name);
    // 删除category的记录
    void delete(int id);
    // 更新category的记录
    void update(@Param("name") String categoryName, @Param("id") int categoryId);
    // 根据id查询获取对应的category;
    Category get(int id);
    // 获取总数
    int getTotal();
    // 查询所有
    //List<Category> list();
    // 分页查询,count为每页显示行数
    List<Category> list(@Param("startNum") int startNum, @Param("countNum") int countNum);

}
