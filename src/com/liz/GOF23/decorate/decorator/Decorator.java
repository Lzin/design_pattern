package com.liz.GOF23.decorate.decorator;

import com.liz.GOF23.decorate.drink.Drink;
//装饰者要实现被装饰者的顶层抽象
public class Decorator extends Drink {
    private Drink obj;

    //！！！开始组合(体现出组合关系)
    public Decorator(Drink obj){
        this.obj = obj;
    }
    @Override
    public float cost() {
        //!!!自己的价格 + 单品咖啡的价格组合
        return getPrices() + obj.cost();
    }

    @Override
    public String getDes() {
        //描述(装饰者信息 + 被装饰者信息)
        return this.des+" "+this.getPrices()+" "+"&&"+obj.getDes()+obj.getPrices();
    }
}
