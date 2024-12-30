package org.lowleveldesign.StrategyDesignPattern;

import org.lowleveldesign.StrategyDesignPattern.Strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategyObj;

    // Passing object using Construction Injection
    Vehicle(DriveStrategy driveObj){
        this.driveStrategyObj = driveObj;
    }

    public void drive(){
        driveStrategyObj.drive();
    }
}
