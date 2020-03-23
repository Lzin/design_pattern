package com.liz.GOF23.factory.simple_factory.old_way.pizza;

//抽象类Pizza

/**
 * 传统方法的优缺点:
 * 1. 优点是比较好理解，简单容易操作
 * 2. 缺点是违反了设计模式的ocp原则，即对扩展开放，对修改关闭。当我们给类增加新功能的时候，尽量不修改代码或者少修改代码
 * 3. 假设再增加一种pizza种类，就要修改很多代码
 *
 * 改进:
 * 将创建pizza对象封装到一个类，这样有新的种类时，只需要修改该类即可，其他代码就无须修改了 => 简单工厂模式
 * */
public abstract class Pizza {
    //名字
    protected String name;

    //准备原材料
    public abstract void prepare();

    //烘烤
    public void bake() {
        System.out.println(name + "baking;");
    }

    //切断
    public void cut() {
        System.out.println(name + "cutting;");
    }

    //打包
    public void box() {
        System.out.println(name + "boxing;");
    }


    public void setName(String name) {
        this.name = name;
    }

}
