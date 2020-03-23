package com.liz.GOF23.builder.com.relearn;

//指挥者
public class BenzDirector {
    //组合具体建造者 constructor or setter di
    public BenzBuilder benzBuilder = null;

    public BenzDirector(BenzBuilder benzBuilder) {
        this.benzBuilder = benzBuilder;
    }

    //开始指挥细节
    public CarMode createBenz() {
        benzBuilder.makePart1();
        benzBuilder.makePart2();
        benzBuilder.makePart3();
        return benzBuilder.createCarMode();
    }
}
