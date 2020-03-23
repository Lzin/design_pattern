package com.liz.GOF23.singleton.double_check;
/**
 * 双重选择:
 * 进行了两次if(singleton == null)的检查，保证了线程安全
 * 这样实例化代码只用执行一次，后面再次访问时,直接return即可
 *
 * 线程安全: 延迟加载，效率较高
 * 结论: 在实际开发中，用的较多
 * */
public class SingleByDoubleCheck {
    //volatile: 立即更新到主存,同时保证了指令不重排序
    private static volatile SingleByDoubleCheck singleton;
    private SingleByDoubleCheck(){}

    //提供一个静态的公有方法，加入双重检查代码。解决线程安全问题和懒加载问题
    public static SingleByDoubleCheck getInstance(){
        if(singleton == null){
            synchronized (SingleByDoubleCheck.class){
                if(singleton == null){
                    singleton=new SingleByDoubleCheck();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        System.out.println(SingleByDoubleCheck.getInstance() == SingleByDoubleCheck.getInstance());
    }
}
