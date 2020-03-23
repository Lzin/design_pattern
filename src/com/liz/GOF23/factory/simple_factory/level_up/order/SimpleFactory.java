package com.liz.GOF23.factory.simple_factory.level_up.order;

import com.liz.GOF23.factory.simple_factory.level_up.pizza.ChessPizza;
import com.liz.GOF23.factory.simple_factory.level_up.pizza.GreekPizza;
import com.liz.GOF23.factory.simple_factory.level_up.pizza.PepperPizza;
import com.liz.GOF23.factory.simple_factory.level_up.pizza.Pizza;

//简单工厂类(静态工厂)
/**
 *
 * 在一处进行new即可(工厂类) 其他地方直接使用实例 public (static) T createXxx();
 *
 * !!!定义一个可以实例化对象的类，从而去覆盖掉创建对象的代码(代码的重封装)
 * */
public class SimpleFactory {
    //使用简单工厂模式,给出预订类型 创建pizza
    public static Pizza createPizza(String orderType) {
        System.out.println("使用简单工厂模式");
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(orderType + " pizza ");
        } else if (orderType.equals("cheese")) {
            pizza = new ChessPizza();
            pizza.setName(orderType + " pizza ");
        }
        //增加方法只需要更改一处即可
        else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName(orderType + " pizza ");
        }
        return pizza;
    }
}
