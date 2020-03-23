package com.liz.GOF23.prototype.deep_clone;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException, IOException {
        DeepProtoType dpt = new DeepProtoType();
        dpt.name = "1z";
        dpt.deepCloneableTarget = new DeepCloneableTarget("box","Box");

        /**
         * 自定义: 深拷贝
         * 默认:   浅拷贝
         * */
        //方案1 重写clone
        //DeepProtoType dptClone = (DeepProtoType) dpt.clone();

        //方案2 对象的序列化和反序列化
        DeepProtoType dptClone = (DeepProtoType)dpt.deepClone();

        //比较引用类型的hashcode
        System.out.println(dpt.deepCloneableTarget.hashCode());
        System.out.println(dptClone.deepCloneableTarget.hashCode());


    }
}
