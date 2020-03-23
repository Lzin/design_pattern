package com.liz.GOF23.command.command_controller.command;

//创建命令接口（命令的抽象）
public interface MyCommand {
    //执行某个命令
    public void execute();
    //撤销某个命令
    public void undo();
}
