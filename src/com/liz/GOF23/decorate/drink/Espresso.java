package com.liz.GOF23.decorate.drink;

public class Espresso extends Coffee {
    //创建的时候就给予价格
    public Espresso(){
        setDes("意大利咖啡");
        setPrices(6.0f);
    }

}
