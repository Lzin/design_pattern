package com.liz.GOF23.template;

//抽象类，表示豆浆
public abstract class SoyaMilk {
    //模板方法，不让子类覆盖
    final void make() {
        //流程一览
        select();
        if(isAdd()){
            add();
        }
        soak();
        beat();
    }

    //选材
    void select() {
        System.out.println("第一步:选择材料");
    }

    //添加配料(配料可能不同)

    public abstract void add();

    //浸泡
    void soak() {
        System.out.println("第三步:浸泡");
    }

    //打磨
    void beat() {
        System.out.println("第四步:打磨");
    }

    //钩子方法，判断是否需要添加配料
    boolean isAdd(){
        return true;
    }

}

