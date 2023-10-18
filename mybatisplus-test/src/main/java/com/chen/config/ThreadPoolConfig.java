package com.chen.config;

import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@Configuration
public class ThreadPoolConfig {

    private int cores = Runtime.getRuntime().availableProcessors();
    private int limitSize = 1000000;

    @Bean
    ThreadPoolExecutor threadPoolExecutor (){
        return new ThreadPoolExecutor(cores, cores * 2, 60, TimeUnit.SECONDS, new LinkedBlockingDeque<>(limitSize), new ThreadFactory() {
            final AtomicInteger count = new AtomicInteger(0);
            @Override
            public Thread newThread(@NotNull Runnable r) {
                System.out.println("------------------------");
                System.out.println(count.get());
                System.out.println("------------------------");
                return new Thread(r,"测试线程"+count.addAndGet(1));
            }
        },new ThreadPoolExecutor.AbortPolicy());

    }


}
