package com.liz.GOF23.command.command;
public class Client {
    public static void main(String[] args) {
        //实例化Invoker
        MainInvoker invoker = new MainInvoker();
        Receiver receiver1 = new ConcreteReceiver1();
        Receiver receiver2 = new ConcreteReceiver2();

        //添加消息队列
        invoker.addReceiver(receiver1);
        invoker.addReceiver(receiver2);
        invoker.notifyAllReceiver();
    }
}
