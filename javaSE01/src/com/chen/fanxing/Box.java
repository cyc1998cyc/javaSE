package com.chen.fanxing;

/**
 * @author cyc
 * @createTime 2023/4/20 22:28
 * @description
 */

public class Box <E>{
    //存放数据
    private E s;

    public Box(E s) {
        this.s = s;
    }

    public Box() {
    }

    public E getS() {
        return s;
    }

    public void setS(E s) {
        this.s = s;
    }
}
