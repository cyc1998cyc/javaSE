package com.chen.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chen.entity.User;
import java.util.List;
import com.chen.mapper.UserMapper;
@Service
public class UserService extends ServiceImpl<UserMapper, User> {

    
    public int updateBatch(List<User> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int batchInsert(List<User> list) {
        return baseMapper.batchInsert(list);
    }

    public int addUser(User user) {
        int insert = baseMapper.insert(user);
        return insert;
    }

    public List<User> selectAll() {
        return baseMapper.selectList(null);
    }

    public List<User> selectByNum(int num) {

        LambdaQueryWrapper<User> userLambdaQueryWrapper = new LambdaQueryWrapper<>();
        userLambdaQueryWrapper.orderByDesc(User::getBirth);
        userLambdaQueryWrapper.last("limit "+num);
        return baseMapper.selectList(userLambdaQueryWrapper );
    }
}
