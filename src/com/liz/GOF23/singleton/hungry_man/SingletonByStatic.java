package com.liz.GOF23.singleton.hungry_man;

//饿汉式（静态变量）

//优点: 简单，在类装载的时候已经完成了实例化，避免了线程同步

//缺点: 在类装载的时候就完成实例化，没有达到 lazyloading（懒加载），如果从始至终没有使用过这个实例，则会造成内存的浪费
//导致类装载的原因可能有很多种，这时候万一初始化了instance，未使用。造成了内存的浪费

//！！！可以使用，可能造成内存浪费
public class SingletonByStatic {
    //1.构造器私有化,外部不能new
    private SingletonByStatic(){

    }
    //2.本类内部创建对象实例(在类加载的时候进行定义 由于后期的构造器私有化 所以不能修改)
    private static  SingletonByStatic instance = new SingletonByStatic();
    //3.对外提供返回 返回实例对象
    public static SingletonByStatic getInstance(){
        return instance;
    }
    public static void main(String[] args) {
        //测试
        SingletonByStatic instance = SingletonByStatic.getInstance();
        SingletonByStatic instance1 = SingletonByStatic.getInstance();
        System.out.println(instance == instance1); //true
        System.out.println(instance.hashCode()); //完全一致
        System.out.println(instance1.hashCode());//完全一致
    }
}
