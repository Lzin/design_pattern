package com.liz.GOF23.iterator.college;

import java.util.Iterator;
//抽象聚合（内部具体实现了对数据的初始化，同时获取迭代器）
public interface College {
    public String getName();
    //增加系的方法
    public void addDepartment(String name,String desc);

    //返回一个迭代器,遍历
    public Iterator createIterator();
}
