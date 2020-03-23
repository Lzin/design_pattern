package com.liz.GOF23.iterator.college;

//数据元(数据元素)
public class Department {
    private String name;
    //描述
    private String desc;

    public String getName() {
        return name;
    }

    public Department(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
