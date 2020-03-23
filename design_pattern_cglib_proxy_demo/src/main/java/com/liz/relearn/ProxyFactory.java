package com.liz.relearn;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

//cglib代理
public class ProxyFactory implements MethodInterceptor {
    //维护一个被代理对象
    public Object target;
    //init
    public ProxyFactory (Object target){
        this.target = target;
    }
    public Object getProxyInstance(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        //返回代理对象
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理模式开始了");
        //反射(获取对象的方法)
        Object invoke = method.invoke(target, args);
        System.out.println("代理模式结束了");
        return invoke+"。。。强化内容";
    }
}
