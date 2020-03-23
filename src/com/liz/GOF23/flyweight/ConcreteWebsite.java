package com.liz.GOF23.flyweight;
/**
 * ConcreteFlyWeight: 具体的享元角色
 * 具体的网站(内部存放类的共有部分)
 * （共同点）
 */
public class ConcreteWebsite extends WebSite {

    //对象共享的信息 内部状态
    private String type = "";//网站发布的形式

    //构造器 传入具体的type
    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的用户为"+user.getName()+"  展示类型是" + type);
    }
}
