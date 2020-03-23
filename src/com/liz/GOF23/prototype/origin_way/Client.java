package com.liz.GOF23.prototype.origin_way;

//传统方法复制10只克隆羊
/**
 * 1.优点: 比较好理解，简单易操作
 * 2.缺点: 在创建新的对象时，总是需要重新获取原始对象的属性，如果创建的对象比较复杂，效率较低
 *         总是需要重新初始化对象，而不是动态获取对象运行状态，不够灵活
 *
 * 3.改进: java的Object类提供了一个clone()方法,该方法可以将一个java对象复制一份，但是需要实现clone的java类必须实现接口Cloneable（该接口表示该类可以复制，并且具有复制的能力） =>原型模式
 *
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "white");
        //.... copy
        Sheep sheepCopy1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        System.out.println(sheepCopy1);
        //.... show
    }

}
