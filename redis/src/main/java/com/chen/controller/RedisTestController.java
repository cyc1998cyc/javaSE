package com.chen.controller;

import com.chen.controller.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisTestController {

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/test")
    public String test(){
        String name = (String) redisTemplate.opsForValue().get("name");
        return name;
    }

    @RequestMapping("/saveUser")
    public String saveUser(@RequestBody User user){
        redisTemplate.opsForValue().set("user2",user);
        return "success!";
    }

    @RequestMapping("/getUser/{key}")
    public User getUser(@PathVariable("key") String key){
        User user = (User)redisTemplate.opsForValue().get(key);
        return user;
    }

}
