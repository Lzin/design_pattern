package com.liz.GOF23.bridge.bridge_relearn;

public class Red implements Color {
    @Override
    public void paint(String shape) {
        System.out.println("红色的"+shape);
    }
}
