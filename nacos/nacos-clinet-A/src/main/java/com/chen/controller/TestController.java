package com.chen.controller;


import com.chen.feign.BTestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private BTestFeign bTestFeign;

    @RequestMapping("/test")
    public String test() {
        List<ServiceInstance> instances = discoveryClient.getInstances("nacos-client-b");
        System.out.println(instances);
        return "test";
    }

    @RequestMapping("/test02")
    public String test02() {
        return bTestFeign.getInfo();
    }

}
