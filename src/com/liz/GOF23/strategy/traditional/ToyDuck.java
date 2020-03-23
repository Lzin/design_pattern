package com.liz.GOF23.strategy.traditional;

public class ToyDuck extends Duck {
    //不能叫，也不能飞翔
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
    public void fly(){
        System.out.println("玩具鸭不会飞翔..");
    }
}
