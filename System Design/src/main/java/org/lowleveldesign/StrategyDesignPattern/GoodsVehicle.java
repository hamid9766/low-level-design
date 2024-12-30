package org.lowleveldesign.StrategyDesignPattern;

import org.lowleveldesign.StrategyDesignPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{

    GoodsVehicle(){
        super(new NormalDriveStrategy());
    }

}
