package com.liz.GOF23.visitor.relearn;

import com.liz.GOF23.visitor.relearn.elem.ConcreteElemA;
import com.liz.GOF23.visitor.relearn.elem.ConcreteElemB;
import com.liz.GOF23.visitor.relearn.visitor.ConcreteVisitorA;
import com.liz.GOF23.visitor.relearn.visitor.ConcreteVisitorB;
import com.liz.GOF23.visitor.relearn.visitor.Visitor;

public class Client {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.add(new ConcreteElemA());
        os.add(new ConcreteElemB());
        Visitor visitorA = new ConcreteVisitorA();
        os.accept(visitorA);
        System.out.println("===============");
        Visitor visitorB = new ConcreteVisitorB();
        os.accept(visitorB);
    }
}
