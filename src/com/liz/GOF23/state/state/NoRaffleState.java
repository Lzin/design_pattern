package com.liz.GOF23.state.state;

import com.liz.GOF23.state.activity.RaffleActivity;


/**
 * 不能抽奖的状态（未扣除积分）
 *
 * */
public class NoRaffleState extends State {

    // 初始化时传入活动引用，扣除积分后改变其状态
    //activity中记录了当前状态
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    //当前状态是可以扣除积分的，积分扣除后将状态set为可以抽奖状态
    @Override
    public void deductMoney() {
        System.out.println("扣除50积分成功，您可以抽奖了");
        activity.setState(activity.getCanRaffleState());
    }


    //当前状态不能抽奖
    @Override
    public boolean raffle() {
        System.out.println("扣了积分才能抽奖喔！");
        return false;
    }

    //当前状态不能发放奖品
    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品");
    }
}
