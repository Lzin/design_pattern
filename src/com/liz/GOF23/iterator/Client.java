package com.liz.GOF23.iterator;

import com.liz.GOF23.iterator.college.College;
import com.liz.GOF23.iterator.college.ComputerCollege;
import com.liz.GOF23.iterator.college.InfoCollege;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        //创建学院
        List<College> collegeList = new ArrayList<>();

        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        collegeList.add(computerCollege);
        collegeList.add(infoCollege);

        OutPut outPut = new OutPut(collegeList);
        outPut.printCollege();

    }
}
