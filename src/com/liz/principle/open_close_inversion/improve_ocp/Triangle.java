package com.liz.principle.open_close_inversion.improve_ocp;

public class Triangle  implements IShape{
    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}
