package com.liz.principle.single_responsibility;

public class Vehicle {
    /**
     * 单一职责原则:核心思想 让类足够简单
     *      1.降低了类的复杂度，一个类或者多个类只负责一项职责
     *      2.提高类的可读性，可维护性
     *      3.降低变更引起的风险
     *      4.在逻辑足够简单时，才可以在代码级别违反单一职责原则
     *        在类中方法足够少时，可以在方法级别保持单一职责原则
     * */
    //1.run方法中违反了单一职责原则
    //2.根据交通工具运行的方式不同，分解成不同的类即可

    //3.虽然没有在类级别上遵守单一原则，但是在方法级别上仍然遵守了单一职责原则
    public void run(String vehicle){
        System.out.println(vehicle+"在公路上跑");
    }
    public void roadRun(String vehicle){
        System.out.println(vehicle+"在公路上跑");
    }
    public void roadAir(String vehicle){
        System.out.println(vehicle+"在天上跑");
    }
}
