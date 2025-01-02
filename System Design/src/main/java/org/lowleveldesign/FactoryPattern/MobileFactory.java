package org.lowleveldesign.FactoryPattern;

public class MobileFactory {

    public Mobile createMobile(String brand) {
        String b = brand.toLowerCase();
        return switch (b) {
            case "iphone" -> new Iphone();
            case "samsung" -> new Samsung();
            case "realme" -> new Realme();
            case "oneplus" -> new OnePlus();
            case "googlepixel" -> new GooglePixel();
            default -> throw new IllegalArgumentException("Unsupported brand: " + brand);
        };
    }
}
