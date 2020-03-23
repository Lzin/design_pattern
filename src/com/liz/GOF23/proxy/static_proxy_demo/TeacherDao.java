package com.liz.GOF23.proxy.static_proxy_demo;

//被代理的对象(待加强的对象)
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课中");
    }
}
