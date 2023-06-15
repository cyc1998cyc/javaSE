package com.chen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QpsTestController {

    @GetMapping("test2")
    public String qpsTest2(){

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test2");
        return "ok";
    }

    @GetMapping("test")
    public String qpsTest(){

        System.out.println("test");
        return "ok";
    }
}
