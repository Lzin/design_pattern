package com.liz.GOF23.builder.com.liz.builder;

//产品 => product
public class House {
    //地基
    private String basic;
    //墙
    private String wall;
    //屋顶
    private String roofed;

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}
