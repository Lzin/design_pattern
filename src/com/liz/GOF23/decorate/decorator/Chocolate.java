package com.liz.GOF23.decorate.decorator;

import com.liz.GOF23.decorate.drink.Drink;
//具体的调味品
public class Chocolate extends Decorator {
    public Chocolate(Drink obj) {
        super(obj);
        setDes("巧克力调味品");
        setPrices(3.0f);//调味品的价格
    }
}
