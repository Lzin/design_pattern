package com.liz.GOF23.decorate;

import com.liz.GOF23.decorate.decorator.Chocolate;
import com.liz.GOF23.decorate.decorator.Decorator;
import com.liz.GOF23.decorate.decorator.Milk;
import com.liz.GOF23.decorate.drink.Drink;
import com.liz.GOF23.decorate.drink.LongBlack;

public class CoffeeStore {
    //装饰者模式下订单: 2份巧克力 + 一份牛奶 的LongBlack
    public static void main(String[] args) {
        //1.LongBlack
        Drink order = new LongBlack();
        System.out.println("单品信息:"+order.getDes()+"   费用:"+order.cost());

        //2.加入一份牛奶(装饰者)
        order = new Milk(order);
        System.out.println("订单1:"+order.getDes()+"   费用:"+order.cost());

        //3.加入两份巧克力
        //加入第一份
        order = new Chocolate(order);
        //加入第二份
        order = new Chocolate(order);
        System.out.println("订单2:"+order.getDes()+"   费用:"+order.cost());
        //链式思想
    }
}
