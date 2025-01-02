package org.lowleveldesign.FactoryPattern;

public class GooglePixel implements Mobile{

    @Override
    public void createMobile() {
        System.out.println("Google Pixel Mobile phone Created");
    }
}
