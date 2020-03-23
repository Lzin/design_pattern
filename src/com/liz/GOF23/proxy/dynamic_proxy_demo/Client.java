package com.liz.GOF23.proxy.dynamic_proxy_demo;


public class Client {
    public static void main(String[] args) {
        //1.创建目标对象
        ITeacherDao target = new TeacherDao();

        //2.创建工厂，传入参数为target
        ProxyFactory factory = new ProxyFactory(target);
        //3.为target创建代理对象
        ITeacherDao proxyInstance = (ITeacherDao) factory.getProxyInstance();
        //4.使用代理对象（动态代理对象生成代理对象，通过反射机制生成，所以无需实现接口）
        //class com.sun.proxy.$Proxy0 内存中动态生成了代理对象
        System.out.println(proxyInstance.getClass());
        //代理对象调用目标对象的方法
        proxyInstance.teach();
        System.out.println("-----------------------------------------");
        //方法增强后
        System.out.println("增强逻辑后:"+proxyInstance.say("1z"));
    }
}
