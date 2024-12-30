package org.lowleveldesign.LiskovSubstitution;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates the Liskov Substitution Principle (LSP) using the Vehicle hierarchy.
 * Highlights both adherence to and violation of the principle in the provided subclasses.
 */
public class TestLiskovPrincipal {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Car());
        vehicleList.add(new Motorcycle());
        vehicleList.add(new Bicycle());

        for(Vehicle vehicle : vehicleList){
            System.out.println(vehicle.getClass().getSimpleName() + " - " + vehicle.hasEngine().toString());
        }
    }
}
