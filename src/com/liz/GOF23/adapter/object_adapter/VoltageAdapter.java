package com.liz.GOF23.adapter.object_adapter;

//Adapter: 对象适配器模式
//Adapter类通过获取src实例，实现dst类接口，完成从src->dst的适配
public class VoltageAdapter implements IVoltage5V {
    //类适配器和对象适配器不同的地方
    private  Voltage220V voltage;
    //聚合 src实例
    public VoltageAdapter(Voltage220V voltage){
        super();
        this.voltage = voltage;
    }

    @Override
    public int output5V() {
        if(voltage!=null){
            //提供电压
            int src = this.voltage.output220V();
            //适配逻辑,返回目标值
            System.out.println("对象适配器转换中...");
            int dst = src/44;

            return dst;
        }else{
            throw new RuntimeException("装配失败");
        }
    }
}
