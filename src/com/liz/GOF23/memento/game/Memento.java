package com.liz.GOF23.memento.game;

public class Memento {
    private int vit;
    private int def;

    /**
     * vit:攻击力
     * def:防御力
     * */
    public Memento(int vit, int def) {
        this.vit = vit;
        this.def = def;
    }

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
}
