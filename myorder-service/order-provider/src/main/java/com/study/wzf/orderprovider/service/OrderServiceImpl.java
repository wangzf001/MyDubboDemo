package com.study.wzf.orderprovider.service;

import com.study.wzf.dto.AddOrderRequest;
import com.study.wzf.dto.AddOrderResponse;
import com.study.wzf.dto.QueryOrderRequest;
import com.study.wzf.dto.QueryOrderResponse;
import com.study.wzf.service.IOrderService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author HERO
 * @date 2020/12/16
 * @project_name myorder-service
 */
@Service(cluster = "failover",retries = 3,loadbalance = "roundrobin")
public class OrderServiceImpl implements IOrderService {

    @Override
    public AddOrderResponse addUser(AddOrderRequest request) {
        System.out.println("订单号为：" + request.getOrderCode());
        return new AddOrderResponse();
    }

    @Override
    public QueryOrderResponse queryUser(QueryOrderRequest request) {
        System.out.println("查询订单：" + request.getOrderCode());
        return new QueryOrderResponse();
    }
}
