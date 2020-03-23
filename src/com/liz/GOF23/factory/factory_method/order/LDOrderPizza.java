package com.liz.GOF23.factory.factory_method.order;

import com.liz.GOF23.factory.factory_method.pizza.LDCheesePizza;
import com.liz.GOF23.factory.factory_method.pizza.LDPepperPizza;
import com.liz.GOF23.factory.factory_method.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {


    //在子类中进行创建
    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if(orderType.equals("cheese")) {
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