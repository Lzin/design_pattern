package com.liz.GOF23.factory.abstract_factory.order;

import com.liz.GOF23.factory.abstract_factory.pizza.BJCheesePizza;
import com.liz.GOF23.factory.abstract_factory.pizza.BJPepperPizza;
import com.liz.GOF23.factory.abstract_factory.pizza.Pizza;

public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        //开始生产
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            //子类new
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            //子类new
            pizza = new BJPepperPizza();
        }
        // TODO Auto-generated method stub
        return pizza;
    }
}
