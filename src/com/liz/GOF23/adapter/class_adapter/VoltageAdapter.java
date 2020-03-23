package com.liz.GOF23.adapter.class_adapter;
//Adapter: 类适配器模式
//Adapter类通过继承src类，实现dst类接口，完成从src->dst的适配
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    @Override
    public int output5V() {
        //提供电压
        int src = output220V();
        //适配逻辑,返回目标值
        System.out.println("类适配器转换中...");
        int dst = src/44;
        return dst;
    }
}
