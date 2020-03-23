package com.liz.GOF23.memento.origin;

public class Originator {
    //状态信息
    private String state;

    public String getState(){
        return state;
    }
    public void setState(String state){
        this.state = state;
    }

    //编写一个方法保存状态对象Memento

    public Memento saveStatus() {
        return new Memento(state);
    }

    //恢复状态
    public void getStatusFromMemento(Memento memento){
        //将备忘录中的值重新导入
            state = memento.getState();
    }
}
