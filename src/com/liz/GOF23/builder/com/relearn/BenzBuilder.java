package com.liz.GOF23.builder.com.relearn;

public class BenzBuilder extends AbsBuilder {
    //Benz 制作细节
    @Override
    public void makePart1() {
        System.out.println("benz part1");
    }

    @Override
    public void makePart2() {
        System.out.println("benz part2");
    }

    @Override
    public void makePart3() {
        System.out.println("benz part3");
    }
}
