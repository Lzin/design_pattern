package com.liz.GOF23.builder.com.liz.builder;

public class HighBuildingBuilder extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼封顶");
    }
}
