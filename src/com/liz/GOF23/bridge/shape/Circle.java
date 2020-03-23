package com.liz.GOF23.bridge.shape;

public class Circle extends Shape {
    @Override
    public void draw() {
        color.bePaint("圆");
    }
}
