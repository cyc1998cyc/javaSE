package com.chen.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chen.entity.User;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    List<User> selectTest();
}