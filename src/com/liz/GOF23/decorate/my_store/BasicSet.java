package com.liz.GOF23.decorate.my_store;

public class BasicSet implements Food {
    @Override
    public String getDescription() {
        return "我的点餐是: 汉堡+可乐";
    }
}
