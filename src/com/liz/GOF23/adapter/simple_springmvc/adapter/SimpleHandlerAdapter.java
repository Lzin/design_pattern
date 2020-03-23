package com.liz.GOF23.adapter.simple_springmvc.adapter;

import com.liz.GOF23.adapter.simple_springmvc.controller.SimpleController;

public class SimpleHandlerAdapter implements HandlerAdapter{
    @Override
    public boolean support(Object handler) { return (handler instanceof SimpleController);}

    @Override
    public void handle(Object handler) { ((SimpleController)handler).doSimpleController();}
}
