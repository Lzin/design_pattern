package com.liz.GOF23.builder.com.liz.builder;

//具体的建造者，内部写具体的建造逻辑 =>ConcreteBuilder
public class CommonHouseBuilder extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }
}
