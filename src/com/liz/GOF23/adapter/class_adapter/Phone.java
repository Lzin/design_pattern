package com.liz.GOF23.adapter.class_adapter;
//使用类
public class Phone {
    public void charging(IVoltage5V voltage){
        if(voltage.output5V() == 5){
            System.out.println("5v电压输入，充电中");
        }else{
            System.out.println("充电失败");
        }
    }
}
