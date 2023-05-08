package com.chen.redis;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RedisController {
    @Resource
    private RedisTemplate redisTemplate;


    @GetMapping("/redis/get/{key}")
    public Object get(@PathVariable("key") String key) {
        Object key1 = redisTemplate.opsForValue().get("key");
        return key1;
    }

    @PostMapping("/redis/set/{key}/{value}")
    public Object set(@PathVariable("key") String key,
                      @PathVariable("value") String value) {
        redisTemplate.opsForValue().set(key,value);
        return "成功";
    }
}
