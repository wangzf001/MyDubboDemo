package com.study.wzf.myuserprovider.service;

import com.study.wzf.dto.AddUserRequest;
import com.study.wzf.dto.AddUserResponse;
import com.study.wzf.service.IUserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author HERO
 * @date 2020/12/15
 * @project_name myuser-service
 */
@Service(cluster = "failover",retries = 3,loadbalance = "roundrobin")
public class UserServiceImpl implements IUserService {
    @Override
    public AddUserResponse addUser(AddUserRequest request) {
        return new AddUserResponse();
    }
}
