package com.liz.GOF23.bridge.bridge_relearn;

public class Client {


    public static void main(String[] args) {
        //实现了多态性
         Color color = new Red();
         //实现了多态性
         Shape shape = new Rectangle();
         shape.setColor(color);
         shape.paintShape();
    }
}
