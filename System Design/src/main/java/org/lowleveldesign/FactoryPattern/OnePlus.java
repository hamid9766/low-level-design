package org.lowleveldesign.FactoryPattern;

public class OnePlus implements Mobile{

    @Override
    public void createMobile() {
        System.out.println("OnePlus Mobile phone Created");
    }
}
