package com.liz.GOF23.singleton.lazy_man;

/**
 * 懒汉式(线程不安全)【当使用某个方法时，才去创建instance】
 * 在实例化方法处写逻辑
 *
 * 优缺点声明:
 * 优点: 起到了懒加载的效果，但是只能在单线程下使用
 * 缺点: 如果在多线程下，一个线程进入了if(singleton == null)判断语句块，还未来得及往下执行，另一个线程也通过了这个判断语句，这时候就会出现了多个实例。所以在多线程下不可取
 *
 * ！！！ 实际开发中，不可取
 * */
public class SingletonByNotSafeThread {
    private static SingletonByNotSafeThread instance;

    private SingletonByNotSafeThread(){}

    //不安全 效率还低（白给自爆性） 不能使用
    public static SingletonByNotSafeThread getInstance(){
        if(instance == null){
            synchronized(SingletonByNotSafeThread.class){
                instance = new SingletonByNotSafeThread();
            }
        }
        return instance;// 依旧不能保证线程安全
    }

    //提供一个静态的公有方法，当使用到该方法时，才去创建instance
    public static void main(String[] args) {
        System.out.println(SingletonByNotSafeThread.getInstance() == (SingletonByNotSafeThread.getInstance()));
    }
}
