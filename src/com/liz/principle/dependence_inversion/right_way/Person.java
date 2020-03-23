package com.liz.principle.dependence_inversion.right_way;

public class Person {
    /**
     * 1.好处: 简单，容易想到
     * 2.坏处: 如果我们获取的消息是 微信或者短信，需要新增类，同时person也要新增加相应的方法
     * 说明耦合性太高了 违反了依赖倒转原则
     * 3.解决方法:
     *      引入了一个抽象的接口IReceiver，表示接收者，Person类和接口发生依赖(方法内部不去依赖Email，去依赖接口)
     *      因为Email，WeiXin等都属于接收的返回，各自实现IReceiver接口就ok
     *      类和类之间通过接口依赖
     *      使用了多态性
     * */
    //receive(Email email)
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}
