package com.chen.controller;

import com.chen.feign.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RefreshScope
public class TestController {

    @Value("${hero.name}")
    private String name;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private TestFeign testFeign;

    @GetMapping("/test")
    public String test(){
        List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
        System.out.println(instances);

        System.out.println(testFeign.info());
        return "OK";
    }

    @GetMapping("/test2")
    public String test2(){
        System.out.println(name);
        return name;
    }
}
