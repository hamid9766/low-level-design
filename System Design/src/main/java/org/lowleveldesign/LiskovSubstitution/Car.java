package org.lowleveldesign.LiskovSubstitution;

public class Car extends Vehicle{

    @Override
    public Integer numberOfWheels() {
        return 4;
    }
}
