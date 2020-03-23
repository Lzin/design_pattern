package com.liz.GOF23.command.command;

import java.util.ArrayList;
import java.util.List;

//具体的调用者
public class MainInvoker {
    //保存需要通知的接收者集合
    private List<Receiver> list;

    private Command command;

    public MainInvoker(){
        this.list = new ArrayList<>();
    }
    public MainInvoker addReceiver(Receiver receiver){
        list.add(receiver);
        return this;
    }

    //通知所有的接受者
    public void notifyAllReceiver(){
        System.out.println("开始通知所有人");
        for (Receiver receiver : list) {
            command = new MessageCommand(receiver);
            command.execute();
        }
    }
}
