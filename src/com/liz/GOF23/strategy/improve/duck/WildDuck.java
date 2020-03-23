package com.liz.GOF23.strategy.improve.duck;

import com.liz.GOF23.strategy.improve.fly.FlyBehavior;
import com.liz.GOF23.strategy.improve.fly.GoodFlyBehavior;

public class WildDuck extends Duck {
    public WildDuck(){
        //!!!!
        flyBehavior = new GoodFlyBehavior();
    }
    @Override
    public void display() {
        System.out.println(" 这是野鸭 ");
    }
}
