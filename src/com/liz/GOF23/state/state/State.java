package com.liz.GOF23.state.state;

/**
 * 抽象类
 * @author Administrator
 *
 */
public abstract class State {
    //扣除积分
    public abstract void deductMoney();

    //是否抽中了奖品
    public abstract boolean raffle();

    //发放奖品
    public abstract  void dispensePrize();
}

