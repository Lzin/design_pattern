package com.liz.GOF23.chain_of_responseibility.approver;

import com.liz.GOF23.chain_of_responseibility.request.PurchaseRequest;

public class DepartmentApprover extends Approver {

    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getPrice() <= 5000){
            System.out.println("请求编号 id"+request.getId()+"被"+this.name+"处理");
        }else{
            //请求的金额不在范围中,使用后继者来处理请求
            afterApprover.processRequest(request);
        }
    }
}
