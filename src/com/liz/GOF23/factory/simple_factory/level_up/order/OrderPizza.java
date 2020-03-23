package com.liz.GOF23.factory.simple_factory.level_up.order;

import com.liz.GOF23.factory.simple_factory.level_up.pizza.ChessPizza;
import com.liz.GOF23.factory.simple_factory.level_up.pizza.GreekPizza;
import com.liz.GOF23.factory.simple_factory.level_up.pizza.PepperPizza;
import com.liz.GOF23.factory.simple_factory.level_up.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//订购pizza
public class OrderPizza {

   private Pizza pizza;
   private String orderType;//用户输入

    public void setFactory(){
        do {
            orderType=getType();
            pizza = SimpleFactory.createPizza(orderType);
            if(pizza != null){
                showPizza();
            }
        }while (true);
    }
    //展示
    public void showPizza() {
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
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
