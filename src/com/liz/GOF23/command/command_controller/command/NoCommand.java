package com.liz.GOF23.command.command_controller.command;

import com.liz.GOF23.command.command_controller.receiver.MyReceiver;

/**
 * 没有任何命令，即空执行:用于初始化状态【默认】
 * 使用NoCommand 可以省略对空的判断
 * */
public class NoCommand implements MyCommand {
    //聚合 LightReceiver，从而执行具体的命令
    private MyReceiver light;

    public NoCommand(){
    }
    @Override
    public void execute() {
        //调用接收者的方法

    }

    @Override
    public void undo() {
        //调用接收者的方法

    }
}
