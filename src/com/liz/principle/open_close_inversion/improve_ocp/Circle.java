package com.liz.principle.open_close_inversion.improve_ocp;

import java.awt.Shape;

public class Circle implements IShape {
    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}
