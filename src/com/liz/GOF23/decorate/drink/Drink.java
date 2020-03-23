package com.liz.GOF23.decorate.drink;

public abstract class Drink {
    public String des;//对drink的描述
    //价格
    private float prices = 0.0f;

    public void setDes(String des) {
        this.des = des;
    }

    public String getDes() {
        return des;
    }

    public float getPrices() {
        return prices;
    }

    public void setPrices(float prices) {
        this.prices = prices;
    }
    //计算费用
    public abstract float cost();
}
