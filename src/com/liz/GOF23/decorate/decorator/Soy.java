package com.liz.GOF23.decorate.decorator;

import com.liz.GOF23.decorate.drink.Drink;

public class Soy extends Decorator {
    public Soy(Drink obj) {
        super(obj);
        setDes("豆浆");
        setPrices(1.5f);
    }
}
