package com.example;

public final class Singleton {
    /**
     * java1.4之前会有问题
     */
    //private static volatile Singleton singleton = null;
    //
    //public static Singleton getInstance() {
    //    if (singleton == null) {
    //        synchronized (Singleton.class) {
    //            if (singleton == null) {
    //                singleton = new Singleton();
    //            }
    //        }
    //    }
    //    return singleton;
    //}
    static class SingletonHolder {
        static final Singleton singleton = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.singleton;
    }

    private Singleton() {

    }
}
