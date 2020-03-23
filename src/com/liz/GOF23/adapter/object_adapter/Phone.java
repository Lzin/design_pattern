package com.liz.GOF23.adapter.object_adapter;

//使用类
public class Phone {
    //传入接口 解耦方便，具体实现的依旧是
    public void charging(IVoltage5V voltage){
        if(voltage.output5V() == 5){
            System.out.println("5v电压输入，充电中");
        }else{
            System.out.println("充电失败");
        }

    }
}
