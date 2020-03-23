package com.liz.GOF23.proxy.static_proxy_demo;

public class Client {
    public static void main(String[] args) {
        //创建目标对象（被代理对象）
        ITeacherDao teacherDao = new TeacherDao();
        //创建代理对象，同时将被代理对象传递给代理对象
        ITeacherDao staticProxyDemo = new TeacherProxyDao(teacherDao);
        //通过代理对象，调用被代理对象的方法
        //即:执行的是代理对象，但是代理对象调用目标对象的方法
        staticProxyDemo.teach();
    }
}
