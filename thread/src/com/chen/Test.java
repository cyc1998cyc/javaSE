package com.chen;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        FutureTask<String> futureTask = new FutureTask<>(new CallableImpl());
        Thread thread = new Thread(futureTask);
        thread.start();

        Thread.sleep(1000);

        String result = futureTask.get();

        System.out.println(result);

    }

}

class CallableImpl implements Callable<String>{

    @Override
    public String call() throws Exception {
        return "陈宇超";
    }
}
