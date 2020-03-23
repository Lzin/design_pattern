package com.liz.GOF23.observer.traditional;

/**
 * 显示当前天气情况（接入方的网站）
 * 显示并更新
 */
public class CurrentConditions {
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
        System.out.println("*** Today mTemperature: " + temperature + "***");
        System.out.println("*** Today mPressure: " + pressure + "***");
        System.out.println("*** Today mHumidity: " + humidity + "***");
    }
}

