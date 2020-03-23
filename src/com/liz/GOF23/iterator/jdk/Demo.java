package com.liz.GOF23.iterator.jdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("admin");

        //获取到迭代器
        Iterator iterator = a.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
