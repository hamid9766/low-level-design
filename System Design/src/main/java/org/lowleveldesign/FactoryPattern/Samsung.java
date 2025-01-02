package org.lowleveldesign.FactoryPattern;

public class Samsung implements Mobile{

    @Override
    public void createMobile() {
        System.out.println("Samsung Mobile phone Created");
    }
}
