package com.liz.GOF23.builder.com.liz.builder;
//抽象建造者 =>Builder
public abstract class HouseBuilder {
    //组合
    private House house = new House();
    //将建造的流程写好，抽象的方法
    //打地基
    public abstract void buildBasic();

    //砌墙
    public abstract void buildWalls();

    //封顶
    public abstract void roofed();

    //建房,将组合的产品返回
    public House buildHouse(){
        return house;
    }
}
