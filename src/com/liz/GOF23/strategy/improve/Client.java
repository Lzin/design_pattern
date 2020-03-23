package com.liz.GOF23.strategy.improve;

import com.liz.GOF23.strategy.improve.duck.Duck;
import com.liz.GOF23.strategy.improve.duck.PekingDuck;
import com.liz.GOF23.strategy.improve.duck.WildDuck;
import com.liz.GOF23.strategy.improve.fly.BadFlyBehavior;
import com.liz.GOF23.strategy.improve.fly.GoodFlyBehavior;

public class Client {
    public static void main(String[] args) {
        //改变类 不同对象的不同属性
        Duck duck = new WildDuck();
        duck.setFlyBehavior(new BadFlyBehavior());
        duck.fly();
    }

}
