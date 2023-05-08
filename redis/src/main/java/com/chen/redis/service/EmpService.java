package com.chen.redis.service;

import com.chen.redis.entities.Emp;

public interface EmpService {
    public void add(Emp emp);

    public Object getEmpById(Integer id);
}
