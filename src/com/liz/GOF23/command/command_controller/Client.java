package com.liz.GOF23.command.command_controller;

import com.liz.GOF23.command.command_controller.light.LightOffCommand;
import com.liz.GOF23.command.command_controller.light.LightOnCommand;
import com.liz.GOF23.command.command_controller.receiver.LightReceiver;
import com.liz.GOF23.command.command_controller.receiver.MyReceiver;

public class Client {
    public static void main(String[] args) {
        //使用命令设计模式，通过遥控对电灯的操作
        //创建电灯接收者
        MyReceiver receiver = new LightReceiver();

        //创建电灯开闭的命令（MyReceiver 和 command进行绑定）
        LightOnCommand onCommand = new LightOnCommand(receiver);
        LightOffCommand offCommand = new LightOffCommand(receiver);

        //遥控器
        RemoteInvoker controller = new RemoteInvoker();
        controller.setCommand(0,onCommand,offCommand);

        //遥控器调用命令
        System.out.println("-------------按下开启按钮----------------");
        controller.onButtonWasPushed(0);
        System.out.println("--------------撤销操作------------------");
        controller.undoButtonWasPushed();
        System.out.println("--------------按下关闭按钮-----------------");
        controller.offButtonWasPushed(0);
        System.out.println("--------------撤销操作------------------");
        controller.undoButtonWasPushed();
    }
}
