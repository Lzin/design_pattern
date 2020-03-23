package com.liz.GOF23.flyweight;

public class Client {


    public static void main(String[] args) {
        //创建一个工厂
        WebSiteFactory factory = new WebSiteFactory();
        WebSite ByWeChat = factory.getWebSiteCategory("微信");
        WebSite ByBlog = factory.getWebSiteCategory("博客");

        ByBlog.use(new User("客户1"));
        ByWeChat.use(new User("客户2"));
        System.out.println("对象个数:"+factory.getSizeOfPool());
        //复用
        WebSite ByWeChatCopy = factory.getWebSiteCategory("微信");
        ByWeChatCopy.use(new User("客户3"));
        System.out.println("对象个数:"+factory.getSizeOfPool());

    }
}
