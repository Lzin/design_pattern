package com.liz.GOF23.strategy.traditional;

//抽象鸭子类
public abstract class Duck {
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
        System.out.println("鸭子会飞翔..");
    }
}
