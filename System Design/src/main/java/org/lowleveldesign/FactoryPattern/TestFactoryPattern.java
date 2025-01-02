package org.lowleveldesign.FactoryPattern;

public class TestFactoryPattern {

    private static void createAndPrintMobile(MobileFactory mobileFactory, String brand){
        try {
            Mobile mobile = mobileFactory.createMobile(brand);
            mobile.createMobile();
        }catch (IllegalArgumentException e){
            System.out.println("Error creating " + brand + ", " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        MobileFactory mobileFactory = new MobileFactory();
        createAndPrintMobile(mobileFactory,"Iphone");
        createAndPrintMobile(mobileFactory,"Samsung");
        createAndPrintMobile(mobileFactory,"GooglePixel");
        createAndPrintMobile(mobileFactory,"Pixel");

    }
}
