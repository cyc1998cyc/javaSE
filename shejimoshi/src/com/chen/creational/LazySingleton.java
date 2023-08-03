package com.chen.creational;

/**
 * 饿汉式单例模式
 */
public class LazySingleton {
    private static LazySingleton instance ;

    private LazySingleton(){

    }

    private static LazySingleton getInstance(){



        if (null == instance){
            instance = new LazySingleton();
        }
        return instance;
    }
}
