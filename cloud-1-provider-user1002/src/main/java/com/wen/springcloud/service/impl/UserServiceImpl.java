package com.wen.springcloud.service.impl;

import com.wen.springcloud.entity.Result;
import com.wen.springcloud.entity.User;
import com.wen.springcloud.mapper.UserMapper;
import com.wen.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    // @Value注解用于读取配置文件
    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private UserMapper userMapper;

    @Override
    public Result getUserById(Long id) {
        User userById = userMapper.getUserById(id);
        if (userById != null) {
            return new Result(200, "获取成功" + serverPort, userById);
        } else {
            return new Result(444, "获取失败");
        }
    }
}

