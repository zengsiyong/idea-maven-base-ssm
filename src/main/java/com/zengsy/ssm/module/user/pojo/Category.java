package com.zengsy.ssm.module.user.pojo;

import java.util.List;

/**
 * Created by zengsy on 2017-10-09.
 * 这是一个摄影分类/约拍套餐分类表
 * Category除了基本的属性id和name，还提供了一对多关系的products
 * 一个分类会对应多行产品，而一行产品里又有多个产品记录。
 * 为了实现界面上的这个功能，为Category类设计了
 * List<List<Product>> productsByRow
 * 这样一个集合属性
 *
 */
public class Category {
    private String name;
    private int id;
    List<Product> products;
    List<List<Product>> productsByRow;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<List<Product>> getProductsByRow() {
        return productsByRow;
    }

    public void setProductsByRow(List<List<Product>> productsByRow) {
        this.productsByRow = productsByRow;
    }

    // 重写toString方法，当打印Category对象的时候，会打印其名称。
    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '}';
    }
}
