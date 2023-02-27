package com.wen.springcloud.controller;


import com.wen.springcloud.entity.Result;
import com.wen.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public Result getUserById(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }

}

