package com.liz.GOF23.bridge;

import com.liz.GOF23.bridge.color.Blue;
import com.liz.GOF23.bridge.color.Color;
import com.liz.GOF23.bridge.shape.Circle;
import com.liz.GOF23.bridge.shape.Shape;

public class Client {
    public static void main(String[] args) {
        //均都使用了多态性
        Color color = new Blue();
        Shape circle = new Circle();
        //组合要素
        circle.setColor(color);
        //逻辑操作
        circle.draw();
    }
}
