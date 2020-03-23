package com.liz.GOF23.composite;
import java.util.ArrayList;
import java.util.List;

//Composite: 可以管理下层
public class University extends OrganizationComponent {
    //List中存放的是College
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

    //重写add方法
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        //实际业务中 college的add方法和university的add方法不一定完全相同
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
