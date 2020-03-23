package com.liz.GOF23.singleton.static_inner_class;

//静态内部类
/*
 * 所以: 1.达到了懒加载的效果{外部类的加载不会导致内部类的加载}  2.只会装载一次，装载时线程安全
 *
 * 1.这种方法采用了类装载的机制保证了初始化实例只有一个线程
 * 2.当主类进行类装载的时候，静态内部类不会进行装载（在这里调用了getInstance后才加载）
 * 3.类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性。在类进行初始化时，其他线程无法进入
 *
 * 优点: 避免了线程不安全，利用静态内部类特点实现延迟加载，效率高
 * 结论: 推荐使用
 * */
public class StaticInnerClassDemo {
    private StaticInnerClassDemo() {
    }


    private static class InnerClass {
        private static final StaticInnerClassDemo INSTANCE = new StaticInnerClassDemo();
    }

    /**
     * 静态内部类
     * 1.当主类进行类装载的时候，静态内部类不会进行装载
     * 2.当调用方法，用到了静态内部类时，内部类会进行装载
     */
    public static StaticInnerClassDemo getInstance(){
        return InnerClass.INSTANCE;
    }

    public static void main(String[] args) {
        System.out.println(StaticInnerClassDemo.getInstance() == StaticInnerClassDemo.getInstance());
    }
}
