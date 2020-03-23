package com.liz.principle.open_close_inversion.improve_ocp;

public class Rectangle implements IShape {
    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}
