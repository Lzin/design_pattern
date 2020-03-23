package com.liz.GOF23.prototype.deep_clone;

import java.io.*;

//Serializable 序列化(将对象的信息转化为可以存储或者传输的过程)
public class DeepProtoType implements Serializable, Cloneable {
    public String name;//String 属性
    public DeepCloneableTarget deepCloneableTarget;//引用类型（自定义clone需要改造这个引用类）

    public DeepProtoType() {
        super();
    }
//浅拷贝
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }


    //深拷贝实现1 重写clone
    //对引用类型一层一层进行向下复制 直到出现没有引用类型，全为属性即可

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //完成对基本数据类型（属性）和String的克隆
        Object deep = null;
        deep = super.clone();

        //对引用类型的属性进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        //clone 类型(由于没有出现引用类型 所以这里clone一个新的实例)
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepProtoType;
    }

    //深拷贝实现2 通过对象的序列化和反序列化实现深拷贝(推荐使用)
    public Object deepClone() throws IOException {
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //开始序列化操作
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);//将当前对象以对象流的形式进行输出(序列化)

            //开始反序列化操作
            //bis读出了bos的信息 相当于克隆
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType cloneDemo = (DeepProtoType) ois.readObject();
            return cloneDemo;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
       finally {
            bos.close();
            oos.close();
            bis.close();
            ois.close();
        }
        return null;
    }
}
