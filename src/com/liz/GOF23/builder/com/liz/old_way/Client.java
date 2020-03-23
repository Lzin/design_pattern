package com.liz.GOF23.builder.com.liz.old_way;

public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HighBuilding highBuilding = new HighBuilding();
        commonHouse.build();
        System.out.println("--------------------");
        highBuilding.build();
    }
}
