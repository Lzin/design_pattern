package com.liz.GOF23.bridge.color;

public class Red implements Color {
    @Override
    public void bePaint(String shape) {
        System.out.println("红色的"+shape);
    }
}
