package com.liz.GOF23.observer.improve.subject;

import com.liz.GOF23.observer.improve.observer.Observer;

//被依赖的抽象主体
public interface Subject {
    //注册观察者
    public void registerObserver(Observer o);
    //移除观察者
    public void removeObserver(Observer o);
    //广播信息
    public void notifyObservers();
}
