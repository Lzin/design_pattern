package com.liz.GOF23.iterator;
import com.liz.GOF23.iterator.college.College;
import com.liz.GOF23.iterator.college.Department;
import java.util.Iterator;
import java.util.List;

//输出所有的信息（遍历细节）
public class OutPut {
    //学院集合
    List<College> collegeList;
    public OutPut(List<College> collegeList){
        this.collegeList = collegeList;
    }
    //遍历所有的学院，调用printDepartment输出各个学院的系
    public void printCollege(){
        //从college中取出所有的学院，java中List已经实现了iterator
        Iterator<College> iterator = collegeList.iterator();
        while(iterator.hasNext()){
            //取出一个学院
            College c = iterator.next();
            //输出学院的名称
            System.out.println("学院名称:"+c.getName());
            //打印系信息
            printDepartment(c.createIterator());//得到对应的迭代器
            System.out.println("-------------------------");
        }

    }
    //输出信息(系)
    public void printDepartment(Iterator iterator){
        while(iterator.hasNext()){
            //从list0开始向后遍历
            Department d = (Department) iterator.next();
            System.out.println("系名称:"+d.getName());
            System.out.println("系描述:"+d.getDesc());
        }

    }

}
