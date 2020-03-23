package com.liz.GOF23.factory.abstract_factory.order;

import com.liz.GOF23.factory.abstract_factory.pizza.Pizza;

//一个抽象工厂模式的抽象层(接口)
public interface AbsFactory {
    //工厂子类具体实现
    public  Pizza createPizza(String orderType);
}
