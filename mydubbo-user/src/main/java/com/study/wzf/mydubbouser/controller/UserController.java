package com.study.wzf.mydubbouser.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
//import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import com.study.wzf.dto.AddUserRequest;
import com.study.wzf.dto.AddUserResponse;
import com.study.wzf.service.IUserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HERO
 * @date 2020/12/16
 * @project_name mydubbo-user
 */
//@NacosPropertySource(dataId = "example",autoRefreshed = true)
@RestController
//@RefreshScope
public class UserController {

//    @NacosValue(value = "${info:Local Hello Nacos}",autoRefreshed = true)
    @Value("${info:Local Hello Nacos}")
    private String info;

    @Reference
    private IUserService userService;

    @GetMapping("/addUser")
    public void addUser(){
        AddUserRequest addUserRequest = new AddUserRequest();

        AddUserResponse addUserResponse = userService.addUser(addUserRequest);
        System.out.println(info);
        System.out.println(addUserResponse);
    }

}
