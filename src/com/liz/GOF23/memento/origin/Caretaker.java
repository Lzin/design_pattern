package com.liz.GOF23.memento.origin;

import java.util.ArrayList;
import java.util.List;

//管理备忘录
//在List集合中会有很多的备忘录
public class Caretaker {
    private List<Memento> mementoList = new ArrayList<>();
    public void add(Memento memento){
        mementoList.add(memento);
    }

    //获取到第index个Originator的备忘录对象（存档）
    public Memento get(int index){
        return mementoList.get(index);
    }

}
