package com.chen.creational;

/**
 * 饿汉式单例模式
 */
public class EagerSingleton {
    private final static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){

    }

    private EagerSingleton getInstance(){
        return instance;
    }
}
