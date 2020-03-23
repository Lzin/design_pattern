package com.liz.GOF23.strategy.improve.duck;

import com.liz.GOF23.strategy.improve.fly.NoFlyBehavior;

public class ToyDuck extends Duck {
    //不能叫，也不能飞翔

    public ToyDuck(){
        flyBehavior = new NoFlyBehavior();
    }
    @Override
    public void display() {
        System.out.println("玩具鸭");
    }
    //需要重写父类的全部方法

    public void quack(){
        System.out.println("玩具鸭不会叫..");
    }
    public void swim(){
        super.swim();
    }
}
