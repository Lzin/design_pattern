package com.liz.GOF23.iterator.college;

import com.liz.GOF23.iterator.iter.InfoCollegeIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//具体聚合2
public class InfoCollege implements College {
    //数据在此处以列表形式存储
    List<Department> departmentList;

    public InfoCollege(){
        departmentList = new ArrayList<Department>();
        addDepartment("信息安全","信息安全专业");
        addDepartment("网络安全","网络安全专业");
        addDepartment("服务器安全","服务器安全专业");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name,desc);
        departmentList.add(department);
    }

    //获取迭代器对象
    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}

