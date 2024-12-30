package org.lowleveldesign.StrategyDesignPattern;

import org.lowleveldesign.StrategyDesignPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{

    SportsVehicle(){
        super(new SportsDriveStrategy());
    }

}
