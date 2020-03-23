package com.liz.GOF23.singleton.enum_singleton;

/**
 * 借助jdk1.5中添加的枚举类实现单例模式，不但可以避免多线程同步问题，而且防止反序列化重新创建新的对象
 * */
public class SingletonByEnumDemo {
    public static void main(String[] args) {
        SingletonByEnumDemo instance1 = Singleton.INSTANCE.getInstance();
        SingletonByEnumDemo instance2 = Singleton.INSTANCE.getInstance();
        System.out.println(instance1 == instance2);
    }
}
