package com.liz.GOF23.observer.improve.subject;

import com.liz.GOF23.observer.improve.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. 包含最新的天气情况信息
 * 2. 含有 观察者集合，使用ArrayList进行管理，通知所有的接收者看到最新消息
 * 3. 当数据有更新时，就主动的调用   CurrentConditions对象update方法(含 display), 这样他们（接入方）就看到最新的信息
 */
public class WeatherData implements Subject {
    private float temperature;
    private float pressure;
    private float humidity;
    //观察者集合
    private List<Observer> observers;
    //加入新的第三方

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

//    public void dataChange() {
//        //调用 接入方的 update
//        notifyObservers();
//    }

    //当数据有更新时，就调用 setData =>自动提醒
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //调用dataChange， 将最新的信息 推送给 接入方 currentConditions
        notifyObservers();
    }

    //注册一个观察者
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    //移除一个观察者
    @Override
    public void removeObserver(Observer o) {
        if(observers.contains(o)){
            observers.remove(o);
        }
    }

    //遍历所有的Observer 进行更新
    @Override
    public void notifyObservers() {
        for(int i = 0;i < observers.size();i++){
            //Subject给Observer中注入数据 然后调用Observer的展示方法
            observers.get(i).update(this.temperature,this.pressure,this.humidity);
        }
    }
}

