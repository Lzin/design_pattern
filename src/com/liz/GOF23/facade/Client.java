package com.liz.GOF23.facade;

public class Client {
    //如果直接调用客户端 很麻烦
    //调用顶层类
    public static void main(String[] args) {
        HomeTheaterFacade facade = new HomeTheaterFacade();
        facade.ready();
        facade.play();
        facade.pause();
        facade.end();
    }
}
