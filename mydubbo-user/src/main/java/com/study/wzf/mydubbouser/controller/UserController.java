package com.study.wzf.mydubbouser.controller;

import com.study.wzf.dto.AddUserRequest;
import com.study.wzf.dto.AddUserResponse;
import com.study.wzf.service.IUserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HERO
 * @date 2020/12/16
 * @project_name mydubbo-user
 */
@RestController
public class UserController {

    @Reference
    private IUserService userService;

    @GetMapping("/addUser")
    public void addUser(){
        AddUserRequest addUserRequest = new AddUserRequest();

        AddUserResponse addUserResponse = userService.addUser(addUserRequest);
        System.out.println(addUserResponse);
    }

}
