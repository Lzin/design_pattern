package com.liz.GOF23.observer.improve.observer;

import com.liz.GOF23.observer.improve.observer.Observer;

public class LzinnerNet implements Observer {

    /**
     * 显示当前天气情况（接入方的网站）
     */
    // 温度，气压，湿度
    private float temperature;
    private float pressure;
    private float humidity;

    //由 WeatherData 来调用，更新至最新的数据

    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();//展示数据
    }

    //显示
    public void display() {

        System.out.println("*** Today mLzinnerTemperature: " + temperature + "***");
        System.out.println("*** Today mLzinnerPressure: " + pressure + "***");
        System.out.println("*** Today mLzinnerHumidity: " + humidity + "***");
    }
}
