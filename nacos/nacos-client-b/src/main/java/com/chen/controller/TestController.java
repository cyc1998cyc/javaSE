package com.chen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/btest")
public class TestController {
    int i = 0;

    @GetMapping("btest")
    public String info() {
        System.out.println(i++);
        return "OK";
    }
}
