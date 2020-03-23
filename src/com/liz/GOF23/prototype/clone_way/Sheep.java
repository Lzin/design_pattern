package com.liz.GOF23.prototype.clone_way;

public class Sheep implements Cloneable {
    private String name;
    private int age;
    private String color;
    public  Sheep friend;//是对象，克隆会如何处理，默认是浅拷贝
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
}

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Color='" + color + '\'' +
                '}';
    }
    //克隆该实例

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep = null;//待克隆对象
        sheep=(Sheep)super.clone();
        return sheep;
    }
}
