package com.chen.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "order-service")
@RequestMapping("/order")
public interface OrderFeign {
    @RequestMapping("/getOrder")
    public String getOrder();



}
