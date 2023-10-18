package com.chen.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chen.entity.User;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
public interface UserService extends IService<User>{


    int updateBatch(List<User> list);

    int batchInsert(List<User> list);

    Page<User> findByPage(Page<User> userPage);

    void batchInsertByThread();
}
