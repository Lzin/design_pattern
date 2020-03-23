package com.liz.GOF23.flyweight;
/**
 * FlyWeight:抽象的享元角色
 * 将外部状态和内部状态进行糅合
 * */
public abstract class WebSite {
    //抽象方法
    public abstract void use(User user);
}
