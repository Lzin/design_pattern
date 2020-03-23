package com.liz.GOF23.iterator.college;
import com.liz.GOF23.iterator.iter.ComputerCollegeIterator;

import java.util.Iterator;

//具体聚合1
public class ComputerCollege implements College {
    //数据在此处以 数组形式存储
    Department[] departments;
    int numOfDepartment = 0;//保存当前数组的对象个数
    @Override
    public String getName() {
        return "计算机学院";
    }
    //init_data
    public ComputerCollege(){
        departments = new Department[5];
        addDepartment("java","java专业");
        addDepartment("php","php专业");
        addDepartment("c","c专业");
        addDepartment("c++","c++专业");
        addDepartment("python","python专业");
    }
    @Override
    public void addDepartment(String name, String desc) {
        //真正的数据
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment+=1;
    }

    //获取一个迭代器对象
    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
