package com.chen.day01;

public class Mythread extends Thread{
    @Override
    public void run() {
        System.out.println("jiansheng");
        System.out.println(Thread.currentThread().getName());
    }

}
