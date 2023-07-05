package com.chen.controller;

import com.chen.entity.User;
import com.chen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;

@RestController
@RequestMapping("/test")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    public String add(){
        User user = new User();
        user.setUserId(123);
        user.setBirth(new Date());
        user.setSalary(new BigDecimal(8756.2));
        user.setUserName("陈宇超");
        userService.insert(user);

        return"插入成功";
    }
}
