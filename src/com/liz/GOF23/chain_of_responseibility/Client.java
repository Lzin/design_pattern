package com.liz.GOF23.chain_of_responseibility;

import com.liz.GOF23.chain_of_responseibility.approver.CollegeApprover;
import com.liz.GOF23.chain_of_responseibility.approver.DepartmentApprover;
import com.liz.GOF23.chain_of_responseibility.approver.SchoolMasterApprover;
import com.liz.GOF23.chain_of_responseibility.approver.ViceSchoolMasterApprover;
import com.liz.GOF23.chain_of_responseibility.request.PurchaseRequest;

public class Client {
    public static void main(String[] args) {
        PurchaseRequest request = new PurchaseRequest(1, 3100, 1);

        //创建相关的审批人(环形处理)
        DepartmentApprover da = new DepartmentApprover("主任");
        CollegeApprover ca = new CollegeApprover("院长");
        ViceSchoolMasterApprover vma = new ViceSchoolMasterApprover("副校长");
        SchoolMasterApprover sma = new SchoolMasterApprover("校长");
        sma.setApprover(da);
        //设置审批级别 要不然会空指针
        da.setApprover(ca);
        ca.setApprover(vma);
        vma.setApprover(sma);


        da.processRequest(request);
    }
}
