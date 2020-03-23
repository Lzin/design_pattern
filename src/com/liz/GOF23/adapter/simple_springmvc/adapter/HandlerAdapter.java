package com.liz.GOF23.adapter.simple_springmvc.adapter;

public interface HandlerAdapter {
    //适配方法 (handler instance of xxController)
    public boolean support(Object handler);
    //实现匹配思路((xxController)handler.xx())
    public void handle(Object handler);

}
