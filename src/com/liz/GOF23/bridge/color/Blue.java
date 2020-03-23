package com.liz.GOF23.bridge.color;

public class Blue implements Color {
    @Override
    public void bePaint(String shape) {
        System.out.println("蓝色的"+shape);
    }
}
