package com.liz.GOF23.adapter.simple_springmvc.adapter;

import com.liz.GOF23.adapter.simple_springmvc.controller.HttpController;

public class HttpHandlerAdapter implements HandlerAdapter {
    @Override
    public boolean support(Object handler) {return (handler instanceof HttpController);}

    @Override
    public void handle(Object handler) { ((HttpController)handler).doHttpHandler();}
}
