package com.liz.GOF23.template;

public class Client {
    public static void main(String[] args) {
        SoyaMilk red = new RedBeanSoyaMilk();
        SoyaMilk peanut = new PeanutSoyaMilk();
        //调用模板方法
        red.make();
        System.out.println("-----------------------");
        peanut.make();
        System.out.println("-----------------------");
        //实现钩子方法 调用纯豆浆
        SoyaMilk pure = new PureSoyaMilk();
        pure.make();
    }
}
