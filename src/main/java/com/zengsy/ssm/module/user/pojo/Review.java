package com.zengsy.ssm.module.user.pojo;

import java.util.Date;

/**
 * Created by xlc on 2017-10-09.
 * 存放评论信息，如购买的cosplay外拍套餐效果很好
 * 基本属性的getter、setter
 * 与User的多对一关系
 * 与Product 的多对一关系
 */
public class Review {
    private String content;
    private Date createDate;
    private User user;
    private Product product;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Date getCreateDate() {
        return createDate;
    }
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
}