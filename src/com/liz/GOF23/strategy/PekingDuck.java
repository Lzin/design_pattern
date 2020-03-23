package com.liz.GOF23.strategy;

import com.liz.GOF23.strategy.traditional.Duck;
/**
 * 北京鸭会叫会游泳，但是飞翔比较差
 * */
public class PekingDuck extends Duck {
    @Override
    public void display() {
        System.out.println("这是北京鸭");
    }

    @Override
    public void fly() {
        System.out.println("北京鸭飞翔较差");
    }
}
