package com.liz.principle.dependence_inversion.right_way;

public class WechatMessage implements IReceiver {
    @Override
    public String getInfo() {
       return "wechat:发送信息";
    }
}
