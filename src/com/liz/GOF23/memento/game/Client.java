package com.liz.GOF23.memento.game;

public class Client {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole(1000,1000);

        Caretaker caretaker = new Caretaker();

        //创建存档
        System.out.println("存档后状态:");
        caretaker.setMemento(gameRole.createMentor());
        gameRole.showStatus();
        System.out.println("-----------------");
        System.out.println("修改后状态:");
        gameRole.setDef(0);
        gameRole.setVit(0);
        gameRole.showStatus();
        System.out.println("---------------------");

        //读档
        System.out.println("读档后状态:");
        gameRole.recover(caretaker.getMemento());
        gameRole.showStatus();


    }
}
