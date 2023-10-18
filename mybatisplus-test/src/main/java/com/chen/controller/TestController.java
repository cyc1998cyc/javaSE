package com.chen.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chen.entity.User;
import com.chen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private UserService userService;

    @Autowired
    private ThreadPoolExecutor threadPoolExecutor;

    @RequestMapping("/getPageUser")
    public Page<User> getPageUser(){
        Page<User> userPage = new Page<>(1,4);
        return userService.findByPage(userPage);

    }

    @RequestMapping("/testThreadPool")
    public String testThreadPool(){

        ArrayList<CompletableFuture<Integer>> completableFutures = new ArrayList<>();

        for (int i = 0; i < 100; i++) {

            CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
                return 1;
            }, threadPoolExecutor);
            completableFutures.add(completableFuture);
        }

        for (CompletableFuture<Integer> m : completableFutures) {
            try {
                Integer integer = m.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }


        return "success";
    }

    @RequestMapping("/batchInsert")
    public String batchInsertByThread(){
        userService.batchInsertByThread();
        return "success";
    }


}
