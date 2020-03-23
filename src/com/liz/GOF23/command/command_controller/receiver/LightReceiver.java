package com.liz.GOF23.command.command_controller.receiver;

//具体的接收者
public class LightReceiver implements MyReceiver {
    public void on(){
        System.out.println(" 电灯打开了 ");
    }
    public void off(){
        System.out.println(" 电灯关闭了 ");
    }
}
