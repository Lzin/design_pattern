package com.liz.GOF23.builder.com.relearn;

public class FarriDirector {
    private FarriBuilder builder = null;
    public FarriDirector(FarriBuilder builder){
        this.builder = builder;
    }
    //使用builder建立模型
    public CarMode createFarri(){
        //具体建立模型
        builder.makePart1();
        builder.makePart2();
        builder.makePart3();
        return builder.createCarMode();
    }

}
