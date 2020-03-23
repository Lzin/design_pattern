package com.liz.GOF23.observer.improve.observer;

//观察者接口，由具体观察者实现
public interface Observer {
    //更新信息
    /**
     * 温度
     * 气压
     * 湿度
     * */
    public void update(float temperature,float pressure,float humidity);
}
