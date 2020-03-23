package com.liz.GOF23.strategy.improve.fly;

public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println(" 飞翔技术一般.. ");
    }
}
