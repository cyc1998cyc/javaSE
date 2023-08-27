package com.chen.simpleFactory.factory2;

public class BaomaFactory implements Factory{



    public void productCar() {
        System.out.println("我正在生产宝马");
        new Baoma().production();

    }
}
