package com.liz.principle.single_responsibility;

//单一职责原则
public class SingleResponsibility {
    public static void main(String[] args) {
        //shitFunctionOfVehicle();
        //splitFunctionOfVehicle();
        splitMethodOfVehicle();
    }
    public static void shitFunctionOfVehicle(){
        //摩托车和飞机都在公路上跑,违反了单一职责原则
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("飞机");
    }
    //将类的粒度变小 交通工具根据不同的职能进行拆分(遵守了单一职责，但是花销很大)
    public static void splitFunctionOfVehicle(){
        RoadVehicle rVehicle=new RoadVehicle();
        AirVehicle airVehicle=new AirVehicle();
        rVehicle.run("摩托车");
        airVehicle.run("飞机");
    }
    public static void splitMethodOfVehicle(){
        Vehicle vehicle=new Vehicle();
        vehicle.roadAir("飞机");
        vehicle.roadRun("汽车");
    }
}
