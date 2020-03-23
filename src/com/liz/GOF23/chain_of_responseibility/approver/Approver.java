package com.liz.GOF23.chain_of_responseibility.approver;

import com.liz.GOF23.chain_of_responseibility.request.PurchaseRequest;

public abstract class Approver {
    Approver afterApprover;//下一个处理者
    String name;//名字

    public Approver(String name){
        this.name = name;
    }

    //获取下一个处理者
    public void setApprover(Approver afterApprover) {
        this.afterApprover = afterApprover;
    }

    //处理审批请求的方法（由子类去处理）
    public abstract void processRequest(PurchaseRequest request);

}
