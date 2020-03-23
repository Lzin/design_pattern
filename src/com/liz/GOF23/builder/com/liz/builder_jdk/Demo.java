package com.liz.GOF23.builder.com.liz.builder_jdk;

public class Demo {
    StringBuilder stringBuilder = new StringBuilder("hello");
    /**
     * Appendable 接口定义了多个append方法(抽象方法)，为抽象建造者【定义了抽象方法】
     *
     * AbstractStringBuilder 实现了Appendable接口方法，所以它为建造者（只是不能实例化）
     *
     * StringBuilder 既为指挥者，又是具体的建造者，建造方法的实现由AbstactStringBuilder完成
     *     @Override
     *     @HotSpotIntrinsicCandidate
     *     public StringBuilder append(String str) {
     *         super.append(str);
     *         return this;
     *     }
     * */
}
