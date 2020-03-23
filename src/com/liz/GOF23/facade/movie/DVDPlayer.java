package com.liz.GOF23.facade.movie;

//子部件一览
public class DVDPlayer {
    //使用单例模式(饿汉式)
    private static DVDPlayer instance = new DVDPlayer();
    public static DVDPlayer getInstance(){
        return instance;
    }

    //DVD的功能

    //开启
    public void on(){
        System.out.println("dvd on");
    }
    //关闭
    public void off(){
        System.out.println("dvd off");
    }

    //播放
    public void play(){
        System.out.println(" dvd is playing ");
    }
    //暂停
    public void pause(){
        System.out.println(" dvd pause");
    }
}
