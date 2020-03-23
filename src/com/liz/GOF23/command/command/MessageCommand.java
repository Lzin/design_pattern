package com.liz.GOF23.command.command;

//具体的命令对象（发送者和接收者之间的纽带）
public class MessageCommand implements Command{
    private Receiver receiver;
    public MessageCommand(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.response();
    }
}
