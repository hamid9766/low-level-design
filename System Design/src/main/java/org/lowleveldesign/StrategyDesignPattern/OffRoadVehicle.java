package org.lowleveldesign.StrategyDesignPattern;

import org.lowleveldesign.StrategyDesignPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle(){
        super(new SportsDriveStrategy());
    }

}
