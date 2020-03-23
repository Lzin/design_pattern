package com.liz.GOF23.decorate.my_store;



public class Store {
    public static void main(String[] args) {
        Food food = new BasicSet();
        //原始
        System.out.println(food.getDescription());
        //加餐1
        Decorator decorator = new IceCream(food);
        System.out.println(decorator.getDescription());
        //加餐2
        decorator = new Chicken(decorator);
        System.out.println(decorator.getDescription());
    }
}
