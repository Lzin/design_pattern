package com.liz.GOF23.proxy.dynamic_proxy_demo;
//目标对象
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师正在授课中...");
    }

    @Override
    public String say(String name) {
        return "hello"+name;
    }

}
