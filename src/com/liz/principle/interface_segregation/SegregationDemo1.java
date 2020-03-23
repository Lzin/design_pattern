package com.liz.principle.interface_segregation;

//接口隔离
//如果有多个类通过接口进行相互依赖的时候，需要将接口进行拆分以便于产生多余的依赖方法
//此处A和B进行联系使用了接口的123方法，但是4和5没有进行使用;所以可以将接口拆分为若干个部分（所谓的接口隔离）

//在这里将Interface split为 InterfaceSplit1 和InterfaceSplit2 粒度更小，没有无关使用方法

//!!! 一个类对于另外一个类的依赖建立在最小接口上

public class SegregationDemo1 {
    public static void main(String[] args) {
        A a=new A();
        InterfaceSplit1 interfaceSplit=new B();
        a.test1(interfaceSplit);
        a.test2(interfaceSplit);
        a.test3(interfaceSplit);
    }
}
class B implements InterfaceSplit1 {

    @Override
    public void operation1() {
        System.out.println("b1");
    }

    @Override
    public void operation2() {
        System.out.println("b2");
    }

    @Override
    public void operation3() {
        System.out.println("b3");
    }
}

class A{
    public void test1(InterfaceSplit1 demo){
        demo.operation1();
    }
    public void test2(InterfaceSplit1 demo){
        demo.operation2();
    }
    public void test3(InterfaceSplit1 demo){
        demo.operation3();
    }
}
