package com.liz.GOF23.command.command_controller;

import com.liz.GOF23.command.command_controller.command.MyCommand;
import com.liz.GOF23.command.command_controller.command.NoCommand;

/**
 * Invoker
 * 类似一个遥控器，用户进行聚合
 * 组织命令集合
 */
public class RemoteInvoker {
    //命令集合1[开启]
    MyCommand[] onCommands;
    //命令集合2[关闭]
    MyCommand[] offCommands;
    //命令 [撤销]
    MyCommand undoCommand;

    //构造器 完成初始化【初始化每一个指令 => 空操作】
    public RemoteInvoker() {
        onCommands = new MyCommand[5];
        offCommands = new MyCommand[5];

        //将所有的指令默认初始化
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    //给按钮设置需要的命令即可

    //!!!!给控制器动态设置指令
    public void setCommand(int no, MyCommand onCommand, MyCommand offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    //按下开的按钮
    public void onButtonWasPushed(int no){
        //!!!找到按下的指令，并调用对应的方法
        onCommands[no].execute();
        //记录这次的操作 用于撤销
        undoCommand=onCommands[no];
    }

    //按下关的按钮
    public void offButtonWasPushed(int no){
        //!!!找到按下的指令，并调用对应的方法
        offCommands[no].execute();
        //记录这次的操作 用于撤销
        undoCommand=offCommands[no];
    }

    //按下撤销按钮
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

}
