package com.liz.GOF23.composite;

//Component: 这是组合中对象声明的抽象类，适当情况下支持所有类的共有行为。用于访问和管理子部件（可以定位成类或者接口）
public abstract class OrganizationComponent {
    private String name; //名字
    private String des;  //说明
    //添加
    //默认实现（为什么不写成抽象类? 叶子节点无需增加方法）
    protected void add(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    //默认实现（为什么不写成抽象类? 叶子节点无需移除方法）
    protected void remove(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    //构造器
    public OrganizationComponent(String name, String des) {
        super();
        this.name = name;
        this.des = des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public String getName() {
        return name;
    }


    //都含有的打印方法print 做成抽象的
    protected abstract void print();
}
