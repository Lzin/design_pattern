package com.liz.GOF23.singleton.hungry_man;
/**
 * 饿汉式(静态代码块)
 * 类加载的时候完成初始化
 *
 * 这种方法和上面的方法类似，只不过将类实例化的过程放在了静态代码块中。也是在类装载的时候，就执行静态代码块中的代码，初始化类的实例。优缺点和上述一致
 * 这种单例模式可用，但是可能造成内存浪费
 * */
public class SingletonByStaticBlock {
    private static SingletonByStaticBlock instance;//静态代码

    //在静态代码块中创建单例对象
    static{
        instance=new SingletonByStaticBlock();
    }
    private SingletonByStaticBlock(){}//防止对类进行修改

    public static SingletonByStaticBlock getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(SingletonByStaticBlock.getInstance().hashCode() == SingletonByStaticBlock.getInstance().hashCode());
    }
}
