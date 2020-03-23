package com.liz.GOF23.visitor.relearn.visitor;

import com.liz.GOF23.visitor.relearn.elem.ConcreteElemA;
//具体访问者A
public class ConcreteVisitorA implements Visitor {
    @Override
    public void visit(ConcreteElemA element) {
        System.out.println("具体访问者A访问:"+element.operationA());
    }
}
