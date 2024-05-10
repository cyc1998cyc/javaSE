package com.chen.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "nacos-client-b")
@RequestMapping("/btest")
public interface BTestFeign {

    @GetMapping("btest")
    String getInfo();
}

