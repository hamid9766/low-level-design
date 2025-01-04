package org.lowleveldesign.AbstractFactory;

import org.lowleveldesign.AbstractFactory.PhoneFactory.IphoneFactory;
import org.lowleveldesign.AbstractFactory.PhoneFactory.SamsungFactory;

public class TestAbstractFactoryPattern {
    public static void main(String[] args) {
        PhoneStore phoneStore = new IphoneFactory();
        PhoneStore phoneStore1 = new SamsungFactory();

        phoneStore.orderPhone("16");

        System.out.println("---------------------");
        phoneStore.orderPhone("15 Pro");

        System.out.println("---------------------");
        phoneStore1.orderPhone("S24 Ultra");


    }
}
