package com.liz.GOF23.visitor.relearn;

import com.liz.GOF23.visitor.relearn.elem.Element;
import com.liz.GOF23.visitor.relearn.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    private List<Element> list=new ArrayList<Element>();
    public void accept(Visitor visitor){
        for (Element element : list) {
            //数据和visitor之间进行适应
            element.accept(visitor);
        }
    }
    public void add(Element element){
        list.add(element);
    }
    public void remove(Element element){
        list.remove(element);
    }
}
