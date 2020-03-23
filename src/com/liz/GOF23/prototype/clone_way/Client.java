package com.liz.GOF23.prototype.clone_way;

//当原始对象进行修改的时候，复制对象会随着原始对象进行自适应修改
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("使用原型模式完成对象的创建");
        Sheep sheepModel = new Sheep("tom",1,"白色");
        //原始方法
        sheepModel.friend = new Sheep("tom_friend",2,"黑色");

        //开始克隆(默认是浅拷贝)
        Sheep sheep2 = (Sheep) sheepModel.clone();
        Sheep sheep3 = (Sheep) sheepModel.clone();
        //System.out.println(sheepModel.friend);
        //对于数据类型是引用数据类型的成员变量，比如说成员变量是某个数组，某个类的对象等。那么浅拷贝会进行引用传递，也就是将该成员变量的引用值(内存地址)复制一份给新的对象（hashcode一致）
        System.out.println("sheep2: "+sheep2+" sheep2:friend"+sheep2.friend.hashCode());
        System.out.println("sheep3: "+sheep3+" sheep3:friend"+sheep3.friend.hashCode());
    }
}
