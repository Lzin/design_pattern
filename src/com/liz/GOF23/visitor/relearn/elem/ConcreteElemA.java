package com.liz.GOF23.visitor.relearn.elem;

import com.liz.GOF23.visitor.relearn.visitor.Visitor;
//具体被访问类A
public class ConcreteElemA implements Element {
    @Override
    public void accept(Visitor visitor) {
       visitor.visit(this);
    }
    //加入额外操作
    public String operationA(){
        return "具体元素A的操作";
    }
}
