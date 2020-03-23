package com.liz.GOF23.builder.com.relearn;

public class Client {

    public static void main(String[] args) {
        BenzBuilder bzBuilder = new BenzBuilder();
        BenzDirector bzDirector = new BenzDirector(bzBuilder);
        CarMode benMode = bzDirector.createBenz();
        System.out.println("---------------------");
    
        FarriBuilder fBuilder = new FarriBuilder();
        FarriDirector fDirector = new FarriDirector(fBuilder);
        CarMode farri = fDirector.createFarri();
        System.out.println("-----------------------");

    }
}
