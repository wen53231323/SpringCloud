package com.wen.springcloud.controller;


import com.wen.springcloud.clients.UserClient;
import com.wen.springcloud.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallUser {
    @Autowired
    private UserClient userClient;

    @GetMapping("/userClient/{id}")
    public Result getUserById(@PathVariable("id") Long id) {
        Result userById = userClient.getUserById(id);
        return userById;
    }
}
