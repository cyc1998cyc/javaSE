package com.chen.dialimoshi.transction;

public class DaoTransction {
    public void before(){
        System.out.println("开启事务");
    }

    public void after(){
        System.out.println("关闭事务");
    }


}
