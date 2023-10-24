package com.chen.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chen.entity.Goods;
import com.chen.entity.User;
import com.chen.service.GoodsService;
import com.chen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private UserService userService;

    @Autowired
    private ThreadPoolExecutor threadPoolExecutor;

    @Autowired
    private GoodsService goodsService;

    private AtomicInteger pageNo = new AtomicInteger(0);
    private AtomicInteger pageNo2 = new AtomicInteger(0);

    @RequestMapping("/getPageUser")
    public Page<User> getPageUser(){
        Page<User> userPage = new Page<>(1,4);
        return userService.findByPage(userPage);

    }

    @RequestMapping("/testThreadPool")
    public String testThreadPool(){

        ArrayList<CompletableFuture<Integer>> completableFutures = new ArrayList<>();

        while (true){
            pageNo2.getAndAdd(1);
            Page<User> userPage = new Page<>(pageNo2.get(), 20);
            Page<User> byPage = userService.findByPage(userPage);
            if (byPage.getRecords() == null){
                break;
            }
            CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
                byPage.getRecords().forEach(user -> {
                    System.out.println(user.getUserId());
                });
                return 1;
            }, threadPoolExecutor);
            completableFutures.add(completableFuture);

            for (CompletableFuture<Integer> future : completableFutures) {
                try {
                    future.get();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        }









//        while (true){
//            i++;
//            if (i == 100){
//                break;
//            }
//
//            int finalI = i;
//            CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
//                System.out.println(finalI);
//                int j = 9/0;
//
//                return 1;
//            }, threadPoolExecutor);
//            completableFutures.add(completableFuture);
//
//            for (CompletableFuture<Integer> future : completableFutures) {
//                try {
//                    future.get();
//                } catch (Exception e) {
//
//
//                }
//            }
//
//
//        }

        return "success";


    }

    @RequestMapping("/batchInsert")
    public String batchInsertByThread(){
        userService.batchInsertByThread();
        return "success";
    }

    @RequestMapping("/testMysql")
    public String testMySql(){


        try {
            Goods one = goodsService.getOne(null);
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


        return "success";
    }

    @RequestMapping("/addData")
    public String addData(){
        while (pageNo.get()<=1000){
            System.out.println("当前页数:" + pageNo);
            pageNo.addAndGet(1);
            CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
                ArrayList<User> users = new ArrayList<>();
                for (int i = 1; i <= 200; i++) {
                    User user = new User();
                    user.setUserId(pageNo.get()*200+i);
                    user.setUserName("test"+i);
                    user.setSalary(new BigDecimal(i));
                    user.setBirth(LocalDateTime.now());
                    users.add(user);
                }
                userService.batchInsert(users);
                return 1;
            }, threadPoolExecutor);

        }
        return "success";
    }



}



