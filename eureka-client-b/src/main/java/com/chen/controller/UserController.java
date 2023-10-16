package com.chen.controller;

import com.chen.feign.OrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class UserController {

    @Autowired
    private OrderFeign orderFeign;

    @RequestMapping("/getUserOrder")
    public String getUserOrder(){
        System.out.println("调用order请求");
        String order = orderFeign.getOrder();
        return order;

    }

}
