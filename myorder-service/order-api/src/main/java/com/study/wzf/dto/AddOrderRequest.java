package com.study.wzf.dto;

import java.util.Date;

/**
 * @author HERO
 * @date 2020/12/22
 * @project_name myorder-service
 */
public class AddOrderRequest {

    private Integer userId;
    private String orderCode;
    private Date createTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
