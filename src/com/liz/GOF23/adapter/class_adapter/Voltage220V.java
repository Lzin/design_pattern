package com.liz.GOF23.adapter.class_adapter;
//src: 被适配的类 将被适配的类放入适配器类中进行处理
public class Voltage220V {
    //输出220v的电压
    public int output220V(){
        int src = 220;
        System.out.println("电压="+src+"伏");
        return src;
    }
}
