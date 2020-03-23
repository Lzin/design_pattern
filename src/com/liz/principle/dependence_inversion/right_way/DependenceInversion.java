package com.liz.principle.dependence_inversion.right_way;

public class DependenceInversion {
    /**
     * 依赖倒转原则:
     *      使用抽象类或者接口进行类和类之间的连接，从而降低耦合性。
     *      在依赖时传入的不是类，而是接口。在调用的时候采用多态的原理指定到具体的类
     *      ！！！传递参数时，永远不要传递类 这样会导致极高的耦合性 需要传递接口 被待传递类使用
     *
     * 细节:
     *      1.底层模块尽量要有抽象类和接口，或者两者都有，程序的稳定性更好
     *      2.变量的声明类型尽量是抽象类和接口，这样在变量引用和声明对象间存在一个缓冲层，利于程序的扩展和优化
     *      3.继承的时候遵循里氏替换原则
     * */
    public static void main(String[] args) {
        Person person=new Person();
        //多态
        IReceiver receiver=new Email();
        person.receive(receiver);
    }
}
