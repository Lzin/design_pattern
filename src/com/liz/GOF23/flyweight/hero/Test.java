package com.liz.GOF23.flyweight.hero;
//在享元模式下，可以避免重复创建相同或者相似的对象，这样可以减少内存和提高程序的效率。
public class Test {
    public static void main(String[] args) {
        HeroFactory heroFactory = new HeroFactory();
        String wizard = "法师";
        String shooter = "射手";

        // Hero hero1 = new Hero();
        Hero hero1 = heroFactory.factory(wizard);
        hero1.setHeroClass(wizard);
        hero1.setName("王昭君");
        hero1.setAttack(1000);
        hero1.setDefence(100);
        hero1.create();

        Hero hero2 = heroFactory.factory(wizard);
        hero2.setHeroClass(wizard);
        hero2.setName("嬴政");
        hero2.setAttack(1200);
        hero2.setDefence(180);
        hero2.create();

        Hero hero3 = heroFactory.factory(shooter);
        hero3.setHeroClass(shooter);
        hero3.setName("孙尚香");
        hero3.setAttack(1500);
        hero3.setDefence(100);
        hero3.create();

        System.out.println("输出各对象的地址：");
        System.out.println(hero1);
        System.out.println(hero2);
        System.out.println(hero3);

    }
}
