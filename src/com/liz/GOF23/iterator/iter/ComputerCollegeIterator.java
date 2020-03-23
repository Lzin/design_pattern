package com.liz.GOF23.iterator.iter;

import com.liz.GOF23.iterator.college.Department;

import java.util.Iterator;

//具体迭代器，定义了数据的遍历思路
//此处以数组方式存放Department
public class ComputerCollegeIterator implements Iterator {

    Department[] departments;
    int position = 0;//遍历的位置

    //将数据注入迭代器
    public ComputerCollegeIterator(Department[]departments){
        this.departments = departments;
    }
    //判断是否还有下一个
    @Override
    public boolean hasNext() {
        if(position >= departments.length || departments[position] == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position+=1;//后移一位
        return department;
    }

    @Override
    public void remove() {
        //暂时不需要删除方法 默认实现..
    }
}
