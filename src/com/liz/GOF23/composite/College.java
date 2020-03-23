package com.liz.GOF23.composite;

import java.util.ArrayList;
import java.util.List;

//院系
public class College extends OrganizationComponent {
    //List中存放的是Department
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }

    //重写add方法
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }
    //重写remove方法


    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    //重写get方法
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    //输出university中所包含的院校
    @Override
    protected void print() {
        System.out.println("-----------------"+getName()+"-----------------");
        //遍历list
        for(OrganizationComponent organizationComponent:organizationComponents){
            organizationComponent.print();
        }
    }
}
