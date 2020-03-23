package com.liz.GOF23.singleton.enum_singleton;
//枚举
public enum Singleton {
    INSTANCE;//
    private  SingletonByEnumDemo demo = null;
    private Singleton() {
        demo = new SingletonByEnumDemo();
    }

    public SingletonByEnumDemo getInstance() {
        return demo;
    }
}
