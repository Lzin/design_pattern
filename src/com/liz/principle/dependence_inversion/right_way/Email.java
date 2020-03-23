package com.liz.principle.dependence_inversion.right_way;

public class Email implements IReceiver {

    @Override
    public String getInfo() {
        {
            return "电子邮件信息: hello world";
        }
    }
}
