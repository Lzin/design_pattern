package com.liz.GOF23.strategy.improve.duck;

import com.liz.GOF23.strategy.improve.fly.FlyBehavior;

//抽象鸭子类
public abstract class Duck {
    //聚合策略接口
    public FlyBehavior flyBehavior;
    public Duck(){

    }
    public abstract void display();//显示鸭子信息
    public void quack(){
        System.out.println("鸭子会叫..");
    }
    public void swim(){
        System.out.println("鸭子会游泳");
    }
    public void fly(){
        if(flyBehavior != null) flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior behavior){
        this.flyBehavior = flyBehavior;
    }
}
