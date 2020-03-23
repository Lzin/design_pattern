package com.liz.GOF23.factory.abstract_factory.order;

import com.liz.GOF23.factory.abstract_factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//生产点 调用工厂
public class OrderPizza {
//    private AbsFactory factory;
//    public void setFactory(AbsFactory factory){
//        this.factory = factory;
//    }
    // 写一个方法，可以获取客户希望订购的披萨种类

//生产pizza 多态
    public void productPizza(AbsFactory factory){
        Pizza pizza = null;
        String orderType; // 订购披萨的类型
        do {
            orderType = getType();
            pizza=factory.createPizza(orderType);
            //输出pizza 制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }


    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
