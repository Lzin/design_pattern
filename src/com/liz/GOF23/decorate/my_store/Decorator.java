package com.liz.GOF23.decorate.my_store;
//抽象的装饰类
public abstract class Decorator implements Food {
    private Food food;
    public Decorator(Food food){
        this.food = food;
    }

    @Override
    public String getDescription() {
        return food.getDescription();
    }
}
