package com.liz.GOF23.visitor.relearn.elem;

import com.liz.GOF23.visitor.relearn.visitor.Visitor;
//具体被访问类B
public class ConcreteElemB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    //加入额外操作
    public String operationB(){
        return "具体元素B的操作";
    }
}
