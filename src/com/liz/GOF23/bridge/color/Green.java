package com.liz.GOF23.bridge.color;

public class Green implements Color
{
    @Override
    public void bePaint(String shape) {
        System.out.println("绿色的"+shape);
    }
}
