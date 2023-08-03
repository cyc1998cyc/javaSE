package com.chen.day01;

public class Test03 {
    static ThreadLocal threadLocal = new ThreadLocal();

    static class SubThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                threadLocal.set(Thread.currentThread().getName()+"->"+i);
                System.out.println(threadLocal.get());
            }
        }
    }


    public static void main(String[] args) {

    }
}
