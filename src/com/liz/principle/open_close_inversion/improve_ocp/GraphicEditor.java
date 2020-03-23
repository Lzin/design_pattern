package com.liz.principle.open_close_inversion.improve_ocp;

public class GraphicEditor  {
    //接收Shape对象，根据type，来绘制不同的图形
    public void drawShape(IShape s){
        s.draw();
    }
}
