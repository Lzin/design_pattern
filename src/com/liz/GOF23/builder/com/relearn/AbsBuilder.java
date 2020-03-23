package com.liz.GOF23.builder.com.relearn;

public abstract class AbsBuilder {
    //原型
    private static CarMode carMode;

    //抽象制造细节
    public abstract void makePart1();

    public abstract void makePart2();

    public abstract void makePart3();

    //返回原型
    public CarMode createCarMode() {
        return carMode;
    }

}
