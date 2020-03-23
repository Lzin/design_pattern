package com.liz.GOF23.factory.simple_factory.level_up.order;

//客户端完成订购任务
public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza pizza = new OrderPizza();
        //制作完毕
        pizza.setFactory();
    }
}
