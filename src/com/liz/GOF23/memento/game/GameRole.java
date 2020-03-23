package com.liz.GOF23.memento.game;

public class GameRole {
    /**
     * vit:攻击力
     * def:防御力
     */
    private int vit;
    private int def;

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public GameRole(int vit, int def) {
        this.vit = vit;
        this.def = def;
    }

    //创建备忘录
    public Memento createMentor() {
        return new Memento(vit, def);
    }

    //读档
    public void recover(Memento memento) {
        this.def = memento.getDef();
        this.vit = memento.getVit();
    }

    //显示当前的状态
    public void showStatus(){
        System.out.println("攻击力为:"+this.vit);
        System.out.println("防御力为:"+this.def);
    }
}
