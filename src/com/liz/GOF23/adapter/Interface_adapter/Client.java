package com.liz.GOF23.adapter.Interface_adapter;
//当不需要全部实现接口提供的方法时，可以先设计一个抽象类实现接口，并为该接口中每个方法提供默认实现（空方法）
//适用于想调用接口 但是不想实现所有方法的情况
public class Client {
    public static void main(String[] args) {
        AbsAdapter adapter = new AbsAdapter() {
            //只需要覆盖需要的方法即可
            @Override
            public void m1() {
                System.out.println("只覆盖了m1方法");
            }
        };
        adapter.m1();
    }
}
