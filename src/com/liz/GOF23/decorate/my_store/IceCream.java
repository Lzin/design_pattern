package com.liz.GOF23.decorate.my_store;

public class IceCream extends Decorator {
    public IceCream(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"+冰淇淋";
    }
}
