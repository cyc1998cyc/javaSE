package com.chen.day01;

public class Test02 {
    public static void main(String[] args) throws InterruptedException {
        String lock = "lock";

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("线程1开始启动");

                    //执行wait方法
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("wait方法执行结束");

                }
            }
        });


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock){
                    System.out.println("线程2开始启动");
                    lock.notify();
                    System.out.println("线程2放开锁");
                }

            }
        });


        thread.start();

        Thread.sleep(3000);

        thread1.start();
    }
}
