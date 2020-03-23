package com.liz.GOF23.flyweight.hero;

public class Hero {
    private String heroClass;//英雄职业

    private String name;//角色名字

    private long attack;//攻击力

    private long defence;//防御力

    public Hero() {
    }

    //省略get、set方法

    public String getName() {
        return name;
    }

    public String getHeroClass() {
        return heroClass;
    }

    public long getAttack() {
        return attack;
    }

    public long getDefence() {
        return defence;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttack(long attack) {
        this.attack = attack;
    }

    public void setDefence(long defence) {
        this.defence = defence;
    }

    public void setHeroClass(String heroClass) {
        this.heroClass = heroClass;
    }

    public void create() {
        System.out.println("职业：" + this.getHeroClass() + "\n"
                + "创建的角色：" + this.getName() + "\n"
                + "角色属性：" + "\n"
                + "攻击力：" + this.getAttack() + "\n"
                + "防御力：" + this.getDefence() + "\n");
    }
}
