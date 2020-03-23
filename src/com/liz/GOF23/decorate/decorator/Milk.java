package com.liz.GOF23.decorate.decorator;

import com.liz.GOF23.decorate.drink.Drink;

public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶");
        setPrices(2.0f);
    }
}
