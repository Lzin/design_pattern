package com.liz.GOF23.singleton.lazy_man;

/**
 * 加重量级锁 保证线程安全
 * 懒汉式(线程安全，同步方法) 在使用的时候才进行创建
 *
 * 优点: 解决了线程不安全的问题
 * 缺点:效率太低。当每个线程想获得类实例的时候，执行getInstance方法都要进行同步，而这个方法同步一次就够了，后面想获得该实例直接返回即可。所以说效率过低
 *
 * ！！！在实际开发中，不推荐使用（效率过低）
 * */
public class SingleBySync {
    private static SingleBySync instance;

    private SingleBySync(){}

    public static synchronized SingleBySync getInstance(){
        if(instance == null){
            //延迟加载
            instance=new SingleBySync();
        }
        return instance;

    }

    //提供一个静态的公有方法，当使用到该方法时，才去创建instance 同时加上了synchronized 保证线程同步
    public static void main(String[] args) {
        System.out.println(SingleBySync.getInstance() == (SingleBySync.getInstance()));
    }
}
