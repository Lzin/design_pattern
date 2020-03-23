package com.liz.GOF23.factory.simple_factory.level_up.pizza;

public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("制作PeeperPizza,准备原材料中");
    }
}
