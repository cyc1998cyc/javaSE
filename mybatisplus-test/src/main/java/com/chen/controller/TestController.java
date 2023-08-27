package com.chen.controller;

import com.chen.entity.User;
import com.chen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    UserService userService;

    @RequestMapping("/add")
    public String add(){
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setBirth(new Date());
        user.setUserName("chenyuchao");
        user.setPassword("1812244d");
        user.setPhoneNum("18551560669");

        userService.addUser(user);


        return "添加用户成功";
    }

    @RequestMapping("/outport")
    public List<User> outport(){
        int num = 2;

        return userService.selectByNum(num);


    }
}
