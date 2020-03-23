package com.liz.GOF23.factory.simple_factory.old_way.pizza;

public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("制作GreekPizza,准备原材料中");
    }
}
