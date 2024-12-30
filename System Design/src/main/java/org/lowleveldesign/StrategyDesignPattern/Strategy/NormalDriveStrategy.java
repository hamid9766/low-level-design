package org.lowleveldesign.StrategyDesignPattern.Strategy;

public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Normal Drive Mode ");
    }
}
