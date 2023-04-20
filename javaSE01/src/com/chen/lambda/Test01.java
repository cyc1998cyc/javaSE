package com.chen.lambda;

/**
 * @author cyc
 * @createTime 2023/4/12 22:48
 * @description
 */

public class Test01 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程启动1");
            }
        }).start();


        new Thread(() ->{
            System.out.println("线程2启动");
        }).start();



    }
}
