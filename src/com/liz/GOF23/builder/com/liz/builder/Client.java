package com.liz.GOF23.builder.com.liz.builder;
public class Client {
    //产品和产品之间的区别不是体现在流程上，而是体现在属性上
    public static void main(String[] args) {
        //构建普通房
        CommonHouseBuilder commonBuilder = new CommonHouseBuilder();
        HouseDirector commonDirector = new HouseDirector(commonBuilder);
        //返回普通房产品(可以进行传输....)
        House commonHouse = commonDirector.constructHouse();
        //成功构建原型

        System.out.println("----------------------------");
        //构建高楼
        HighBuildingBuilder highBuildingBuilder = new HighBuildingBuilder();
        HouseDirector highDirector = new HouseDirector(highBuildingBuilder);
        House highHouse = highDirector.constructHouse();
        //成功构建原型
    }
}
