package com.liz.GOF23.command.command;

//具体的接收者2
public class ConcreteReceiver2 implements Receiver {
    @Override
    public void response() {
        System.out.println(this.getClass().getSimpleName()+"收到了信息，开始工作");
    }
}
