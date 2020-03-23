package com.liz.GOF23.bridge.shape;

import com.liz.GOF23.bridge.color.Color;

//在此中不仅仅规范了形状 而且使用了color进行操作 故定义为抽象类
public abstract class Shape {
    //抽象类和接口之间实现了组合关系,接口组合入抽象类中
    //Shape中的子类使用了color的多态性
    public Color color;
    public void setColor(Color color){
        this.color = color;
    }
    public abstract void draw();
}
