package com.liz.GOF23.memento.origin;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("404");
        System.out.println("修改前当前状态:"+originator.getState());
        //开始存档了
        caretaker.add(originator.saveStatus());

        originator.setState("500");
        System.out.println("修改后当前状态:"+originator.getState());

        //读档
        originator.getStatusFromMemento(caretaker.get(0));
        System.out.println("读档后当前状态:"+originator.getState());
    }
}
