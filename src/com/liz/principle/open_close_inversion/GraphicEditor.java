package com.liz.principle.open_close_inversion;

public class GraphicEditor  {
    //接收Shape对象，根据type，来绘制不同的图形
    public void drawShape(Shape s){
        if(s.m_type == 1){
            drawRectangle(s);
        }
        if(s.m_type ==2){
            drawCircle(s);
        }
        if(s.m_type==3){
            drawRectangle(s);
        }
    }
    public void drawCircle(Shape r){
        System.out.println("绘制圆形");
    }
    public void drawRectangle(Shape r){
        System.out.println("绘制三角形");
    }
}
