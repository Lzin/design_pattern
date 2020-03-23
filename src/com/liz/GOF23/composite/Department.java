package com.liz.GOF23.composite;
//系
//叶子节点
//树形结构的终点 无需聚合
public class Department extends OrganizationComponent {
    public Department(String name, String des) {
        super(name, des);
    }

    //此时的add和remove方法无需写了(叶子节点无需增加其他单位)

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
