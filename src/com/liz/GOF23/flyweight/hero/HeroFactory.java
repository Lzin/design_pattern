package com.liz.GOF23.flyweight.hero;

import java.util.HashMap;

public class HeroFactory {
    //英雄池
    private HashMap<String,Hero> map = new HashMap<>();
    //heroClass 外部状态
    public Hero factory(String heroClass){
        Hero hero = map.get(heroClass);
        if(hero == null){
            hero = new Hero();
            map.put(heroClass,hero);
        }
        return hero;
    }
}
