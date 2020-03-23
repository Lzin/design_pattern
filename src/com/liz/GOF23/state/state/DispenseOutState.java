package com.liz.GOF23.state.state;

import com.liz.GOF23.state.activity.RaffleActivity;

/**
 * @author Administrator
 * 奖品发送完了的状态
 */
public class DispenseOutState extends State {

    // 初始化时传入活动引用
    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }
    @Override
    public void deductMoney() {
        System.out.println("奖品发送完了，请下次再参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发送完了，请下次再参加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发送完了，请下次再参加");
    }
}

