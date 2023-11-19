package com.chen;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test03 {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 2);

        for (int i = 0; i < 10000; i++) {
            CompletableFuture.supplyAsync(()->{
                System.out.println(Thread.currentThread().getName() + ":test");
                return Thread.currentThread().getName()+":test";
            },threadPool);
        }


        threadPool.shutdown();
    }
}
