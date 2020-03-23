package com.liz.GOF23.factory.simple_factory.old_way.pizza;

public class ChessPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("制作ChessPizza,准备原材料中");
    }
}
