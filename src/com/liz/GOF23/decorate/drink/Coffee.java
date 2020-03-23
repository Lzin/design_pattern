package com.liz.GOF23.decorate.drink;

public class Coffee extends Drink {
    @Override
    public float cost() {
        return this.getPrices();
    }
}
