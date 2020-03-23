package com.liz.GOF23.bridge.bridge_relearn;

/**
 * 抽象类: 和接口做到关联
 * */
public abstract class Shape {
    public Color color;

    public void setColor(Color color) {
        this.color = color;
    }
    public abstract void paintShape();
}
