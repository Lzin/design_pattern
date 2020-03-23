package com.liz.GOF23.flyweight;
import java.util.HashMap;

/**
 * FlyweightFactory:享元工厂类
 */
public class WebSiteFactory {
    //集合，充当池的作用 key: type value: 实例
    private HashMap<String, ConcreteWebsite> pool = new HashMap<>();

    //根据网站的类型，返回一个网站
    public WebSite getWebSiteCategory(String type) {
        //如果没有就创建一个实例，并放入到池中
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebsite(type));
        }
        //如果存在 直接返回即可
        return pool.get(type);
    }

    //池中数据
    public int getSizeOfPool() {
        return pool.size();
    }
}

