package com.liz.GOF23.chain_of_responseibility.request;

//请求类
public class PurchaseRequest {
    private int type;
    ;//请求类型
    private float price = 0.0f;//请求金额
    private int id = 0;//请求id

    //构造器
    public PurchaseRequest(int type, float price, int id) {
        super();
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
