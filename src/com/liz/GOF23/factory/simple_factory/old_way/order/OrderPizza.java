package com.liz.GOF23.factory.simple_factory.old_way.order;

import com.liz.GOF23.factory.simple_factory.old_way.pizza.ChessPizza;
import com.liz.GOF23.factory.simple_factory.old_way.pizza.GreekPizza;
import com.liz.GOF23.factory.simple_factory.old_way.pizza.PepperPizza;
import com.liz.GOF23.factory.simple_factory.old_way.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//订购pizza
public class OrderPizza {
    public OrderPizza() {
        //违背了迪米特原则
        Pizza pizza = null;
        String orderType;//订购类型
        do {
            orderType = getType();
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName(orderType + " pizza ");
            } else if (orderType.equals("cheese")) {
                pizza = new ChessPizza();
                pizza.setName(orderType + " pizza ");
            } else if (orderType.equals("pepper")) {
                pizza = new PepperPizza();
                pizza.setName(orderType + " pizza ");
            } else {
                break;
            }
            //输出pizza制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

        } while (true);
    }

    //获取类型
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
