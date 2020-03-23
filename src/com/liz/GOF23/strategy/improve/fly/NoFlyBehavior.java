package com.liz.GOF23.strategy.improve.fly;

import java.util.Arrays;
import java.util.Comparator;

public class NoFlyBehavior implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println(" 不会飞翔.. ");

    }
}
