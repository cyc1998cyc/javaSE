package com.chen.redis.service.impl;

import com.chen.redis.entities.Emp;
import com.chen.redis.mapper.EmpMapper;
import com.chen.redis.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class EmpServiceImpl implements EmpService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Resource
    private EmpMapper empMapper;


    @Override
    public void add(Emp emp) {
        empMapper.insert(emp);
    }

    @Override
    public Object getEmpById(Integer id) {
        String key = "user:"+id;

        //先从缓存获取，如果有则直接返回
        // 如果无，则查询数据库，并将数据存到缓存
        Object userObj = redisTemplate.opsForValue().get(key);
        if (userObj == null){
            synchronized (this.getClass()){
                System.out.println("查询同步代码块");
                userObj = redisTemplate.opsForValue().get(key);
                if (userObj == null){
                    System.out.println("查询数据库");
                    Emp emp = empMapper.selectByPrimaryKey(id);
                    redisTemplate.opsForValue().set(key,emp);
                    return emp;
                }else{
                    System.out.println("查询缓存");
                    return userObj;
                }

            }
        }else{
            System.out.println("查询缓存");
            return userObj;

        }

    }
}
