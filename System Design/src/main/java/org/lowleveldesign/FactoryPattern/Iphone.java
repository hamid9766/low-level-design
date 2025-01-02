package org.lowleveldesign.FactoryPattern;

public class Iphone implements Mobile{

    @Override
    public void createMobile() {
        System.out.println("Iphone Mobile Created");
    }
}
