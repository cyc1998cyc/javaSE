package com.chen.controller;

import com.chen.domain.Goods;
import com.chen.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/jiansheng")
    public String Hello(){

        Goods goods = goodsService.selectByPrimaryKey(1);
        System.out.println(goods);
        return "chenyuchao";
    }
}
