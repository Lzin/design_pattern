package com.liz.GOF23.state.state;

/**
 * @author Administrator
 *
 */

import com.liz.GOF23.state.activity.RaffleActivity;

/**
 * 发放奖品的状态
 * 当activity的状态改变为DispenseState 抽奖活动结束
 */
public class DispenseState extends State {

    // 初始化时传入活动引用，发放奖品后改变其状态
    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("不能扣除积分");
    }


    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        //奖品的数量 > 0
        if(activity.getCount() > 0){
            System.out.println("恭喜中奖了");
            // 改变状态为不能抽奖
            activity.setState(activity.getNoRafflleState());
        }else{
            System.out.println("很遗憾，奖品发送完了");
            // 改变状态为奖品发送完毕
            activity.setState(activity.getDispensOutState());
            System.out.println("游戏结束！！");
        }

    }
}
