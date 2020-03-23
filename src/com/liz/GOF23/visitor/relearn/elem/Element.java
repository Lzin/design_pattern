package com.liz.GOF23.visitor.relearn.elem;

import com.liz.GOF23.visitor.relearn.visitor.Visitor;
//被访问类的接口
//抽象元素(内部有accept方法用于接收访问者)
public interface Element {
    void accept(Visitor visitor);
}
