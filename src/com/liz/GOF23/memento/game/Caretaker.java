package com.liz.GOF23.memento.game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//保存了游戏角色的状态
public class Caretaker {
    //保存某个角色的某个状态
    private Memento memento;
    //保存某个角色的多个状态
    private List<Memento> mementos = new ArrayList<>();
    //保存多个角色的多个状态
    private HashMap<String,ArrayList<Memento>> rolesMementos;

    //写的简单点...
    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
