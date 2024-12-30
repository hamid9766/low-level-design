package org.lowleveldesign.StrategyDesignPattern;

public class TestStrategyPattern {
    public static void main(String[] args) {
        Vehicle goodsVehicle = new GoodsVehicle();
        Vehicle sportsVehicle = new SportsVehicle();
        goodsVehicle.drive();
        sportsVehicle.drive();

    }
}
