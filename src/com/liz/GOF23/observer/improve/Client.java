package com.liz.GOF23.observer.improve;
import com.liz.GOF23.observer.improve.observer.CurrentConditions;
import com.liz.GOF23.observer.improve.subject.WeatherData;

import java.util.Observable;

public class Client {
    public static void main(String[] args) {
        //创建一个WeatherData(具体的subject)
        WeatherData weatherData = new WeatherData();

        //观察者注册入weatherData中
        weatherData.registerObserver(new CurrentConditions());
        //改动一行即可
        //weatherData.registerObserver(new LzinnerNet());
        System.out.println();
        //推送后
        weatherData.setData(30.0f,100,30.3f);
        System.out.println("----------------------------------------------");
        weatherData.setData(30.1f,101,30.4f);

    }
}
