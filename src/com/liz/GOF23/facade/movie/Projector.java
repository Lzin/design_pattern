package com.liz.GOF23.facade.movie;

//投影仪
public class Projector {
    private static Projector instance = new Projector();
    public static Projector getInstance(){
        return instance;
    }

    //投影仪功能
    //开启
    public void on(){
        System.out.println("projector on");
    }
    //关闭
    public void off(){
        System.out.println("projector off");
    }

    //聚焦
    public void focus(){
        System.out.println("projector is focusing");
    }

}
