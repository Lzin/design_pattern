package com.liz.GOF23.iterator.iter;
import com.liz.GOF23.iterator.college.Department;

import java.util.Iterator;
import java.util.List;

//具体迭代器，定义了数据的遍历思路
//此处以List方式存放Department
public class InfoCollegeIterator implements Iterator {
    List<Department> departmentList;
    int index = -1;//索引

    //构造器 => 内部注入Department
    public InfoCollegeIterator(List<Department> departmentList){
        this.departmentList = departmentList;
    }

    //判断集合中还有没有下一个元素
    @Override
    public boolean hasNext() {
        if(index >= departmentList.size() - 1){
            return false;
        }else{
            index +=1;//由于起始点是 -1
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }

    //空实现remove方法
    public void remove(){

    }
}
