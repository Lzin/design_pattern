package com.liz.GOF23.factory.abstract_factory.order;

import com.liz.GOF23.factory.abstract_factory.pizza.*;

public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            //子类new
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            //子类new
            pizza = new LDPepperPizza();
        }
        // TODO Auto-generated method stub
        return pizza;
    }
}

