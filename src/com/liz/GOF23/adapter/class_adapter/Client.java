package com.liz.GOF23.adapter.class_adapter;

public class Client {


    public static void main(String[] args) {
        System.out.println("类适配器模式");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
