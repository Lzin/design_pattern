package com.liz.GOF23.template;

public class PureSoyaMilk extends SoyaMilk {
    @Override
    public void add() {
        //空实现
    }
    //此时不会去调用add方法
    @Override
    boolean isAdd() {
        return false;
    }
}
