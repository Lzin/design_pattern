package com.liz;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
//代理对象的生成及强化逻辑
public class ProxyFactory implements MethodInterceptor {
    //维护一个目标对象
    private Object target;

    //构造器: 传入被代理对象
    public ProxyFactory(Object target) {
        this.target = target;
    }

    //通过cglib，可以返回一个target的代理对象
    public Object getProxyInstance(){
        //1.创建一个工具类
        Enhancer enhancer = new Enhancer();
        //2.设置父类
        enhancer.setSuperclass(target.getClass());
        //3.设置回调函数
        enhancer.setCallback(this);
        //4.创建子类对象(代理对象)
        return enhancer.create();
    }

    //重写拦截方法，会调用目标对象的相关方法（此处开始强化）
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib代理模式开始了");
        //拦截对象，对方法进行强化
        //方法的返回值  returnVal
        Object returnVal = method.invoke(target, args);

        //强化
        returnVal+="...强化内容";
        System.out.println(returnVal);
        System.out.println("Cglib代理模式停止了");
        return returnVal;
    }
}
