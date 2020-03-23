package com.liz.GOF23.builder.com.liz.builder;

//指挥者,动态指定制作流程，返回具体产品 生产者逻辑的顶层
//指挥者内部可以使用setter或者构造器的方法注入具体构造器
public class HouseDirector {
    HouseBuilder houseBuilder = null;
    //构造器传入
    public HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }
    //setter
//    public void setHouseBuilder(HouseBuilder houseBuilder) {
//        this.houseBuilder = houseBuilder;
//    }
    //指挥具体的建造流程
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        //返回实例
        return houseBuilder.buildHouse();
    }
}
