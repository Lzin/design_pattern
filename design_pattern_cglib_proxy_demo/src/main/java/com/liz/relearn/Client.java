package com.liz.relearn;

public class Client {
    public static void main(String[] args) {
        TeacherDao dao = new TeacherDao();
        System.out.println(dao.func());
        System.out.println("-------------------");
        ProxyFactory factory = new ProxyFactory(dao);
        TeacherDao instance = (TeacherDao)factory.getProxyInstance();
        System.out.println(instance.func());

    }
}
