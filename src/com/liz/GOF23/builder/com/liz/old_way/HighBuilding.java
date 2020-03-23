package com.liz.GOF23.builder.com.liz.old_way;

public class HighBuilding extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼房子封顶");
    }
    
}
