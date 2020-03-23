package com.liz.GOF23.builder.com.liz.old_way;

//抽象房屋
public abstract class AbstractHouse {
    //打地基
    public abstract void buildBasic();

    //砌墙
    public abstract void buildWalls();

    //封顶
    public abstract void roofed();

    //用了模板方法 后序再说...
    public  void build() {
        buildBasic();
        buildWalls();
        roofed();
    }
}
