package com.liz.GOF23.proxy.static_proxy_demo;

//代理对象,静态代理
public class TeacherProxyDao implements ITeacherDao {
    private ITeacherDao target;//目标对象，通过接口进行依赖
    //构造器
    public TeacherProxyDao(ITeacherDao target){
        this.target = target;
    }
    @Override
    public void teach() {
        //进行对象的强化
        System.out.println("核心对象使用前做的事...");
        target.teach();
        System.out.println("核心对象使用后做的事...");
    }
}
