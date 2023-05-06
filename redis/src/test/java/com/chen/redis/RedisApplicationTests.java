package com.chen.redis;

import ch.qos.logback.core.util.TimeUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@SpringBootTest
class RedisApplicationTests {

    @Resource
    RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        //插入一个值
        redisTemplate.opsForValue().set("cyc", "chenyuchao");

        //指定缓存失效时间为100秒
        redisTemplate.expire("cyc", 100L, TimeUnit.SECONDS);

        //根据key获取过期时间
        System.out.println(redisTemplate.getExpire("cyc"));

        //删除缓存
        System.out.println(redisTemplate.delete("cyc"));

        //向redis里存入数据
        redisTemplate.opsForValue().set("cyc", "123123");

        //在原有的值基础上新增字符串到末尾
        redisTemplate.opsForValue().append("cyc","123123312312312");

        //截取key键对应值得字符串，从开始下标位置开始到结束下标的位置(包含结束下标)的字符串。


        System.out.println(redisTemplate.opsForValue().get("cyc"));


    }

}
