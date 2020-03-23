package com.liz.GOF23.command.command_controller.light;

import com.liz.GOF23.command.command_controller.command.MyCommand;
import com.liz.GOF23.command.command_controller.receiver.MyReceiver;
//命令对象（内部聚合了接收者进行具体操作）
public class LightOffCommand implements MyCommand {
    //聚合 LightReceiver，从而执行具体的命令
    private MyReceiver light;

    public LightOffCommand(MyReceiver light){
        this.light = light;
    }
    @Override
    public void execute() {
        //调用接收者的方法
        light.off();
    }

    @Override
    public void undo() {
        //调用接收者的方法
        light.on();
    }
}
