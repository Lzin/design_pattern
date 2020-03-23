package com.liz.GOF23.flyweight;
//外部需要使用的部分
//外部状态（区分点）
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
