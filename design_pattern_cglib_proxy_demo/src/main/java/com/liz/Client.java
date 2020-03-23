package com.liz;

public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDao target = new TeacherDao();
        System.out.println(target.teach());
        System.out.println("----------开始强化------------");
        //获取到代理对象，并且将目标对象传递给代理对象
        TeacherDao instance = (TeacherDao) new ProxyFactory(target).getProxyInstance();
        System.out.println(instance.getClass());

        //执行代理对象方法，底层触发intercept拦截方法，从而实现对目标对象的调用
        System.out.println("强化结果:"+instance.teach());
    }
}
