package com.liz.GOF23.state.activity;

import com.liz.GOF23.state.state.*;

//抽奖活动
public class RaffleActivity {

    State state = null;//当前状态，是变化的
    int count = 0;//奖品数量
    State noRafflleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);

    State dispenseState =   new DispenseState(this);
    State dispensOutState = new DispenseOutState(this);

    //构造器
    /**
     * 1.初始化当前状态为不能抽奖的状态
     * 2.初始化奖品的数量
     * */
    public RaffleActivity( int count) {
        this.state = getNoRafflleState();
        this.count = count;
    }

    public void debuctMoney(){
        state.deductMoney();
    }

    public void raffle(){
        if(state.raffle()){
            state.dispensePrize();
        }

    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        int curCount = count;
        count--;
        return curCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNoRafflleState() {
        return noRafflleState;
    }

    public void setNoRafflleState(State noRafflleState) {
        this.noRafflleState = noRafflleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getDispensOutState() {
        return dispensOutState;
    }

    public void setDispensOutState(State dispensOutState) {
        this.dispensOutState = dispensOutState;
    }
}
