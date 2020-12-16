package com.study.wzf.service;

import com.study.wzf.dto.AddUserRequest;
import com.study.wzf.dto.AddUserResponse;

/**
 * @author HERO
 * @date 2020/12/15
 * @project_name myuser-service
 */
public interface IUserService {

    /**
     * 添加用户
     * @param request
     * @return
     */
    AddUserResponse addUser(AddUserRequest request);

}
