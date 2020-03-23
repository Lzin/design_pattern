package com.liz.GOF23.visitor.relearn.visitor;

import com.liz.GOF23.visitor.relearn.elem.ConcreteElemB;

//具体访问者B
public class ConcreteVisitorB implements Visitor {
    @Override
    public void visit(ConcreteElemB elementB) {
        System.out.println("具体访问者B访问:"+elementB.operationB());
    }
}
