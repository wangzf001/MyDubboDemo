package com.study.wzf.mydubboorder.controller;

import com.study.wzf.dto.AddOrderRequest;
import com.study.wzf.service.IOrderService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HERO
 * @date 2020/12/16
 * @project_name mydubbo-order
 */
@RestController
public class OrderController {

    @Reference(timeout = 3000)
    private IOrderService iOrderService;

    @PostMapping("/submitOrder")
    public void submitOrder(){
        AddOrderRequest request = new AddOrderRequest();
        request.setOrderCode("606606");
        iOrderService.addUser(request);
    }



}
