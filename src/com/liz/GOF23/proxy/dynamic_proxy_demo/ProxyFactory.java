package com.liz.GOF23.proxy.dynamic_proxy_demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//代理工厂
public class ProxyFactory {
    //维护一个目标对象，Object
    private Object target;

    //构造器，对target进行初始化
    public ProxyFactory(Object target) {
        this.target = target;
    }

    //给目标对象生成一个代理对象
    public Object getProxyInstance(){
        /**
         *  public static Object newProxyInstance
         *  (ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
         *
         *  1.ClassLoader loader: 指定当前目标对象使用的类加载器，获取加载器的方法固定
         *  2.interfaces:目标对象实现的接口类型，使用泛型的方式确认类型
         *  3.InvocationHandler: 事件处理，执行目标对象的方法时，会去触发事件处理器的方法，会把当前执行的目标对象方法作为参数传递(method)
         *
         *  最终返回一个代理对象，然后invoke中对代理对象进行加强（反射机制）
         *
         *
         * */
        return Proxy.newProxyInstance(target.getClass().getClassLoader()
                , target.getClass().getInterfaces(),
                new InvocationHandler() {

                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("核心逻辑实现前干的事");
                        //反射机制调用目标对象的方法,执行代理对象的方法
                        System.out.println("通过返回获得方法名:"+method.getName());
                        //System.out.println("通过返回获得方法参数:"+args[0]); 无参的时候可能报空指针异常
                        //方法的返回值
                        Object val = method.invoke(target,args);
                        //简单增强逻辑
                        val+="123";
                        System.out.println("核心逻辑实现后干的事");
                        return val;
                    }
                });
    }
}
