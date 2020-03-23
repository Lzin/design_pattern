package com.liz.GOF23.builder.com.liz.old_way;

/**
 * 代码分析:
 * 1.优点: 比较好理解，简单容易操作
 * 2.缺点:
 *      1.缺少流程规范
 *      2.将产品(房子) 和创建产品的过程(建房子过程)封装在一起，耦合性增强了
 *      （比较形象的比方: CommonHouse内部应该写的是房子内部的情况(屋主的行为) 而不是施工队建造房子的情况....）
 * 3.如何解决: 将产品和产品建造过程解耦 => 建造者模式
 * */
public class CommonHouse extends AbstractHouse {
    //在产品内部写了创建过程，耦合性增强
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }

}
