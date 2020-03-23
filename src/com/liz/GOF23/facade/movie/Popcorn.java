package com.liz.GOF23.facade.movie;
//爆米花机
public class Popcorn {
    //使用单例模式(饿汉式)
    private static Popcorn instance = new Popcorn();
    public static Popcorn getInstance(){
        return instance;
    }

    //爆米花机的功能

    //开启
    public void on(){
        System.out.println("popcorn on");
    }
    //关闭
    public void off(){
        System.out.println("popcorn off");
    }

    //制作爆米花
    public void pop(){
        System.out.println(" popcorn is poping ");
    }

}
