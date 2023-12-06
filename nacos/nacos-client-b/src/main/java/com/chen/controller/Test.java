package com.chen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bserver")
public class Test {
    @GetMapping("/test")
    public String info(){
        return "bserver";
    }
}
