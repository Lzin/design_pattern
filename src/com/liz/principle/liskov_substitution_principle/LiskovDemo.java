package com.liz.principle.liskov_substitution_principle;

/**
 * 里氏替换原则: 强调继承
 *      在继承中，子类可以完全覆盖掉父类，但是代码不出错，显然这是一种理想化的情况（所有引用基类的地方需要透明的使用子类）
 *      1.尽量不要去重写父类的方法
 *      2.如果需要重写的话，可以采用将重写方法单独实现。其他方法继承基类的模式
 * */
public class LiskovDemo {
    /**
     * 重写父类的方法可以完成新的功能，这样写起来的确比较简单，但是整个继承体系的复用性会变得比较差，尤其是运行多态比较频繁的时候
     *
     * 所以通用的做法是将父类和子类继承于一个更加通俗的基类，将原有的继承关系去除，采用依赖聚合组合的关系进行代替
     * */
    public static void main(String[] args) {
        A a=new A();
        System.out.println("11-3="+a.func1(11,3));
        System.out.println("1-8="+a.func1(1,8));

        B b=new B();
        /**
         * 本意是求出 11-3 和 1-8 但是会被误重写
         *
         * 可以采用组合的方式，降低耦合度
         * */
        System.out.println("11-3="+b.func3(11,3));
        System.out.println("1-8="+b.func3(1,8));

    }
}

class A extends Base{
    //返回两个数的差
    public int func1(int num1 , int num2){
        return num1-num2;
    }
}

class B extends Base{
    //重写方法，可能是无意识的
//    public int func1(int a,int b){
//        return a+b;
//    }
//    public int func2(int a,int b){
//        return func1(a,b)+9;
//    }

    //如果B需要使用A类的方法
    //使用组合关系
    //这里可以尝试使用接口 从而满足依赖倒转原则
    private A aElem=new A();
    public int func3(int a,int b){
        return aElem.func1(a,b);
    }
}

//创建一个更加基础的基类 或者是接口
class Base{
    //把更加基础的方法和成员写入Base中

}
