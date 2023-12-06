package com.chen.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "user-service")
@RequestMapping("/bserver")
public interface TestFeign {
    @GetMapping("/test")
    public String info();
}
