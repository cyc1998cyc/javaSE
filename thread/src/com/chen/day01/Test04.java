package com.chen.day01;

/**
 * interurpt()会中断线程的wait()方法
 */
public class Test04 {
    public static void main(String[] args) throws InterruptedException {

        subThread t = new subThread();
        t.start();

        Thread.sleep(2000);

        t.interrupt();

    }

    private static final Object OBJECT = new Object();

    static class subThread extends Thread{
        @Override
        public void run() {
            synchronized (OBJECT){
                try {
                    System.out.println("begin wait...");

                    OBJECT.wait();

                    System.out.println("end wait");
                } catch (InterruptedException e) {
                    System.out.println("wait 等待被中断了");
                }

            }
        }
    }
}
