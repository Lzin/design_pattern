package com.liz.GOF23.decorate.my_store;

public class Chicken extends Decorator {
    public Chicken(Food food) {
        super(food);
    }

    //强化方法
    @Override
    public String getDescription() {
        return super.getDescription()+"+鸡";
    }
}
