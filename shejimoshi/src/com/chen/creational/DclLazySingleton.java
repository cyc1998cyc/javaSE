package com.chen.creational;

/**
 * 饿汉式单例模式
 */
public class DclLazySingleton {
    private static DclLazySingleton instance;

    private DclLazySingleton() {

    }

    private static DclLazySingleton getInstance() {


        if (null == instance) {
            synchronized (DclLazySingleton.class) {
                if (null == instance) {

                    instance = new DclLazySingleton();
                }

            }
        }
        return instance;
    }
}
