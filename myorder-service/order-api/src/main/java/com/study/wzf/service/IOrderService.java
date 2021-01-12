package com.study.wzf.service;

import com.study.wzf.dto.AddOrderRequest;
import com.study.wzf.dto.AddOrderResponse;
import com.study.wzf.dto.QueryOrderRequest;
import com.study.wzf.dto.QueryOrderResponse;

/**
 * @author HERO
 * @date 2020/12/16
 * @project_name myorder-service
 */
public interface IOrderService {

    AddOrderResponse addUser(AddOrderRequest request);
    QueryOrderResponse queryUser(QueryOrderRequest request);
}
