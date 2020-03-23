package com.liz.GOF23.decorate.jdk_decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Decorator {
    public static void main(String[] args) throws IOException {
        //FileInputStream 具体的实现类(类似于上述的单品咖啡)
        //DataInputStream 具体的装饰类（类似于上述的调味品实例）
        //FilterInputStream 抽象的装饰类(类似于上述的抽象调味品)[含有被装饰者]
        //InputStream  抽象的实现类(类似于上述的抽象Drink)

        //io体系中使用了装饰者模式
        DataInputStream dis = new DataInputStream(new FileInputStream("D://xxx.txt"));
        System.out.println(dis.read());
        dis.close();
    }
}
